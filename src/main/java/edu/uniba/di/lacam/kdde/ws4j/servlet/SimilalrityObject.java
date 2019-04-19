package edu.uniba.di.lacam.kdde.ws4j.servlet;
/**
 * 
 */

/**
 * @author vaibhav
 *
 */
public class SimilalrityObject {
	String signal; 
	String conversationBlock;
	boolean ismatched;
	String typeOfMatch;
	Double score;
	Integer signalId;
	String signalName;
	String signalValue;
	String color;
 	
	
	
	
	
	
	
	
	
	
	

 
	public SimilalrityObject(String signal, String conversationBlock, boolean ismatched, String typeOfMatch,
			Double score, Integer signalId, String signalName, String signalValue, String color) {
		super();
		this.signal = signal;
		this.conversationBlock = conversationBlock;
		this.ismatched = ismatched;
		this.typeOfMatch = typeOfMatch;
		this.score = score;
		this.signalId = signalId;
		this.signalName = signalName;
		this.signalValue = signalValue;
		this.color = color;
	}
	public SimilalrityObject(String signal, String conversationBlock, boolean ismatched, String typeOfMatch,
			Double score, Integer signalId) {
		super();
		this.signal = signal;
		this.conversationBlock = conversationBlock;
		this.ismatched = ismatched;
		this.typeOfMatch = typeOfMatch;
		this.score = score;
		this.signalId = signalId;
	}
	public String getSignal() {
		return signal;
	}
	public void setSignal(String signal) {
		this.signal = signal;
	}
	public String getConversationBlock() {
		return conversationBlock;
	}
	public void setConversationBlock(String conversationBlock) {
		this.conversationBlock = conversationBlock;
	}
	public boolean isIsmatched() {
		return ismatched;
	}
	public void setIsmatched(boolean ismatched) {
		this.ismatched = ismatched;
	}
	public String getTypeOfMatch() {
		return typeOfMatch;
	}
	public void setTypeOfMatch(String typeOfMatch) {
		this.typeOfMatch = typeOfMatch;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	public Integer getSignalId() {
		return signalId;
	}
	public void setSignalId(Integer signalId) {
		this.signalId = signalId;
	}
	public String getSignalName() {
		return signalName;
	}
	public void setSignalName(String signalName) {
		this.signalName = signalName;
	}
	public String getSignalValue() {
		return signalValue;
	}
	public void setSignalValue(String signalValue) {
		this.signalValue = signalValue;
	}
	
	
}
