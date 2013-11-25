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

	@Test
	public void whenNumberContaintMultipleDigitsButSumContainsOne_shouldReturnSum() {
		assertSumOfSum(11L, 2);
		assertSumOfSum(12L, 3);
		assertSumOfSum(13L, 4);
		assertSumOfSum(14L, 5);
		assertSumOfSum(15L, 6);
		assertSumOfSum(16L, 7);
		assertSumOfSum(17L, 8);
		assertSumOfSum(18L, 9);
	}

	@Test
	public void whenMultipleDigitsWithSumBiggerThan9_shouldReturnSumOfSumsDigits() {
		assertSumOfSum(19L, 1);
		assertSumOfSum(12345678901234L, 1);
	}

	private void assertSumOfSum(long number, int sum) {
		assertEquals(sum, sumOfSum(number));
	}

}
