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

	static HashMap<String, SignalConfigHolder> signalHolderMap = new HashMap<>();
	static HashMap<String, OrgSignal> orgSignalHolderMap = new HashMap<>();
	// read all signals def files
	static {
		
		
		String sql="SELECT * from org_generic_signal WHERE org_id=90";
		
		
		ArrayList<HashMap<String, String>> sqlResult = DBUtils.getInstance().executeQuery(Thread.currentThread().getStackTrace(), sql);

		 for (HashMap<String, String> hashMap : sqlResult) {
			 String sqlGenericSignal="SELECT * from generic_signal WHERE id in (SELECT signal_id from generic_signal_value WHERE id in ("+hashMap.get("generic_signal_value_id")+"))";
			 
			 ArrayList<HashMap<String, String>> sqlGenericResult = DBUtils.getInstance().executeQuery(Thread.currentThread().getStackTrace(), sqlGenericSignal);
			 
			 for (HashMap<String, String> hashMap2 : sqlGenericResult) {
				 
				 String sqlGenericSignalVlaue="SELECT * from generic_signal_value WHERE signal_id in ("+hashMap2.get("id")+")";
				 ArrayList<HashMap<String, String>> sqlGenericSignalVlaueResult = DBUtils.getInstance().executeQuery(Thread.currentThread().getStackTrace(), sqlGenericSignalVlaue);
				 
				 for (HashMap<String, String> hashMap3 : sqlResult) {
					OrgSignalValue orgSignalValues=new OrgSignalValue(Integer.parseInt(hashMap3.get("id")), hashMap3.get("value"), hashMap3.get("type_of_match"), Float.parseFloat(hashMap3.get("threshold")));
				}
				 
				 OrgSignal signal=new OrgSignal(hashMap2.get("id"), hashMap2.get("name"), hashMap2.get("color"));
			}
			 
			
			 
			 
			 
			
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
		ArrayList<HashMap<String, String>> sqlResult = DBUtils.getInstance().executeQuery(Thread.currentThread().getStackTrace(), sql);

		String orgId = sqlResult.get(0).get("organization_id");

		try {

			if (orgId != null) {
				SignalConfigHolder signalHolderCollection1 = signalHolderMap.get(orgId);
				for (SignalType signalHolder : signalHolderCollection1.signlaHolders) {
					for (SignalValue signalType : signalHolder.getSignalvalue()) {
						System.out.println("orgId  " + orgId + "   " + signalType.getValue());
						SimilalrityObject so = SignalMatchFactory.buildSignalMatch(signalType.getType_of_match()).patternMatch(text, orgId);
						if (so != null) {
							// System.out.println(so.getScore() + " -- " + so.getTypeOfMatch() + " -- " +
							// so.getSignal());
							return so;
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
			matchingEngine.match("abcd", 448);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
