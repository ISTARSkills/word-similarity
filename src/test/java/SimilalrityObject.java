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
	
	
	
	
	
	
	
	
	
	
	
	
	public SimilalrityObject(String signal, String conversationBlock, boolean ismatched, String typeOfMatch) {
		super();
		this.signal = signal;
		this.conversationBlock = conversationBlock;
		this.ismatched = ismatched;
		this.typeOfMatch = typeOfMatch;
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
	
	
}
