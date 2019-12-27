package Com.Bridgelabz.Fellowship.LogicalProgramming;

import Com.bridgelabz.Fellowship.utility.Utility;

public class TemparatureConversion 
{
 public static void main(String[] args)
 {
	 System.out.println("enter the temperatuire in fehrenheit");
		float f = Utility.floatInput();
		System.out.println("enter the value of celsious");
		float c =Utility.floatInput();
        Utility.tempConversion(f, c);
}
}
