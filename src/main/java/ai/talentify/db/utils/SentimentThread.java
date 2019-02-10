package ai.talentify.db.utils;
import com.google.gson.Gson;

import ai.talentify.db.utils.Analysis;
import ai.talentify.db.utils.DBUtils;
import ai.talentify.db.utils.NLP;
import ai.talentify.db.utils.Snippet;

public class SentimentThread implements Runnable {

	private String analytics;
	private String id;
	public SentimentThread(String analytics, String id) {
		super();
		this.analytics = analytics;
		this.id = id;
	}
	@Override
	public void run() {
		try {
			int agentCount = 0;
			float totalSentiment = 0f;
			Analysis analysis = new Gson().fromJson(analytics, Analysis.class);
			for (Snippet snippet : analysis.getConversation()) {
				if (snippet.getSpeaker().equalsIgnoreCase("Agent")) {
					agentCount++;
					float value =  25*(NLP.findSentiment(snippet.getText()));
					totalSentiment = totalSentiment +value;

				}
			}
			if(agentCount != 0) {
				System.out.println(totalSentiment);
				String sql = "update task set sentiment=" + ((totalSentiment) / agentCount) + " where id="
						+ id;
				DBUtils.getInstance().insertIntoDB(sql);
			} else {
				String sql = "update task set sentiment=100 where id="
						+ id;
				DBUtils.getInstance().insertIntoDB(sql);
			}

		} catch (Exception e) {
			String sql = "update task set sentiment=100 where id=" + id;
			DBUtils.getInstance().insertIntoDB(sql);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
