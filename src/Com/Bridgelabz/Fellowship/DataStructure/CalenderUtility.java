package Com.Bridgelabz.Fellowship.DataStructure;

import java.util.Scanner;

import Com.bridgelabz.Fellowship.utility.Utility;

public class CalenderUtility 
{
	@SuppressWarnings("unused")
	private Scanner  s = new Scanner(System.in);
		// static variable to store number of days that occurs in a month in a non leap year
		public static int month[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		// static variable to store number of days that occur in a month in a leap year
		public static int monthLeap[]= {31,29,31,30,31,30,31,31,30,31,30,31};
		// stores name of days in a sequential order
		public static String week[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	
		
		// used to take and validate date input with respect to month and year
		/*public int inputDate(int mth ,int year)
		{
			System.out.println("pLEASE eNTER Date");
			int date =s.nextInt();
			int mdays=0;
			if((year%4==0||year%400==0)&&year%100!=0)
				mdays=monthLeap[mth];
			else
				mdays=month[mth];
			if(date<=mdays)
				return date;
			else
			{
				System.out.println("this month doesnt have these much days");
				return inputDate(mth, year);
			}
		}*/
		// returns int value based on georgiean formula
		public int dayOfWeek(int d, int m, int y)
		{
			int y0 = y - (14 - m) / 12;
			int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
			int m0 = m + 12 * ((14 - m) / 12) - 2;
			int d0 = (d + x + (31 * m0) / 12) % 7;
			return d0;
		}
		// returns how many days in a particular month
		public static int value(int i)
		{
			return month[i];
		}
		public static int inputYear()
		{
			System.out.println("Please enter year");
			int year=Utility.integerInput();
			if(year>0&&year<10000)
				return year;
			else
			{
				System.out.println("Enter year between 0 to 9999");
				return inputYear();
			}
		}
		// used to take and validating month input
		public static int inputMonth()
		{
			System.out.println("Please Enter MONTH");
			int month=Utility.integerInput();
			if(month>=1&&month<13)
				return month;
			else
			{
				System.out.println("Enter month between 0 to 13");
				return inputMonth();
			}
		}
	}

