package Com.Bridgelabz.Fellowship.DataStructure;

import java.io.BufferedReader;
import java.io.FileReader;

import Com.bridgelabz.Fellowship.utility.Utility;

public class Hashingfunction
{
  	OrderedLinkedList[] order=new OrderedLinkedList[11];
  	NodeUtility nu=new NodeUtility();
	int[] retArray = Utility.readFile();
	public static int[] readFile() throws Exception
	{
		int str[]=new int[10];
		FileReader fr=new FileReader("/home/admin1/Akshada/Fellowship/src/Com/Bridgelabz/Fellowship/DataStructure/Nodetext");
		BufferedReader br=new BufferedReader(fr);
		String data;
		String lines[]=br.readLine().split(",");
       /*  for(String string:lines)
         {
        	 System.out.println(string+" ");
         }
         System.out.println();*/
		return lines;
		
	}

		for(int i=0; i<retArray.length; i++)
		{
			int rem = retArray[i]%11;
			if(order[rem]== null)
			{
				order[rem] = new OrderedLinkedList();
				order[rem].addItem(retArray[i]);
			}
			else
			{
				order[rem].addItem(retArray[i]);
            }
		}
		for(int i=0;i<11;i++)
		{
			System.out.println(i);
			if(order[i] !=null)
			{
				order[i].display();
			}
		}
	}

    public static void main(String[] args)
    {
      	aa hs=new aa();
    }
}