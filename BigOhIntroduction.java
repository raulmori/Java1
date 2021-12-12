	public static int find(int[] values, int value)
	{
		for( int i = 0; i < values.length; i++ )
		{
			if( values[i] == value )
			{
				return i;
			}
		}
	
		return -1;
	}
	
	find( {4, 6, 1, 5, 2, 9, 0}, 8 )
	
	STEPS JAVA TAKES
		initialize i = 0
		is 0 < 7? yes
		is values[0] == 8? no
		increase i from 0 to 1
		is 1 < 7? yes
		is values[1] == 8? no
		....
		...
		increase i from 6 to 7
		is 7 < 7? no
		return -1
		
		1: initialization
		7+1: bounds checks
		7: value checks
		7: increments of i
		1: return statement
		
		3*7 + 3 operations: WORST CASE FOR THE GIVEN LIST
		
		General List: N elements
		
			1: initialize i
			N+1: bounds checks
			N: value checks
			N: increments of i
			1: return statement
		
		3N + 3: WORST CASE FOR A GENERAL LIST OF N ELEMENTS
		
		N = 10: 3*10 + 3 -> 33 operations
		N = 100: 303 operations
		N = 1000000: 3000003 operations
		
		
		Compare the case for N and for 2N
		
		Compare Work: 3N + 3 to 3(2N) + 3
		
			3N + 3 to 6N + 3
			
			
			For large N, 3N + 3 is approximately 3N
			
			Compare Work to Time:
			
			1 operation per second:
			
				T(N): (3N+3 operations) * (1 second / operation)
				T(N) = 3N + 3
			
			3 operations per second
			
				T(N) = (3N + 3) * (1/3 seconds / operation)
				T(N) = N + 1
				
				
		BIG O:
		
			3N + 3 is approximately 3N
			
				3N 'grows like' O(N)
				
				
				Big-O:
					Ignore Small Terms
					Ignore Leading Constants
					Focus on the main source of growth
				
				
		7N^2 + 4N + 10	-> approximately 7N^2 + 4N for large N
		
		4N <= 4N^2
		
		7N^2 + 4N <= 7N^2 + 4N^2 = 11 N^2
			
				7N^2 + 4N + 10 = O( N^2 )
				
				
		4N is a vanishingly small fraction of 7N^2
		
			7N^2 + 4N + 10 = O( N^2 )
				
		
		
		Algorithm 1 on Computer 1:
			
			5 N^2 total operations
			
			N -> 2N
			5 N^2 -> 5 (2N)^2 -> 4*5*N^2
								4 times the original work
		
		Algorithm 2 on Computer 2:
		
			7 N^2 total operations
			
			N -> 2N
			
			7 N^2 -> 7*(2N)^2 -> 4*7*N^2
								4 times the original work
				
			
			
		
		( 2N+1 )^2 - 6N + 2
		
			-> (2N)^2 - 6N
				
				-> 4N^2 - 6N
				
					-> O(N^2)
		
		
		SEARCHING AN UNSORTED LIST:
			O(N) operations where N is the size of the list
			
		
		Questions Posed:
			1) Can we do better? [ for an unsorted list ]
			2) How many operations for searching a sorted list?
			3) How do we sort the list?
		
		
		HYPOTHETICALLY
		
			Search an unsorted list in O( sqrt(N) ) operations
			
			BOGUS
			
			
			
			
			
			
			
			
			
			
			
			
					
		SEARCHING A SORTED LIST:
			
			
			find( {0, 1, 2, 4, 5, 6, 9}, 8 )
			
			Find the Midpoint:
				Midpoint is 4
					-> target must be in {5, 6, 9}
					
			Complexity of Looping over Remaining List
			
			1: finding midpoint value
			1: comparing midpoint to target
				remaining: search last N/2 elements
			
			2 + [3(N/2) + 3] = 5 + (3/2)N
			
			compared to 3N + 3
			
			5 + (3/2)N -> O(N)
			
			
			find( {0, 1, 2, 4, 5, 6, 9}, 8 )
			
			Find the Midpoint:
				Midpoint is 4
					-> target must be in {5, 6, 9}
					
					midpoint is 6
					6 < 8
						-> target must be in {9}
						
						is 8 9? no, target is not found
			
			1+1+1+1+1 -> 5 total operations
			
			5 operations is much less than 24 operations
		
		
		N = 16
		
		1: find the midpoint value
		1: compare midpoint value to target
		
			if target < midpoint: take left half
			if target > midpoint: take right half
			if target = midpoint: done
			
			8 elements remaining
			
			1: find the midpoint value
			1: compare midpoint to target
			
				4 elements remain
				
				1: find the midpoint
				1: compare midpoint to target
				
					2 elements remain
					
					1: find the midpoint
					1: compare midpoint to target
					
						1 element remains
						
						1: compare last element to target
		
		total operations
			<= (2 ops per level)*(#levels - 1) + 1
			-> (2)*4 + 1 -> 9 operations
		
		
		N = 16 -> 9 operations
		
		N = 32 -> 2*5 + 1 -> 11 operations
		N = 64 -> 2*6 + 1 -> 13 operations
		
		IN GENERAL
		
			For N elements, need to divide log_2(N) many times/levels
			
			
			total operations <= 2*[ log_2(N) - 1 ] + 1
			
			
			total operations <= O( log_2(N) )
			
			
			
		
		
		
		BINARY SEARCH: O( log_2(N) )
		
		TERNARY SEARCH: O( log_3(N) )
		
		log_b(a) = ln(a) / ln(b)
		
		BINARY SEARCH: O( ln(N) / ln(2) ) -> O( ln(N) )
		
		TERNARY SEARCH: O( ln(N) / ln(3) ) -> O( ln(N) )
		
		
		Total Work: O( ln(N) )
		
		
		N -> 2N
		
		~ln(N) -> ~ln(2N) 
				-> ~ln(N) + ln(2)
				
		
		
		SEARCHING AN UNSORTED LIST: O( N )
		SEARCHING A SORTED LIST: O( ln N )
		
		Compare 1 and 2
		
		2 = 2*1
		
		1 <-> 2*1
			
			
	
