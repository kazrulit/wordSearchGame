package kz.epam.model.word;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Khamid_Sarmanov on 12/11/2015.
 */
public class ClothWordTest extends TestCase {
    @Test
    public void testGetWord() throws Exception {
        List list = ClothWord.getWord();
        Collections.shuffle(list);
        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            char[][] chars = (char[][]) iterator.next();
            for (int i = 0; i < chars.length; i++) {
                for (int j = 0; j < chars[i].length; j++) {
                    System.out.print(chars[i][j]);
                }
                System.out.println();
            }
        }

    }
}