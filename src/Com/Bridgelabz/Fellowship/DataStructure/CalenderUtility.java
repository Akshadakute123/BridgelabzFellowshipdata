package Com.Bridgelabz.Fellowship.DataStructure;

import java.util.Scanner;

public class CalenderUtility 
{
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
		public int value(int i)
		{
			return month[i];
		}
	}

