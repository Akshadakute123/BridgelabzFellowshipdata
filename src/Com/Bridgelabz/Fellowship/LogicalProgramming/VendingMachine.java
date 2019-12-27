package Com.Bridgelabz.Fellowship.LogicalProgramming;

import Com.bridgelabz.Fellowship.utility.Utility;

public class VendingMachine
{
 public static void main(String[] args)
 { 
	
	
	System.out.println("enter the money");
	int money=Utility.integerInput();
	
	int n=Utility.calculate(money,0);
	
	System.out.println(n);
	
}
}
