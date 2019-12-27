package Com.Bridgelabz.Fellowship.LogicalProgramming;

import Com.bridgelabz.Fellowship.utility.Utility;

public class Gambler
{
 public static void main(String[] args) {
	System.out.println("enter the value of stake");
	int stake=Utility.integerInput();
	System.out.println("enter the value of goals");
	int goal=Utility.integerInput();
     System.out.println("enter how many times you want to paly");
     int times=Utility.integerInput();
     Utility.gambler(stake, goal, times);
	}
}
