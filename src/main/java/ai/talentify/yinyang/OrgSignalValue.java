package ai.talentify.yinyang;

public class OrgSignalValue {
	private Integer id;
	private String value;
	private String typeOfMatch;
	private Float threshold;
	public OrgSignalValue(Integer id, String value, String typeOfMatch, Float threshold) {
		super();
		this.id = id;
		this.value = value;
		this.typeOfMatch = typeOfMatch;
		this.threshold = threshold;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getTypeOfMatch() {
		return typeOfMatch;
	}
	public void setTypeOfMatch(String typeOfMatch) {
		this.typeOfMatch = typeOfMatch;
	}
	public Float getThreshold() {
		return threshold;
	}
	public void setThreshold(Float threshold) {
		this.threshold = threshold;
	}
	
	
}
