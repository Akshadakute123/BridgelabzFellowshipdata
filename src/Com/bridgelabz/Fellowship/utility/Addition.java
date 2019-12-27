package Com.bridgelabz.Fellowship.utility;

public class Addition 
{
 public static void main(String[] args)
 {
	 System.out.println("enter the number");
	 int n1=Utility.integerInput();
	 System.out.println("enter the number");
	 int n2=Utility.integerInput();
	int sum=Utility.add(n1, n2);
	System.out.println(sum);
}
}
