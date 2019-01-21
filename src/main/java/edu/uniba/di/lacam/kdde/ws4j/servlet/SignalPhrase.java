package edu.uniba.di.lacam.kdde.ws4j.servlet;
import de.tudarmstadt.ukp.jwktl.api.RelationType;
public class SignalPhrase {
	String alternate;
	RelationType type;
	public String getAlternate() {
		return alternate;
	}
	public void setAlternate(String alternate) {
		this.alternate = alternate;
	}
	public RelationType getType() {
		return type;
	}
	public void setType(RelationType type) {
		this.type = type;
	}
	public SignalPhrase(String alternate, RelationType type) {
		super();
		this.alternate = alternate;
		this.type = type;
	}
	
	
}	
