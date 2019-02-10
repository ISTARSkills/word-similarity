package ai.talentify.db.utils;

public class Signal {
	String name;
	String type;
	String featureValue;
	String featureType;
	String color;
	int id;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Signal() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFeatureValue() {
		return featureValue;
	}

	public void setFeatureValue(String featureValue) {
		this.featureValue = featureValue;
	}

	public String getFeatureType() {
		return featureType;
	}

	public void setFeatureType(String featureType) {
		this.featureType = featureType;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Signal(String name, String type, String featureValue, String featureType) {
		super();
		this.name = name;
		this.type = type;
		this.featureValue = featureValue;
		this.featureType = featureType;
	}

	
}
