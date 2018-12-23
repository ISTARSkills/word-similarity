package edu.uniba.di.lacam.kdde.lexical_db;

import java.util.List;

import edu.uniba.di.lacam.kdde.lexical_db.data.Concept;
import edu.uniba.di.lacam.kdde.lexical_db.item.Link;
import edu.uniba.di.lacam.kdde.lexical_db.item.POS;

public interface ILexicalDatabase {

    Concept getConcept(String lemma, POS pos, int sense);

    List<Concept> getAllConcepts(String lemma, POS pos);

    List<Concept> getLinkedSynsets(Concept concept, Link link);

    List<String> getWords(Concept concept);

    List<String> getGloss(Concept concept, Link link);
}
