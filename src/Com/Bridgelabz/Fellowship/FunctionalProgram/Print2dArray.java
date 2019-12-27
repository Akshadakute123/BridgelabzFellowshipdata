package Com.Bridgelabz.Fellowship.FunctionalProgram;

import Com.bridgelabz.Fellowship.utility.Utility;

public class Print2dArray 
{
 public static void main(String[] args) 
 {
	System.out.println("enter the size of row");
	int row=Utility.integerInput();
	System.out.println("enter the size of coloumn");
	int col=Utility.integerInput();
	Utility.matrixArray(row, col);
	
	
}
}
