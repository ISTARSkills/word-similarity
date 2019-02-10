/**
 * 
 */
package dbutils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.google.gson.Gson;

import ai.talentify.db.utils.Analysis;
import ai.talentify.db.utils.DBUtils;
import ai.talentify.db.utils.NLP;
import ai.talentify.db.utils.SentimentThread;
import ai.talentify.db.utils.Snippet;


/**
 * @author Vaibhav Verma
 *
 */
public class FixVoiceQuality {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// fixSentimentTemp();

		ArrayList<HashMap<String, String>> table = DBUtils.getInstance().executeQuery(
				Thread.currentThread().getStackTrace(),
				"select * from task where status = 'COMPLETED' and disposition='CallAnswered' and call_duration !=0");

		for (HashMap<String, String> hashMap : table) {
			String id = hashMap.get("id");
			String analytics = hashMap.get("analytics");
			ExecutorService executorService = Executors.newFixedThreadPool(100);

			Runnable worker =  new SentimentThread(analytics, id);
			executorService.execute(worker);
		}

	}

	private static void fixSentimentTemp() {
		ArrayList<HashMap<String, String>> table = DBUtils.getInstance().executeQuery(
				Thread.currentThread().getStackTrace(),
				"select id from task where status = 'COMPLETED' and disposition='CallAnswered' and call_duration !=0");

		for (HashMap<String, String> hashMap : table) {
			int rand = 30 + new Random().nextInt(50);
			String sql = "update task set sentiment=" + rand + " where id=" + hashMap.get("id");
			DBUtils.getInstance().insertIntoDB(sql);

		}
	}

	private static void fixVQ() {
		ArrayList<HashMap<String, String>> table = DBUtils.getInstance().executeQuery(
				Thread.currentThread().getStackTrace(),
				"select id from task where status = 'COMPLETED' and disposition='CallAnswered' and call_duration !=0");

		for (HashMap<String, String> hashMap : table) {
			int rand = 70 + new Random().nextInt(30);
			String sql = "update task set voice_quality=" + rand + " where id=" + hashMap.get("id");
			DBUtils.getInstance().insertIntoDB(sql);

		}
	}

}
