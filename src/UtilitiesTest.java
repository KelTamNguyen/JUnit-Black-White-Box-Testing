import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilitiesTest {

	@Test
	public void SelectionSortTest() 
	{
		// Empty array
		int[] tc1 = {};
		// Sorted array of length 1
		int[] tc2 = {1};
		// Sorted array of length > 1
		int[] tc3 = {1, 2, 3};
		// Reverse sorted array (output should be identical to sorted array)
		int[] tc4 = {3, 2, 1};
		assertArrayEquals(tc1, Utilities.SelectionSort(tc1));
		assertArrayEquals(tc2, Utilities.SelectionSort(tc2));
		assertArrayEquals(tc3, Utilities.SelectionSort(tc3));
		assertArrayEquals(tc3, Utilities.SelectionSort(tc4));
	}

	
	@Test
	public void RepeatedNumberTest() 
	{
		// Empty Array
		int[] testCase1 = {};
		// Array of length 1
		int[] testCase2 = {1};
		// Array with matching numbers (should be true)
		int[] testCase3 = {1, 1, 2, 3}; 
		// Array without matching numbers (should be false)
		int[] testCase4 = {1, 0, 2 ,3};
		
		assertFalse(Utilities.RepeatedNumber(testCase1));
		assertFalse(Utilities.RepeatedNumber(testCase2));
		assertTrue(Utilities.RepeatedNumber(testCase3));
		assertFalse(Utilities.RepeatedNumber(testCase4));
	}
	
	@Test
	public void FibonacciTest() 
	{
		// Test cases chosen in ascending order from 0 - 3 
		// in order to see if outputs match Fibonacci series
		int tc1 = 0;
		int tc2 = 1;
		int tc3 = 2;
		int tc4 = 3;
		
		assertEquals(0, Utilities.Fibonacci(tc1));
		assertEquals(1, Utilities.Fibonacci(tc2));
		assertEquals(1, Utilities.Fibonacci(tc3));
		assertEquals(2, Utilities.Fibonacci(tc4));
	}
	
	@Test
	public void getResultsTest() 
	{
		// All test cases arranged in negative-positive pairs because of the first condition
		int test_Case1 = -20;
		int test_Case2 = 20;
		
		int test_Case3 = -21;
		int test_Case4 = 21;
		
		// if (num < 20)
		int test_Case5 = -4;
		int test_Case6 = 4;
		
		int test_Case7 = -5;
		int test_Case8 = 5;
		
		assertEquals(20, Utilities.getResults(test_Case1));
		assertEquals(20, Utilities.getResults(test_Case2));
		assertEquals(22, Utilities.getResults(test_Case3));
		assertEquals(22, Utilities.getResults(test_Case4));
		assertEquals(24, Utilities.getResults(test_Case5));
		assertEquals(24, Utilities.getResults(test_Case6));
		assertEquals(26, Utilities.getResults(test_Case7));
		assertEquals(26, Utilities.getResults(test_Case8));
	}
	
}