package Com.Bridgelabz.Fellowship.LogicalProgramming;

import Com.bridgelabz.Fellowship.utility.Utility;

public class DayOfWeek 
{
   public static void main(String[] args) 
   {
	System.out.println("enter the day");
	int d=Utility.integerInput();
	System.out.println("enter the month");
	int m=Utility.integerInput();
	System.out.println("enter the year");
	int y=Utility.integerInput();
	//Utility.dayofweek(d, m, y);
	int day=Utility.dayofweek(d, m, y);

//	System.out.println("enter your choice");
	//int day=Utility.integerInput();
switch(day)
{
case 0:
{
System.out.println("sunday");
break;
}
case 1:
{
System.out.println("monday");
break;
}
case 2:	{
System.out.println("tuesday"); 
break;
}
case 3:
{
System.out.println("wensday");
break;
}
case 4:
{
System.out.println("thursday");
break;
}
case 5:
{
System.out.println("friday");
break;
}
case 6:
{
System.out.println("saturday");
break;
}
default:
{
System.out.println("wrong choice");
break;
}
}

}
}
