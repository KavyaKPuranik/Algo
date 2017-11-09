package sort;

public class MergeSort {

	// Worst case: decreasing order
	// n^2 comparisions
	// n(n-1)/2 swaps
	
	int a[];
	
	public MergeSort(int a[])
	{
		this.a = a;
	}
	
	void merge(int low, int mid, int high)
	{
		int index = 0, b[]=new int[high-low+1];
		int i = low, j= mid+1;
		while(i<=mid && j<=high)
		{
			if(a[i]<=a[j])
				b[index++]=a[i++];
			else
				b[index++]=a[j++];
		}
		while(i<=mid)
			b[index++]=a[i++];
		while(j<=high)
			b[index++]=a[j++];
		i=low;
		index=0;
		while(i<=high)
			a[i++]=b[index++];
	}
	
	public int [] sort()
	{
//		System.out.println("Before sort");
//		for(int i=0; i<a.length; i++)
//			System.out.print(a[i] + "\t");
		
		merge_sort(0,a.length-1);
		
//		System.out.println("\nAfter sort");
//		for(int i=0; i<a.length; i++)
//			System.out.print(a[i] + "\t");
		return a;
	}
	
	
	int [] merge_sort(int low, int high)
	{
//		System.out.println("Pass " + low + " " + high);
//		for(int i=0; i<a.length; i++)
//			System.out.print(a[i] + "\t");
		if(high<low+1)
			return a;
		int mid = (low+high)/2;
		merge_sort(low, mid);
		merge_sort(mid+1,high);
		merge(low,mid,high);
		return a;
	}
}
