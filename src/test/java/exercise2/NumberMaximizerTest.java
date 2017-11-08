package exercise2;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class NumberMaximizerTest {

	private NumberMaximizer underTest;

	@Before
	public void setup() {
		underTest = new NumberMaximizer();
	}

	@Test
	public void shouldReturn99FromN2TestCase1() {
		assertThat(underTest.largestNumber(2), is(99));
	}

	@Test
	public void shouldReturn9FromN1TestCase2() {
		assertThat(underTest.largestNumber(1), is(9));
	}
}
