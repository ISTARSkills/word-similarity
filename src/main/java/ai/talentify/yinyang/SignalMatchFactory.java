package ai.talentify.yinyang;

public class SignalMatchFactory {
	private static SignalMatchFactory single_instance = null;

	public SignalMatchFactory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static SignalMatchFactory getInstance() {
		if (single_instance == null)
			single_instance = new SignalMatchFactory();

		return single_instance;
	}

	public static SignalMatch buildSignalMatch(TypeOfMatch type) {
		SignalMatch signalMatch = null;
		

		switch (type) {
		case SEMANTIC:
			return new SemanticSignal();

		case EXACT:
			return new ExactSignal();


		case PATTERN_SET_EXACT:
			return new PatternSetSignal();


		default:

		}

		return signalMatch;

	}

}
