package problems;

public class ProblemsTest {

	public static void main(String args[])
	{
		int array[] = new int[]{10,3,9,7,5,2};
		int array_sort[] = array.clone();
//		System.arraycopy(array, 0, array_sort, 0, array.length);
		new sort.MergeSort(array_sort).sort();
		int x = 5;
		FindCombo fc = new FindCombo(array, x);
		System.out.println("\nThere is a combination ai,aj in the array such that ai+aj =" + x);
		System.out.println("O(n^2): " + fc.find_combo_n2());
		System.out.println("Sort the array");
		FindCombo fc_sort = new FindCombo(array_sort, x);
		System.out.println("O(nlogn) - Binary search on sorted array:	 " + fc_sort.find_combo_nlogn());
		System.out.println("O(n) - Sorted array: " + fc_sort.find_combo_n());
		

		
		FindComboInArray fcia = new FindComboInArray(array);
		System.out.println("\nThere is a combination ai,aj,ak in the array such that ai+aj = ak");
		System.out.println("O(n^3): " + fcia.find_combo_in_array_n3());
		System.out.println("Sort the array");
		new sort.MergeSort(array_sort).sort();
		FindComboInArray fcia_sort = new FindComboInArray(array);
		System.out.println("O(n^2) - Find Combo on sorted array: " + fcia_sort.find_combo_in_array_n2());
		System.out.println("It is still an open problem to find if there exists a better algo for this problem");
		

		
		MaxDiff md = new MaxDiff(array);
		System.out.println("\nFind the max difference between any 2 numbers");
		System.out.println("O(n^2): " + md.max_diff_n2());
		System.out.println("O(n): " + md.max_diff_n());
		
		
		MinDiff mid = new MinDiff(array);
		System.out.println("\nFind the min difference between any 2 numbers");
		System.out.println("O(n^2): " + mid.min_diff_n2());
		MinDiff mid_sort = new MinDiff(array_sort);
		System.out.println("O(nlogn): " + mid_sort.min_diff_nlogn());
		

		MaxProfit mp = new MaxProfit(array);
		System.out.println("\nSell a stock after you buy, such that you have maximum profit");
		System.out.println("O(n^2): " + mp.max_profit_n2());
		System.out.println("O(n): " + mp.max_profit_n());
		
	}
	
}
