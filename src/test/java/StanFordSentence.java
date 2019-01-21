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
				"C:\\Users\\Anurag\\git\\word-similarity\\src\\main\\resources\\english-left3words-distsim.tagger")));
		List<List<HasWord>> sentences = MaxentTagger.tokenizeText(new StringReader("this is a cat"));
		List<List<HasWord>> conversationSentence = MaxentTagger.tokenizeText(new StringReader("is this a cat"));

		HashMap<String, ArrayList<String>> signalMap = generateSentanceMap(tagger, sentences);
		HashMap<String, ArrayList<String>> convaerSationMap = generateSentanceMap(tagger, conversationSentence);
		
		
		HashMap<String, String> tagMap=new HashMap<String, String>();
		
		for (String pos : signalMap.keySet()) {
			if (!tagMap.containsKey(pos)) {
				tagMap.put(pos, pos);
			}  
		}
		for (String pos : convaerSationMap.keySet()) {
			if (!tagMap.containsKey(pos)) {
				tagMap.put(pos, pos);
			}  
		}
		
		 
		 
		boolean isMatch=false;
		for (String pos : tagMap.keySet()) {
			if (pos.startsWith("NN") || pos.startsWith("VB") || pos.startsWith(".")  ) {
				if(signalMap.get(pos)!=null && convaerSationMap.get(pos)!=null) {
				isMatch = matchList(signalMap.get(pos), convaerSationMap.get(pos));
				}else {
					isMatch=false;
					break;
				}
				if (!isMatch) {
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
