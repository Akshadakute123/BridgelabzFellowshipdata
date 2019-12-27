package Com.Bridgelabz.Fellowship.LogicalProgramming;

import java.io.File;

import Com.bridgelabz.Fellowship.utility.Utility;

/**
 * purpose: to find a number using binary search method
 * 
 * @author Akshada
 *
 */
public class BinarySearchExternal 
{
	public static void main(String[] args)throws Exception 
	  { 
		String ss[]=Utility.readFile();
		System.out.println("after sort");
		String[] Lines=Utility.insertionsort1(ss);
		for (int i = 0; i < Lines.length; i++)
		{
			System.out.print(Lines[i] + " ");
		}
		
			//System.out.println(Lines);
		
		System.out.println();
		System.out.println("enter a word for search");
		String word=Utility.StringInput();
		int l=Utility.binarysearchString(ss, 0, ss.length, word);
		System.out.println();
		System.out.println("word "+word+" found at index "+l);
		
		
	  } 
	  
  
}
