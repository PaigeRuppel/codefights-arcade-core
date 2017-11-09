package exercise5;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class DivisorTest {

	private Divisor underTest;

	@Before
	public void setup() {
		underTest = new Divisor();
	}
	
	@Test
	public void shouldReturn9TestCase1() {
		int bound = 10;
		int divisor = 3;
		assertThat(underTest.maxMultiple(divisor, bound), is(9));
	}

}
