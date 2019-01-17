package edu.uniba.di.lacam.kdde.ws4j.servlet;

public class TrieNode  
{  
    final static int SIZE = 26;  
    TrieNode[] children = new TrieNode[SIZE];  
  
    // isLeaf is true if the node represents  
    // end of a word  
    boolean isLeaf;  
      
    // constructor  
    public TrieNode() {  
        isLeaf = false;  
        for (int i =0 ; i< SIZE ; i++)  
                children[i] = null;  
    }  
}  