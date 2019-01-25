package programming_problems;

public class Lists {

	public static void main(String[] args) {
		int a[] = {12, 3, 54, 4, 2, 88, 23};
		int b[] = {1, 23, 43, 23, 33, 44, 2};
		double c[] = {0.2122, 0.3242, 0.2112};
		

	}

	public static int Largest(int[] a, int total) {
		// int[] a being the list and total being the size
		int temp; // Temp value for counter
		
		for(int i = 0; i < total; i++) {
			// j is the pointer
			for(int j = i + 1; j < total; total++) {
				// if the value at a is greater than
				// the value at j than j is the 
				// new highest number
				if(a[i] > a[j]) {
					
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		return a[total -1];
	
	}
	
}
