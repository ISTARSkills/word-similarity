package ai.talentify.yinyang;

import edu.uniba.di.lacam.kdde.ws4j.servlet.SimilalrityObject;

public class ExactSignal extends SignalMatch {

	@Override
	SimilalrityObject patternMatch(String conversationBlock) {
 
		for (SignalType signalType : MatchingEngine.signalHolderCollection.signlaHolders) {
			for (SignalValue signalValue : signalType.getSignalvalue()) {

				if (signalValue.getType_of_match().name().equalsIgnoreCase(TypeOfMatch.EXACT.name())) {
					if (conversationBlock.toLowerCase().trim().contains(signalValue.getValue().toLowerCase().trim())) {
						return new SimilalrityObject(signalType.getKey(), conversationBlock, true, TypeOfMatch.EXACT.name(), 1d, signalValue.getId());
					}
				}

			}
		}

		return null;
	}

}
