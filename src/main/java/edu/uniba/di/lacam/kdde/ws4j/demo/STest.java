package edu.uniba.di.lacam.kdde.ws4j.demo;

import java.util.Arrays;
import java.util.Iterator;

import edu.mit.jwi.IRAMDictionary;
import edu.mit.jwi.item.IIndexWord;
import edu.mit.jwi.item.ISynset;
import edu.mit.jwi.item.IWord;
import edu.mit.jwi.item.IWordID;
import edu.mit.jwi.item.POS;
import edu.uniba.di.lacam.kdde.lexical_db.ILexicalDatabase;
import edu.uniba.di.lacam.kdde.lexical_db.MITWordNet;
import edu.uniba.di.lacam.kdde.ws4j.RelatednessCalculator;
import edu.uniba.di.lacam.kdde.ws4j.similarity.HirstStOnge;
import edu.uniba.di.lacam.kdde.ws4j.similarity.JiangConrath;
import edu.uniba.di.lacam.kdde.ws4j.similarity.LeacockChodorow;
import edu.uniba.di.lacam.kdde.ws4j.similarity.Lesk;
import edu.uniba.di.lacam.kdde.ws4j.similarity.Lin;
import edu.uniba.di.lacam.kdde.ws4j.similarity.Path;
import edu.uniba.di.lacam.kdde.ws4j.similarity.Resnik;
import edu.uniba.di.lacam.kdde.ws4j.similarity.WuPalmer;
import edu.uniba.di.lacam.kdde.ws4j.util.WS4JConfiguration;

public class STest {

	private static RelatednessCalculator[] rcs;
	private static IRAMDictionary dict = new MITWordNet().getDictionary();

	static {
		WS4JConfiguration.getInstance().setMemoryDB(false);
		WS4JConfiguration.getInstance().setMFS(true);
		ILexicalDatabase db = new MITWordNet();
		rcs = new RelatednessCalculator[] { new HirstStOnge(db), new LeacockChodorow(db), new Lesk(db),
				new WuPalmer(db), new Resnik(db), new JiangConrath(db), new Lin(db), new Path(db) };
	}

	public static void main(String[] args) {
		/*
		 * long t = System.currentTimeMillis(); Arrays.asList(rcs).forEach(rc ->
		 * System.out.println(rc.getClass().getName() + "\t" +
		 * rc.calcRelatednessOfWords("act", "moderate")));
		 * System.out.println("\nDone in " + (System.currentTimeMillis() - t) +
		 * " msec.");
		 */
		test(POS.NOUN);
		test(POS.ADJECTIVE);
		test(POS.ADVERB);
		test(POS.VERB);

	}

	private static void test(POS pos) {
		
		IIndexWord idxWord = dict.getIndexWord("running away", pos); // dict.getIndexWord(inputWord,
		try {

			int x = idxWord.getTagSenseCount();
			for (int i = 0; i < x; i++) {
				IWordID wordID = idxWord.getWordIDs().get(i);
				IWord word = dict.getWord(wordID);

				// Adding Related Words to List of Realted Words
				ISynset synset = word.getSynset();
				for (IWord w : synset.getWords()) {
					System.out.println(w.getLemma());
					// output.add(w.getLemma());
				}
			}
		} catch (Exception ex) {
			System.out.println("No synonym found!");
		}

	}

}
