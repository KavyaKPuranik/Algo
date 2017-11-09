package problems;
/*
 * Given an array a0,a1,....an-1,
 * Find the max difference between any 2 numbers
 * Max(ai-aj) such that j>i+l
 * Sell a stock AFTER a few days(l) of buying such that you have maximum profit
 */

public class MaxProfitWithGap {

	int a[];
	int l;
	
	MaxProfitWithGap(int a[], int l)
	{
		this.a = a;
		this.l = l;
	}
	
	/* 
	 * O(n^2)
	 */
	int max_profit_with_l_gap_n2()
	{
		int max_diff = 0;
		for(int i=0; i<a.length-1; i++)
			for(int j=i+l; j<a.length; j++)
			{
				max_diff=(a[j]-a[i]>max_diff)?a[j]-a[i]:max_diff;
//				System.out.println("ai " + a[i] +"\taj " +a[j]+"\t"+(a[i]-a[j])+ "\t" +max_diff);
			}
		return max_diff;
	}
	

	
	/* 
	 * O(n)
	 */
	int max_profit_with_l_gap_n()
	{
		int i=0,j=l,max_diff = a[j]-a[i];
		j++;
		while(j<a.length)
		{
			i=(a[i]>a[j-l])?j-l:i;
			max_diff=(a[j]-a[i]>max_diff)?a[j]-a[i]:max_diff;
			j++;
		}
		
		return max_diff;
	}
	

}
