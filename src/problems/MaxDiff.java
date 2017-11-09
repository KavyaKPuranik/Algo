package problems;
/*
 * Given an array a0,a1,....an-1,
 * Find the max difference between any 2 numbers
 * Max(ai-aj)
 */

public class MaxDiff {

	int a[];
	
	MaxDiff(int a[])
	{
		this.a = a;
	}
	
	/* 
	 * O(n^2)
	 */
	int max_diff_n2()
	{
		int max_diff = 0;
		for(int i=0; i<a.length; i++)
			for(int j=0; j<a.length; j++)
				max_diff=(Math.abs(a[i]-a[j])>max_diff)?Math.abs(a[i]-a[j]):max_diff;
		return max_diff;
	}
	

	
	/* 
	 * O(n)
	 */
	int max_diff_n()
	{
		int min=a[0],max=a[0],max_diff = 0;
		for(int i=1; i<a.length; i++)
		{
			max=(a[i]>max)?a[i]:max;
			min=(a[i]<min)?a[i]:min;
		}
		max_diff = max - min;
		return max_diff;
	}
	

}
