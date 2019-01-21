package edu.uniba.di.lacam.kdde.ws4j.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

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
import edu.uniba.di.lacam.kdde.lexical_db.ILexicalDatabase;
import edu.uniba.di.lacam.kdde.lexical_db.MITWordNet;
import edu.uniba.di.lacam.kdde.ws4j.RelatednessCalculator;
import edu.uniba.di.lacam.kdde.ws4j.servlet.WordSimilarityServlet;
import edu.uniba.di.lacam.kdde.ws4j.similarity.WuPalmer;
import edu.uniba.di.lacam.kdde.ws4j.util.WS4JConfiguration;

public class SimilarityCalculationDemo {

	private static RelatednessCalculator[] rcs;
	//private static File wiktionaryDirectory = new File("C:\\Users\\Anurag\\Documents\\TARGET_DIRECTORY");
	//private static IWiktionaryEdition wkt = JWKTL.openEdition(wiktionaryDirectory);
	private static IRAMDictionary dict = new MITWordNet().getDictionary();
	static {
		WS4JConfiguration.getInstance().setMemoryDB(false);
		WS4JConfiguration.getInstance().setMFS(true);
		ILexicalDatabase db = new MITWordNet();
		/*- rcs = new RelatednessCalculator[]{
		        new HirstStOnge(db), new LeacockChodorow(db), new Lesk(db), new WuPalmer(db),
		        new Resnik(db), new JiangConrath(db), new Lin(db), new Path(db)*/
		rcs = new RelatednessCalculator[] { new WuPalmer(db) };
	}

	public static void main(String[] args) {

		// sentanceSimilarity("I kill you", "I murder you");
		 csvReader() ;
		
	}
	

	private static void csvReader() {
		// TODO Auto-generated method stub
		
		StringBuffer out = new StringBuffer();
		String csvFile = "C:\\Users\\Anurag\\Downloads\\similarwords.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";

		try {
			int i=0;

			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				
				
				// use comma as separator
				String[] country = line.split(cvsSplitBy);

				// System.out.println("Country [code= " + country[0] + " , name=" + country[1] +
				// "]");
				try {
					
					/*
					 * System.out.println(WordSimilarityServlet
					 * .getWordSimilarty(country[0].trim().toLowerCase(),
					 * country[1].trim().toLowerCase()) .getTypeOfMatch());
					 * edu.uniba.di.lacam.kdde.ws4j.servlet.SimilalrityObject obj=
					 * WordSimilarityServlet .getWordSimilarty(country[0].trim().toLowerCase(),
					 * country[1].trim().toLowerCase());
					 * 
					 * if(!obj.getTypeOfMatch().equalsIgnoreCase("NO_MATCH")) {
					 * out.append(country[0].trim().toLowerCase() + "\t" +
					 * country[1].trim().toLowerCase() +"\t" + obj.getTypeOfMatch() +
					 * "\t"+obj.getScore()+ "\r\n" ); }else { obj =WordSimilarityServlet
					 * .getWordSimilarty(country[0].trim().toLowerCase(),
					 * country[1].trim().toLowerCase()); }
					 */
				} catch (Exception e) {
					out.append(country[0].trim().toLowerCase() + "\t" + country[1].trim().toLowerCase() +"\t NO_MATCH \r\n" );
				}
				i++;
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
		
		
		try {
			File file = new File("C:\\Users\\Anurag\\Downloads\\restest.csv");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(out.toString());
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

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

						  //System.out.println(w.getLemma());
						wordList.add(w.getLemma());

						// output.add(w.getLemma());
					}
				}
			}

		}
		return wordList;

	}
	private static void sentanceSimilarity(String sentance1, String sentance2) {
		long t = System.currentTimeMillis();

		float score = 0.0f;
		Arrays.asList(rcs).forEach(rc -> {
			System.out.println(rc.getClass().getName() + "\t");
			String[] words1 = sentance1.split(" ");
			String[] words2 = sentance2.split(" ");
			double[][] k = rc.getSimilarityMatrix(words1, words2);

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
			double average = (double) totalScore / (double) words1.length;
			System.out.println("totalScore " + totalScore);
			System.out.println("average " + average);

		});

		ArrayList<String> filterWords1 = removeStopWords(sentance1.toLowerCase());
		ArrayList<String> filterWords2 = removeStopWords(sentance2.toLowerCase());
		System.out.println("\nfilter1 >>>>");
		for (String string : filterWords1) {
			System.out.println(string);
		}
		System.out.println("\nfilter1 >>>>");
		for (String string : filterWords2) {
			System.out.println(string);
		}
		ArrayList<String> filter1Synonyms=new ArrayList<String>();
		ArrayList<String> filter2Synonyms=new ArrayList<String>();
		
		
		for (String word : filterWords1) {
			filter1Synonyms.add(word);
			filter1Synonyms.addAll(getFilterWordSimilarity(word));
		}
		for (String word : filterWords2) {
			filter2Synonyms.add(word);
			filter2Synonyms.addAll(getFilterWordSimilarity(word));
		}
		
		System.out.println("\n\n\n\nfilter1Synonyms");
		for (String string : filter1Synonyms) {
			System.out.println(" "+string);
		}
		System.out.println("\n\n\n\nfilter2Synonyms");
		for (String string : filter2Synonyms) {
			System.out.println(" "+string);
		}
		
		double filterTotalScore=0;
		System.out.println("\n\n\n\n synonyms wupalmer result");
		for (String word1 : filter1Synonyms) {
			double maxValue=0;
			for (String word2 : filter2Synonyms) {
				double value=rcs[0].calcRelatednessOfWords(word1, word2);
				System.out.println(" "+word1  +"  -> "+word2+" -> " +value);
				if(value > maxValue ) {
					maxValue=maxValue+value;
										
				}
			}
		}
		
		 
		
		System.out.println("\nDone in " + (System.currentTimeMillis() - t) + " msec.");
		//wkt.close();
	}

	private static ArrayList<String> getFilterWordSimilarity(String signal) {
		// TODO Auto-generated method stub
		ArrayList<String> synonyms = new ArrayList<String>();
		IWiktionaryPage page =null;//wkt.getPageForWord(signal);
		for (IWiktionaryEntry entry : page.getEntries()) {
			for (IWiktionarySense sense : entry.getSenses()) {
				for (IWiktionaryRelation word : sense.getRelations(RelationType.SYNONYM)) {
					String synonym =word.getTarget();
					//System.out.println(synonym);
					synonyms.add(synonym);
				}

				//System.out.println(sense.getRelations(RelationType.SYNONYM));
			}
		}
		
		return synonyms;
		
	}

	private static ArrayList<String> removeStopWords(String sentance) {
		String csvFile = "C:\\Users\\Vaibhav Verma\\git\\word-similarity\\src\\main\\resources\\stop_word.txt";
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

	public double[][] sentenceSimilarity(String word1, String word2) {
		String[] words1 = word1.split(" ");
		String[] words2 = word2.split(" ");
		double[][] k = rcs[0].getSimilarityMatrix(words1, words2);
		for (int i = 0; i < k.length; i++) {
			for (int j = 0; j < k[i].length; j++) {
				System.out.println(k[i][j] + " ---- " + words1[i] + " >>>>>> " + words2[j]);
			}
		}
		return k;
	}

	public double wordSimilarity(String word1, String word2) {
		long t = System.currentTimeMillis();
		// Arrays.asList(rcs).forEach(
		// rc -> System.out.println(rc.getClass().getName() + "\t" +
		// rc.calcRelatednessOfWords(word1, word2)));
		// System.out.println("\nDone in " + (System.currentTimeMillis() - t) +
		// " msec.");
		return rcs[0].calcRelatednessOfWords(word1, word2);
	}
}