public class AverageRepeat
{
	public static void main(String[] args)
	{
		System.out.println("Do you want to compute averages?");
		boolean runLoop = IO.readBoolean();
		
		while( runLoop )
		{	
			System.out.print("Enter a positive value, negative to exit:");
			double currentValue = IO.readDouble();
			double total = 0; // For storing the running total
		
			int numEntries = 0;
		
			while( currentValue >= 0 )
			{
				total = total + currentValue;
				numEntries = numEntries + 1;
				// SAME AS: total += currentValue;
				System.out.println("\tCurrent Total: " + total);
				System.out.println("\tCurrent Average: " + (total/numEntries));
			
				System.out.print("Enter a positive value, negative to exit:");
				currentValue = IO.readDouble();
			}
		
			if( numEntries != 0 )
			{
				IO.outputDoubleAnswer( total / numEntries );
			}
			else
			{
				System.out.println("No data entered.");
			}
			
			System.out.println("Do you want to compute more averages?");
			runLoop = IO.readBoolean();
		}
		
		System.out.println("Goodbye!");
		
		
		
		
	}
}
