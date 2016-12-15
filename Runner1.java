import java.util.ArrayList;

public class Runner1
{
	public static void main( String[] args )
	{
		printArray( ProblemSet1.createWedge( 15 ) );
		
		printArray( ProblemSet1.fibArray( 15 ) );
		
		double[] doubleArray = new double[] { 9.0, 4.5, 2.3, 6.7, 8.6 };
		
		System.out.println( ProblemSet1.isMedian( doubleArray, 6.7 ) );
		
		System.out.println( ProblemSet1.isMedian( doubleArray, 5.2 ) );
		
		double[] doubleArray2 = new double[] { 1.5, 1.4, 1.7, 1.7, 1.9, 1.0 };
		
		System.out.println( ProblemSet1.isMedian( doubleArray2, 1.6 ) );
		
		double[] doubleArray3 = new double[0];
		
		System.out.println( ProblemSet1.isMedian( doubleArray3, 5.2 ) );
		
		double[] doubleArray4 = new double[] { 4.0 };
		
		System.out.println( ProblemSet1.isMedian( doubleArray4, 9.0 ) );
		
		System.out.println( ProblemSet1.isMedian( doubleArray4, 4.0 ) );
		
		int[] intArray = { 1, 2, 3, 4, 5, 9 };
		
		ProblemSet1.rotate( intArray, 3 );
		
		printArray( intArray );
		
		ProblemSet1.rotate( intArray, -3 );

		printArray( intArray );
		
		ArrayList<Integer> arrL = new ArrayList<Integer>();
		
		arrL.add(2);
		arrL.add(0);
		arrL.add(-1);
		arrL.add(2);
		arrL.add(0);
		arrL.add(2);
		
		printArray( ProblemSet1.convert( arrL ) );
		
		char[][] charArray2D = new char[][] { { 'e', '2', '4', 'r' }, { 'g', '5', '1', 'z' } };
		
		print2DArray( ProblemSet1.replace( charArray2D ) );
		
		ArrayList<String> arrL2 = new ArrayList<String>();
		
		arrL2.add("aaabb");
		arrL2.add("aaaab");
		arrL2.add("aaaaa");
		arrL2.add("ababa");
		arrL2.add("aabbab");
		arrL2.add("wer");
		
		System.out.println( ProblemSet1.getFirst( arrL2 ) );
		
		int[] intArray2 = { 0, 21, 42, 10, 39, 10, 1000 };
		
		printArrayListInteger( ProblemSet1.top5( intArray2 ) );
		
		int[][] matrixA = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] matrixB = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		
		print2DArrayInt( ProblemSet1.multiply( matrixA, matrixB ) );
		
		ArrayList<String> arrL3 = new ArrayList<String>();
		
		arrL3.add("aaAbb");
		arrL3.add("aaaab");
		arrL3.add("aaaaa");
		arrL3.add("ababa");
		arrL3.add("aabbab");
		arrL3.add("wer");
		
		System.out.println( ProblemSet1.equalsIgnoreCase( arrL2, arrL3 ) );
		
		ArrayList<String> arrL4 = new ArrayList<String>();
		
		arrL4.add("aaabb");
		arrL4.add("aaaab");
		arrL4.add("aaaaewea");
		arrL4.add("ababewa");
		arrL4.add("aabbewab");
		arrL4.add("wereew");
		
		System.out.println( ProblemSet1.equalsIgnoreCase( arrL2, arrL4 ) );
		

		
	}
	
	public static void printArrayListInteger( ArrayList<Integer> arrL )
	{
	
		for ( int x = 0; x < arrL.size(); x++ )
		{
		
			System.out.print( arrL.get(x) + ", " );
		
		}
	
	}
	
	public static void printArray( int[] ar )
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
	
	public static void print2DArray( char[][] a )
	{
	
		for( int g = 0; g < a.length; g++ )
		{
		
			for( int z = 0; z < a[g].length; z++ )
			{
			
				System.out.print( a[g][z] );
				
			}
			
			System.out.println( "" );
		
		}

	}
	
	public static void print2DArrayInt( int[][] a )
	{
	
		System.out.println( "" );
	
		for( int g = 0; g < a.length; g++ )
		{
		
			for( int z = 0; z < a[g].length; z++ )
			{
			
				System.out.print( a[g][z] + " " );
				
			}
			
			System.out.println( "" );
		
		}
	
	}


}