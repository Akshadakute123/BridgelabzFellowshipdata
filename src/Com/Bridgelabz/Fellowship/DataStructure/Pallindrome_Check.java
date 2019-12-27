package Com.Bridgelabz.Fellowship.DataStructure;

import java.util.Arrays;
import Com.Bridgelabz.Fellowship.DataStructure.*;

import Com.bridgelabz.Fellowship.utility.Utility;

public class Pallindrome_Check 
{
		//Scanner sc = new Scanner(System.in);
		
		
	
	public static void main(String[] args) 
	{
		System.out.println("enter the string dou you want to check");
		String str=Utility.StringInput();
		Dequeue<Character> d = new Dequeue<Character>();
		//String check = Pallindrome_Check.inputString();
		char[] element = str.toCharArray();
		for(int i=0;i<element.length;i++)
		{
			d.addRear(element[i]);
		}
		Dequeue<Character>d2 = new Dequeue<Character>();
		char[] res1=d.display(); 
		for(int i=0;i<element.length;i++)
		{
			d2.addFront(element[i]);
		}
		char[] res2 =d2.display();
		if(Arrays.equals(res1, res2)) 
		{
			System.out.println("String is pallindrome");
		}
		else System.out.println("String is not pallindrome");
	}

}