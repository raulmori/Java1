public class ArrayUtility
{
	public static int linearSearch( int[] values, int target )
	{
		for( int i = 0; i < values.length; i++ )
		{
			if( values[i] == target )
			{
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch( int[] values, int target )
	{	
		int firstIndex, midIndex, lastIndex;
		
		firstIndex = 0;
		lastIndex = values.length - 1;
		
		while( firstIndex < lastIndex )
		{
			midIndex = ( firstIndex + lastIndex )/2;
			
			if( values[ midIndex ] == target ){ return midIndex; }
			if( values[ midIndex ] > target ){ lastIndex = midIndex - 1; }
			if( values[ midIndex ] < target ){ firstIndex = midIndex + 1; }
		}
		
		if( firstIndex == lastIndex && values[ firstIndex ] == target )
		{
			return firstIndex;
		}
		else
		{
			return -1;
		}
	}
	
	public static int[] insertionSort( int[] values )
	{
		printArray("Sorting: ", values, 0, values.length - 1);
		
		for( int i = 1; i < values.length; i++ )
		{
			for( int j = i-1; j >= 0; j-- )
			{
				if( values[j] > values[j+1] )
				{
					int temp = values[j];
					values[j] = values[j+1];
					values[j+1] = temp;
					printArray("List: ", values, 0, values.length - 1);
				}	
			}			
		}
		
		return values;
	}
	
	
	public static int[] selectionSort( int[] values )
	{
		printArray("Sorting: ", values, 0, values.length - 1);
		for( int i = 0; i < values.length; i++ )
		{
			int currentMinPosition = i;
			
			for( int j = i + 1; j < values.length; j++ )
			{
				if( values[ currentMinPosition ] > values[j] )
				{
					currentMinPosition = j;
				}
			}
			int temp = values[i];
			values[i] = values[currentMinPosition];
			values[currentMinPosition] = temp;
			printArray("Current: ", values, 0, values.length - 1);
		}
		return values;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void printArray(String message, int[] arr, int start, int end)
	{
		System.out.print(message);
		for( int i = start; i <= end; i++ )
		{
			System.out.print( arr[i] + " " );
		}
		System.out.println();
	}
	
	
	
	
}
