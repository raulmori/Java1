public class ArraysTest
{
	public static void main(String[] args)
	{
		int[] list = { 6, 5, 3, 1, 8, 7, 2, 4};         //This is the Array with its values
		
		list = ArrayUtilities.insertionSort( list );    //This is the function that will sort the values in the Array Variable then save the result in the variable "list" again
		
		System.out.println("Final Sorted List: ");      
		for( int i = 0; i < list.length; i++ )          //This is a "for" loop and it will print out the sorted values of the new "list" array variable
		{
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}
}
