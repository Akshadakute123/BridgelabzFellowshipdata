package Com.Bridgelabz.Fellowship.DataStructure;

public class StackUsingLinkedList 
{
	private class Node
	{
		int data;
		
		Node link;
	}
	Node top;
	StackUsingLinkedList()
	{
		this.top=null;
	}
	
	void push(int x) {
		Node temp=new Node();
		 if (temp == null)
		 { 
	           
	            return ; 
		 }
	
	temp.data=x;
	temp.link=top;
	top=temp;
	
	}
	boolean isEmpty()
	{
		return top==null;
				
	}
	  void pop()
	  {
		  if(top==null)
		  {
			  System.out.println("stack is underflow");
			  return;
		  }
		  else
		  {
			  top=(top).link;
					 
		  }
	  }
	  public void display()
	  {
		  if(top==null)
		  {
			  System.out.println("stack is underflow");
		  }
		  else
		  {
			  Node temp=top;
			  while(temp!=null)
			  {
				  System.out.printf("%d-> ",temp.data);
			  
			  temp=temp.link;
			  
			  }
		  }
	  }

 
	  public static void main(String x[])
	  {
		 StackUsingLinkedList li=new StackUsingLinkedList();
		 li.push(45);
		// li.display();
		 li.push(46);
		 li.push(47);
		 li.push(48);
		 li.push(49);
		 li.push(50);
		 li.display();
		 
		 
		 System.out.println("after pop");
		 li.pop();
		 li.pop();
		 li.display();
		  
		  
	  }
}