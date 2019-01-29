package edu.uniba.di.lacam.kdde.ws4j.servlet;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

import de.tudarmstadt.ukp.jwktl.api.IWiktionaryEdition;
import edu.stanford.nlp.ling.HasWord;
import edu.stanford.nlp.ling.SentenceUtils;
import edu.stanford.nlp.ling.TaggedWord;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;

public class WordSimilartyThread implements Callable<SimilalrityObject> {
	private String signal;
	private String conversationBlock;
	private IWiktionaryEdition wkt;
	private ArrayList<String> stopWords;
	private ArrayList<String> negativeWords;
	private Integer signalId;
	private Integer productID;

	public WordSimilartyThread(String signal, String conversationBlock, IWiktionaryEdition wkt,
			ArrayList<String> stopWords, ArrayList<String> negativeWords, Integer signalId, Integer productID) {
		super();
		this.signal = signal;
		this.conversationBlock = conversationBlock;
		this.wkt = wkt;
		this.stopWords = stopWords;
		this.negativeWords = negativeWords;
		this.signalId = signalId;
		this.productID = productID;

	}

	@Override
	public SimilalrityObject call() throws Exception {
		double value = 0d;
		if (conversationBlock.toLowerCase().equalsIgnoreCase(signal.toLowerCase())) {
			return new SimilalrityObject(signal, conversationBlock, true, MatchTypes.EXACT_MATCH.name(), 1d, signalId);
		}

		if (conversationBlock.toLowerCase().contains(signal.toLowerCase())) {
			String conversions[]=conversationBlock.split(" ");
 			for (String conv : conversions) {
				if(conv.equalsIgnoreCase(signal)) {
					return new SimilalrityObject(signal, conversationBlock, true, MatchTypes.CONTAINS.name(), 1d, signalId);
				}
			}
		}

		// IWiktionaryPage page = wkt.getPageForWord(signal);
		for (AnalysisSignal signal : SignalHolder.products.get(productID).signals) {
			if (signal.id == signalId) {
				for (SignalPhrase phrase : signal.synonyms) {
					if(conversationBlock.toLowerCase().contains(phrase.alternate.toLowerCase())) {
						return new SimilalrityObject(signal.word, conversationBlock, true, phrase.type.name(), 1d, signalId);
					}
				}
			}

		}

		boolean isSignalNegative = false;
		boolean isConversationNegative = false;
		ArrayList<String> alertnateSignals = new ArrayList<>();
		for (String word : negativeWords) {
			if (signal.contains(word)) {
				isSignalNegative = true;
			}
			if (conversationBlock.contains(word)) {
				isConversationNegative = true;
			}

		}
		String[] words1 = signal.split(" ");
		String temp = signal;
		for (int i = 0; i < words1.length; i++) {
			String string = words1[i];
			if (!stopWords.contains(string)) {
				ArrayList<String> synonymList = new ArrayList<String>();// getFilterWordSimilarity(string);
				for (String word : synonymList) {
					// temp.replaceAll(string, word);
					alertnateSignals.add(temp.replaceAll(string, word));
					temp = signal;
				}
			}
		}
		for (String word : alertnateSignals) {
			System.out.println("SYNONYM_SENTENCE_ALTERNATE " + word);
			if (word.equalsIgnoreCase(conversationBlock)) {
				return new SimilalrityObject(signal, conversationBlock, true, MatchTypes.SYNONYM_SENTENCE_EXACT.name(),
						1d, signalId);
			}

			if (conversationBlock.toLowerCase().contains(word)) {
				return new SimilalrityObject(signal, conversationBlock, true,
						MatchTypes.SYNONYM_SENTENCE_CONTAINS.name(), 1d, signalId);
			}
		}

		boolean resstanford = stanfordSimilarity(signal, conversationBlock);
		if (resstanford) {
			return new SimilalrityObject(signal, conversationBlock, true, MatchTypes.STANFORD_SIMILARITY.name(), 1d,
					signalId);
		}

		System.out.println("No Entry found in wictionary for " + signal);
		value = sentanceSimilarity(signal.trim().toLowerCase(), conversationBlock.trim().toLowerCase());
		if (value >= 0.90) {

			if ((isSignalNegative && isConversationNegative)
					&& (signal.contains("?") && conversationBlock.contains("?"))) {
				return new SimilalrityObject(signal, conversationBlock, true, MatchTypes.SENTENCE_SIMILARITY.name(),
						value, signalId);
			} else if ((!isSignalNegative && !isConversationNegative)
					&& (!signal.contains("?") && !conversationBlock.contains("?"))) {
				return new SimilalrityObject(signal, conversationBlock, true, MatchTypes.SENTENCE_SIMILARITY.name(),
						value, signalId);
			}
			if ((isSignalNegative && isConversationNegative)
					&& (!signal.contains("?") && !conversationBlock.contains("?"))) {
				return new SimilalrityObject(signal, conversationBlock, true, MatchTypes.SENTENCE_SIMILARITY.name(),
						value, signalId);
			} else if ((!isSignalNegative && !isConversationNegative)
					&& (signal.contains("?") && conversationBlock.contains("?"))) {
				return new SimilalrityObject(signal, conversationBlock, true, MatchTypes.SENTENCE_SIMILARITY.name(),
						value, signalId);
			} else {
				value = (1 - value);
				if (value >= 0.90) {
					return new SimilalrityObject(signal, conversationBlock, true, MatchTypes.SENTENCE_SIMILARITY.name(),
							value, signalId);
				}
			}
		} else {
			// check word by word contains

			// check noun and verb conatins
		}

		return new SimilalrityObject(signal, conversationBlock, true, MatchTypes.NO_MATCH.name(), value, signalId);
	}

	private static boolean stanfordSimilarity(String signal, String conversationBlock) {
		System.out.println("stanfordSimilarity->");
		boolean isMatch = false;
		try {

			List<List<HasWord>> sentences = MaxentTagger.tokenizeText(new StringReader(signal));
			List<List<HasWord>> conversationSentence = MaxentTagger.tokenizeText(new StringReader(conversationBlock));

			HashMap<String, ArrayList<String>> signalMap = generateSentanceMap(WordSimilarityServlet.tagger, sentences);
			HashMap<String, ArrayList<String>> convaerSationMap = generateSentanceMap(WordSimilarityServlet.tagger,
					conversationSentence);

			HashMap<String, String> tagMap = new HashMap<String, String>();

			for (String pos : signalMap.keySet()) {
				if (!tagMap.containsKey(pos)) {
					tagMap.put(pos, pos);
				}
			}
			for (String pos : convaerSationMap.keySet()) {
				if (!tagMap.containsKey(pos)) {
					tagMap.put(pos, pos);
				}
			}
			for (String pos : tagMap.keySet()) {
				if (pos.startsWith("FW") || pos.startsWith("CD") || pos.startsWith("NN") || pos.startsWith("VB") || pos.startsWith(".")) {
					if (signalMap.get(pos) != null && convaerSationMap.get(pos) != null) {
						isMatch = matchList(signalMap.get(pos), convaerSationMap.get(pos));
					} else {
						isMatch = false;
						break;
					}
					if (!isMatch) {
						break;
					}
				}
			}
			System.out.println("isMatch " + isMatch);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isMatch;
	}

	private static double sentanceSimilarity(String sentance1, String sentance2) {
		long t = System.currentTimeMillis();

		float score = 0.0f;
		double average = 0;

		System.out.println(WordSimilarityServlet.rcs[0].getClass().getName() + "\t");
		String[] words1 = sentance1.split(" ");
		String[] words2 = sentance2.split(" ");
		double[][] k = WordSimilarityServlet.rcs[0].getSimilarityMatrix(words1, words2);

		double totalScore = 0;

		for (int i = 0; i < k.length; i++) {
			// double[] maxValue = new double[k.length];
			double maxValue = 0;

			for (int j = 0; j < k[i].length; j++) {
				System.out.println(k[i][j] + " ---- " + words1[i] + " >>>>>> " + words2[j]);
				if (k[i][j] > maxValue) {
					maxValue = k[i][j];
				}
			}
			totalScore += maxValue;
		}
		// System.out.println("sentance1.length() "+words1.length);
		average = (double) totalScore / (double) words1.length;
		System.out.println("totalScore " + totalScore);
		System.out.println("average " + average);

		System.out.println("\nDone in " + (System.currentTimeMillis() - t) + " msec.");
		return average;

	}

	public static boolean matchList(ArrayList<String> list1, ArrayList<String> list2) {
		if (list1.size() > list2.size()) {
			for (String string : list2) {
				boolean isMatch = false;
				for (String string2 : list1) {
					if (string.equalsIgnoreCase(string2)) {
						isMatch = true;
					}
				}
				if (!isMatch) {
					return false;
				}
			}
		} else {
			for (String string : list1) {
				boolean isMatch = false;
				for (String string2 : list2) {
					if (string.equalsIgnoreCase(string2)) {
						isMatch = true;
					}
				}
				if (!isMatch) {
					return false;
				}
			}
		}
		return true;

	}

	private static HashMap<String, ArrayList<String>> generateSentanceMap(MaxentTagger tagger,
			List<List<HasWord>> sentences) {
		HashMap<String, ArrayList<String>> sentanceMap = new HashMap<String, ArrayList<String>>();

		for (List<HasWord> sentence : sentences) {
			List<TaggedWord> tSentence = tagger.tagSentence(sentence);
			for (TaggedWord list : tSentence) {
				System.out.println(list.word() + "\t " + list.tag() + " \t ");
				if (sentanceMap.containsKey(list.tag())) {
					sentanceMap.get(list.tag()).add(list.word());
				} else {
					ArrayList<String> wordList = new ArrayList<String>();
					wordList.add(list.word());
					sentanceMap.put(list.tag(), wordList);
				}
			}
			System.out.println();
			System.out.println(SentenceUtils.listToString(tSentence, false));
		}
		return sentanceMap;
	}

}
