package exercise15;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoveTest {

    private Love underTest;

    @Before
    public void setup() {
        underTest = new Love();
    }

    @Test
    public void youngAndBeautifulButNotLovedIsTrue() {
        boolean young = true;
        boolean beautiful = true;
        boolean loved = false;
        assertTrue(underTest.willYou(young, beautiful, loved));
    }
}
