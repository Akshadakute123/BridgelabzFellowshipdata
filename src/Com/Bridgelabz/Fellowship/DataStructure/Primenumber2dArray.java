package Com.Bridgelabz.Fellowship.DataStructure;

import Com.bridgelabz.Fellowship.utility.Utility;

public class Primenumber2dArray {
	public static void main(String[] args) {
		int arr[][] = new int[10][100];
		
		int res[] = Utility.primenumber();
		for(int j=0,k=0;j<res.length;j++)
		{
			if (res[j]>1) {
				arr[res[j] / 100][k] = res[j];
				if (k == arr[j / 100].length - 2)
					k = 0;
				else
					k++;
			}
		}
//		for(int i=0;i<arr[0].length;i++)
//		{
//			
//			System.out.print(arr[0][i]+"  ");
//			
//		}
		for (int i = 0; i < arr.length; i++) 
		{      //if(i>0)
			for (int j = 0; j < arr[i].length; j++)
			{
				  if(arr[i][j]>0)
				System.out.print(arr[i][j] + " ");
				// System.out.println();
			}
			System.out.println();
		}
	/*	for (int i : res) {
			if (i > 0)
				System.out.println(i);
		}*/
	}

}
