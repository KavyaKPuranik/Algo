package problems;
/*
 * Given an array a0,a1,....an-1,
 * Find the min difference between any 2 numbers
 * Min(ai-aj)
 */

public class MinDiff {

	int a[];
	
	MinDiff(int a[])
	{
		this.a = a;
	}
	
	/* 
	 * O(n^2)
	 */
	int min_diff_n2()
	{
		int min_diff = a[0];
		for(int i=1; i<a.length; i++)
			for(int j=1; j<a.length; j++)
				if(i!=j)
					min_diff=(Math.abs(a[i]-a[j])<min_diff)?Math.abs(a[i]-a[j]):min_diff;
		return min_diff;
	}
	
	/* 
	 * O(nlogn) - sorted array
	 */
	int min_diff_nlogn()
	{
		int min_diff = a[a.length-1];
		for(int i=1; i<a.length; i++)
				min_diff=(Math.abs(a[i]-a[i-1])<min_diff)?Math.abs(a[i]-a[i-1]):min_diff;
		return min_diff;
	}
	

	

}
