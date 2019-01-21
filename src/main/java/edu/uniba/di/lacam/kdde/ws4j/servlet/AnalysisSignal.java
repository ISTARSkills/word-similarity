/**
 * 
 */
package edu.uniba.di.lacam.kdde.ws4j.servlet;

import java.util.ArrayList;
import java.util.List;

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
		List<IWiktionaryPage> pages = WordSimilarityServlet.wkt.getPagesForWord(signal, true);

		if (pages.size() != 0) {
			System.out.println("Entry found in wictionary for " + signal);

			for (int i = 0; i < pages.size(); i++) {
				IWiktionaryPage page = pages.get(i);
				for (IWiktionaryEntry entry : page.getEntries()) {
					for (IWiktionarySense sense : entry.getSenses()) {
						for (IWiktionaryRelation word : sense.getRelations()) {
							String synonym = word.getTarget();
							System.out.println("RelationType.SYNONYM->" + synonym);
							SignalPhrase phrase = new SignalPhrase(synonym, word.getRelationType());
							synonyms.add(phrase);
						}

					}
				}
			}
		}
	}

	int id;
	String word;
	ArrayList<SignalPhrase> synonyms;

}
