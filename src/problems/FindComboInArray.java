package problems;
/*
 * Given an array a0,a1,....an-1,
 * Is there some ai + aj = ak?
 * where, i = j or i != j
 */

public class FindComboInArray {

	int a[];
	
	FindComboInArray(int a[])
	{
		this.a = a;
	}
	
	/* 
	 * O(n^3)
	 */
	boolean find_combo_in_array_n3()
	{
		for(int i=0; i<a.length; i++)
			for(int j=0; j<a.length; j++)
				for(int k=0; k<a.length; k++)
					if(a[i]+a[j]==a[k])
					{
//						System.out.println("i: "+ i + " j: "+j + " k: "+k);
						return true;
					}
		return false;
	}
	
	/* 
	 * O(n^2) - Find Combo on sorted array
	 */
	boolean find_combo_in_array_n2()
	{
		for(int i=0; i<a.length; i++)
		{
			if(new FindCombo(a,a[i]).find_combo_n())
				return true;
		}
		return false;
	}
	
	/*
	 * It is still an open problem to find if there exists a better algo for this problem
	 */

}
