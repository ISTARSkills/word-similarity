package ai.talentify.yinyang;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;

import ai.talentify.db.utils.DBProperties;
import edu.uniba.di.lacam.kdde.ws4j.servlet.SimilalrityObject;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class SemanticSignal extends SignalMatch {

	@Override
	SimilalrityObject patternMatch(String conversationBlock,String orgId) {
		ArrayList<OrgSignal> orgSignals =MatchingEngine.orgSignalHolderMap.get(orgId);

		for (OrgSignal orgSignal : orgSignals) {
			for (OrgSignalValue orgSignalValue : orgSignal.getSignalValues()) {

				if (orgSignalValue.getTypeOfMatch().equalsIgnoreCase(TypeOfMatch.SEMANTIC.name())) {

					double value = sentanceSimilarity(orgSignalValue.getValue().toLowerCase().trim(), conversationBlock.trim().toLowerCase());
					if (value > 0.7) {
						return new SimilalrityObject(orgSignal.getName(), conversationBlock, true, TypeOfMatch.SEMANTIC.name(), value, orgSignal.getId(),
								orgSignal.getName(), orgSignalValue.getValue(),orgSignal.getColor());
						
					}

				}

			}
		}
		return null;
	}

	private static double sentanceSimilarity(String sentance1, String sentance2) {

		OkHttpClient client = new OkHttpClient.Builder().connectTimeout(10, TimeUnit.SECONDS).writeTimeout(10, TimeUnit.SECONDS).readTimeout(30, TimeUnit.SECONDS).build();

		MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
		RequestBody body = RequestBody.create(mediaType, "sentence1=" + sentance1 + "&sentence2=" + sentance2);
		
		//System.out.println("Url >>>>>>> "+DBProperties.getProperty("EMOTION_ANALYZER_URL")+"sentence_similarity" + " >>>>> "+sentance1 +"  sentance2    "+sentance2);
		Request request = new Request.Builder().url(DBProperties.getProperty("EMOTION_ANALYZER_URL")+"sentence_similarity").post(body).addHeader("content-type", "application/x-www-form-urlencoded").addHeader("cache-control", "no-cache").addHeader("postman-token", "c0f3ec5d-3af4-8efb-677d-396e26d44d49").build();

		Response response = null;
		try {
			response = client.newCall(request).execute();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String result = null;
		try {
			result = response.body().string();
		} catch (IOException e) {
			e.printStackTrace();
		}
		float res = 0.0f;
		JSONObject jsonObject = new JSONObject(result);
		if (jsonObject.has("similarityScore")) {
			String similarityScore = jsonObject.getString("similarityScore");
			res = Float.parseFloat(similarityScore);
		}
		return res;

	}

}
