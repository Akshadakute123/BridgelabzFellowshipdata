package Com.Bridgelabz.Fellowship.DataStructure;

public class LinkedListUtility<T>
{
	public class Node<T> 
	{
		public Node next;
		public T data;

	}

	Node<T> head;

	// Creates a new list that is empty.
	// It needs no parameters and returns an empty list.
	public  LinkedListUtility list()
	{
		return new  LinkedListUtility();
	}
	public void add(T obj)
	{
		Node<T> node=new Node();
		node.data=(T)obj;
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node insert=head;
			while(insert.next!=null)
			{
				insert=insert.next;
			}
			insert.next=node;
		}
	}
	public void remove( T data)
	{
		Node<T> temp=head,prev=null;
		if(temp.data.equals(data))
		{
			head=temp.next;
			return;
		}
		
		
			while(temp!=null&&!temp.data.equals(data))
			{
				head=temp;
				temp=temp.next;
						return;
			}
		if(temp==null)
		{
			return;
		}
		prev.next=temp.next;
	}
	public boolean search(Object obj)
	{
		Node search=new Node();
		search.data=obj;
		Node check=head;
		while(check!=null)
		{
			if(check.data.equals(search.data))
				
				return true;
				
				check=check.next;
			
		}
		
	return false;
	}
	public   boolean isEmpty()
	{
		if(head==null)
		{
			return true;
		}
		return false;
	}
	public int size()
	{
		Node<T> temp=head;
		int count=0;
		
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		return count;
		
	}
	public void append(Object obj)
	{
		Node<T> node=new Node();
		node.data=(T)obj;
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node insert=head;
			while(insert.next!=null)
			{
				insert=insert.next;
			}
			insert.next=node;
		}
	}
	public void removeAtIndex(int index)
	{
		if(index==0)
		{
			head=head.next;
		}
		else
		{
			Node n=head;
			Node n1=null;
			for(int i=0;i<=index-1;i++)
			{
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
		
	}
	}
	public void display()
	{
		Node display=head;
		while(display!=null)
		{
			System.out.print(display.data+" ");
		      display=display.next;
		}
	}
	// gives the index on which item is present in the linked list
	public int index(T item)
	{
		Node<T> temp=head;
		int count=0;
		
		while(item!=(temp.data))
		{
			count++;
			temp=temp.next;
		}
		return count;
		
	}
	//Insert an element At particular position
	public void insertAt(T data,int position)
	{
		Node new_data=new Node<T>();
		new_data.data=data;
		Node<T> temp=head;
		if(position>1)
		{
			temp=temp.next;
			position--;
		}
		new_data.next=temp.next;
		temp.next=new_data;
		
	}
}
