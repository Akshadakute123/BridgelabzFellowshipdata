package Com.Bridgelabz.Fellowship.LogicalProgramming;

import Com.bridgelabz.Fellowship.utility.Utility;

public class MonthlyPayment 
{
 public static void main(String[] args)
 {
	System.out.println("Enter the principal ammount");
	double P=Utility.doubleInput();
	System.out.println("enter year");
	double Y=Utility.doubleInput();
	System.out.println("enter the Rate per interest value");
	double R=Utility.doubleInput();
	Utility.payment(P, Y, R);
} 
}
