package ai.talentify.yinyang;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="SignalConfigHolder")

public class SignalConfigHolder {
	ArrayList<SignalType> signlaHolders = new ArrayList<SignalType>();

	public ArrayList<SignalType> getSignlaHolders() {
		return signlaHolders;
	}

	public void setSignlaHolders(ArrayList<SignalType> signlaHolders) {
		this.signlaHolders = signlaHolders;
	}
	
	
	
}
