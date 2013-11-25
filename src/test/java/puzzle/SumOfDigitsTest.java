package puzzle;

import static puzzle.SumOfDigits.sumOfSum;

import org.junit.Test;

public class SumOfDigitsTest {

	@Test(expected = IllegalArgumentException.class)
	public void whenNumberBelowZero_shouldThrowException() {
		sumOfSum(-1);
	}

}
