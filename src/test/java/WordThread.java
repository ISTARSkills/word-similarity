import java.util.ArrayList;
import java.util.HashMap;

import de.tudarmstadt.ukp.jwktl.api.IWiktionaryEdition;
import de.tudarmstadt.ukp.jwktl.api.IWiktionaryEntry;
import de.tudarmstadt.ukp.jwktl.api.IWiktionaryPage;
import de.tudarmstadt.ukp.jwktl.api.IWiktionaryRelation;
import de.tudarmstadt.ukp.jwktl.api.IWiktionarySense;
import de.tudarmstadt.ukp.jwktl.api.RelationType;
import edu.uniba.di.lacam.kdde.ws4j.util.DBUtils;

public class WordThread  implements Runnable {
	private IWiktionaryEntry entry;
	private IWiktionaryEdition wkt; 
	
	public WordThread() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public WordThread(IWiktionaryEntry entry, IWiktionaryEdition wkt) {
		super();
		this.entry = entry;
		this.wkt = wkt;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		System.out.println("word  " + entry.getWord());
		String wordDict= entry.getWord().replaceAll("'", "''");
		String existQuery = " SELECT * from word WHERE word='" +wordDict + "';";

		ArrayList<HashMap<String, String>> isExistRes = DBUtils.getInstance()
				.executeQuery(Thread.currentThread().getStackTrace(), existQuery);
		System.out.println(existQuery);
		if (isExistRes.size() == 0) {
			try {
				String sql = "INSERT INTO \"public\".\"word\" (  \"word\") VALUES ( '" + wordDict
						+ "') RETURNING id;";
				ArrayList<HashMap<String, String>> resUser = DBUtils.getInstance()
						.executeQuery(Thread.currentThread().getStackTrace(), sql);
				System.out.println(sql);
				Integer id = Integer.parseInt(resUser.get(0).get("id").toString());

				for (IWiktionarySense sense : entry.getSenses()) {

					for (IWiktionaryRelation word : sense.getRelations(RelationType.SYNONYM)) {
						try {
							String synonym = word.getTarget().replaceAll("'", "''");;
							String wordd = "";
							System.out.println("synioonym \t " + synonym);

							String checkWord = " SELECT * from word WHERE word='" + synonym + "';";

							ArrayList<HashMap<String, String>> rescheckWord = DBUtils.getInstance()
									.executeQuery(Thread.currentThread().getStackTrace(), checkWord);
							System.out.println(checkWord);
							if (rescheckWord.size() > 0) {
								Integer synonymId = Integer.parseInt(rescheckWord.get(0).get("id"));

								String sqlSynonym = "INSERT INTO \"public\".\"word_synonym\" (\"word_id\", \"synonyms_id\") VALUES ("
										+ id + ", " + synonymId + ");";
								DBUtils.getInstance().insertIntoDB(sqlSynonym);
								System.out.println(sqlSynonym);
							} else {
								Integer synonymId = getSynonymId(synonym,wkt);
								if (synonymId != null) {
									String sqlSynonym = "INSERT INTO \"public\".\"word_synonym\" (\"word_id\", \"synonyms_id\") VALUES ("
											+ id + ", " + synonymId + ");";
									DBUtils.getInstance().insertIntoDB(sqlSynonym);
									System.out.println(sqlSynonym);
								}
							}
						} catch (Exception e) {
							// TODO: handle exception
						}
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	private static Integer getSynonymId(String wordCheck,IWiktionaryEdition wkt) {
		// TODO Auto-generated method stub
		IWiktionaryPage page = wkt.getPageForWord(wordCheck);
		
		Integer id = null;
		if (page != null) {
			for (IWiktionaryEntry entry : page.getEntries()) {
				String wordDict= entry.getWord().replaceAll("'", "''");
				String existQuery = " SELECT * from word WHERE word='" + wordDict + "';";

				ArrayList<HashMap<String, String>> isExistRes = DBUtils.getInstance()
						.executeQuery(Thread.currentThread().getStackTrace(), existQuery);
				System.out.println(existQuery);
				if (isExistRes.size() > 0) {
					id = Integer.parseInt(isExistRes.get(0).get("id").toString());
					return id;
				}
				if (isExistRes.size() == 0) {
					try {
						String sql = "INSERT INTO \"public\".\"word\" (  \"word\") VALUES ( '" + wordDict
								+ "') RETURNING id;";
						ArrayList<HashMap<String, String>> resUser = DBUtils.getInstance()
								.executeQuery(Thread.currentThread().getStackTrace(), sql);
						System.out.println(sql);
						id = Integer.parseInt(resUser.get(0).get("id").toString());

						for (IWiktionarySense sense : entry.getSenses()) {
							for (IWiktionaryRelation word : sense.getRelations(RelationType.SYNONYM)) {
								try {
									String synonym = word.getTarget().replaceAll("'", "''");;
									System.out.println("synioonym \t " + synonym);

									System.out.println("RelationType.SYNONYM->" + synonym);

									String checkWord = " SELECT * from word WHERE word='" + synonym + "';";

									ArrayList<HashMap<String, String>> rescheckWord = DBUtils.getInstance()
											.executeQuery(Thread.currentThread().getStackTrace(), checkWord);
									System.out.println(checkWord);
									if (rescheckWord.size() > 0) {
										Integer synonymId = Integer.parseInt(rescheckWord.get(0).get("id"));

										String sqlSynonym = "INSERT INTO \"public\".\"word_synonym\" (\"word_id\", \"synonyms_id\") VALUES ("
												+ id + ", " + synonymId + ");";
										DBUtils.getInstance().insertIntoDB(sqlSynonym);
										System.out.println(sqlSynonym);

									} else {
										Integer synonymId = getSynonymId(synonym,wkt);
										if (synonymId != null) {
											String sqlSynonym = "INSERT INTO \"public\".\"word_synonym\" (\"word_id\", \"synonyms_id\") VALUES ("
													+ id + ", " + synonymId + ");";
											DBUtils.getInstance().insertIntoDB(sqlSynonym);
											System.out.println(sqlSynonym);
										}
									}
								} catch (Exception e) {
									// TODO: handle exception
								}
							}
						}
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			}
		}
		return id;
	}

}
