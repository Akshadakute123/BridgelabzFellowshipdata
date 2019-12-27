package Com.Bridgelabz.Fellowship.DataStructure;

import Com.bridgelabz.Fellowship.utility.Utility;

public class Calender1 
{
		public static void main(String[] args) 
		{
			System.out.println("enter the month");
			int month=Utility.integerInput();
			System.out.println("enter the year");
			int year=Utility.integerInput();
			int months[]= {31,28,31,30,31,30,31,31,30,31,30,31};
			int monthLeap[]= {31,29,31,30,31,30,31,31,30,31,30,31};
			String week[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
			Utility.dayofweek(1, month, year);
			Utility.leapYear(year);
			
		}

}
