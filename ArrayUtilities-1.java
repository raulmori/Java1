public class ArrayUtilities
{
	public static int unsortedFind(int[] values, int target)
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
	
	public static int sortedFind( int[] values, int target )
	{
		int firstIndex, lastIndex, midIndex;
		
		firstIndex = 0;
		lastIndex = values.length - 1;
		
		while( firstIndex <= lastIndex )
		{
			midIndex =  (firstIndex + lastIndex) / 2;
			
			if( values[ midIndex ] == target ){ return midIndex; }
			if( values[ midIndex ] < target ){ firstIndex = midIndex + 1; }
			if( values[ midIndex ] > target ){ lastIndex = midIndex - 1; }
			
			System.out.println("Next Range: " + firstIndex + " to " + lastIndex);
		}
		
		return -1;
	}
	
	public static int[] insertionSort( int[] values )
	{// START BY ASSUMING values[0] represents a 1-element sorted list
		
		System.out.print("Sorting: ");
		for( int k = 0; k < values.length; k++ )
		{
			System.out.print( values[k] + " ");
		}
		System.out.println();
				
		for( int i = 1; i < values.length; i++ )
		{
			// ADD THE ELEMENT values[i] into the sorted region
			for( int j = i - 1; j >= 0; j-- )
			{
				if( values[j] > values[j+1] )
				{
					// CORRECT VALUE SWAP
					int temp = values[j];
					values[j] = values[j+1];
					values[j+1] = temp;
					
					// INCORRECT VALUE SWAP
					// values[j] = values[j+1];
					// values[j+1] = values[j];
					
					System.out.print("Sorting: ");
					for( int k = 0; k < values.length; k++ )
					{
						System.out.print( values[k] + " ");
					}
					System.out.println();
				}
			}
		}
		
		return values;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
