package problems;
/*
 * Given an array a0,a1,....an-1 and a key,
 * Is there some ai + aj = key?
 * where, i = j or i != j
 */

public class FindCombo {

	int a[];
	int key;
	
	FindCombo(int a[], int key)
	{
		this.a = a;
		this.key = key;
	}
	
	/* 
	 * O(n^2)
	 */
	boolean find_combo_n2()
	{
		for(int i=0; i<a.length; i++)
			for(int j=0; j<a.length; j++)
				if(a[i]+a[j]==key)
				{
//					System.out.println("i: "+ i + " j: "+j);
					return true;
				}
		return false;
	}
	
	/* 
	 * O(nlogn) - sorted array
	 */
	boolean find_combo_nlogn()
	{
		for(int i=0; i<a.length; i++)
		{
			if(new sort.BinSearch(a, key-a[i]).binSearch()!=-1)
				return true;
		}
		return false;
	}

	/* 
	 * O(n) - sorted array
	 */
	boolean find_combo_n()
	{
		for(int l=0,r=a.length-1; l<=r;)
		{
			if(a[l]+a[r]==key)
				return true;
			else if(a[l]+a[r]<key)
				l++;
			else
				r--;
		}
		return false;
	}
}
