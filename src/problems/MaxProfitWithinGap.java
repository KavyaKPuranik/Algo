package problems;
/*
 * Given an array a0,a1,....an-1,
 * Find the max difference between any 2 numbers
 * Max(ai-aj) such that j<i+gap but j>i
 * Sell a stock WITHIN a few days(gap) of buying such that you have maximum profit
 */

public class MaxProfitWithinGap {

	int a[];
	int gap;
	
	MaxProfitWithinGap(int a[], int gap)
	{
		this.a = a;
		this.gap = gap;
	}
	
	/* 
	 * O(n^2)
	 */
	int max_profit_with_gap_n2()
	{
		int max_diff = 0;
		for(int i=0; i<a.length-1; i++)
			for(int j=i+1+gap; j<a.length; j++)
			{
				max_diff=(a[j]-a[i]>max_diff)?a[j]-a[i]:max_diff;
//				System.out.println("ai " + a[i] +"\taj " +a[j]+"\t"+(a[i]-a[j])+ "\t" +max_diff);
			}
		return max_diff;
	}
	
	/* 
	 * O(n^2)
	 */
	int max_profit_within_gap_n2()
	{
		int max_diff = 0;
		for(int i=0; i<a.length-1; i++)
			for(int j=i+1; j<i+1+gap; j++)
			{
				max_diff=(a[j]-a[i]>max_diff)?a[j]-a[i]:max_diff;
//				System.out.println("ai " + a[i] +"\taj " +a[j]+"\t"+(a[i]-a[j])+ "\t" +max_diff);
			}
		return max_diff;
	}
	

	
	/* 
	 * O(n)
	 */
	int max_profit_with_gap_n()
	{
		int i=0,j=1,max_diff = a[j]-a[i];
		j++;
		while(j<a.length)
		{
			i=(a[i]>a[j-1])?j-1:i;
			max_diff=(a[j]-a[i]>max_diff)?a[j]-a[i]:max_diff;
			j++;
		}
		
		return max_diff;
	}
	

}
