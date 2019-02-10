

import java.util.ArrayList;

/**
 * This object is used in the context of storing the analysis related fields of
 * the sales tasks performed.
 * 
 * @author absin
 *
 */
public class Snippet {
	
	int id;
	float from;
	float to;
	String speaker;
	String text;
	String rawText;
	ArrayList<Signal> signals = new ArrayList<>();
	ArrayList<Signal> invisibleSignals = new ArrayList<>();
	float confidence;
	String stage;
	Boolean isFinal;

	public ArrayList<Signal> getSignals() {
		return signals;
	}

	public void setSignals(ArrayList<Signal> signals) {
		this.signals = signals;
	}

	public ArrayList<Signal> getInvisibleSignals() {
		return invisibleSignals;
	}

	public void setInvisibleSignals(ArrayList<Signal> invisibleSignals) {
		this.invisibleSignals = invisibleSignals;
	}

	public float getFrom() {
		return from;
	}

	public void setFrom(float from) {
		this.from = from;
	}

	public float getTo() {
		return to;
	}

	public void setTo(float to) {
		this.to = to;
	}

	public String getSpeaker() {
		return speaker;
	}

	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getRawText() {
		return rawText;
	}

	public void setRawText(String rawText) {
		this.rawText = rawText;
	}

	public Snippet() {
		super();
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public float getConfidence() {
		return confidence;
	}

	public void setConfidence(float confidence) {
		this.confidence = confidence;
	}

	public Boolean getIsFinal() {
		return isFinal;
	}

	public void setIsFinal(Boolean isFinal) {
		this.isFinal = isFinal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
