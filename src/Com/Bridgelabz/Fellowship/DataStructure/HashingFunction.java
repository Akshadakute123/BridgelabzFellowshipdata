package Com.Bridgelabz.Fellowship.DataStructure;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import Com.bridgelabz.Fellowship.utility.Utility;

public class HashingFunction 
{
	

		static Object[] ob = new Object[11];

		public static void main(String[] args) throws Exception {
			

			for (int i = 0; i < ob.length; i++) {
				ob[i] = new LinkedListhashing<Integer>();
			}
			LinkedListhashing<Integer> input =HashingFunction.inputFromFile();
			for (int i = 0; i < input.size(); i++) {

				LinkedListhashing<Integer> list = (LinkedListhashing<Integer>) ob[i % 11];
				list.add(i);
			}
			
			
			for (int i = 0; i < ob.length; i++) {

				LinkedListhashing<Integer> list = (LinkedListhashing<Integer>) ob[i];
				System.out.println();
				list.display();

			}

			System.out.println();
			System.out.println("Enter a data to search ");
			int data = Utility.integerInput();

			getvalue(data%11,data);
			//Hashing.writeToFile(input));

		}

		public static void getvalue(int key,int data) {
			LinkedListhashing<Integer> list = (LinkedListhashing<Integer>) ob[key];
			if (list.search(data)) {
				list.removeAtIndex((int) list.index(data));

			} else {
				list.add(data);
			}
			list.display();


		}
		public static LinkedListhashing<Integer> inputFromFile() throws Exception
		{
			LinkedListhashing<Integer> intlist = new LinkedListhashing<Integer>();
			File file = new File("/home/admin1/Akshada/Fellowship/src/Com/Bridgelabz/Fellowship/DataStructure/Hashing");
			Scanner s = new Scanner(file);
			while (s.hasNextInt())
			{
				intlist.add(s.nextInt());
			}
			return intlist;
		}
		public static void writeToFile(LinkedListhashing<Integer> list) throws Exception
		{
			File file = new File("/home/admin1/Akshada/Fellowship/src/Com/Bridgelabz/Fellowship/DataStructure/Hashing");
			FileWriter writer = new FileWriter(file);
			writer.write(" "); writer.flush();
			String str = "";
			int l = list.size();
			//System.out.println(l);list.display();
			while(l!=0)
			{
				str=str+list.pop()+" ";
				l--;
			}
			System.out.println(str);
			writer.write(str);
			writer.flush();
		}
	}


