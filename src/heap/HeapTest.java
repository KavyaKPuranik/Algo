package heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeapTest 
{
	public static void main(String args[])
	{
		List<Integer> array = new ArrayList<>(Arrays.asList(90,20,18,78,3,52,68));
		MinHeap h = new MinHeap(array);
		for(int ele: array)
			System.out.print(ele+"\t");
		System.out.println();
		
		System.out.println("Deleted ele: "+h.deleteMin());
		for(int ele: array)
			System.out.print(ele+"\t");
		System.out.println();
	}
}
