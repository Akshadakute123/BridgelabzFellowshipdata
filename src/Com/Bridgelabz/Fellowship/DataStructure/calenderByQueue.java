package Com.Bridgelabz.Fellowship.DataStructure;

import Com.bridgelabz.Fellowship.utility.Utility;

public class calenderByQueue
{
	
		
		// making a 2d queue
		@SuppressWarnings("rawtypes")
		QueueList[] queue = new QueueList[7];
		// public constructor
		@SuppressWarnings({ "unchecked", "rawtypes" })
		public  calenderByQueue()
		{
			for(int i=0;i<7;i++)
			{
				queue[i]=new QueueList();
			}
			queue[0].enqueue("Su");
			queue[0].enqueue("Mo");
			queue[0].enqueue("Tu");
			queue[0].enqueue("We");
			queue[0].enqueue("Th");
			queue[0].enqueue("Fr");
			queue[0].enqueue("Sa");
			
		}
		// addidng elements to the calender
		@SuppressWarnings("unchecked")
		public void playCalender()
		{
			int year=CalenderUtility.inputYear();
			int month= CalenderUtility.inputMonth();			
			//int date= u.inputDate(month, year);
			int res =Utility.dayofweek(1, month, year);
			int value = 1;
			
			int maxval = CalenderUtility.value(month-1);
			for(int i= 0;i<res;i++)
			{
				queue[1].enqueue("  ");
			}
			for(int i= res;i<7;i++)
			{
				queue[1].enqueue(value++);
			}
			for(int i=2;i<7;i++)
			{
				for(int j =0;j<7&&value<=maxval;j++)
				{
					queue[i].enqueue(value++);
				}
			}
		}
		// displaying the calender
		public void displayCalender()
		{
			for(int i=0;i<7;i++)
			{
				queue[i].display();
				System.out.println();
			}
		}
		
		
		public static void main(String[] args) 
		{
			calenderByQueue c = new calenderByQueue();
			c.playCalender();
			c.displayCalender();
		}
}
