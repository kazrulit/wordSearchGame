package kz.epam.model.word;

import kz.epam.model.pattern.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Khamid_Sarmanov on 12/11/2015.
 */
public class FocalWord {
    public static List getWord() {
        List list = new ArrayList();
        list.add(FLetterPattern.fillLeter("heavy", "handmade", "dirty"));
        list.add(OLetterPattern.fillLeter("ivory", "impostor ", "yachting", "reorg"));
        list.add(CLetterPattern.fillLeter("joint ", "jetliner", "river"));
        list.add(ALetterPattern.fillLeter("knave", "kindness", "energize", "defer"));
        list.add(LLetterPattern.fillLeter("mainland", "debug"));

        if(list.size() % 2 != 0)
            list.add(RandomLetterPattern.fillLeter());

        return list;
    }
}
