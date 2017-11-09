package sort;

import java.util.concurrent.ThreadLocalRandom;

public class FindRank {
	
	int a[];
	
	FindRank(int a[])
	{
		this.a = a;
	}
	
	int partition(int low, int high, int p)
	{
		int i = low-1, j= low;
//		for(int k=0; k<a.length; k++)
//		System.out.print(a[k] + "\t");
		int pivot = a[p];
		a[p]=a[high];
		a[high]=pivot;
//		System.out.print("\nPass low:" + low + "\thigh " + high+ "\tpivot " + pivot+ "\t\t\n");
		while(j < high)
		{
			if(a[j] <= pivot)
			{
				i++;
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			j++;
		}
		i++;
		int temp = a[i];
		a[i]=a[high];
		a[high]=temp;
//		System.out.print("\nleft:" + left + "\tright " + right + "\t\t\n");
//		for(int i=0; i<a.length; i++)
//			System.out.print(a[i] + "\t");
		return i;
		
	}
	
	int find_rank(int r)
	{
		return find_rank(0,a.length-1,r);
	}
	
	int Rpivot(int low, int high)
	{
		int random = ThreadLocalRandom.current().nextInt(low, high + 1);//(int) (Math.random() * (high-low+1));
//		System.out.println(random);
		return random;
	}
	
	int find_rank(int low, int high, int r)
	{
		if(high<low)
			return -1;
		int p = Rpivot(low,high);
		int pivot_pos = partition(low,high,p);
		if(r<(high-pivot_pos+1))
			return find_rank(pivot_pos+1,high,r);
		else if(r>(high-pivot_pos+1))
			return find_rank(low, pivot_pos-1,r-(high-pivot_pos+1));
		return a[pivot_pos];
	}
}
