package puzzle;

import static org.junit.Assert.assertEquals;
import static puzzle.SumOfDigits.sumOfSum;

import org.junit.Test;

public class SumOfDigitsTest {

	@Test(expected = IllegalArgumentException.class)
	public void whenNumberBelowZero_shouldThrowException() {
		sumOfSum(-1);
	}

	@Test
	public void whenNumberIsOneLong_shouldReturnNumber() {
		assertSumOfSum(0, 0);
		assertSumOfSum(1, 1);
		assertSumOfSum(2, 2);
		assertSumOfSum(3, 3);
		assertSumOfSum(4, 4);
		assertSumOfSum(5, 5);
		assertSumOfSum(6, 6);
		assertSumOfSum(7, 7);
		assertSumOfSum(8, 8);
		assertSumOfSum(9, 9);
	}

	private void assertSumOfSum(long number, int sum) {
		assertEquals(sum, sumOfSum(number));
	}

}
