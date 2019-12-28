package Com.Bridgelabz.Fellowship.DataStructure;

import Com.bridgelabz.Fellowship.utility.Utility;

public class PrimeAnagram
{


	public static void main(String[] args) {
		int i,j;
		int arr4[][]=new int[2][900];
		System.out.println("Enter the range to print the prime numbers: ");
	   int range=Utility.integerInput();
		int[] arr=Utility.primeNumberArray(range);
	/*	for(i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
				System.out.print(arr[i]+" ");
		}*/
		System.out.println();
		int arr2[]=Utility.anagramArray(arr);
		/*for(i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}*/
		System.out.println();
		int arr3[]=Utility.compareTo(arr, arr2);
		
		for(i=0;i<arr2.length;i++)
		{
			arr4[0][i]=arr2[i];
		}
		for(j=0;j<arr3.length;j++)
		{
			arr4[1][j]=arr3[j];
		}
		
		for(i=0;i<arr4.length;i++)
		{
			for (int k = 0; k < arr4[i].length; k++) {
				if(arr4[i][k]!=0)
				{
				System.out.print(arr4[i][k]+"\t");
				}
				
			}
			System.out.println();
		}
		
	}

}

