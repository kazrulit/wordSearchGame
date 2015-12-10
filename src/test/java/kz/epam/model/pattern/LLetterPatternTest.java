package kz.epam.model.pattern;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Khamid_Sarmanov on 12/10/2015.
 */
public class LLetterPatternTest extends TestCase {
    @Test
    public void testFillLeter() throws Exception {
        LetterPattern letterPattern = new LLetterPattern();
        char[][] grid = letterPattern.fillLeter("Editable", "Eagle");

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
}