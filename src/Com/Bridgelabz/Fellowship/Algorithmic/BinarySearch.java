package Com.Bridgelabz.Fellowship.Algorithmic;

import Com.bridgelabz.Fellowship.utility.Utility;

/**
 * @author admin1
 *
 */
public class BinarySearch 
{
	
	public static void main(String[] args)
	{
		int arr[] = { 1, 5, 7, 9, 0 };
		int start = 0;
		int end = arr.length - 1;
		int search = 5;
	int res=Utility.binarysearch(arr, 0, end, search);
	   System.out.println(res);
		System.out.println("binary search for string");
	     String arr1[] = { "ak","dk","sk","gd" };
	     int start1=0;
	     int end1=arr.length-1;
	     String search1="ak";
	     
	     
	     
		int res2=Utility.binarysearchString(arr1, 0, end1, search1);
		System.out.println(res2);
		
	}
}
