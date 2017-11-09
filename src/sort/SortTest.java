package sort;

public class SortTest {

	public static void main(String args[])
	{
		int array[] = new int[] {2,15,12,20,24,9,6,4,18,25,13,21,16,22,19,10,23,7,3,8,14,11,17,5,1};
		//{100,88,77,66,55,44,33,22,11,3,6,18,20,19,2,25,46,73,81,90,33,22,100,121,23,44,64,12,2,1,1};
		int median = (array.length+1)/2;
		int key = 7;
		System.out.println("Before sort");
		for(int i=0; i<array.length; i++)
			System.out.print(array[i] + "\t");
		
//		BubbleSort b = new BubbleSort(array);
//		array = b.sort();
//		SelectionSort s = new SelectionSort(array);
//		array = s.sort();
//		InsertionSort b = new InsertionSort(array);
		
//		MergeSort m = new MergeSort(array);
//		m.sort();		
//
		QuickSort q = new QuickSort(array);
//		q.quick_sort();
//		System.out.println("\nThe position of the element at rank "+median+" is "+q.find_rank(median));
//		q.quick_sort_find_rank();
//		q.find_rank_dpivot(median);
//		System.out.println("\nDpivot="+q.Dpivot(18, array.length-1));
		q.quick_sort_deterministic();
//		System.out.println("\nRpivot="+q.Rpivot(0, array.length-1));
//
//		QuickSortFindRank f = new QuickSortFindRank(array);
//		System.out.println("\nThe element at rank "+median+" is "+f.find_rank(median));
		
		System.out.println("\nAfter sort");
		for(int i=0; i<array.length; i++)
			System.out.print(array[i] + "\t");
		
//		System.out.println("\nBinary search\n"
//				+ "key: " + key + " is present in the index: " 
//				+ new BinSearch(array,key).binSearch());
	}
	
}
