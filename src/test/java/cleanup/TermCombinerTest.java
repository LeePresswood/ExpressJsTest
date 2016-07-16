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
}