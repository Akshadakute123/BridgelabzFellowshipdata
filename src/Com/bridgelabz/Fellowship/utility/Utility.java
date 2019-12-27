package Com.bridgelabz.Fellowship.utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Utility {
	static Scanner sc = new Scanner(System.in);

	public static int integerInput() {
		return sc.nextInt();
	}

	public static String StringInput() {
		return sc.nextLine();
	}

	public static double doubleInput() {
		return sc.nextDouble();
	}
	public static float floatInput()
	{
		return sc.nextFloat();
	}
	public static Long LongInput()
	{
		return sc.nextLong();
	}

	public static int add(int no1, int no2) {
		int sum = no1 + no2;
		// System.out.println();
		return sum;
	}

	// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ coin Flip Flop@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

	static int head = 0, tail = 0, counter = 1;
	static double randno = 0.0;

	public static void flipflop(int num) {
		while (counter <= num) {
			randno = Math.random();
			System.out.println(counter + "/t" + randno);
			if (randno < 0.5) {
				head++; 
				System.out.println("heads");
			} else {
				tail++;
				System.out.println("tails");
			}
			counter++;
		}
		System.out.println();
		System.out.println("number of heads=" + head);
		System.out.println("number of tails=" + tail);
	}

	// ###########################@@@Leap
	// Year@@######################################
	static int year;

	public static void leapYear(int year)

	{
		int counter = 0;
		int new_year = year;
		while (new_year > 0) {
			// int rem= year%10;
			new_year = new_year / 10;
			counter++;

		}

		System.out.println(counter);
		if (counter != 4) {
			System.out.println("you have not entered 4 digit number");
			System.out.println("please enter four digit number");
			year = Utility.integerInput();
			leapYear(year);

		} else

		if (counter == 4) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.println(+year + " year is Leap year");
			} else {
				System.out.println(+year + " year is not leap year");
			}

		} else {
			System.out.println("the year you have entered is not four digit");

		}

		// this.year=year;

	}
	// ##########################@@POWER OF TWO@@#############################

	public static void powerOfTwo(int num) {
		int power = 1, i = 0;
		while (i <= num) {
			if (i >= 0 && num < 31) 
			{
				System.out.println("2^" + i + "=" + power);
				power = power * 2;
				i++;
			}

		}

	}

	// ###########################@@HARMONIC NUMBER@@#########################
	public static void harmonic(int num) {
		int i = 1;
		double result = 0.0;
		while (i <= num) {
			if (num != 0) {
				System.out.print("1/" + i + " +");
				result = result + (double) 1 / i;
				i++;

			}

		}
		System.out.println();
		System.out.println("result of harmonic number is" + result);
	}

	// ##############################@@@@PrimeFactorization@@##################

	public static void primeFactor(int num) {
		while (num % 2 == 0) {
			System.out.println(2 + " ");
			num = num / 2;
		}
		for (int i = 3; i <= Math.sqrt(num); i++) {
			while (num % i == 0) {
				System.out.println(i + " ");
				num /= i;
			}
		}

	}
	// ##############################@@@@2DD ARRAY@@##################

	public static void matrixArray(int row, int col) {
		int arr[][] = new int[row][col];
		System.out.println("Enter elements");
		for (int i = 0; i < arr.length; i++) {
			// System.out.println("enter row "+i+"information");

			for (int j = 0; j < arr[i].length; j++)

			{
				int a = Utility.integerInput();
				arr[i][j] = a;
				// System.out.println();

			}

		}
		PrintWriter w = new PrintWriter(System.out);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				w.print(arr[i][j] + " ");
				// System.out.println();
			}
			w.println();

		}
		w.flush();
		w.close();
	}

	// ################################################@@@DISTINCT
	// TRIPLET@@#########################

	public static void distinctTriplet(int arr[], int n) {
		int count = 0;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; j < n; j++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k] + " ");
						count++;
					}

				}
			}
		}
		System.out.println();
		System.out.println(count);
	}

//###################################@@@ECLUIDIAN DISTANCE@@@@###################

	public static void calculateEcludian(int x, int y) {
		double distance = Math.sqrt(x * x + y * y);
		System.out.println("ecludian distance of(" + x + "," + y + ") to origin(0,0) is" + distance);
	}
//#############################@@@CALCULATE QUADRATIC EQUATION@@################

	public static void calculateRoot(int num1, int num2, int num3) {
		int delta = ((num2 * num2) - (4 * num1 * num3));
		int root1 = (int) ((-num2) + (Math.sqrt(delta)) / (2 * num1));
		int root2 = (int) ((-num2) - (Math.sqrt(delta)) / (2 * num1));
		System.out.println("the value of root1 is" + root1);
		System.out.println("the value of root2 is" + root2);

	}

//#####################################@@@WINDCHILL@@########################

	public static void calculateTemp(double t, double v) {
		if (t > 50 || v > 120 || v < 3) 
		{
			System.out.println("invalid input");
		} else
		{
			double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
			System.out.println(w);
		}
	}
//#######################@@Gambler@@########################################

	static int wins = 0;
	static int bets = 0;

	public static void gambler(int stake, int goal, int times) {
		for (int i = 0; i <= times; i++) {
			int cash = stake;
			while (cash > 0 && cash < goal) {
				bets++;
				if (Math.random() < 0.5) {
					cash++;
				} else {
					cash--;
				}
			}
			if (cash == goal) {
				wins++;
			}
		}
		System.out.println();
		System.out.println(wins + " wins of " + times);
		System.out.println("Percent of games won = " + 100.0 * wins / times);
		System.out.println("Avg # bets           = " + 1.0 * bets / times);
	}
//##########################################@@@STOPWATCH@@#####################

	static double start_time = 0, stop_Time = 0;

	public static void starttime() {
		start_time = System.currentTimeMillis();
		System.out.println("start time is" + start_time);

	}

	public static void stoptime() {
		stop_Time = System.currentTimeMillis();
		System.out.println("stop time is" + stop_Time);
	}

	public static void ElapsedTime() {
		System.out.println("elapsed time is" + (start_time - stop_Time));
	}

//########################################@@@@VENDING MACHINE@@#####################
	static int money;
	static int i = 0;
	//static int total = 0;
	static int notes[] = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };

	public static int calculate(int money,int data) {
		int rem = 0;
		int total=data;
		if (money == 0) {
			return total;
		} else {
			if (money >= notes[i]) {
				int calculatemoney = money / notes[i];
				rem = money % notes[i];
				money = rem;
				total += calculatemoney;
				System.out.println(notes[i] + " notes-------->" + calculatemoney);

			}
			i++;
			return calculate(money,total);
		}
	}

	// #####################################@@DAY OF WEEK@@############

	public static int dayofweek(int d,int m,int y)
     {
    
    	int ye= y-(14-m)/12;
    	int x=ye+ye/4-ye/100+ye/400;
    	int me=m+12*((14-m)/12)-2;
    	int de=(d+x+(31*me)/12)%7;
		return de;
    	
    			
     }
	
//################################@@@@@Temperature conversion#####@@@@@@@@@@@@@@@
	public static void tempConversion(float f,float c)
	{
		float F = (c * 9 / 5) + 32;
		System.out.println("Conversion of celsius to fehrenheit is " + F);
		float C = (f - 32) * 5 / 9;
		System.out.println("Conversion of  fehrenheit celsius to is " + C);
	}
	//####################@@@@@@@@@@@@@PAYMENT CALCULATION@@@#########
	public static void payment(double P,double Y,double R)
	{
		double n=Y*12;
		double r=(R/(12*100));
		double payment=((P*r)/(1-Math.pow(1+4, (-n))));
		System.out.println("monthly payment is "+payment);
		
		
		
	}
	
//@@@@@@@@@@@@@@@@@@##############Square root###@@@@@@@@@@@@@@
	public static void sqrt(double num) {
		double eplison = 0.00001;
		double t = num;
		while (Math.abs(t - num / t) > eplison * t)
		{
			t = (num / t + t) / 2.0;
		}
		System.out.println("result is"+t);
	}
//@@@@@@@@@@@@@@@@@#######BINARY CONVERSIOMN@@@@##############
	public static void binaryconv(int n) 
	{
		// int arr[]=new int[32];
		int i = 1;
		int binary = 0;
		while (n != 0) 
		{
			int rem = n % 2;
			binary = binary + rem * i;
			n = n / 2;
			i = i * 10;

		}
		System.out.println("binary conversion is" + binary);
	}

	public static int swapnibble(int n)
	{
		return ((n & 0X0f) << 4 | (n & 0xf0) >> 4);
	}

	public static void power(int dec) 
	{
		for (int i = 1; i <= 100; i++) 
		{
			int res = (int) Math.pow(2, i);
			if (res == dec) {
				System.out.println("the no is in the power of 2^" + i + " ");
			} else
			{
				System.out.println("number is not in power 2");
				break;
			}
		}
	}
	
	//@@@@@@@@@@####################BINARY SEARCH USING EXTERNAL FILE$######@@@@@
	
	public static String[] readFile() throws Exception
	{
		String str[]=new String[10];
		FileReader fr=new FileReader("/home/admin1/Akshada/Fellowship/src/Com/Bridgelabz/Fellowship/DataStructure/Nodetext");
		BufferedReader br=new BufferedReader(fr);
		String data;
		String lines[]=br.readLine().split(",");
       /*  for(String string:lines)
         {
        	 System.out.println(string+" ");
         }
         System.out.println();*/
		return lines;
		
	}
	//@@@@@@@@##############INSERTION SORT of String###@@@@@@@@@@@@@@@@@@
	public static void insertionsort()
	{
		int arr[] = { 2, 6, 4, 1, 9, 33 };
	
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	///@@@@@@@@@@@@@@@@@INSERTION SORT FOR STRING@@@@@@@@@@@
	public static String[] insertionsort1(String[] ss)
	{
		
		for (int i = 1; i < ss.length; i++) {
			String temp = ss[i];
			int j = i;
			while (j > 0 && temp.compareTo(ss[j - 1]) <0) {
				ss[j] = ss[j - 1];
				j--;
			}
			ss[j] = temp;
		}
		
		return ss;
		
	}
//<==================BINARY SEARCH FOR STRING=============================>
	
	public static int binarysearch(int[] arr, int start, int end, int search)
	{
		int mid = (start + end) / 2;
		if (arr[mid] == search)
		{
			return mid;
		} else if (arr[mid] > search) 
		{
			return binarysearch(arr, start, mid - 1, search);
		} else if (arr[mid] < search)
		{
			return binarysearch(arr, mid + 1, end, search);
		}
		return -1;

	}
	
	//<============================BINARY SEARCH FOR STRING===================>
	public static int binarysearchString(String arr1[], int start, int end, String search) {
		int mid = (start + end) / 2;
		if (arr1[mid].compareTo(search) == 0) {
			return mid;
		} else if (arr1[mid].compareTo(search) > 0) {
			return binarysearchString(arr1, start, mid - 1, search);
		} else if (arr1[mid].compareTo(search) < 0) {
			return binarysearchString(arr1, mid + 1, end, search);
		}
		return -1;

	}
	//<=======================BUbble sort=========================>
	public static void bubbleSort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
			}
		}
			
	}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	//<======================Buble sort============================>
	public static void bubbleSort1(String arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j].compareTo(arr[j+1])>0)
				{
					String temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
			}
		}
			
	}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	//<=======================ANAGRAM STRING+=====================>
	

	public static void isAnagram(String str1, String str2) 
	{
		int len, len1, len2, found = 0, notfound = 0;
		len1 = str1.length();
		len2 = str2.length();
		if (len1 == len2) 
		{
			len = len1;
			for (int i = 0; i < len; i++) 
			{
				found = 0;
				for (int j = 0; j < len; j++)
				{
					if (str1.charAt(i) == str2.charAt(j))
					{
						found = 1;
						break;
					}
				}
				if (found == 0)
				{
					notfound = 1;
					break;
				}
			}
			if (notfound == 1) 
			{
				System.out.println("Strings arte not anagram to each other");
			} else {
				System.out.println("strings are vanagram");
			}

		} 
		else
		{
			System.out.println("both string must have the nsame number of character to anagram");
		}
		
	}
	//<===========================================PRIME NUMBER========================>
	 
	static int arr[]=new int[1000];
	public static ArrayList<Integer> isprime(int num)
	 { 
		ArrayList<Integer>a1=new ArrayList<Integer>();
		 for(int i=1;i<=num;i++)
		 {
			 int count =0;
			 for(int j=2;j<=i/2;j++)
			 {
				 if(i%j==0)
				 {
					 count++;
				 }
			 }
			 if(count==0&&i!=1)
			 {
				 System.out.println(i+" ");
				 
				 
				
			 }
			
		 }
		return a1;
	 }
	 public static boolean isPrimeBool(int num) 
	 {
		 for(int i=2;i<=num/2;i++)
		 {
			 if (num%i==0)
			 {
				 return false;
			 }
		 }
		 return true;
		 
	 }
	//<======================PRIme palindrome===================>
	public static boolean Primepalindrome(int  primes)
	
	{
		int sum=0;
		while(primes!=0)
		{
			int rem=primes%10;
			sum=sum*10+rem;
			primes=primes/10;
			
		}
		if(primes==sum)
		{
	        return true;		
		}
		else
		{
            return false;
		}
	}
	
	
	//<=====================Prime number=========================>

public static int[] primenumber()
{
		int primeNums[]=new int[500];
		int k=0;
		for (int i = 1; i <= 1000; i++) 
		{
			if(Utility.isPrimeBool(i)==true)
				primeNums[k++]=i;
		}
		//System.out.println("sum of prime number is" + sum);
		return primeNums;
	}

	
	//<=====================Merge sort==========================>
	
	static int inputarray[];
	static int temparr[];
	static int length;
	
	public  static void mergesort(int arr[])
	{
		inputarray=arr;
		length=arr.length;
		temparr=new int[length];
		divideArray(0,length-1);
		
		
	}
	public static void divideArray(int lower,int higher)
	{
		if(lower<higher)
		{
			int middle=lower+(higher-lower)/2;
			divideArray(lower,middle);
			divideArray(middle+1,higher);
			mergeArray(lower,middle,higher);
			
		}
	}
	
public static void mergeArray(int lower,int middle,int higher)
{
	for(int i=lower;i<=higher;i++)
	{
	temparr[i]=inputarray[i];	
	}
	int i=lower;
	int j=middle+1;
	int k=lower;
	while(i<=middle &&j<=higher)
	{
		if(temparr[i]<=temparr[j])
		{
			inputarray[k]=temparr[i];
			i++;
		}
		else
		{
			inputarray[k]=temparr[j];
			j++;
		}
			k++;
	}
	while(i<=middle)
	{

		inputarray[k]=temparr[i];
		k++;
		i++;
	}
	
}
//<=================================STRING FUNCTIONS====================>
public static void stringfunctions(String name,int mobileno,int date)
{
	String str1="Hello name your contact number is 91-xxxxxxxxxx Please let us know in case of any clarification Thank you BridgeLabz 01/01/2016 ";
	str1.split("name");
	


}

//<==============================Guess No=========================>
public static int  guessNumber()
{

		int low = 0, high = 127, mid;
		while (low != high)
		{
			mid = (low + high) / 2;
			System.out.println("enter 1 if no is between " + low + " - " + mid + "\nEnter 2 if no is between "
					+ (mid + 1) + " - " + high);
			int c =Utility.integerInput();
			mid = (low + high) / 2;
			if (c == 1)
				high = mid;
			else
				low = mid + 1;
		}
		return low;
	}
//<=======================String Palindrome====================>
/*public static void stringPlaindrome(String str1)
{
	
	Dequeue<Character> d = new Dequeue<Character>();
			//String str1;
			char[] element = check.toCharArray();
			for(int i=0;i<element.length;i++)
			{
				d.addRear(element[i]);
			}
			Dequeue<Character>d2 = new Dequeue<Character>();
			char[] res1=d.display(); 
			for(int i=0;i<element.length;i++)
			{
				d2.addFront(element[i]);
			}
			char[] res2 =d2.display();
			if(Arrays.equals(res1, res2)) 
			{
				System.out.println("String is pallindrome");
			}
			else System.out.println("String is not pallindrome");
		}

	}
*/

}