package ai.talentify.yinyang;

import java.util.ArrayList;
import java.util.List;

import edu.uniba.di.lacam.kdde.ws4j.servlet.SimilalrityObject;

public class PatternSetSignal extends SignalMatch {

	ArrayList<String> commbinations = new ArrayList<String>();
	
	@Override
	SimilalrityObject patternMatch(String conversationBlock) {
		for (SignalType signalType : MatchingEngine.signalHolderCollection.signlaHolders) {
			for (SignalValue signalValue : signalType.getSignalvalue()) {
				if (signalValue.getType_of_match().name().equalsIgnoreCase(TypeOfMatch.PATTERN_SET_EXACT.name())) {
					String[] lists = signalValue.getValue().split(",");
					for (String string : lists) {
						if(conversationBlock.contains(string)) {
							return new SimilalrityObject(signalType.getKey(), conversationBlock, true, TypeOfMatch.PATTERN_SET_EXACT.name(), 1d, signalValue.getId());
						}
					}
					
				}
			}
		}
		return null;
	}

	

}
