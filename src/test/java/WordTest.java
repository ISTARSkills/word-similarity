import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import edu.uniba.di.lacam.kdde.ws4j.servlet.WordSimilarityServlet;

public class WordTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		csvReader();
	}

	private static void csvReader() {
		// TODO Auto-generated method stub
		
		StringBuffer out = new StringBuffer();
		String csvFile = "C:\\rw\\rw\\rw.txt";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = "\t";

		try {

			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] country = line.split(cvsSplitBy);

				// System.out.println("Country [code= " + country[0] + " , name=" + country[1] +
				// "]");
				try {
					
					
					/*
					 * System.out.println(WordSimilarityServlet
					 * .getWordSimilarty(country[0].trim().toLowerCase(),
					 * country[1].trim().toLowerCase()) .getTypeOfMatch());
					 * 
					 * out.append(country[0].trim().toLowerCase() + "," +
					 * country[1].trim().toLowerCase() +"," + WordSimilarityServlet
					 * .getWordSimilarty(country[0].trim().toLowerCase(),
					 * country[1].trim().toLowerCase()).getTypeOfMatch() + "\r\n" );
					 */
				} catch (Exception e) {
					out.append(country[0].trim().toLowerCase() + "," + country[1].trim().toLowerCase() +", NO_MATCH \r\n" );
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		try {
			File file = new File("C:\\Users\\Vaibhav Verma\\Downloads\\similar_result.csv");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(out.toString());
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
