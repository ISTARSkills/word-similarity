package ai.talentify.yinyang.tests;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import ai.talentify.yinyang.SignalConfigHolder;
import ai.talentify.yinyang.SignalMatchType;
import ai.talentify.yinyang.SignalType;
import ai.talentify.yinyang.SignalValue;

public class ReadWriteSignalConfig {

	public static void main(String[] args) {
		// readSignals();
		writeSignals();

	}

	private static void writeSignals() {

	/*	SignalValue e = new SignalValue(1, "Hi", SignalMatchType.SEMANTIC.name());
		SignalValue e1 = new SignalValue(2, "Good morning", SignalMatchType.SEMANTIC.name());
		SignalValue e2 = new SignalValue(3, "Thanks", SignalMatchType.SEMANTIC.name());*/
		SignalType SignalType1 = new SignalType();
		SignalType1.setId(1);
		SignalType1.setColor("#0101DF");
		SignalType1.setKey("Greetings");
		List<SignalValue> signalvalues = new ArrayList<SignalValue>();

		/*signalvalues.add(e);
		signalvalues.add(e1);
		signalvalues.add(e2);*/
		SignalType1.setSignalvalue(signalvalues);

		SignalConfigHolder customer = new SignalConfigHolder();
		ArrayList<SignalType> signlaHolders = new ArrayList<SignalType>();

		signlaHolders.add(SignalType1);
		customer.setSignlaHolders(signlaHolders);

		try {

			JAXBContext jaxbContext = JAXBContext.newInstance(SignalConfigHolder.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(customer, System.out);

		} catch (JAXBException e11) {
			e11.printStackTrace();
		}

	}

	private static void readSignals() {
		try {

			File file = new File("C:\\file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(SignalConfigHolder.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			SignalConfigHolder customer = (SignalConfigHolder) jaxbUnmarshaller.unmarshal(file);
			System.out.println(customer);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
