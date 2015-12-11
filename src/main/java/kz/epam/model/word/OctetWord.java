package kz.epam.model.word;

import kz.epam.model.pattern.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Khamid_Sarmanov on 12/11/2015.
 */
public class OctetWord {
    public static List getWord() {
        List list = new ArrayList();
        list.add(OLetterPattern.fillLeter("alter", "aardvark ", "ranchman", "kulan"));
        list.add(CLetterPattern.fillLeter("badge ", "bachelor", "racer"));
        list.add(TLetterPattern.fillLeter("cabin", "backbone"));
        list.add(ELetterPattern.fillLeter("daddy", "dandruff", "fable", "dandy"));
        list.add(TLetterPattern.fillLeter("early", "radiator"));

        if(list.size() % 2 != 0)
            list.add(RandomLetterPattern.fillLeter());

        return list;
    }
}
