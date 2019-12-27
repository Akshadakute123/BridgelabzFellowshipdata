package Com.Bridgelabz.Fellowship.DataStructure;

public class Queue
{
  int balance=1000;
   int index=0;
   int arr[];
  public Queue()
  {
	  arr=new int[10];
  }
  public void enqueue(int item)
	{
		if (index<10) 
		{
			arr[index] = item;
			balance=balance + arr[index];
			index++;
		}
		else
		{
			int[]new_arr =arr;
			arr= new int[index+10];
			for(int i=0;i<index;i++)
			{
				arr[i]=new_arr[i];
			}
			arr[index]=item;
			balance=balance + arr[index];
			index++;
		}
	}
  public void display()
 	{
 		for(int i=0;i<index;i++)
 		{
 			System.out.println(arr[i]);
 		}
 	}
  public void dequeue()
  {
	  balance=balance-arr[0];
	  int new_arr[]=arr;
	  arr=new int[index-1];
	  for(int i=1,j=0;i<index;i++)
	  {
		  arr[j]=new_arr[i];
	  }
	  index--;
	  
  }
 
  public Boolean isEmpty()
  {
	  if(index==0)
	  {
		  return true;
	  }
	  else
	  {
		  return false;
	  }
  }
  public int size()
  {
	  return index;
  }
}
