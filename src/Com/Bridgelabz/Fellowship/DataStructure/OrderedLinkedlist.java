package Com.Bridgelabz.Fellowship.DataStructure;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import Com.Bridgelabz.Fellowship.DataStructure.Unorderedlist.Node;

public class OrderedLinkedlist
{
	public class Node
	{
		public Node next;
		public int data;

	}

	Node head;
	public OrderedLinkedlist  list()
	{
		return new OrderedLinkedlist ();
	}
	public void add(int item)
	{
		Node node = new Node();
		node.data = item;
		if (head == null)
		{
			head = node;
		}
		else 
		{
			if (head.data<item) 
			{
				Node insert = head;
				Node put = null;
				while (insert != null && insert.data <= item) 
				{
					put = insert;
					insert = insert.next;
				}
				if (insert != null) 
				{
					Node value = put.next;
					put.next = node;
					node.next = insert;
				} else 
				{
					Node value = put.next;
					put.next = node;
				} 
			}
			else
			{
				Node new_head = new Node();
				Node exc = head;
				new_head.data=item;
				head = new_head;
				new_head.next=exc;
			}
			
		}
	}

	// displays all the items present in the list
	public void display() {
		Node display = head;
		while (display != null) {
			System.out.println(display.data);
			display = display.next;
		}
	}
	
	//removes an specified item from the list
	public void remove(int item)
	{
		Node node= new Node(); 
		node.data=item;
		Node remove =head;
		Node value=null;
		while(remove.data!=item)
		{
			value=remove;
			remove = remove.next;
		}
		value.next=remove.next;
	}
	//searches for an item in the list and gives boolean true value if present
	public boolean search(int item)
	{
		Node node = head;
		while(node !=null)
		{
			if(node.data==item)
				return true;
			node =node.next;
		}
			return false;
	}
	public int size() {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	 public int pop()
	 {
		 int v=0;
		 if(head==null)
		 {
			 System.out.println("Empty Linked List");
			 return 0;
		 }
		 //for 1 element
		 if(head.next==null)
		 {	
			 int data = head.data;
			 head=null;
			 return data;
		 }
		 //generic case
		 Node curr=head;
		 Node prev=null;
		 while(curr.next!=null)
		 {
			 prev=curr;
			 curr=curr.next;
		 }
		 v=curr.data;
		 prev.next=null;
		 return v;
	 }
	public static  OrderedLinkedlist inputFromFile() throws Exception
	{
		 OrderedLinkedlist intlist = new  OrderedLinkedlist();
		File file = new File("/home/admin1/Akshada/Fellowship/src/Com/Bridgelabz/Fellowship/DataStructure/Integerfile");
		Scanner s = new Scanner(file);
		while (s.hasNextInt())
		{
			intlist.add(s.nextInt());
		}
		return intlist;
	}
	// to write into the file
	public static void writeToFile(OrderedLinkedlist list) throws Exception
	{
		File file = new File("/home/admin1/Akshada/Fellowship/src/Com/Bridgelabz/Fellowship/DataStructure/Integerfile");
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
	public static void main(String[] args) throws Exception 
	{
		 OrderedLinkedlist input = OrderedLinkedlist.inputFromFile();
		 input.display();
		System.out.println("Enter the value you want to search");
		Scanner s = new Scanner(System.in);
		int ele=s.nextInt();
		if(input.search(ele))
		{
			input.remove(ele);
		}
		else input.add(ele);
		 OrderedLinkedlist.writeToFile(input);
}
}
