
public class Utilities 
{
	public static int[] SelectionSort(int[] array) 
	{
		// Takes int[] and sorts it using Selection Sort algorithm
		// returns sorted int[]
		int temp, minIndex;
		if (array.length <= 1)
			return array;
		else 
		{
			// Apply Selection sort for arrays of length of 2 or more
			for (int i = 0; i < array.length - 1; i++)
			{
				minIndex = i;
				for (int j = i + 1; j < array.length; j++)
					if (array[j] < array[i])
						minIndex = j;
				
				// Swap minimum element with the first element
				temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}
			return array;
		}
	}
		
	
	public static boolean RepeatedNumber(int[] array) 
	{
		boolean result = false;
		
		//In case of array being empty or having single element
		if (array.length <= 1)
			return result;
		// array is a viable array and will be checked for repeated numbers
		else 
		{
			for (int i = 0; i < array.length; i++)
				for (int j = i + 1; j < array.length; j++)
					if (array[i] == array[j])
						result = true;	
		}
		
		return result;
	}
	
	public static int Fibonacci(int integer) 
	{
		//Takes in an integer greater than 0 
		//and returns its fibonacci number
		if (integer > 1)
			return Fibonacci(integer - 1) + Fibonacci(integer - 2);
		else
			return integer;
		
	}
	
	public static int getResults(int num) 
	{
		if (num < 0) 
			num = num * -1;
		
		if (num >= 20) {
			if (num % 2 == 0)
				return num;
			else
				return num + 1;
			}
		
		else {
			num = num + 20;
			
			if (num % 2 == 0)
				return num;
			else
				return num + 1;
						
			}
	}
	
	public static int getResultsFirstMutant(int num) 
	{
		// if num < 0, then num is multiplied by positive 1
		if (num < 0) 
			num = num * 1;
		
		if (num >= 20) {
			if (num % 2 == 0)
				return num;
			else
				return num + 1;
			}
		
		else {
			num = num + 20;
			
			if (num % 2 == 0)
				return num;
			else
				return num + 1;
						
			}
	}
	
	public static int getResultsSecondMutant(int num) 
	{
		if (num < 0) 
			num = num * -1;
		
		// original: if (num >= 20)
		if (num < 20) {
			if (num % 2 == 0)
				return num;
			else
				return num + 1;
			}
		
		else {
			num = num + 20;
			
			if (num % 2 == 0)
				return num;
			else
				return num + 1;
						
			}
	}

}