package ai.talentify.yinyang;

import java.util.ArrayList;

public class OrgSignal {
	private Integer id;
	private String name;
	private String color;
	private ArrayList<OrgSignalValue> signalValues=new ArrayList<OrgSignalValue>();
	public OrgSignal(Integer id, String name, String color, ArrayList<OrgSignalValue> signalValues) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.signalValues = signalValues;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public ArrayList<OrgSignalValue> getSignalValues() {
		return signalValues;
	}
	public void setSignalValues(ArrayList<OrgSignalValue> signalValues) {
		this.signalValues = signalValues;
	}
	
	
}
