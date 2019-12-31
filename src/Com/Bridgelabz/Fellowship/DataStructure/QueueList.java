package Com.Bridgelabz.Fellowship.DataStructure;

public class QueueList<T>
{
 
	
		// initiallizing list object
	@SuppressWarnings("rawtypes")
	LinkedListUtility list ;
		// public constructor
		@SuppressWarnings("rawtypes")
		public QueueList()
		{
			list= new LinkedListUtility();
		}
		// to add data in queue
		@SuppressWarnings("unchecked")
		public void enqueue(T item)
		{
			list.add(item);
		}
		// to display queueueue_Stac
		public void display()
		{
			list.display();
		}
		// return the size of queue
		public int size()
		{
			return list.size();
		}
	}



