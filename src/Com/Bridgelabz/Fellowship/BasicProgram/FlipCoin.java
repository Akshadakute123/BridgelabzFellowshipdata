package Com.Bridgelabz.Fellowship.BasicProgram;

import Com.bridgelabz.Fellowship.utility.Utility;

public class FlipCoin 
{

	public static void main(String[] args)
	{
		 System.out.println("Enter how many times you want to flip a coin");
          int num=Utility.integerInput();
          System.out.println();
          Utility.flipflop(num);
          
	}
} 
