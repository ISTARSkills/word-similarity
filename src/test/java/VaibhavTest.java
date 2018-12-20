import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import edu.mit.jwi.IRAMDictionary;
import edu.mit.jwi.item.IIndexWord;
import edu.mit.jwi.item.ISynset;
import edu.mit.jwi.item.IWord;
import edu.mit.jwi.item.IWordID;
import edu.mit.jwi.item.POS;
import edu.uniba.di.lacam.kdde.lexical_db.ILexicalDatabase;
import edu.uniba.di.lacam.kdde.lexical_db.MITWordNet;
import edu.uniba.di.lacam.kdde.ws4j.RelatednessCalculator;
import edu.uniba.di.lacam.kdde.ws4j.demo.SimilarityCalculationDemo;
import edu.uniba.di.lacam.kdde.ws4j.similarity.WuPalmer;
import edu.uniba.di.lacam.kdde.ws4j.util.WS4JConfiguration;

public class VaibhavTest {
	private static IRAMDictionary dict = new MITWordNet().getDictionary();
	private static RelatednessCalculator[] rcs;

	static {
		WS4JConfiguration.getInstance().setMemoryDB(false);
		WS4JConfiguration.getInstance().setMFS(true);
		ILexicalDatabase db = new MITWordNet();

		rcs = new RelatednessCalculator[] { new WuPalmer(db) };
	}

	public static void main(String[] args) {
		/*
		 * Check the word is exist is or not else return senticene //contains
		 * check if the word is present check the contains check if it false
		 * then get all the synonyms and again so a contains check
		 * 
		 */

		// someTest();

		// first check wether signal has a valid entry in wordnet
		// get synonyms
		// check synonyms contans in second sentence

		// if first one has entry in wordnet then check for senetnec similarity

		// System.out.println(rcs[0].calcRelatednessOfWords("kill","murder"));
		String word1 = "precisely";
		String word2 = "exxxxactly";
		String res="Not Found";
		try {
		  res=getWordSimilarty(word1, word2).getTypeOfMatch();
		}catch (Exception e) {
 		}
		if(res!=null) {
			System.out.println(res);
		}else {
			System.out.println("Not Found");
		}
	
		// getSentenceSimlarity();

	}

	private static void getSentenceSimlarity() {
		// TODO Auto-generated method stub
		String words1[] = "runn".split(" ");
		String words2[] = "I will defeat you".split(" ");
		double[][] k = rcs[0].getSimilarityMatrix(words1, words2);

		for (int i = 0; i < k.length; i++) {
			for (int j = 0; j < k[i].length; j++) {
				System.err.println(k[i][j] + " ---- " + words1[i] + " >>>>>> " + words2[j]);
			}
		}
	}

	private static SimilalrityObject getWordSimilarty(String signal, String conversationBlock) {

		if (conversationBlock.toLowerCase().contains(signal)) {
			return new SimilalrityObject(signal, conversationBlock, true, MatchTypes.CONTAINS.name());
		}

		if (conversationBlock.equalsIgnoreCase(signal)) {
			return new SimilalrityObject(signal, conversationBlock, true, MatchTypes.EXACT_MATCH.name());
		}

		if (getIsExistOrNot(signal)) {
			for (String synonym : getSysnonyms(signal)) {
				if (synonym.equalsIgnoreCase(conversationBlock)) {
					return new SimilalrityObject(signal, conversationBlock, true, MatchTypes.SYNONYM_EXACT.name());
				}

				if (conversationBlock.toLowerCase().contains(synonym)) {
					return new SimilalrityObject(signal, conversationBlock, true, MatchTypes.SYNONYM_CONATINS.name());
				}
			}
		} else {
			String[] words1 = signal.split(" ");
			String[] words2 = conversationBlock.split(" ");
			double[][] k = rcs[0].getSimilarityMatrix(words1, words2);
			for (int i = 0; i < k.length; i++) {
				for (int j = 0; j < k[i].length; j++) {
					System.out.println(k[i][j] + " ---- " + words1[i] + " >>>>>> " + words2[j]);
				}
			}
		}

		return null;

	}

	private static boolean isInWordNet(String signal) {
		// TODO Auto-generated method stub
		return false;
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
		return isExist;

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

	private static void someTest() {
		SimilarityCalculationDemo Champa = new SimilarityCalculationDemo();
		Champa.wordSimilarity("kill", "murder");
		System.out.println(Champa.wordSimilarity("kill", "murder"));

		String csvFile = "C:\\Users\\vaibhav\\Downloads\\Sentence.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";

		try {

			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				String[] country = line.split(cvsSplitBy);
				try {
					System.out.println(" Score-> " + Champa.wordSimilarity(country[0], country[1]) + "Expected Score ->"
							+ country[2]);
				} catch (ArrayIndexOutOfBoundsException e) {
					System.err.println(country[1]);
				}
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
	}

}
