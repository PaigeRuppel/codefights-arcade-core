package exercise3;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class CandyDistributionTest {

	private CandyDistribution underTest;
	
	@Before
	public void setup() {
		underTest = new CandyDistribution();
	}
	
	@Test
	public void shouldReturn9From3And10TestCase1() {
		assertThat(underTest.candies(3, 10), is(9));
	}
}
