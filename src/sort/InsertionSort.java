package sort;

public class InsertionSort {

	// Worst case: decreasing order
	// n^2 comparisions
	// n(n-1)/2 swaps

	
	int a[];
	
	InsertionSort(int a[])
	{
		this.a = a;
	}
	
	int [] sort()
	{
//		System.out.println("Before sort");
//		for(int i=0; i<a.length; i++)
//			System.out.print(a[i] + "\t");
		
		for(int i=1; i<a.length; i++)
		{
			int key=a[i];
			int j;
			// Insert a[i] into the sorted seq a[1 ... i-1]
			for(j=i-1; j>0 && a[j]>key; j--)
				a[j+1]=a[j];
			a[j+1]=key;
			System.out.println("\nPass " + i);
			for(int k=0; k<a.length; k++)
				System.out.print(a[k] + "\t");
		}
//		System.out.println("\nAfter sort");
//		for(int i=0; i<a.length; i++)
//			System.out.print(a[i] + "\t");
		return a;
	}
	
}
