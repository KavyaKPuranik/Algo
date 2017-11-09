package sort;
public class BinSearch {

	int a[];
	int key;
	
	public BinSearch(int a[], int key)
	{
		this.a = a;
		this.key = key;
	}
	
	public int binSearch()
	{
		return search(0,a.length);
	}
	
	int search(int i,int j)
	{
		if(i>=j)
			return -1;
		int n= (i+j)/2;
		if(a[n]== key)
			return n;
//		System.out.println("\n" +i + " " + j+ " " + n+ " " + n);
//		for(int k=i; k<j; k++)
//		System.out.print(a[k]);
		if(a[n]<key)
			return this.search(n+1,j);
		return this.search(i,n-1);
	}
}
