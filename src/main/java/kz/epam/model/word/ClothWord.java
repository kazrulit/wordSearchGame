package kz.epam.model.word;

import kz.epam.model.pattern.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Khamid_Sarmanov on 12/11/2015.
 */
public class ClothWord {
    public static List getWord() {
        List list = new ArrayList();
        list.add(CLetterPattern.fillLeter("batty ", "banknote", "error"));
        list.add(LLetterPattern.fillLeter("Editable", "Eagle"));
        list.add(OLetterPattern.fillLeter("board", "beginner", "decadent", "roast"));
        list.add(TLetterPattern.fillLeter("angel", "gemstone"));
        list.add(HLetterPattern.fillLeter("Facelift", "affluent", "easel"));

        if(list.size() % 2 != 0)
            list.add(RandomLetterPattern.fillLeter());
        return list;
    }
}
