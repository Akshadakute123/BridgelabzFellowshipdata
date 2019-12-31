package Com.Bridgelabz.Fellowship.DataStructure;


public class Queue_Stack<T> 
{
	@SuppressWarnings("rawtypes")
	Stack list ;
	@SuppressWarnings("rawtypes")
	public Queue_Stack()
	{
		list= new Stack();
	}
	@SuppressWarnings("unchecked")
	public void enqueue(T item)
	{
		list.push(item);;
	}
	public void display()
	{
		list.display();
	}
	public int size()
	{
		return list.size();
	}
}