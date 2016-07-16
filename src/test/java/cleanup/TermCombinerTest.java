package cleanup;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Made by Lee on 7/16/2016.
 */
public class TermCombinerTest {
    @Test
    public void testThatNullReturnsNull(){
        String stringToCombine = null;
        assertEquals(null, TermCombiner.combine(stringToCombine));
    }

    @Test
    public void testThatEmptyStringReturnsNull(){
        String stringToCombine = "";
        assertEquals(null, TermCombiner.combine(stringToCombine));
    }

    @Test
    public void testThatNumberReturnsNumber(){
        String stringToCombine = "2";
        assertEquals("2", TermCombiner.combine(stringToCombine));
    }

    @Test
    public void testThatVariableReturnsVariable(){
        String stringToCombine = "x";
        assertEquals("x", TermCombiner.combine(stringToCombine));
    }

//    @Test
//    public void testThatMultipliedVariablesReturnsSimplifiedVersionOfThatVariable(){
//        String stringToCombine = "x*x";
//        assertEquals("x^2", TermCombiner.combine(stringToCombine));
//    }
}