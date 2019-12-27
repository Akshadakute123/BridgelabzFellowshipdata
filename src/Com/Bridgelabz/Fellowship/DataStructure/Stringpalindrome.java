package Com.Bridgelabz.Fellowship.DataStructure;

import java.util.Arrays;

import Com.bridgelabz.Fellowship.utility.Utility;

public class Stringpalindrome 
{
 public static void main(String[] args) 
 {  
	 Dequeue<Character> d1=new Dequeue<Character>();
	 System.out.println("enter the string");
	 String str=Utility.StringInput();
	char c[]=str.toCharArray();
      for(int i=0;i<c.length;i++)
      {
    	  d1.addRear(c[i]);
      }
	 
     /* for(int i=0;i<c.length;i++)
		{
			d1.addRear(c[i]);
		}*/
      char[] res1=d1.display(); 
      System.out.println("---------------");
		Dequeue<Character>d2 = new Dequeue<Character>();
		
		for(int i=0;i<c.length;i++)
		{
			d2.addFront(c[i]);
		}
		char[] res2 =d2.display();
		if(Arrays.equals(res1, res2)) 
		{
			System.out.println("String is pallindrome");
		}
		else System.out.println("String is not pallindrome");
	}
	 
     
	// char[] c=str.toCharArray();
	 
	 
	

}
