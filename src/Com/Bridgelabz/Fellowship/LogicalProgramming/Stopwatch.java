package Com.Bridgelabz.Fellowship.LogicalProgramming;

import Com.bridgelabz.Fellowship.utility.Utility;

public class Stopwatch
{
	public static void main(String[] args) 
	{
		System.out.println("enter 1 for start time");
		//Utility.nextLine();
		int start=Utility.integerInput();
		Utility.starttime();
		System.out.println("enter 2 for stop time");
        int stop=Utility.integerInput();
        Utility.stoptime();
        System.out.println("enter 3 for elapsed time");
        int elapse=Utility.integerInput();
        Utility.ElapsedTime();
		
		
		
	}

}
