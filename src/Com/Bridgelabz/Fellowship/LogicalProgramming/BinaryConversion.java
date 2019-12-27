package Com.Bridgelabz.Fellowship.LogicalProgramming;

import Com.bridgelabz.Fellowship.utility.Utility;

public class BinaryConversion
{
 public static void main(String[] args) 
 {
	System.out.println("enter the number");
	int n=Utility.integerInput();
     Utility.binaryconv(n);
     Utility.swapnibble(n);
     int dec=n;
     Utility.power(dec);
     
}
}
