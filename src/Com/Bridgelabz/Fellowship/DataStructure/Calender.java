package Com.Bridgelabz.Fellowship.DataStructure;

import java.util.Scanner;

public class Calender 
{
	Scanner scan=new Scanner(System.in);
	
	CalenderUtility  u = new CalenderUtility ();
		char[] days = { 'S', 'M', 'T', 'W', 'T', 'F', 'S' };
		int[][] calender = new int[6][7];
		
		// public constructor
		public Calender() {
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 7; j++) {
					calender[i][j] = -10;
				}
			}
		}
		// display calender
		public void displayCalender() {
			for(int i=0;i<7;i++)
			{
				System.out.print(days[i]+" ");
			}
			System.out.println();
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 7; j++) {
					if (calender[i][j] == -10) 
						System.out.print(' ' + " ");
						else
							System.out.print(calender[i][j] +" ");
				}
				System.out.println();
				System.out.println("- - - - - - - - - - - -");
			}
		}
		// main logic to add days to calender
		public void playCalender()
		{
			//int year=u.inputYear();
			System.out.println("Please enter the year");
			int year=scan.nextInt();
			System.out.println("Please enter the month");
			int month=scan.nextInt();
			int res =u.dayOfWeek(1, month, year);
			int value = 1;
			int maxval = u.value(month-1);
			for(int i= res;i<7;i++)
			{
				calender[0][i]=value++;
			}
			for(int i=1;i<6;i++)
			{
				for(int j =0;j<7&&value<=maxval;j++)
				{
					calender[i][j]=value++;
				}
			}
		}

		public static void main(String[] args) 
		{
			
			Calender c = new Calender();
			c.playCalender();
			c.displayCalender();
		}
	}

