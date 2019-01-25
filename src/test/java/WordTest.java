import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import de.tudarmstadt.ukp.jwktl.JWKTL;
import de.tudarmstadt.ukp.jwktl.api.IWiktionaryEdition;
import de.tudarmstadt.ukp.jwktl.api.IWiktionaryEntry;
import de.tudarmstadt.ukp.jwktl.api.IWiktionaryPage;
import de.tudarmstadt.ukp.jwktl.api.IWiktionaryRelation;
import de.tudarmstadt.ukp.jwktl.api.IWiktionarySense;
import de.tudarmstadt.ukp.jwktl.api.RelationType;
import edu.mit.jwi.IRAMDictionary;
import edu.uniba.di.lacam.kdde.lexical_db.MITWordNet;
import edu.uniba.di.lacam.kdde.ws4j.servlet.SignalPhrase;
import edu.uniba.di.lacam.kdde.ws4j.servlet.WordSimilarityServlet;

public class WordTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		csvReader();
		//System.exit(0);
	}

	private static void csvReader() {
		IRAMDictionary dict = new MITWordNet().getDictionary();
		File wiktionaryDirectory = new File("/var/TARGET_DIRECTORY");
		IWiktionaryEdition wkt = JWKTL.openEdition(wiktionaryDirectory);
		ArrayList<String> stopWords = new ArrayList<String>();
		ArrayList<String> negativeWords = new ArrayList<String>();
		HashSet<String> types = new HashSet<String>();

		List<SignalPhrase> synonyms = new ArrayList<SignalPhrase>();
		String signal = "Task";
		IWiktionaryPage page =  WordSimilarityServlet.wkt.getPageForWord(signal);
			try {

				for (IWiktionaryEntry entry : page.getEntries()) {
					if (entry != null ) {
						for (IWiktionarySense sense : entry.getSenses()) {
							if (sense != null &&  sense.getRelations().size() > 0) {
								for (IWiktionaryRelation word : sense.getRelations() ) {

									/*if (word.getRelationType().equals(RelationType.SYNONYM)
											|| word.getRelationType().equals(RelationType.HYPERNYM)
											|| word.getRelationType().equals(RelationType.COORDINATE_TERM)
											|| word.getRelationType().equals(RelationType.MERONYM)
											|| word.getRelationType().equals(RelationType.TROPONYM)) {*/
										if (word.getRelationType() != null && word != null) {
											try {
												System.out.println(word + "-->" + word.getRelationType());
												String synonym = word.getTarget();
												SignalPhrase phrase = new SignalPhrase(synonym, word.getRelationType());
												synonyms.add(phrase);
												types.add(word.getRelationType().name());
											} catch (Exception e) {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
										//}
									}
								}
							}
						}
					}
				}
			} catch (Exception e) {
				//e.printStackTrace();
			}
		

		for (SignalPhrase signalPhrase : synonyms) {
			System.out.println(signalPhrase.getAlternate() + " ---> " + signalPhrase.getType());
		}
	}

}
