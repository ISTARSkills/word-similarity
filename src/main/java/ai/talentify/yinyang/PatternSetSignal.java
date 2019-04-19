package ai.talentify.yinyang;

import java.util.ArrayList;
import java.util.List;

import edu.uniba.di.lacam.kdde.ws4j.servlet.SimilalrityObject;

public class PatternSetSignal extends SignalMatch {

	ArrayList<String> commbinations = new ArrayList<String>();
	
	@Override
	SimilalrityObject patternMatch(String conversationBlock ,String orgId){
		ArrayList<OrgSignal> orgSignals =MatchingEngine.orgSignalHolderMap.get(orgId);

		for (OrgSignal orgSignal : orgSignals) {
			for (OrgSignalValue orgSignalValue : orgSignal.getSignalValues()) {
				if (orgSignalValue.getTypeOfMatch().equalsIgnoreCase(TypeOfMatch.PATTERN_SET_EXACT.name())) {
					String[] lists = orgSignalValue.getValue().split(",");
					for (String string : lists) {
						if(conversationBlock.contains(string)) {
							//return new SimilalrityObject(signalType.getKey(), conversationBlock, true, TypeOfMatch.PATTERN_SET_EXACT.name(), 1d, signalValue.getId());
							return new SimilalrityObject(orgSignal.getName(), conversationBlock, true, TypeOfMatch.PATTERN_SET_EXACT.name(), 1d, orgSignal.getId(),orgSignal.getName(), orgSignalValue.getValue(),orgSignal.getColor());
						}
					}
					
				}
			}
		}
		return null;
	}

	

}
