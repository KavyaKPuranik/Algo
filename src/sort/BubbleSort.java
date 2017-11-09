package sort;

public class BubbleSort {
	// Complexity: O(n^2)
	// Traverse through the array and swap with the next element if it is smaller than this element
	// At the end of each pass, the greatest element is at the end of the array
	// Repeat this for entire array (except last element) till the array is sorted
	
	// Worst case: decreasing order
	
	// n(n-1)/2 comparisions
	// n(n-1)/2 swaps
	
	int a[];
	
	BubbleSort(int a[])
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
//			System.out.println("\nPass " + i);
//			for(int k=0; k<a.length; k++)
//				System.out.print(a[k] + "\t");
			for(int j=0; j<a.length-i-1; j++)
			{
				if(a[j]>a[j+1]) 
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
//				System.out.println("\nj="+j);
//				for(int k=0; k<a.length; k++)
//					System.out.print(a[k] + "\t");
			}
		}
//		System.out.println("\nAfter sort");
//		for(int i=0; i<a.length; i++)
//			System.out.print(a[i] + "\t");
		return a;
	}
	
}
