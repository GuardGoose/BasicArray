package programming_problems;


public class Lists {
	

	public static void display(int[] a) {
		// Function to display arrays
		for(int i = 0; i < a.length; i++)
		{
			// Prints each value on a new line
			System.out.println(a[i]);
		}
	}
	
	
	public static int[] oddList(int[] a) {
		
		int total = a.length/2;
		int oList[] = new int[total];
		
		for (int i = 0; i < total; i++)
		{
			for(int j = i + 1; j < total; j++)
			{
				// if the index is odd
				if(i % 2 != 0)
				{
					// Add the value at the index
					// To the new list
					oList[j] = a[i];
				}
			}
		}
		return oList;
	}
	
	public static int Largest(int[] a) {
		// int[] a being the list and total being the size
		int temp; // Temp value for counter
		int total = a.length;  // Length of the list
		
		for(int i = 0; i < total; i++) 
		{
			// j is the pointer
			for(int j = i + 1; j < total; j++) 
			{
				// if the value at a is greater than
				// the value at j than j is the 
				// new highest number
				if(a[i] > a[j]) 
				{
					
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		return a[total - 1];
	
	}
	
	
	public static int[] Reverse(int[] a) {
		
		int[] rList = new int[a.length];
		
		// Loops through all the elements
		// i is input array
		// j is reverse array, one less than input array
		for(int i = 0, j = rList.length - 1; i < a.length; i++, j--)
		{
			// Stores the values of the array in reverse order
			rList[j] = a[i];
		}
		return rList;
	}
	
	
	
	public static void main(String[] args) {
		int a[] = {12, 3, 54, 4, 2, 88, 23};
		int b[] = {1, 23, 43, 28, 33, 44, 2};
		int c[] = {23, 3, 1, 7777, 666, 45};
		int[] revA = Reverse(a);
		int[] oddB = oddList(b);
		
		System.out.println("Largest: " + Largest(a));
		System.out.println("Largest: " + Largest(b));
		System.out.println("Largest: " + Largest(c));
		//display(revA);
		display(oddB);

	}
	
}
