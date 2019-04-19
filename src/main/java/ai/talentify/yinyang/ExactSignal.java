package ai.talentify.yinyang;

import edu.uniba.di.lacam.kdde.ws4j.servlet.SimilalrityObject;

public class ExactSignal extends SignalMatch {

	@Override
	SimilalrityObject patternMatch(String conversationBlock,String orgId) {
		SignalConfigHolder signalHolderCollection =MatchingEngine.signalHolderMap.get(orgId);
 
		for (SignalType signalType : signalHolderCollection.signlaHolders) {
			for (SignalValue signalValue : signalType.getSignalvalue()) {

				if (signalValue.getType_of_match().name().equalsIgnoreCase(TypeOfMatch.EXACT.name())) {
					if (conversationBlock.toLowerCase().trim().contains(signalValue.getValue().toLowerCase().trim())) {
						//return new SimilalrityObject(signalType.getKey(), conversationBlock, true, TypeOfMatch.EXACT.name(), 1d, signalValue.getId());
						return new SimilalrityObject(signalType.getKey(), conversationBlock, true, TypeOfMatch.EXACT.name(), 1d, signalType.getId(),signalType.getKey(), signalValue.getValue(),signalType.getColor());
					}
				}

			}
		}

		return null;
	}

}
