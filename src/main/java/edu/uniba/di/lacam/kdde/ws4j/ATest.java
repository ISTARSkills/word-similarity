package edu.uniba.di.lacam.kdde.ws4j;

import java.util.Arrays;

import edu.uniba.di.lacam.kdde.ws4j.servlet.MatchTypes;
import edu.uniba.di.lacam.kdde.ws4j.servlet.SimilalrityObject;

public class ATest {

	public static void main(String[] args) throws java.lang.Exception {
		String[] convSplited = "how are you?".split("\\b+");
		Arrays.parallelSetAll(convSplited, (i) -> convSplited[i].trim());
		String tempConv = "";
		for (String s : convSplited) {
			if(s.length()>0)
				tempConv=tempConv+s+" ";
		}
		 
		System.out.println(tempConv.trim()+"--");
	}

}
