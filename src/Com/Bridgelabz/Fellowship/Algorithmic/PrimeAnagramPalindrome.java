package Com.Bridgelabz.Fellowship.Algorithmic;

import java.util.ArrayList;

import Com.bridgelabz.Fellowship.utility.Utility;

public class PrimeAnagramPalindrome 
{
	
		public static void main(String[] args) {
			//int i,j;
			System.out.println("enter a number ");
			int n=Utility.integerInput();
			ArrayList<Integer> al =Utility.isprime(n);
			System.out.println(al);
			System.out.println("prime anagram are ");
			//Utility.anagram(11, 11);
			
			for ( int j = 0; j < al.size(); j++) 
				{
					for (int j2 = j+1; j2 < al.size(); j2++) {
						
						if(Utility.anagram(al.get(j), al.get(j2))==true)
						{
							System.out.println(al.get(j)+ " "+al.get(j2));
							
						}
						
					}
				}System.out.println();
				System.out.println("prime palindrome ");
			for (int j = 0; j < al.size(); j++) {
				int flag=0;
				for (int j2 = j+1; j2 < al.size(); j2++) {
					if(Utility.Primepalindrome(al.get(j))==true)
					{
						flag=1;
						
					}
					
				}if(flag==1)
				{
					
					System.out.print(al.get(j)+" ");	
				}
					
				
			}
			
			
		}

	}




