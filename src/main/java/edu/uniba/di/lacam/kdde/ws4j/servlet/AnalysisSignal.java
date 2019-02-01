/**
 * 
 */
package edu.uniba.di.lacam.kdde.ws4j.servlet;

import java.util.ArrayList;

import de.tudarmstadt.ukp.jwktl.api.IWiktionaryEntry;
import de.tudarmstadt.ukp.jwktl.api.IWiktionaryPage;
import de.tudarmstadt.ukp.jwktl.api.IWiktionaryRelation;
import de.tudarmstadt.ukp.jwktl.api.IWiktionarySense;
import de.tudarmstadt.ukp.jwktl.api.RelationType;

/**
 * @author Vaibhav Verma
 *
 */
public class AnalysisSignal {
	public AnalysisSignal(int id, String signal) {
		// List<IWiktionaryPage> pages =
		// WordSimilarityServlet.wkt.getPagesForWord(signal, true);
		word = signal;
		this.id = id;
		for (IWiktionaryPage page : WordSimilarityServlet.wkt.getPagesForWord(signal, false)) {
			try {

				for (IWiktionaryEntry entry : page.getEntries()) {
					for (IWiktionarySense sense : entry.getSenses()) {
						for (IWiktionaryRelation word : sense.getRelations()) {
							try {
								String synonym = word.getTarget();
								SignalPhrase phrase = new SignalPhrase(synonym, word.getRelationType());
								if ((word.getRelationType().name().equalsIgnoreCase(RelationType.ANTONYM.name()))
										|| (word.getRelationType().name()
												.equalsIgnoreCase(RelationType.CHARACTERISTIC_WORD_COMBINATION.name()))
										|| (word.getRelationType().name().equalsIgnoreCase(RelationType.HOLONYM.name()))
										|| (word.getRelationType().name()
												.equalsIgnoreCase(RelationType.HYPERNYM.name()))
										|| (word.getRelationType().name().equalsIgnoreCase(RelationType.MERONYM.name()))
										|| (word.getRelationType().name().equalsIgnoreCase(RelationType.SYNONYM.name()))
										|| (word.getRelationType().name()
												.equalsIgnoreCase(RelationType.TROPONYM.name()))) {
									synonyms.add(phrase);
								}
							} catch (Exception e) {
								// TODO Auto-generated catch block
								// e.printStackTrace();
							}

						}
					}
				}
			} catch (Exception e) {
			}
		}

	}

	/*-	if (pages.size() != 0) {
			System.out.println("Entry found in wictionary for " + signal);
			this.id=id;
			
			for (int i = 0; i < pages.size(); i++) {
				IWiktionaryPage page = pages.get(i);
				for (IWiktionaryEntry entry : page.getEntries()) {
					try {
					for (IWiktionarySense sense : entry.getSenses()) {
						for (IWiktionaryRelation word : sense.getRelations()) {
							String synonym = word.getTarget();
							System.out.println("RelationType.SYNONYM->" + synonym);
							SignalPhrase phrase = new SignalPhrase(synonym, word.getRelationType());
							synonyms.add(phrase);
						}
	
					}
					} catch (Exception e) {
					}
				}
			}
		}*/

	int id;
	String word;
	ArrayList<SignalPhrase> synonyms = new ArrayList<SignalPhrase>();

}
