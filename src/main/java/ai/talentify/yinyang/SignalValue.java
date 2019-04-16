package ai.talentify.yinyang;

import javax.xml.bind.annotation.XmlAttribute;

public class SignalValue {
	private Integer id;
	private String value ;
	private TypeOfMatch type_of_match;
	public SignalValue() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	

	public SignalValue(Integer id, String value, TypeOfMatch type_of_match) {
		super();
		this.id = id;
		this.value = value;
		this.type_of_match = type_of_match;
	}





	public Integer getId() {
		return id;
	}

	@XmlAttribute(name="id")
	public void setId(Integer id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	@XmlAttribute(name="value")
	public void setValue(String value) {
		this.value = value;
	}



	@XmlAttribute(name="type_of_match")
	public TypeOfMatch getType_of_match() {
		return type_of_match;
	}



	public void setType_of_match(TypeOfMatch type_of_match) {
		this.type_of_match = type_of_match;
	}

}
