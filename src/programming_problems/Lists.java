package programming_problems;

public class Lists {
	

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

	public static void main(String[] args) {
		int a[] = {12, 3, 54, 4, 2, 88, 23};
		int b[] = {1, 23, 43, 23, 33, 44, 2};
		int c[] = {23, 3, 1, 7777, 666, 45};
		
		System.out.println("Largest: " + Largest(a));
		//System.out.println("Largest: " + Largest(b, 7));
		//System.out.println("Largest: " + Largest(c, 6));

	}
	
}
