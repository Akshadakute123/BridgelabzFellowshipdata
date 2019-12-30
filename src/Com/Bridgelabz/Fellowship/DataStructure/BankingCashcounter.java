package Com.Bridgelabz.Fellowship.DataStructure;

	import java.util.Scanner;

	import Com.bridgelabz.Fellowship.utility.Utility;

	public class BankingCashcounter
	{
	static //	private static int amount;
	   Scanner sc=new Scanner(System.in);
		public static int inputAmount()
		{
			System.out.println("Enter amount you want to withdraw ");
			return sc.nextInt();
		}
		public static int inputAmount1()
		{
			System.out.println("Enter amount you want to deposite ");
			return sc.nextInt();
		}


		public static void main(String[] args) {
			int sum=0;
			Queue q=new Queue();
		//	System.out.println("enter the amount which you want deposite or withdraw");
			//int amount=Utility.integerInput();
			System.out.println("enter 0 for withdraw");
			System.out.println("enter 1 for deposite");
			System.out.println("enter 2 for stop");
			int choice=sc.nextInt();
			while(choice!=2)
			{
				switch(choice) 
				{
				case 0:
				if(q.balance==1000)
				{
					System.out.println("withdraw cannot happen");
				}
				else
				{ 
					BankingCashcounter.inputAmount();
					q.dequeue();
				}
			System.out.println("balance is"+q.balance);
				break;
				case 1:
					q.enqueue( BankingCashcounter.inputAmount1());
					System.out.println("balance is"+q.balance);
					break;
				case 2:
					System.out.println("Thankyou!!!");
					break;
				}
				System.out.println("Enter 0 to withdraw");
				System.out.println("Enter  1 to deposit");
				System.out.println("Enter 2 to stop process");
				choice = sc.nextInt();
			}
			if(q.balance==sum)
			{
				System.out.println("balanced");
			}
			else System.out.println("not balanced");
		}
					
				
				
				
			
			}
		



