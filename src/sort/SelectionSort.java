package sort;

public class SelectionSort {
	// Complexity: O(n^2)	
	// Traverse through the array and find the min element
	// At the end of each pass, the smallest element is at the begining of the array
	// Repeat this for entire array (except first element) till the array is sorted
	
	// Worst case: decreasing order
	
	// n(n-1)/2 comparisions
	// n-1 swaps
	
	int a[];
	
	SelectionSort(int a[])
	{
		this.a = a;
	}
	
	int [] sort()
	{
//		System.out.println("Before sort");
//		for(int i=0; i<a.length; i++)
//			System.out.print(a[i] + "\t");
		
		for(int i=0; i<a.length-1; i++)
		{
			int min = i;
//			System.out.println("\nPass " + i);
//			for(int k=0; k<a.length; k++)
//				System.out.print(a[k] + "\t");
			for(int j=i+1; j<a.length; j++)
			{
				if(a[j]<a[min])
					min = j;
				
//				System.out.println("\nj="+j);
//				for(int k=0; k<a.length; k++)
//					System.out.print(a[k] + "\t");
			}
			if(min!=i)
			{
				int temp = a[min];
				a[min] = a[i];
				a[i] = temp;
			}
		}
//		System.out.println("\nAfter sort");
//		for(int i=0; i<a.length; i++)
//			System.out.print(a[i] + "\t");
		return a;
	}
	
}
