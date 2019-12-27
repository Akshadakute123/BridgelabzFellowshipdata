package Com.Bridgelabz.Fellowship.Algorithmic;

import Com.bridgelabz.Fellowship.utility.Utility;

public class AnagramString
{
public static void main(String[] args) 
{
	System.out.println("enter the first String");
	String str1=Utility.StringInput();
	System.out.println("enter the second String");
     String str2=Utility.StringInput();
     Utility.isAnagram(str1, str2);
     
}
}
