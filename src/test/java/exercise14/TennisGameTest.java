package exercise14;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TennisGameTest {

    private TennisGame underTest;

    @Before
    public void setup() {
        underTest = new TennisGame();
    }

    @Test
    public void tennisSetScore13AndScore26ShouldReturnTrue() {
        assertTrue(underTest.tennisSet(3, 6));
    }

    @Test
    public void tennisSetScore18AndScore25ShouldReturnFalse() {
        assertFalse(underTest.tennisSet(8,5));
    }
}
