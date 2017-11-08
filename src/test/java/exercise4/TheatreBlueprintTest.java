package exercise4;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TheatreBlueprintTest {

	private TheatreBlueprint underTest;
	
	@Before
	public void setup() {
		underTest = new TheatreBlueprint();
	}
	
	@Test
	public void shouldReturn96TestCase1() {
		int nRows = 16;
		int nCols = 11;
		int row = 5;
		int col = 3;
		assertThat(underTest.seatsInTheatre(nRows,nCols, row, col), is(96));
	}
}
