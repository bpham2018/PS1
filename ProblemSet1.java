import java.util.ArrayList;

public class ProblemSet1
{

	public static void printArray( double[] ar )
	{
	
		System.out.print(" { ");
		for ( int i = 0; i < ar.length; i++ )
		{
		
			if( i != ar.length - 1)
				System.out.print(ar[i] + ", " );
			else
				System.out.print(ar[i]);
				
		}
		
		System.out.println(" } ");
	
	}

	//precondition n is positive
	//check
	public static int[] createWedge( int n )
	{
		int[] wedge = new int[n*2-1];
		
		int num = 1;
		
		for( int x = 0; x < n; x++ )
		{
			wedge[x] += num;
			num += 1;
		
		}
		
		num -= 2;
			
		for( int y = n; y < wedge.length ; y++ )
		{
			wedge[y] += num;
			num -= 1;
			
		}
		
		return wedge;
	
	}
	
	//precondition 2 is greater than or equal to 1
	public static int[] fibArray( int n )
	{
		int[] a = new int[n];
		
		a[0] += 1;
		a[1] += 1;
	
		for ( int x = 2; x < n; x++ )
		{
			a[x] = a[x-1] + a[x-2]; 
		
		}
	
		return a;
	
	}
	
	public static double[] sort( double[] arr )
	{
		for( int i = 0; i < arr.length; i++ )
		{
			for( int n = i + 1; n < arr.length; n++ )
			{
				double valueHolder = 0;
				
				if( arr[i] > arr[n] )
				{
					valueHolder = arr[i];
					arr[i] = arr[n];
					arr[n] = valueHolder;	
					
				}	
			}
		}
		
		return arr;
	
	}

	public static boolean isMedian( double[] arr, double m )
	{
		boolean match = false;
		
		double median = 0.0;
		
		printArray( arr );
		
		arr = sort( arr );
		
		printArray( arr );
		
		if( arr.length == 0 )
		{
		
			median = m;
		
		}
			
		if( arr.length == 1 )
		{
			median = arr[0];
			
		}
			
		
		if( arr.length > 1 )
		{
			//even
			if( arr.length % 2 == 0 )
			{
				median += ( ( arr[arr.length/2-1] + arr[arr.length/2] )/2 );
				
				System.out.print( median );
				
			}
		
			//odd
			if( arr.length % 2 == 1 )
			{
				median += arr[arr.length/2];
				
				System.out.print( median );
				
			}	
			
		}
		
		if( m == median )
		{
			match = true;
		
		}
		
		return match;
	
	}
	
	public static void rotateLeft( int[] arr )
	{

		int[] rotatedArray = new int[arr.length];
		
		for( int x = 0; x < arr.length; x++)
		{			
			if ( x == 0 )
			{	
				rotatedArray[rotatedArray.length-1] += arr[x]; 
				
			}
			
			else
			{
				rotatedArray[x-1] += arr[x];
				
			}
			
		}
				
		for ( int y = 0; y < arr.length; y++ )
		{
			arr[y] = rotatedArray[y];

		}
		
	}
	
	
	public static void rotateRight( int[] arr )
	{		
		int[] rotatedArray = new int[arr.length];
		
		for( int x = 0; x < arr.length; x++)
		{	
			if ( x == rotatedArray.length-1 )
			{
				rotatedArray[0] += arr[x]; 
				
			}
			
			else
			{	
				rotatedArray[x+1] += arr[x];
				
			}
			
		}
				
		for ( int y = 0; y < arr.length; y++ )
		{
			arr[y] = rotatedArray[y];
		
		}
		
	}

	public static void rotate( int[] arr, int d )
	{
		//positive
		if ( d > 0)
		{
				
			for( int x = 0; x < d; x++ )
			{
				rotateRight(arr);
					
			}
				
		}
				
			
		//negative
		if ( d < 0)
		{
				
			d = d/-1;
				
			for( int x = 0; x < d; x++ )
			{
				rotateLeft(arr);
					
			}				
				
		}
	
	}
	
	public static int[] convert( ArrayList<Integer> arrL )
	{
	
		int[] intArray = new int[arrL.size()];
		
		for( int x = 0; x < arrL.size(); x++ )
		{
			intArray[x] = arrL.get(x);
		
		}
		
		return intArray;
	
	}
	
	public static boolean equalsIgnoreCase( ArrayList<String> a, ArrayList<String> b )
	{
		boolean sameValues = false;
		
		if( a.size() == b.size() )
		{
			int amountMatch = 0;
			
			for( String x : a )
			{	
				//make lower
				String newStringX = "";
				for( int i = 0; i < x.length(); i++ )
				{
				
					char z = x.charAt( i );
					
					if( (int)z <= 90 )
					{
					
						newStringX += (char)((int)z + 32 );
					
					}
					
					else
					{
					
						newStringX += z;
						
					}
					
				}
				
				for( String y: b )
				{
					//make lower
					String newStringY = "";
					
					for( int u = 0; u < y.length(); u++ )
					{		
						char w = y.charAt( u );
						
						if( (int)w <= 90 )
						{
							newStringY += (char)((int)w + 32 );
					
						}
					
						else
						{
							newStringY += w;
						
						}
					
					}		
					
					System.out.println( newStringX );
					System.out.println( newStringY );
					
					if( newStringX.equals( newStringY ) )
					{
						amountMatch += 1;
					
					}
				
				}
				
			}
			
			if( amountMatch == a.size() )
			{
				sameValues = true;
				
			}
			
		
		}
		
		return sameValues;
		
	}
	
	//precondition length of array greater than or equal to 5
	public static ArrayList<Integer> top5( int[] arr )
	{
	
		ArrayList<Integer> arrLInt = new ArrayList<Integer>();
	
		arr = sortInt( arr );
		
		for ( int x = 1; x < 6; x++ )
		{
			
			arrLInt.add(arr[arr.length-x]);
		
		}
		
		return arrLInt;
		
	
	}
	
	public static int[] sortInt( int[] arr )
	{
		for( int i = 0; i < arr.length; i++ )
		{
			for( int n = i + 1; n < arr.length; n++ )
			{
				int valueHolder = 0;
				
				if( arr[i] > arr[n] )
				{
					valueHolder = arr[i];
					arr[i] = arr[n];
					arr[n] = valueHolder;	
					
				}	
			}
		}
		
		return arr;
	
	}
	
	public static String getFirst( ArrayList<String> arrL )
	{
	
		String greatestSoFar = arrL.get(0);
	
		for( int x = 1; x < arrL.size(); x++ )
		{
			String current = arrL.get(x);
			
			if( greatestSoFar.compareTo( current ) > 0 )
			{
				greatestSoFar = current;
			
			}
		
		}
		
		return greatestSoFar;

	}
	
	public static char[][] replace(char[][] arr2D)
	{
		
		for ( int x = 0; x < arr2D.length; x++)
		{
			for ( int y = 0; y < arr2D[x].length; y++)
			{
				
				if( (int)(arr2D[x][y]) >= 48 && (int)(arr2D[x][y]) <= 57 ) 
				{
					arr2D[x][y] = 'z';
					System.out.println( arr2D[x][y]) ;
				}
				
			}
		}
		
		return arr2D;
				
	}
	
	public static int[][] multiply( int[][] a, int[][] b )
	{
	
		int[][] product = new int[a.length][b[0].length];
		
		for( int x = 0; x < a.length; x++ )
		{
		
			for( int y = 0; y < b[0].length; y++ )
			{		
			
			
				for( int z = 0; z < a[0].length; z++ )
				{
				
					product[x][y] += a[x][z]*b[z][y];
					
					
					
				}
			
			}
		
		}
		
		
		
		return product;
	
	}
	
}