Goals: 
	More Arrays
	Strings and Arrays
	
	Strings:
		Identify Unique Characters
		Compute Array of Character Counts
	2D Arrays (and beyond)
	
	
	TYPE[] variableName;
	int[] listOfIntegers;
	
	Book[] bookshelf = new Book[3];
	
	
	bookshelf // TYPE BOOK ARRAY
	bookshelf[2] // TYPE BOOK
	
	
	int[] list = new int[100];
	
	for(int i = 0; i < list.length; i++)
	{
		list[i] = i * i;
	}
	
	
	arr.length -> return the number of elements in the array
	
	
	int[] list = { 0, 3, 4, 1, 10 };
	
	int x = 3;
	
	
	
	
	
	
	
	Strings:
		Identify Unique Characters
		Compute Array of Character Counts
		
		
		
		
		
		
		MISSISSIPPI
		
		
		START LIST OF SEEN CHARACTERS
		FOR EACH CHARACTER IN STRING
			IF CHARACTER IS IN SEEN LIST
				IGNORE
			ELSE
				ADD TO SEEN LIST
		
		return SEEN LIST
		
		public static String uniqueCharacters(String text)
		{
			String seenCharacters = "";
			
			for(int i = 0; i < text.length(); i++)
			{
				char c = text.charAt(i);
				
				if( text.indexOf( c ) >= 0 )
				{
					// c is in seenCharacters somewhere
				}
				else
				{
					seenCharacters = seenCharacters + c;
				}
			}
			
			return seenCharacters;
		}
		
		
		
		
		GENERAL ARRAY QUESTIONS
		
		Can I increase / change the size of an array?
		
		Can I concatenate two arrays together?
		
		
		
		
		
		
		int[][] chessBoard = new int[8][8];
		
		int[][] array = { {1, 2, 3}, {4, 5, 6} };
		
		array[1] -> {4, 5, 6}
		
		array[1][2] -> 6
		
		array.length -> 2
		
		array[0].length -> 3
		
		for( int i = 0; i < array.length; i++ )
		{
			for( int j = 0; j < array[i].length; j++)
			{
				// DO WORK HERE
			}
		}
		
		
