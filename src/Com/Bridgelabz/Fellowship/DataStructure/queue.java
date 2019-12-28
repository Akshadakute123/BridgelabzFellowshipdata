package Com.Bridgelabz.Fellowship.DataStructure;

public class queue<T> 
{
	static int front = -1;
	static int rear = -1;
	static int max = 500;

	static int queue[] = new int[max];
//	private static int check = 0;
	//static int bank_amount = 5000;
	//static int deposit = 0;
//	static int withdraw = 0;

	public static int[] enqueue(int data)
	{
		if (rear == max - 1)
		{
			System.out.println("Queue is full ");
		}
		else
			front=0;
		
			rear = rear + 1;
		 queue[rear] = data;
		
		 return queue;
	}

	public static void dequeue() 
	{
		if (front == -1 || front > rear) 
		{
			System.out.println("Queue underflow ");
		} else 
		{
			front = front + 1;

		}
	}

	public static void display() 
	{
		if (front == -1) 
		{
			System.out.println("Queue is empty ");
		} else 
		{
			for (int i = 0; i <= rear; i++) 
			{
				System.out.print(queue[i] + " ");

			}
		}
	}
	}
