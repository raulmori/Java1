public class Amazon
{
	public static void main(String[] args)
	{
		// ARRAYS
		
		Book[] bookshelf = new Book[3];
		
		bookshelf[0] = new Book("Charlotte's Web", "EB White");
		bookshelf[1] = new Book("Harry Potter and the Very Long Book", "JKR");
		bookshelf[2] = new Book("1984", "George Orwell");
		
		System.out.println( bookshelf[1] );
		
		
		String query = IO.readString();
		
		for( int i = 0; i < 3; i++ )
		{
			if( bookshelf[i].getTitle().equals( query ) )
			{
				System.out.println( bookshelf[i] );
			}
		}
		
		
		
		
	}
}
