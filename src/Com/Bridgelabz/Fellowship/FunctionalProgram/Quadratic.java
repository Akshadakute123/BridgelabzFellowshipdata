package Com.Bridgelabz.Fellowship.FunctionalProgram;

import Com.bridgelabz.Fellowship.utility.Utility;

public class Quadratic
{
 public static void main(String[] args) 
 {
	System.out.println("enter the value of num1");
	int num1=Utility.integerInput();
	System.out.println("entere  the value of second number");
	int num2=Utility.integerInput();
	System.out.println("enter the value of third number");
	int num3=Utility.integerInput();
	Utility.calculateRoot(num1, num2, num3);
}
}
