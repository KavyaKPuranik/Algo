package sort;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class QuickSort {
	
	int a[];
	
	QuickSort(int a[])
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
	
	int Rpivot(int low, int high)
	{
		int random = ThreadLocalRandom.current().nextInt(low, high + 1);//(int) (Math.random() * (high-low+1));
		return random;
	}
	
	int [] quick_sort()
	{
		quick_sort(0,a.length-1);
		return a;
	}
	
	int [] quick_sort(int low, int high)
	{
		if(high<=low)
			return a;
		int p = Rpivot(low,high);
		int pivot_pos = partition(low,high,p);
		quick_sort(low, pivot_pos-1);
		quick_sort(pivot_pos+1,high);
		return a;
	}

	int find_rank(int r)
	{
		return find_rank(0,a.length-1,r);
	}
	
	int find_rank(int low, int high, int r)
	{
//		System.out.println("--High="+high+"\tLow="+low+"\trank="+r);
		if(high<low)
			return -1;
		
		int p = Rpivot(low,high);
		int pivot_pos = partition(low,high,p);
//		System.out.println("--Pivot pos="+pivot_pos);

		if(r==(high-pivot_pos+1))
			return pivot_pos;
		
		if(r<(high-pivot_pos+1))
			return find_rank(pivot_pos+1,high,r);
		
		return find_rank(low, pivot_pos-1,r-(high-pivot_pos+1));
	}

	int [] quick_sort_find_rank()
	{
		quick_sort_find_rank(0,a.length-1);
		return a;
	}
	
	int [] quick_sort_find_rank(int low, int high)
	{
		if(high<=low)
			return a;
		int mid_rank = high-low-(high-low-1)/2;
		int pivot_pos = find_rank(low,high,mid_rank);

		quick_sort_find_rank(low, pivot_pos-1);
		quick_sort_find_rank(pivot_pos+1,high);
		return a;
	}

	int find_rank_dpivot(int r)
	{
		return find_rank_dpivot(0,a.length-1,r);
	}
	
	int find_rank_dpivot(int low, int high, int r)
	{
//		System.out.println("--High="+high+"\tLow="+low+"\trank="+r);
		if(high<low)
			return -1;
		
		int p = Dpivot(low,high);
		int pivot_pos = partition(low,high,p);
//		System.out.println("--Pivot pos="+pivot_pos);

		if(r==(high-pivot_pos+1))
			return pivot_pos;
		
		if(r<(high-pivot_pos+1))
			return find_rank_dpivot(pivot_pos+1,high,r);
		
		return find_rank_dpivot(low, pivot_pos-1,r-(high-pivot_pos+1));
	}
	
	int Dpivot(int low, int high)
	{
		int k,l,m,i,j;
		do
		{
			high = low+((int)((high-low+1)/5)*5)-1;
			for(k=low,l=low;k<=high;k+=5,l++)
			{
				for(i=k; i<k+5; i++)
				{
					for(j=k; j<k+4; j++)
					{
						if(a[j]>a[j+1]) 
						{
							int temp = a[j];
							a[j] = a[j+1];
							a[j+1] = temp;
						}
					}
				}
				int temp = a[l];
				a[l] = a[k+2];
				a[k+2] = temp;
			}
			high=l;
		}while(high>l);
		return low;
	}


	int [] quick_sort_deterministic()
	{
		quick_sort_deterministic(0,a.length-1);
		return a;
	}
	
	int [] quick_sort_deterministic(int low, int high)
	{
		if(high<=low)
			return a;
		int mid_rank = high-low-(high-low-1)/2;
		int pivot_pos = find_rank_dpivot(low,high,mid_rank);

		quick_sort_find_rank(low, pivot_pos-1);
		quick_sort_find_rank(pivot_pos+1,high);
		return a;
	}


	
}
