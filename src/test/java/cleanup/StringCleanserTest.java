package cleanup;

import cleanup.StringCleanser;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Made by Lee on 7/16/2016.
 */
public class StringCleanserTest {
    @Test
    public void testThatNullReturnsNull(){
        String stringToCleanse = null;
        assertEquals(null, StringCleanser.cleanse(stringToCleanse));
    }

    @Test
    public void testThatEmptyStringReturnsNull(){
        String stringToCleanse = "";
        assertEquals(null, StringCleanser.cleanse(stringToCleanse));
    }

    @Test
    public void testThatFrontSpacesAreRemoved(){
        String stringToCleanse = "   Hello";
        assertEquals("Hello", StringCleanser.cleanse(stringToCleanse));
    }

    @Test
    public void testThatBackSpacesAreRemoved(){
        String stringToCleanse = "Goodbye    ";
        assertEquals("Goodbye", StringCleanser.cleanse(stringToCleanse));
    }

    @Test
    public void testThatInnerSpacesAreRemoved(){
        String stringToCleanse = "Hello      And   Goodbye";
        assertEquals("HelloAndGoodbye", StringCleanser.cleanse(stringToCleanse));
    }

    @Test
    public void testThatNonMathPunctuationMarksAreRemoved(){
        String stringToCleanse = "These Are Bad @#$%,<>.!?_\"\\";
        assertEquals("TheseAreBad", StringCleanser.cleanse(stringToCleanse));
    }

    @Test
    public void testThatMathPunctuationMarksAreKept(){
        String stringToCleanse = "These Are Good +-*/^()|&";
        assertEquals("TheseAreGood+-*/^()|&", StringCleanser.cleanse(stringToCleanse));
    }
}