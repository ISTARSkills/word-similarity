/**
 * 
 */
package ai.talentify.yinyang;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.google.gson.Gson;

import ai.talentify.db.utils.DBUtils;
import edu.uniba.di.lacam.kdde.ws4j.servlet.SimilalrityObject;

/**
 * @author Vaibhav Verma This is the main Matching Engine which will expose
 *         methods to match a string with different type of signals and will say
 *         which sentence matches to and engine
 */
public class MatchingEngine {
	static String fileName = "signal-def.xml";

	//static HashMap<String, SignalConfigHolder> signalHolderMap = new HashMap<>();
	static HashMap<String, ArrayList<OrgSignal>> orgSignalHolderMap = new HashMap<>();
	// read all signals def files
	static {
		String orgSql = "select distinct org_id from org_generic_signal";
		ArrayList<HashMap<String, String>> orgSqlResult = DBUtils.getInstance()
				.executeQuery(Thread.currentThread().getStackTrace(), orgSql);
		for (HashMap<String, String> hashMap0 : orgSqlResult) {

			String orgId = hashMap0.get("org_id");
			ArrayList<OrgSignal> orgSignals = new ArrayList<>();
			
			
			String sql = "SELECT * from generic_signal WHERE id in (SELECT distinct signal_id from generic_signal_value WHERE id in (SELECT generic_signal_value_id from org_generic_signal WHERE org_id="+orgId+"))";
			ArrayList<HashMap<String, String>> sqlResult = DBUtils.getInstance()
					.executeQuery(Thread.currentThread().getStackTrace(), sql);

			for (HashMap<String, String> hashMap : sqlResult) {

				  

				 
					ArrayList<OrgSignalValue> orgSignalValues = new ArrayList<>();
					 String sqlGenericSignalVlaue = "SELECT * from generic_signal_value WHERE signal_id in ("
							+ hashMap.get("id") + ")";
					
					ArrayList<HashMap<String, String>> sqlGenericSignalVlaueResult = DBUtils.getInstance()
							.executeQuery(Thread.currentThread().getStackTrace(), sqlGenericSignalVlaue);
					
					
					
					
					for (HashMap<String, String> hashMap3 : sqlGenericSignalVlaueResult) {
						OrgSignalValue orgSignalValue = new OrgSignalValue(Integer.parseInt(hashMap3.get("id")),
								hashMap3.get("value"), hashMap3.get("type_of_match"),
								Float.parseFloat(hashMap3.get("threshold")));
						orgSignalValues.add(orgSignalValue);
					} 

					OrgSignal signal = new OrgSignal(Integer.parseInt(hashMap.get("id")), hashMap.get("name"),
							hashMap.get("color"), orgSignalValues);
					orgSignals.add(signal);
				 
			}
			
			String sqlMetadata="select * from org_metadata where id in (select meta_data_id from org_properties where org_id="+orgId+") ";
			ArrayList<HashMap<String, String>> resOrgMetadata = DBUtils.getInstance()
					.executeQuery(Thread.currentThread().getStackTrace(), sqlMetadata);
			for (HashMap<String, String> hashMap4 : resOrgMetadata) {
				
				String signalOrgPropSql="select * from org_properties where org_id="+orgId+" and meta_data_id="+hashMap4.get("id");
				ArrayList<HashMap<String, String>> resSignalOrgPropSql = DBUtils.getInstance()
						.executeQuery(Thread.currentThread().getStackTrace(), signalOrgPropSql);
				
				ArrayList<OrgSignalValue> orgSignalValues = new ArrayList<>();
				for (HashMap<String, String> hashMap5 : resSignalOrgPropSql) {
					OrgSignalValue orgSignalValue = new OrgSignalValue(Integer.parseInt(hashMap5.get("id")),
							hashMap5.get("value"), "EXACT",
							0.85f);
					orgSignalValues.add(orgSignalValue);
				}

				String str[] ="BRAND_NAME".toLowerCase().split("_");
				String key="";
				for (String s : str) {
					key=key+" "+s;
				}
				key=key.substring(0,2).toUpperCase()+key.substring(2);
 				OrgSignal signal = new OrgSignal(Integer.parseInt(hashMap4.get("id")),key ,
						hashMap4.get("color"), orgSignalValues);
				orgSignals.add(signal);
			}
			
			orgSignalHolderMap.put(orgId, orgSignals);
		}
		
		
		
		

		/*- InputStream stream = MatchingEngine.class.getResourceAsStream("/" + fileName);
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(SignalConfigHolder.class);
			Unmarshaller jaxbUnmarshaller;
			jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			final SignalConfigHolder 	signalHolderCollection = (SignalConfigHolder) jaxbUnmarshaller.unmarshal(stream);
			try {
				stream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String orgSql = "select distinct org_id from org_properties";
			ArrayList<HashMap<String, String>> orgResult = DBUtils.getInstance()
					.executeQuery(Thread.currentThread().getStackTrace(), orgSql);
			for (HashMap<String, String> h : orgResult) {
				String orgId = h.get("org_id");
				SignalConfigHolder tempSignalHolderCollection = signalHolderCollection;
				ArrayList<SignalType> signalTypes=new ArrayList<>();
				for (SignalType signalHolder : tempSignalHolderCollection.signlaHolders) {
					SignalType tempSignalHolder=signalHolder;
					
					ArrayList<SignalValue> signalValues = new ArrayList<>();
					for (SignalValue signalType : signalHolder.getSignalvalue()) {
						if (signalType.getValue().startsWith("$$") && signalType.getValue().endsWith("$$")) {
							String value = signalType.getValue().replaceAll("\\$\\$", "");
							String sql = "select org_properties.*,org_metadata.key from org_properties, org_metadata where org_properties.meta_data_id = org_metadata.id and key='"
									+ value + "' and org_id in (" + orgId + " )";
							ArrayList<HashMap<String, String>> sqlResult = DBUtils.getInstance()
									.executeQuery(Thread.currentThread().getStackTrace(), sql);
		
							int i = 0;
							SignalValue svTemp = null;
							for (HashMap<String, String> hashMap : sqlResult) {
								if (i == 0) {
									svTemp = signalType;
									svTemp.setValue(hashMap.get("value"));
		
									signalValues.add(svTemp);
								} else {
		
									SignalValue sv = new SignalValue();
									sv.setType_of_match(svTemp.getType_of_match());
									sv.setValue(hashMap.get("value"));
		
									signalValues.add(sv);
								}
								i++;
							}
						} else {
							signalValues.add(signalType);
						}
					}
					 
					tempSignalHolder.setSignalvalue(signalValues);
					signalTypes.add(tempSignalHolder);
				}
				tempSignalHolderCollection.setSignlaHolders(signalTypes);;
				
				System.out.println(orgId+"  "+new Gson().toJson(tempSignalHolderCollection));
				System.out.println(orgId+">>"+new Gson().toJson(signalHolderCollection));
				signalHolderMap.put(orgId, tempSignalHolderCollection);
				tempSignalHolderCollection=null;
			}
		
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}

	public SimilalrityObject match(String text, Integer productId) throws JAXBException {

		String sql = "select * from product where id=" + productId;
		ArrayList<HashMap<String, String>> sqlResult = DBUtils.getInstance()
				.executeQuery(Thread.currentThread().getStackTrace(), sql);

		String orgId = sqlResult.get(0).get("organization_id");

		try {

			if (orgId != null) {
				ArrayList<OrgSignal> orgSignals = orgSignalHolderMap.get(orgId);
				if(orgSignals != null && orgSignalHolderMap != null ) {
				for (OrgSignal orgSignal : orgSignals) {
					for (OrgSignalValue orgSignalValue : orgSignal.getSignalValues()) {
						//System.out.println("orgSignalValue.getTypeOfMatch() "+orgSignalValue.getTypeOfMatch());
						//System.out.println("orgId  " + orgId + "   " + orgSignalValue.getValue() + " text "+text);
 						SimilalrityObject so = SignalMatchFactory.buildSignalMatch(orgSignalValue.getTypeOfMatch())
								.patternMatch(text, orgId);
						if (so != null) {
							// System.out.println(so.getScore() + " -- " + so.getTypeOfMatch() + " -- " +
							// so.getSignal());
							return so;
						}
					}
				}
				}

			}
			return new SimilalrityObject("", text, false, "NO_MATCH", 0d, -1);
		} finally {
			resetSignalHolder();
		}
	}

	private void resetSignalHolder() {
		/*
		 * InputStream stream = MatchingEngine.class.getResourceAsStream("/" +
		 * fileName);
		 * 
		 * try { JAXBContext jaxbContext =
		 * JAXBContext.newInstance(SignalConfigHolder.class); Unmarshaller
		 * jaxbUnmarshaller; jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		 * signalHolderCollection = (SignalConfigHolder)
		 * jaxbUnmarshaller.unmarshal(stream);
		 * 
		 * System.out.println(signalHolderCollection.signlaHolders.size()); } catch
		 * (JAXBException e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 */
	}

	public static void main(String[] args) {
		System.err.println("Wow");
		MatchingEngine matchingEngine = new MatchingEngine();
		try {
			matchingEngine.match("hello", 448);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
