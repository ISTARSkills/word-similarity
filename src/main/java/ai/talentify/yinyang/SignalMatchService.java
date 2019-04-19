package ai.talentify.yinyang;

import java.io.InputStream;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class SignalMatchService {
	static String fileName = "signal-def.xml";
	static SignalConfigHolder signalHolderCollection = null;

	public ArrayList<SignalType> fetchXml() {

		InputStream stream = MatchingEngine.class.getResourceAsStream("/" + fileName);
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(SignalConfigHolder.class);
			Unmarshaller jaxbUnmarshaller;
			jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			signalHolderCollection = (SignalConfigHolder) jaxbUnmarshaller.unmarshal(stream);

			System.out.println(signalHolderCollection.signlaHolders.size());
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<SignalType> signalTypes = new ArrayList<>();

		for (SignalType signalType : signalHolderCollection.signlaHolders) {
			signalTypes.add(signalType);
		}
		return  signalTypes;
	}
	public void signalXmlUpdate() {

	}
}
