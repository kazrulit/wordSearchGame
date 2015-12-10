package kz.epam.model.pattern;

/**
 * Created by Khamid_Sarmanov on 12/10/2015.
 */
public class HLetterPattern implements LetterPattern {
    public char[][] fillLeter(String... word) {
        char[][] grid = new char[CharHeight + (GridHeight - CharHeight)][CharWidth + (GridWidth - CharWidth)];

        int yDifference = (GridHeight - CharHeight)/2;
        int xDifference = (GridWidth - CharWidth)/2;

        String left = word[0].trim();
        String right = word[1].trim();
        String middle = word[2].trim();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {


                /** Left vertical **/
                if(j == xDifference) {
                    if(left.length() > (i - yDifference) && yDifference < i + 1)
                        grid[i][j] = left.charAt(i - yDifference);
                    else
                        grid[i][j] = '-';
                }

                /** Right vertical **/
                else if(j == grid[i].length - xDifference - 1) {
                    if(right.length() > (i - yDifference) && yDifference < i + 1)
                        grid[i][j] = right.charAt(i - yDifference);
                    else
                        grid[i][j] = '-';
                }

                /** Middle **/
                else if(i == yDifference + 3) {
                    if(middle.length() > (j - xDifference) && xDifference < j + 1 )
                        grid[i][j] = middle.charAt(j - xDifference);
                    else
                        grid[i][j] = '-';
                }


                else {
                    grid[i][j] = '-';
                }
            }
        }

        return grid;
    }
}
