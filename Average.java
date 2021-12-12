public class Average
{
	public static void main(String[] args)
	{
		//1) user inputs a value
		//2) while the user has not entered a -1
		//		3) add the users input to a total
		//		4) ask for new input
	
		//5) output total / number of values
		
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
		
		// CONTROL IS HERE AFTER NEGATIVE INPUT
		
		if( numEntries != 0 )
		{
			IO.outputDoubleAnswer( total / numEntries );
		}
		else
		{
			System.out.println("No data entered.");
		}
		
		
		
		
	}
}
