package Com.Bridgelabz.Fellowship.Algorithmic;

import Com.bridgelabz.Fellowship.utility.Utility;

public class InsertionSort
{
  public static void main(String[] args) 
  {
	  String ss[] = { "akshada","dakshata","abc","pqr" };
		
		Utility.insertionsort();
		System.out.println();
		System.out.println("output for string");
		String [] s=Utility.insertionsort1(ss);
		for (int i = 0; i < s.length; i++)
		{
			System.out.print(s[i] + " ");
		}}
}
