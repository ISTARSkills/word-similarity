import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;

import com.sun.corba.se.impl.io.InputStreamHook;

import edu.stanford.nlp.ling.SentenceUtils;

import edu.stanford.nlp.ling.TaggedWord;

import edu.stanford.nlp.ling.HasWord;

import edu.stanford.nlp.tagger.maxent.MaxentTagger;

public class StanFordSentence implements generateSentanceMap {

	public static void main(String[] args) throws FileNotFoundException {
		MaxentTagger tagger = new MaxentTagger(new FileInputStream(new File(
				"C:\\Users\\Vaibhav Verma\\git\\word-similarity\\src\\main\\resources\\english-left3words-distsim.tagger")));
		List<List<HasWord>> sentences = MaxentTagger.tokenizeText(new StringReader("This is a cat"));
		List<List<HasWord>> conversationSentence = MaxentTagger.tokenizeText(new StringReader("Is this a cat?"));

		HashMap<String, ArrayList<String>> signalMap = generateSentanceMap(tagger, sentences);
		HashMap<String, ArrayList<String>> convaerSationMap = generateSentanceMap(tagger, conversationSentence);
		
		 
		 
		boolean isMatch=false;
		for (String pos : signalMap.keySet()) {
			if (!pos.startsWith("JJ") && !pos.startsWith("DT")) {
				isMatch=matchList(signalMap.get(pos),convaerSationMap.get(pos));
				if(!isMatch) {
					break;
				}
			}
		}
		System.out.println("isMatch "+isMatch);
	}

	private static boolean matchList(ArrayList<String> list1, ArrayList<String> list2) {
		for (String string : list2) {
			for (String string2 : list2) {
				if(!string.equalsIgnoreCase(string2)) {
					return false;
				}
			}
		}
		return true;

	}

	private static HashMap<String, ArrayList<String>> generateSentanceMap(MaxentTagger tagger,
			List<List<HasWord>> sentences) {
		HashMap<String, ArrayList<String>> sentanceMap = new HashMap<String, ArrayList<String>>();

		for (List<HasWord> sentence : sentences) {
			List<TaggedWord> tSentence = tagger.tagSentence(sentence);
			for (TaggedWord list : tSentence) {
				System.out.println(list.word() + "\t " + list.tag() + " \t ");
				if (sentanceMap.containsKey(list.tag())) {
					sentanceMap.get(list.tag()).add(list.word());
				} else {
					ArrayList<String> wordList = new ArrayList<String>();
					wordList.add(list.word());
					sentanceMap.put(list.tag(), wordList);
				}
			}
			System.out.println();
			System.out.println(SentenceUtils.listToString(tSentence, false));
		}
		return sentanceMap;
	}

}
