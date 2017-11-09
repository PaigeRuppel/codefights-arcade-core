package exercise6;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class NumberCircleTest {

	private NumberCircle underTest;
	
	@Before
	public void setup() {
		underTest = new NumberCircle();
	}
	
	@Test
	public void shouldReturn7TestCase1() {
		int n = 10;
		int firstNumber = 2;
		assertThat(underTest.circleOfNumbers(n, firstNumber), is(7));
	}
	
}
