public class ArrayTools
{
	public static int find(String[] names, String target)
	{
		for( int i = 0; i < names.length; i++ )
		{
			if( names[i].equals( target ) )
			{
				return i;
			}
		}
		return -1;
	}
	
	// HOW MUCH WORK DOES THIS METHOD ACTUALLY DO
	
	
	
	
	
}
