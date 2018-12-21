package edu.uniba.di.lacam.kdde.ws4j.demo;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import de.tudarmstadt.ukp.jwktl.JWKTL;
import de.tudarmstadt.ukp.jwktl.api.IWiktionaryEdition;
import de.tudarmstadt.ukp.jwktl.api.IWiktionaryEntry;
import de.tudarmstadt.ukp.jwktl.api.IWiktionaryPage;
import de.tudarmstadt.ukp.jwktl.api.IWiktionaryRelation;
import de.tudarmstadt.ukp.jwktl.api.IWiktionarySense;
import de.tudarmstadt.ukp.jwktl.api.PartOfSpeech;
import de.tudarmstadt.ukp.jwktl.api.RelationType;
import edu.mit.jwi.Dictionary;
import edu.mit.jwi.IRAMDictionary;
import edu.mit.jwi.item.IIndexWord;
import edu.mit.jwi.item.ISynset;
import edu.mit.jwi.item.IWord;
import edu.mit.jwi.item.IWordID;
import edu.mit.jwi.item.IndexWord;
import edu.mit.jwi.item.POS;
import edu.uniba.di.lacam.kdde.lexical_db.ILexicalDatabase;
import edu.uniba.di.lacam.kdde.lexical_db.MITWordNet;
import edu.uniba.di.lacam.kdde.ws4j.RelatednessCalculator;
import edu.uniba.di.lacam.kdde.ws4j.servlet.DatamuseQuery;
import edu.uniba.di.lacam.kdde.ws4j.servlet.JSONParse;
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
		//wictionaryWord();
		csvREad(); getWordSimilarty(word1.trim().toLowerCase(), word2.trim().toLowerCase());

	}

	 

	private static void csvREad() {
		// TODO Auto-generated method stub
		
	}



	private static void wictionaryWord() {
		File wiktionaryDirectory = new File("C:\\Users\\Vaibhav Verma\\Documents\\TARGET_DIRECTORY");

		ArrayList<de.tudarmstadt.ukp.jwktl.api.PartOfSpeech> poss = new ArrayList<de.tudarmstadt.ukp.jwktl.api.PartOfSpeech>();
		poss.add(PartOfSpeech.NOUN);
		poss.add(PartOfSpeech.VERB);
		poss.add(PartOfSpeech.ADJECTIVE);
		poss.add(PartOfSpeech.ADVERB);

		IWiktionaryEdition wkt = JWKTL.openEdition(wiktionaryDirectory);
		
		IWiktionaryPage page = wkt.getPageForWord("boat");
		for (IWiktionaryEntry entry : page.getEntries()) {
			System.out.println(entry.getSenseCount());
			if (entry != null) {
				for (IWiktionarySense sense : entry.getSenses()) {
					if (sense != null) {
						for (IWiktionaryRelation word : sense.getRelations(RelationType.COORDINATE_TERM)) {
							System.out.println("COORDINATE_TERM ----" + word.getTarget());
						}

						for (IWiktionaryRelation word : sense.getRelations(RelationType.SYNONYM)) {
							System.out.println("SYNONYM ----" + word.getTarget());
						}

						for (IWiktionaryRelation word : sense.getRelations(RelationType.ANTONYM)) {
							System.out.println("ANTONYM ----" + word.getTarget());
						}

						for (IWiktionaryRelation word : sense.getRelations(RelationType.HYPERNYM)) {
							System.out.println("HYPERNYM ----" + word.getTarget());
						}

						for (IWiktionaryRelation word : sense.getRelations(RelationType.HYPONYM)) {
							System.out.println("HYPONYM ----" + word.getTarget());
						}

						for (IWiktionaryRelation word : sense
								.getRelations(RelationType.CHARACTERISTIC_WORD_COMBINATION)) {
							System.out.println("CHARACTERISTIC_WORD_COMBINATION ----" + word.getTarget());
						}
						for (IWiktionaryRelation word : sense.getRelations(RelationType.DERIVED_TERM)) {
							System.out.println("DERIVED_TERM ----" + word.getTarget());
						}
						for (IWiktionaryRelation word : sense.getRelations(RelationType.DESCENDANT)) {
							System.out.println("DESCENDANT ----" + word.getTarget());
						}
						for (IWiktionaryRelation word : sense.getRelations(RelationType.ETYMOLOGICALLY_RELATED_TERM)) {
							System.out.println("ETYMOLOGICALLY_RELATED_TERM ----" + word.getTarget());
						}
						for (IWiktionaryRelation word : sense.getRelations(RelationType.HOLONYM)) {
							System.out.println("HOLONYM ----" + word.getTarget());
						}
						for (IWiktionaryRelation word : sense.getRelations(RelationType.MERONYM)) {
							System.out.println("MERONYM ----" + word.getTarget());
						}
						for (IWiktionaryRelation word : sense.getRelations(RelationType.SEE_ALSO)) {
							System.out.println("SEE_ALSO ----" + word.getTarget());
						}
						for (IWiktionaryRelation word : sense.getRelations(RelationType.TROPONYM)) {
							System.out.println("TROPONYM ----" + word.getTarget());
						}

					}
				}
			}
		}

		wkt.close();
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
