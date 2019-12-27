package Com.Bridgelabz.Fellowship.BasicProgram;

import Com.bridgelabz.Fellowship.utility.Utility;

public class LeapYear
{
	public static void main(String[] args)
	{
		 System.out.println("enter the year which you want to check leap year or not");
		 int year=Utility.integerInput();
		 Utility.leapYear(year);
		 
	}

}
