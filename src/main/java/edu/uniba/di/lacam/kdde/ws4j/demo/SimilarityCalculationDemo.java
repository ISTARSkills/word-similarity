package edu.uniba.di.lacam.kdde.ws4j.demo;

import edu.uniba.di.lacam.kdde.lexical_db.ILexicalDatabase;
import edu.uniba.di.lacam.kdde.lexical_db.MITWordNet;
import edu.uniba.di.lacam.kdde.ws4j.RelatednessCalculator;
import edu.uniba.di.lacam.kdde.ws4j.similarity.*;
import edu.uniba.di.lacam.kdde.ws4j.util.WS4JConfiguration;

import java.util.Arrays;

public class SimilarityCalculationDemo {

	private static RelatednessCalculator[] rcs;

	static {
		WS4JConfiguration.getInstance().setMemoryDB(false);
		WS4JConfiguration.getInstance().setMFS(true);
		ILexicalDatabase db = new MITWordNet();
		/*- rcs = new RelatednessCalculator[]{
		        new HirstStOnge(db), new LeacockChodorow(db), new Lesk(db), new WuPalmer(db),
		        new Resnik(db), new JiangConrath(db), new Lin(db), new Path(db)*/
		rcs = new RelatednessCalculator[] { new Lesk(db) };
	}

	public static void main(String[] args) {
		long t = System.currentTimeMillis();
		Arrays.asList(rcs).forEach(rc -> {
			System.out.println(rc.getClass().getName() + "\t");
			String[] words1 = "I kill you".split(" ");
			String[] words2 = "I murder you".split(" ");
			double[][] k = rc.getSimilarityMatrix(words1, words2);
			for (int i = 0; i < k.length; i++) {
				for (int j = 0; j < k[i].length; j++) {
					System.out.println(k[i][j] + " ---- " + words1[i] + " >>>>>> " + words2[j]);
				}
			}
		});

		System.out.println("\nDone in " + (System.currentTimeMillis() - t) + " msec.");
	}

	public double[][] sentenceSimilarity(String word1, String word2) {
		String[] words1 = word1.split(" ");
		String[] words2 = word2.split(" ");
		double[][] k = rcs[0].getSimilarityMatrix(words1, words2);
		for (int i = 0; i < k.length; i++) {
			for (int j = 0; j < k[i].length; j++) {
				System.out.println(k[i][j] + " ---- " + words1[i] + " >>>>>> " + words2[j]);
			}
		}
		return k;
	}

	public double wordSimilarity(String word1, String word2) {
		long t = System.currentTimeMillis();
		// Arrays.asList(rcs).forEach(
		// rc -> System.out.println(rc.getClass().getName() + "\t" +
		// rc.calcRelatednessOfWords(word1, word2)));
		// System.out.println("\nDone in " + (System.currentTimeMillis() - t) +
		// " msec.");
		return rcs[0].calcRelatednessOfWords(word1, word2);
	}
}