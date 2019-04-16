package ai.talentify.yinyang;

import edu.uniba.di.lacam.kdde.ws4j.servlet.SimilalrityObject;

public abstract class SignalMatch {
	abstract SimilalrityObject patternMatch(String conversationBlock);
}

enum TypeOfMatch 
{ 
	SEMANTIC,EXACT,PATTERN_SET_EXACT
} 