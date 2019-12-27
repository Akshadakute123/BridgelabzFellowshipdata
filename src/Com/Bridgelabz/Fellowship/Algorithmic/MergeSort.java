package Com.Bridgelabz.Fellowship.Algorithmic;

import Com.bridgelabz.Fellowship.utility.Utility;

public class MergeSort 
{
	
public static void main(String[] args) 
{
	int arr[]= {10,45,23,13,42,7};
//	MergeSort ms=new MergeSort();
	 Utility.mergesort(arr);
	 for(int i:arr)
	 {
		 System.out.print(i+" ");
	 }
	
}
}
