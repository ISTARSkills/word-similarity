package edu.uniba.di.lacam.kdde.ws4j.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Servlet implementation class WSTTest
 */
public class WSTTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WSTTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getParameter("");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	private static double sentanceSimilarity(String sentance1, String sentance2) {
		/*
		 * long t = System.currentTimeMillis();
		 * 
		 * float score = 0.0f; double average = 0;
		 * 
		 * System.out.println(WordSimilarityServlet.rcs[0].getClass().getName() + "\t");
		 * String[] words1 = sentance1.split(" "); String[] words2 =
		 * sentance2.split(" "); double[][] k =
		 * WordSimilarityServlet.rcs[0].getSimilarityMatrix(words1, words2);
		 * 
		 * double totalScore = 0;
		 * 
		 * for (int i = 0; i < k.length; i++) { // double[] maxValue = new
		 * double[k.length]; double maxValue = 0;
		 * 
		 * for (int j = 0; j < k[i].length; j++) { System.out.println(k[i][j] + " ---- "
		 * + words1[i] + " >>>>>> " + words2[j]); if (k[i][j] > maxValue) { maxValue =
		 * k[i][j]; } } totalScore += maxValue; } //
		 * System.out.println("sentance1.length() "+words1.length); average = (double)
		 * totalScore / (double) words1.length; System.out.println("totalScore " +
		 * totalScore); System.out.println("average " + average);
		 * 
		 * System.out.println("\nDone in " + (System.currentTimeMillis() - t) +
		 * " msec.");
		 */

		OkHttpClient client = new OkHttpClient();

		MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
		RequestBody body = RequestBody.create(mediaType, "sentence1=sentence1&sentence2=sentence1");
		Request request = new Request.Builder().url("http://db.talentify.in:5010/").post(body)
				.addHeader("content-type", "application/x-www-form-urlencoded").addHeader("cache-control", "no-cache")
				.addHeader("postman-token", "c0f3ec5d-3af4-8efb-677d-396e26d44d49").build();

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
		float res=0.0f;
		JSONObject jsonObject = new JSONObject(result);
		if (jsonObject.has("similarityScore")) {
			String similarityScore =jsonObject.getString("similarityScore");
			res =Float.parseFloat(similarityScore);
		}
		return res;

	}


}
