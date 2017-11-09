package heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinHeap {
	
	private List<Integer> a;
	
	MinHeap(List<Integer> a)
	{
		this.a = a;
		buildHeap();
	}
	
	
	void buildHeap()
	{
		int i=a.size()/2;
		while(i>=0)
		{
			topdownHeapify(i);
			i--;
		}
	}
	
	Integer deleteMin()
	{
		Integer min = a.get(0);
		Integer lastIndex = a.size()-1;
		a.set(0, a.get(lastIndex));
		a.remove(lastIndex);
		topdownHeapify(0);
		return min;
	}
	
	void topdownHeapify(int node)
	{
		int leftChild = 2*node +1;
		int rightChild = 2*(node +1);
		int smallerChild;
		while(rightChild<a.size())
		{
			if(a.get(leftChild)<a.get(rightChild))
				smallerChild = leftChild;
			else
				smallerChild = rightChild;
			if(a.get(node)>a.get(smallerChild))
			{
				// swap
				int t = a.get(node);
				a.set(node,a.get(smallerChild));
				a.set(smallerChild,t);
				node=smallerChild;
				leftChild = 2*node +1;
				rightChild = 2*(node +1);
			}
			else
				break;
		}
		if( leftChild==a.size()-1 && a.get(leftChild)<a.get(node))
		{
			// swap
			int t = a.get(node);
			a.set(node,a.get(leftChild));
			a.set(leftChild,t);
		}
	
	}
	
	void bottomUpHeapify(int i)
	{
		
	}
	
}
