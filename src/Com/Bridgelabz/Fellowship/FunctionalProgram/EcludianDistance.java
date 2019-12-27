package Com.Bridgelabz.Fellowship.FunctionalProgram;

import Com.bridgelabz.Fellowship.utility.Utility;

public class EcludianDistance 
{
 public static void main(String[] args)
 {
	System.out.println("enter the value of x");
	int x=Utility.integerInput();
	System.out.println("enter the value of y");
	int y=Utility.integerInput();
	Utility.calculateEcludian(x, y);
}
}
