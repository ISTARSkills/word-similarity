/**
 * 
 */
package ai.talentify.yinyang;

import java.io.File;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.google.gson.Gson;

import edu.uniba.di.lacam.kdde.ws4j.servlet.SimilalrityObject;

/**
 * @author Vaibhav Verma This is the main Matching Engine which will expose
 *         methods to match a string with different type of signals and will say
 *         which sentence matches to and engine
 */
public class MatchingEngine {
	static String fileName = "signal-def.xml";
	static SignalConfigHolder signalHolderCollection = null;
	// read all signals def files
	static {
		InputStream stream = MatchingEngine.class.getResourceAsStream("/" + fileName);

		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(SignalConfigHolder.class);
			Unmarshaller jaxbUnmarshaller;
			jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			signalHolderCollection= (SignalConfigHolder) jaxbUnmarshaller.unmarshal(stream);

			System.out.println(signalHolderCollection.signlaHolders.size());
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public SimilalrityObject match(String text) throws JAXBException {
		
		for (SignalType signalHolder : signalHolderCollection.signlaHolders) {
			for (SignalValue signalType : signalHolder.getSignalvalue()) {
				SimilalrityObject so = SignalMatchFactory.buildSignalMatch(signalType.getType_of_match()).patternMatch(text);
				
				if(so!=null) {
				System.out.println(so.getScore()+" -- "+so.getTypeOfMatch()+" -- "+so.getSignal());
				}
			}
		}
		return null;

	}
	
	public static void main(String[] args ) {
		System.err.println("Wow");
		MatchingEngine matchingEngine=new MatchingEngine();
		try {
			 matchingEngine.match("Good evening");
 		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
