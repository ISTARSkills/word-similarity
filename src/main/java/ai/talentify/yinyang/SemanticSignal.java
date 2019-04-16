package ai.talentify.yinyang;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;

import edu.uniba.di.lacam.kdde.ws4j.servlet.SimilalrityObject;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class SemanticSignal extends SignalMatch {

	@Override
	SimilalrityObject patternMatch(String conversationBlock) {

		for (SignalType signalType : MatchingEngine.signalHolderCollection.signlaHolders) {
			for (SignalValue signalValue : signalType.getSignalvalue()) {

				if (signalValue.getType_of_match().name().equalsIgnoreCase(TypeOfMatch.SEMANTIC.name())) {

					double value = sentanceSimilarity(signalValue.getValue().toLowerCase().trim(), conversationBlock.trim().toLowerCase());
					if (value > 0.7) {
						return new SimilalrityObject(signalType.getKey(), conversationBlock, true, TypeOfMatch.SEMANTIC.name(), value, signalValue.getId());
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
		Request request = new Request.Builder().url("http://35.200.182.146:5010/sentence_similarity").post(body).addHeader("content-type", "application/x-www-form-urlencoded").addHeader("cache-control", "no-cache").addHeader("postman-token", "c0f3ec5d-3af4-8efb-677d-396e26d44d49").build();

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
