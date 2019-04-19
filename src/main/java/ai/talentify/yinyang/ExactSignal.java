package ai.talentify.yinyang;

import java.util.ArrayList;

import edu.uniba.di.lacam.kdde.ws4j.servlet.SimilalrityObject;

public class ExactSignal extends SignalMatch {

	@Override
	SimilalrityObject patternMatch(String conversationBlock,String orgId) {
		ArrayList<OrgSignal> orgSignals =MatchingEngine.orgSignalHolderMap.get(orgId);
 
		for (OrgSignal orgSignal : orgSignals) {
			for (OrgSignalValue orgSignalValue : orgSignal.getSignalValues()) {

				if (orgSignalValue.getTypeOfMatch().equalsIgnoreCase(TypeOfMatch.EXACT.name())) {
					if (conversationBlock.toLowerCase().trim().contains(orgSignalValue.getValue().toLowerCase().trim())) {
						//return new SimilalrityObject(signalType.getKey(), conversationBlock, true, TypeOfMatch.EXACT.name(), 1d, signalValue.getId());
						return new SimilalrityObject(orgSignal.getName(), conversationBlock, true, TypeOfMatch.EXACT.name(), 1d, orgSignal.getId(),orgSignal.getName(), orgSignalValue.getValue(),orgSignal.getColor());
					}
				}

			}
		}

		return null;
	}

}
