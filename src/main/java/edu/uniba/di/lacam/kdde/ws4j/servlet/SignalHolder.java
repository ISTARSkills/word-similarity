/**
 * 
 */
package edu.uniba.di.lacam.kdde.ws4j.servlet;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.lucene.queries.function.valuesource.ProductFloatFunction;

import ai.talentify.db.utils.DBUtils;

/**
 * @author Vaibhav Verma
 *
 */
public class SignalHolder {
	public static HashMap<Integer, SignalProduct> products = new HashMap<Integer, SignalProduct>();
	
	public void init() {
		// read All products
		
		String productListSQL = "select * from product where deleted=false";
		ArrayList<HashMap<String, String>> dbProducts = DBUtils.getInstance().executeQuery(Thread.currentThread().getStackTrace(), productListSQL);
		
		System.out.println(dbProducts.size() +" size");
		for (HashMap<String, String> dbProduct : dbProducts) {
			products.put(Integer.parseInt(dbProduct.get("id")), new SignalProduct(dbProduct.get("id")));
		}
		// 
	}
}
