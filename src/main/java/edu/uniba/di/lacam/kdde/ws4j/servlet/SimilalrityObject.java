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
	
	
	
	
	
	
	
	
	
	
	

	public SimilalrityObject(String signal, String conversationBlock, boolean ismatched, String typeOfMatch,
			Double score) {
		super();
		this.signal = signal;
		this.conversationBlock = conversationBlock;
		this.ismatched = ismatched;
		this.typeOfMatch = typeOfMatch;
		this.score = score;
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
	
	
}
