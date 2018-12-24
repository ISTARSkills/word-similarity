package edu.uniba.di.lacam.kdde.ws4j.servlet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.common.io.Resources;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import de.tudarmstadt.ukp.jwktl.JWKTL;
import de.tudarmstadt.ukp.jwktl.api.IWiktionaryEdition;
import de.tudarmstadt.ukp.jwktl.api.IWiktionaryEntry;
import de.tudarmstadt.ukp.jwktl.api.IWiktionaryPage;
import de.tudarmstadt.ukp.jwktl.api.IWiktionaryRelation;
import de.tudarmstadt.ukp.jwktl.api.IWiktionarySense;
import de.tudarmstadt.ukp.jwktl.api.RelationType;
import edu.mit.jwi.IRAMDictionary;
import edu.mit.jwi.item.IIndexWord;
import edu.mit.jwi.item.ISynset;
import edu.mit.jwi.item.IWord;
import edu.mit.jwi.item.IWordID;
import edu.mit.jwi.item.POS;
import edu.stanford.nlp.ling.HasWord;
import edu.stanford.nlp.ling.SentenceUtils;
import edu.stanford.nlp.ling.TaggedWord;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;
import edu.uniba.di.lacam.kdde.lexical_db.ILexicalDatabase;
import edu.uniba.di.lacam.kdde.lexical_db.MITWordNet;
import edu.uniba.di.lacam.kdde.ws4j.RelatednessCalculator;
import edu.uniba.di.lacam.kdde.ws4j.similarity.WuPalmer;
import edu.uniba.di.lacam.kdde.ws4j.util.WS4JConfiguration;

/**
 * Servlet implementation class WordSimilarityServlet
 */
@WebServlet(value = "/wordsimilarity") 
public class WordSimilarityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public WordSimilarityServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	private static RelatednessCalculator[] rcs;
	private static IRAMDictionary dict = new MITWordNet().getDictionary();
	private static File wiktionaryDirectory = new File("/var/TARGET_DIRECTORY");
	private static IWiktionaryEdition wkt = JWKTL.openEdition(wiktionaryDirectory);
	static {
		WS4JConfiguration.getInstance().setMemoryDB(false);
		WS4JConfiguration.getInstance().setMFS(true);
		ILexicalDatabase db = new MITWordNet();
		/*- rcs = new RelatednessCalculator[]{
		        new HirstStOnge(db), new LeacockChodorow(db), new Lesk(db), new WuPalmer(db),
		        new Resnik(db), new JiangConrath(db), new Lin(db), new Path(db)*/
		rcs = new RelatednessCalculator[] { new WuPalmer(db) };
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String word1 = request.getParameter("signal");
		String word2 = request.getParameter("conversationblock");

		response.setContentType("application/json");

		PrintWriter out = response.getWriter();
		SimilalrityObject res = null;
		try {

			res = getWordSimilarty(word1.trim().toLowerCase(), word2.trim().toLowerCase());
		} catch (Exception e) {

		}
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("status", res.typeOfMatch);
		jsonObject.addProperty("value", res.score);

		out.append(new Gson().toJson(jsonObject));
		out.flush();
		out.close();

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public static SimilalrityObject getWordSimilarty(String signal, String conversationBlock) {

		/*
		 * DatamuseQuery q = new DatamuseQuery(); JSONParse jsp = new JSONParse();
		 * 
		 * String[] items = jsp.parseWords(q.findSimilar(signal));
		 */
		double value=0d;
		if (conversationBlock.equalsIgnoreCase(signal)) {
			return new SimilalrityObject(signal, conversationBlock, true, MatchTypes.EXACT_MATCH.name(), 1d);
		}

		if (conversationBlock.toLowerCase().contains(signal)) {
			return new SimilalrityObject(signal, conversationBlock, true, MatchTypes.CONTAINS.name(), 1d);
		}

		IWiktionaryPage page = wkt.getPageForWord(signal);

		if (page != null) {
			System.out.println("Entry found in wictionary for " + signal);

			for (IWiktionaryEntry entry : page.getEntries()) {
				for (IWiktionarySense sense : entry.getSenses()) {
					for (IWiktionaryRelation word : sense.getRelations(RelationType.SYNONYM)) {
						String synonym = word.getTarget();
						System.out.println("RelationType.SYNONYM->" + synonym);
						if (synonym.equalsIgnoreCase(conversationBlock)) {
							return new SimilalrityObject(signal, conversationBlock, true,
									MatchTypes.SYNONYM_EXACT.name(), 1d);
						}

						if (conversationBlock.toLowerCase().contains(synonym)) {
							return new SimilalrityObject(signal, conversationBlock, true,
									MatchTypes.SYNONYM_CONTAINS.name(), 1d);
						}
					}

					for (IWiktionaryRelation word : sense.getRelations(RelationType.HYPERNYM)) {
						String synonym = word.getTarget();
						System.out.println("RelationType.HYPERNYM->" + synonym);
						if (synonym.equalsIgnoreCase(conversationBlock)) {
							return new SimilalrityObject(signal, conversationBlock, true,
									MatchTypes.HYPERNYM_EXACT.name(), 1d);
						}

						if (conversationBlock.toLowerCase().contains(synonym)) {
							return new SimilalrityObject(signal, conversationBlock, true,
									MatchTypes.HYPERNYM_CONTAINS.name(), 1d);
						}
					}

					for (IWiktionaryRelation word : sense.getRelations(RelationType.HYPONYM)) {
						String synonym = word.getTarget();
						System.out.println("RelationType.HYPONYM->" + synonym);
						if (synonym.equalsIgnoreCase(conversationBlock)) {
							return new SimilalrityObject(signal, conversationBlock, true,
									MatchTypes.HYPONYM_EXACT.name(), 1d);
						}

						if (conversationBlock.toLowerCase().contains(synonym)) {
							return new SimilalrityObject(signal, conversationBlock, true,
									MatchTypes.HYPONYM_CONTAINS.name(), 1d);
						}
					}

					for (IWiktionaryRelation word : sense.getRelations(RelationType.COORDINATE_TERM)) {
						String synonym = word.getTarget();
						System.out.println("RelationType.COORDINATE_TERM->" + synonym);
						if (synonym.equalsIgnoreCase(conversationBlock)) {
							return new SimilalrityObject(signal, conversationBlock, true,
									MatchTypes.COORDINATE_TERM_EXACT.name(), 1d);
						}

						if (conversationBlock.toLowerCase().contains(synonym)) {
							return new SimilalrityObject(signal, conversationBlock, true,
									MatchTypes.COORDINATE_TERM_CONTAINS.name(), 1d);
						}
					}
				}
			}

			/*
			 * SimilalrityObject
			 * similalrityObject=getDataMuseWordSimilarty(signal,conversationBlock);;
			 * if(similalrityObject!=null) { return similalrityObject; }
			 */
			// dataMuse Integration

			// wkt.close();
		} else {
			boolean isSignalNegative=false;
			boolean isConversationNegative=false;
			ArrayList<String> alertnateSignals = new ArrayList<>();
			ArrayList<String> stopWords = getStopWords();
			ArrayList<String> negativeWords = getNegativeWords();
			for (String word : negativeWords) {
				if(signal.contains(word)) {
					isSignalNegative=true;
				}
				if(conversationBlock.contains(word)) {
					isConversationNegative=true;
				}
				
			}
			String[] words1 = signal.split(" ");
			String temp = signal;
			for (int i = 0; i < words1.length; i++) {
				String string = words1[i];
				if (!stopWords.contains(string)) {
					ArrayList<String> synonymList = getFilterWordSimilarity(string);
					for (String word : synonymList) {
						// temp.replaceAll(string, word);
						alertnateSignals.add(temp.replaceAll(string, word));
						temp = signal;
					}
				}
			}
			for (String word : alertnateSignals) {
				System.out.println("SYNONYM_SENTENCE_ALTERNATE "+word);
				if (word.equalsIgnoreCase(conversationBlock)) {
					return new SimilalrityObject(signal, conversationBlock, true,
							MatchTypes.SYNONYM_SENTENCE_EXACT.name(), 1d);
				}

				if (conversationBlock.toLowerCase().contains(word)) {
					return new SimilalrityObject(signal, conversationBlock, true,
							MatchTypes.SYNONYM_SENTENCE_CONTAINS.name(), 1d);
				}
			}
			

			System.out.println("No Entry found in wictionary for " + signal);
			  value = sentanceSimilarity(signal.trim().toLowerCase(), conversationBlock.trim().toLowerCase());
			if (value >= 0.90) {
				
				if( isSignalNegative && isConversationNegative) {
				return new SimilalrityObject(signal, conversationBlock, true, MatchTypes.SENTENCE_SIMILARITY.name(),
						value);
				}else if(!isSignalNegative && !isConversationNegative) {
					return new SimilalrityObject(signal, conversationBlock, true, MatchTypes.SENTENCE_SIMILARITY.name(),
							value);
				}
				else {
					value=(1-value);
					if (value >= 0.90) {
					return new SimilalrityObject(signal, conversationBlock, true, MatchTypes.SENTENCE_SIMILARITY.name(),
							value);
					}
				}
			}
			else {
				stanfordSimilarity(signal,conversationBlock);
			}
		}

		return new SimilalrityObject(signal, conversationBlock, true, MatchTypes.NO_MATCH.name(), value);

	}

	private static void stanfordSimilarity(String signal,String conversationBlock) {
		// TODO Auto-generated method stub
		MaxentTagger tagger = null;
		try {
			tagger = new MaxentTagger(new FileInputStream(new File(
					"C:\\Users\\Vaibhav Verma\\git\\word-similarity\\src\\main\\resources\\english-left3words-distsim.tagger")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<List<HasWord>> sentences = MaxentTagger.tokenizeText(new StringReader(signal));
		List<List<HasWord>> conversationSentence = MaxentTagger.tokenizeText(new StringReader(conversationBlock));

		HashMap<String, ArrayList<String>> signalMap = generateSentanceMap(tagger, sentences);
		HashMap<String, ArrayList<String>> convaerSationMap = generateSentanceMap(tagger, conversationSentence);
		
		 
		 
		boolean isMatch=false;
		for (String pos : signalMap.keySet()) {
			if (!pos.startsWith("JJ") && !pos.startsWith("DT") && !pos.startsWith(".")) {
				isMatch=matchList(signalMap.get(pos),convaerSationMap.get(pos));
				if(!isMatch) {
					break;
				}
			}
		}
		System.out.println("isMatch "+isMatch);
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

	private static boolean matchList(ArrayList<String> list1, ArrayList<String> list2) {
		for (String string : list2) {
			for (String string2 : list2) {
				if(!string.equalsIgnoreCase(string2)) {
					return false;
				}
			}
		}
		return true;

	}

	private static ArrayList<String> getNegativeWords() {
		//URL resource = Resources.getResource("negative_words.txt");
		//String csvFile = resource.getFile();   // get file path 
		String csvFile = "/var/negative_words.txt";
				BufferedReader br = null;
				String line = "";
				String cvsSplitBy = ",";

				ArrayList<String> stopWords = new ArrayList<String>();

				try {
					br = new BufferedReader(new FileReader(csvFile));
					while ((line = br.readLine()) != null) {
						// use comma as separator
						String[] country = line.split(cvsSplitBy);
						stopWords.add(country[0]);
						// System.out.println("Country [code= " + country[0] +"]");
					}

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					if (br != null) {
						try {
							br.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}

				return stopWords;
	}

	private static ArrayList<String> getFilterWordSimilarity(String signal) {
		// TODO Auto-generated method stub
		ArrayList<String> synonyms = new ArrayList<String>();
		IWiktionaryPage page = wkt.getPageForWord(signal);
		for (IWiktionaryEntry entry : page.getEntries()) {
			for (IWiktionarySense sense : entry.getSenses()) {
				for (IWiktionaryRelation word : sense.getRelations(RelationType.SYNONYM)) {
					String synonym = word.getTarget();
					// System.out.println(synonym);
					synonyms.add(synonym);
				}

				// System.out.println(sense.getRelations(RelationType.SYNONYM));
			}
		}

		return synonyms;

	}

	private static ArrayList<String> getStopWords() {
		// TODO Auto-generated method stub
		String csvFile = "/var/stop_word.txt";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";

		ArrayList<String> stopWords = new ArrayList<String>();

		try {
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				// use comma as separator
				String[] country = line.split(cvsSplitBy);
				stopWords.add(country[0]);
				// System.out.println("Country [code= " + country[0] +"]");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return stopWords;
	}

	private static SimilalrityObject getDataMuseWordSimilarty(String signal, String conversationBlock) {

		DatamuseQuery q = new DatamuseQuery();
		System.err.println(q.findSimilar("Defeat"));
		JSONParse jsp = new JSONParse();

		String[] items = jsp.parseWords(q.findSimilar("Hello"));
		String[] items2 = jsp.parseWords(q.findSimilar("Good Morning"));

		for (String string : items) {
			for (String string2 : items2) {
				if (string2.equalsIgnoreCase(string)) {
					return new SimilalrityObject(signal, conversationBlock, true, MatchTypes.DATA_MUSE.name(), 1d);
				}
			}
		}

		return null;

	}

	private static double sentanceSimilarity(String sentance1, String sentance2) {
		long t = System.currentTimeMillis();

		float score = 0.0f;
		double average = 0;

		System.out.println(rcs[0].getClass().getName() + "\t");
		String[] words1 = sentance1.split(" ");
		String[] words2 = sentance2.split(" ");
		double[][] k = rcs[0].getSimilarityMatrix(words1, words2);

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

		/*
		 * ArrayList<String> filterWords1 = removeStopWords(sentance1.toLowerCase());
		 * ArrayList<String> filterWords2 = removeStopWords(sentance2.toLowerCase());
		 * System.out.println("\nfilter1 >>>>"); for (String string : filterWords1) {
		 * System.out.println(string); } System.out.println("\nfilter1 >>>>"); for
		 * (String string : filterWords2) { System.out.println(string); }
		 * ArrayList<String> filter1Synonyms=new ArrayList<String>(); ArrayList<String>
		 * filter2Synonyms=new ArrayList<String>();
		 * 
		 * 
		 * for (String word : filterWords1) { filter1Synonyms.add(word);
		 * filter1Synonyms.addAll(getFilterWordSimilarity(word)); } for (String word :
		 * filterWords2) { filter2Synonyms.add(word);
		 * filter2Synonyms.addAll(getFilterWordSimilarity(word)); }
		 * 
		 * System.out.println("\n\n\n\nfilter1Synonyms"); for (String string :
		 * filter1Synonyms) { System.out.println(" "+string); }
		 * System.out.println("\n\n\n\nfilter2Synonyms"); for (String string :
		 * filter2Synonyms) { System.out.println(" "+string); }
		 * 
		 * double filterTotalScore=0;
		 * System.out.println("\n\n\n\n synonyms wupalmer result"); for (String word1 :
		 * filter1Synonyms) { double maxValue=0; for (String word2 : filter2Synonyms) {
		 * double value=rcs[0].calcRelatednessOfWords(word1, word2);
		 * System.out.println(" "+word1 +"  -> "+word2+" -> " +value); if(value >
		 * maxValue ) { maxValue=maxValue+value;
		 * 
		 * } } }
		 */

	}

	private static ArrayList<String> removeStopWords(String sentance) {
		String csvFile = "/var/stop_word.txt";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";

		String[] words = sentance.split(" ");

		ArrayList<String> filterWord = new ArrayList<String>();

		ArrayList<String> stopWords = new ArrayList<String>();

		try {
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				// use comma as separator
				String[] country = line.split(cvsSplitBy);
				stopWords.add(country[0]);
				// System.out.println("Country [code= " + country[0] +"]");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		for (String word : words) {
			if (!stopWords.contains(word)) {
				filterWord.add(word);
			}
		}
		return filterWord;

	}

	private static boolean getIsExistOrNot(String word1) {
		// TODO Auto-generated method stub
		ArrayList<POS> poss = new ArrayList<>();
		ArrayList<String> wordList = new ArrayList<>();
		poss.add(POS.NOUN);
		poss.add(POS.ADJECTIVE);
		poss.add(POS.ADVERB);
		poss.add(POS.VERB);
		boolean isExist = false;

		for (POS pos : poss) {
			IIndexWord idxWord = dict.getIndexWord(word1, pos);
			if (idxWord != null) {
				isExist = true;
			}

		}
		return true;

	}

	private static ArrayList<String> getSysnonyms(String wordd) {
		ArrayList<POS> poss = new ArrayList<>();
		ArrayList<String> wordList = new ArrayList<>();
		poss.add(POS.NOUN);
		poss.add(POS.ADJECTIVE);
		poss.add(POS.ADVERB);
		poss.add(POS.VERB);

		for (POS pos : poss) {
			IIndexWord idxWord = dict.getIndexWord(wordd, pos); // dict.getIndexWord(inputWord,

			if (idxWord != null) {
				int x = idxWord.getTagSenseCount();
				for (int i = 0; i < x; i++) {
					IWordID wordID = idxWord.getWordIDs().get(i);
					IWord word = dict.getWord(wordID);

					// Adding Related Words to List of Realted Words
					ISynset synset = word.getSynset();
					for (IWord w : synset.getWords()) {

						double value = rcs[0].calcRelatednessOfWords(wordd, w.getLemma());
						System.out.println(w.getLemma() + " >>>> " + value);

						// System.out.println(w.getLemma());
						wordList.add(w.getLemma());

						// output.add(w.getLemma());
					}
				}
			}

		}
		return wordList;

	}

}
