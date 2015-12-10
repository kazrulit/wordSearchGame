package kz.epam.model.pattern;

public class ALetterPattern implements LetterPattern {

    public char[][] fillLeter(String... word) {
        char[][] grid = new char[CharHeight + (GridHeight - CharHeight)][CharWidth + (GridWidth - CharWidth)];

        int yDifference = (GridHeight - CharHeight)/2;
        int xDifference = (GridWidth - CharWidth)/2;

        String top = word[0].trim();
        String left = word[1].trim();
        String right = word[2].trim();
        String middle = word[3].trim();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                //TODO ALGORITHM
                /** TOP horizontal **/
                if(i == yDifference) {
                    if(top.length() > (j -xDifference) && xDifference < j + 1 )
                        grid[i][j] = top.charAt(j - xDifference);
                    else
                        grid[i][j] = '-';
                }

                /** Left vertical **/
                else if(j == xDifference) {
                    if(left.length() > (i - yDifference) && yDifference < i + 1)
                        grid[i][j] = left.charAt(i - yDifference);
                }

                /** Right vertical **/
                else if(j == grid[i].length - xDifference - 1) {
                    if(right.length() > (i - yDifference) && yDifference < i + 1)
                        grid[i][j] = right.charAt(i - yDifference);
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
