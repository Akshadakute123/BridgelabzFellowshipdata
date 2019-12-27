package Com.Bridgelabz.Fellowship.FunctionalProgram;

import Com.bridgelabz.Fellowship.utility.Utility;

public class Windchill
{
public static void main(String[] args) {
	System.out.println("enter the value of v");
	double v=Utility.doubleInput();
     System.out.println("entere the value of t");
     double t=Utility.doubleInput();
     Utility.calculateTemp(t, v);
}

}
