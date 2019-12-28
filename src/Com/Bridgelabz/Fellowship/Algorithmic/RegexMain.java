package Com.Bridgelabz.Fellowship.Algorithmic;

import Com.bridgelabz.Fellowship.utility.Utility;

public class RegexMain 
 {
	
	
		public static void main(String[] args) {
			//Date d1=new Date();
			String string= "Hello <<name>>, We have your fullname as <<full name>> in our system.\n"
					+ " your contact number is 91-xxxxxxxxxx.\n"
					+ "Please,let us know in case of any clarification \n"
					+ "Thank you BridgeLabz xx/xx/xxxx.";
			System.out.println(string);
			System.out.println();
			System.out.println("Enter a username ");
			String username=Utility.StringInput();
			System.out.println("Enter a Fullname ");
			String fullname=Utility.StringInput();
			System.out.println("Enter a Mobile number ");
			String mobile_number=Utility.StringInput();
			System.out.println("Enter a date ");
			String date=Utility.StringInput();
			Utility.regex(username, fullname, mobile_number, date, string);
		//System.out.println(str3);
			
			
		}

	}


