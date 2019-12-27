package Com.Bridgelabz.Fellowship.DataStructure;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import Com.bridgelabz.Fellowship.utility.Utility;

public class Unorderedlist 
 {  
	
		public class Node
		{
			public Node next;
			public String data;

		}

		Node head;
		public Unorderedlist  list() {
			return new Unorderedlist ();
		}
		
		public void add(String obj)
		{
			Node node = new Node();
			node.data =  obj;
			if (head == null)
				head = node;
			else {
				Node insert = head;
				while (insert.next != null) {
					insert = insert.next;
				}
				insert.next = node;
			}
		}
		public boolean search(Object obj) {
			Node search = new Node();
			search.data = (String) obj;
			Node check = head;
			while (check != null) {
				if (check.data.equals(search.data))
					return true;
				check = check.next;
			}
			return false;

		}
		public void remove(String data) {
			Node  temp = head, prev = null;

			if (temp.data.equals(data)) {
				head = temp.next;
				return;
			}

			while (temp != null && !temp.data.equals(data)) {
				prev = temp;
				temp = temp.next;
			}

			if (temp == null)
				return;

			prev.next = temp.next;

		}
		public void display()
{
			Node display = head;
			while (display != null) {
				
				System.out.println(display.data);
				display = display.next;
			}
		}
		public static String inputFromFile() throws Exception
		{
			String fileText ="";
			File file = new File("/home/admin1/Akshada/Fellowship/src/Com/Bridgelabz/Fellowship/DataStructure/Nodetext");
			Scanner s = new Scanner(file);
			while (s.hasNextLine())
			{
				fileText=s.nextLine();
			}
			return fileText;
		}
		public static void writeTofile(Unorderedlist list) throws Exception
		{
			Node insert = list.head;
			File file = new File("/home/admin1/Akshada/Fellowship/src/Com/Bridgelabz/Fellowship/DataStructure/Nodetext");
			FileWriter writer = new FileWriter(file);
			String output="";
			while(insert!=null)
			{
				output = output+" "+insert.data;
				insert=insert.next;
			}
			writer.write("");
			writer.flush();
			writer.write(output);
			writer.flush();
		}
		public static void main(String[] args) throws Exception
		{
			Unorderedlist list=new Unorderedlist ();
			
			String file_text=Unorderedlist.inputFromFile();
			String[] result=file_text.split(" ", -2);
			for(int i=0;i<result.length;i++)
			{
				list.add(result[i]);
			}
			list.display();
			System.out.println("Enter the word you want to search");
		//	Scanner s = new Scanner(System.in);
			String search =Utility.StringInput();
			//s.close();
			if(list.search(search))
				list.remove(search);
			else
				list.add(search);
			list.display();
			Unorderedlist.writeTofile(list);
		}

}
