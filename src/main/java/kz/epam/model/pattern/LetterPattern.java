package kz.epam.model.pattern;

/**
 * Created by Khamid_Sarmanov on 12/9/2015.
 */
public interface LetterPattern {
    final int CharWidth = 5;
    final int CharHeight = 8;

    final int GridWidth = 9;
    final int GridHeight = 12;

    char[][] fillLeter(String... word);
}
