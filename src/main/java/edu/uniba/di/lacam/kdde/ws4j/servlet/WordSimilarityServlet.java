package edu.uniba.di.lacam.kdde.ws4j.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import edu.mit.jwi.IRAMDictionary;
import edu.mit.jwi.item.IIndexWord;
import edu.mit.jwi.item.ISynset;
import edu.mit.jwi.item.IWord;
import edu.mit.jwi.item.IWordID;
import edu.mit.jwi.item.POS;
import edu.uniba.di.lacam.kdde.lexical_db.ILexicalDatabase;
import edu.uniba.di.lacam.kdde.lexical_db.MITWordNet;
import edu.uniba.di.lacam.kdde.ws4j.RelatednessCalculator;
 import edu.uniba.di.lacam.kdde.ws4j.demo.SimilarityCalculationDemo;
import edu.uniba.di.lacam.kdde.ws4j.similarity.WuPalmer;
import edu.uniba.di.lacam.kdde.ws4j.util.WS4JConfiguration;

/**
 * Servlet implementation class WordSimilarityServlet
 */
public class WordSimilarityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public WordSimilarityServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	private static RelatednessCalculator[] rcs;
	private static IRAMDictionary dict = new MITWordNet().getDictionary();
	static {
		WS4JConfiguration.getInstance().setMemoryDB(false);
		WS4JConfiguration.getInstance().setMFS(true);
		ILexicalDatabase db = new MITWordNet();
		/*- rcs = new RelatednessCalculator[]{
		        new HirstStOnge(db), new LeacockChodorow(db), new Lesk(db), new WuPalmer(db),
		        new Resnik(db), new JiangConrath(db), new Lin(db), new Path(db)*/
		rcs = new RelatednessCalculator[] { new WuPalmer(db) };
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String word1 = request.getParameter("signal");
		String word2 = request.getParameter("conversationblock");

		response.setContentType("application/json");
		
		PrintWriter out = response.getWriter();
		String res="Not Found";
		try {
			 
		  res=getWordSimilarty(word1.trim().toLowerCase(), word2.trim().toLowerCase()).getTypeOfMatch();
		}catch (Exception e) {
 		}
		if(res!=null) {
			System.out.println(res);
		}else {
			System.out.println("Not Found");
		}
		
		
		out.append(new Gson().toJson(res));
		out.flush();
		out.close();

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	private static SimilalrityObject getWordSimilarty(String signal, String conversationBlock) {

		if (conversationBlock.toLowerCase().contains(signal)) {
			return new SimilalrityObject(signal, conversationBlock, true, MatchTypes.CONTAINS.name());
		}

		if (conversationBlock.equalsIgnoreCase(signal)) {
			return new SimilalrityObject(signal, conversationBlock, true, MatchTypes.EXACT_MATCH.name());
		}

		if (getIsExistOrNot(signal)) {
			for (String synonym : getSysnonyms(signal)) {
				if (synonym.equalsIgnoreCase(conversationBlock)) {
					return new SimilalrityObject(signal, conversationBlock, true, MatchTypes.SYNONYM_EXACT.name());
				}

				if (conversationBlock.toLowerCase().contains(synonym)) {
					return new SimilalrityObject(signal, conversationBlock, true, MatchTypes.SYNONYM_CONATINS.name());
				}
			}
		} else {
			String[] words1 = signal.split(" ");
			String[] words2 = conversationBlock.split(" ");
			double[][] k = rcs[0].getSimilarityMatrix(words1, words2);
			for (int i = 0; i < k.length; i++) {
				for (int j = 0; j < k[i].length; j++) {
					System.out.println(k[i][j] + " ---- " + words1[i] + " >>>>>> " + words2[j]);
				}
			}
		}

		return null;

	}
	private static boolean getIsExistOrNot(String word1) {
		// TODO Auto-generated method stub
		ArrayList<POS> poss = new ArrayList<>();
		ArrayList<String> wordList = new ArrayList<>();
		poss.add(POS.NOUN);
		poss.add(POS.ADJECTIVE);
		poss.add(POS.ADVERB);
		poss.add(POS.VERB);
		boolean isExist = false;

		for (POS pos : poss) {
			IIndexWord idxWord = dict.getIndexWord(word1, pos);
			if (idxWord != null) {
				isExist = true;
			}

		}
		return isExist;

	}
	private static ArrayList<String> getSysnonyms(String wordd) {
		ArrayList<POS> poss = new ArrayList<>();
		ArrayList<String> wordList = new ArrayList<>();
		poss.add(POS.NOUN);
		poss.add(POS.ADJECTIVE);
		poss.add(POS.ADVERB);
		poss.add(POS.VERB);

		for (POS pos : poss) {
			IIndexWord idxWord = dict.getIndexWord(wordd, pos); // dict.getIndexWord(inputWord,

			if (idxWord != null) {
				int x = idxWord.getTagSenseCount();
				for (int i = 0; i < x; i++) {
					IWordID wordID = idxWord.getWordIDs().get(i);
					IWord word = dict.getWord(wordID);

					// Adding Related Words to List of Realted Words
					ISynset synset = word.getSynset();
					for (IWord w : synset.getWords()) {

						double value = rcs[0].calcRelatednessOfWords(wordd, w.getLemma());
						System.out.println(w.getLemma() + " >>>> " + value);

						// System.out.println(w.getLemma());
						wordList.add(w.getLemma());

						// output.add(w.getLemma());
					}
				}
			}

		}
		return wordList;

	}


}
