/**
 * 
 */
package edu.uniba.di.lacam.kdde.ws4j.servlet;

import java.util.ArrayList;
import java.util.HashMap;

import ai.talentify.db.utils.DBUtils;

/**
 * @author Vaibhav Verma
 *
 */
public class SignalProduct {
	public SignalProduct(String productID) {
		// find All Signals and add them 

		String productSignalListSQL = "select * from product_signal where is_active=true and product_id="+productID;
		ArrayList<HashMap<String, String>> dbSignals = DBUtils.getInstance().executeQuery(Thread.currentThread().getStackTrace(), productSignalListSQL);
		for (HashMap<String, String> dbSignal : dbSignals) {
			signals.add(new AnalysisSignal(Integer.parseInt(dbSignal.get("id")), dbSignal.get("value")));
		}
	}
	
	
	int id;
	String name; 
	ArrayList<AnalysisSignal> signals = new ArrayList<AnalysisSignal>(); 

}
