package Com.Bridgelabz.Fellowship.DataStructure;

import Com.bridgelabz.Fellowship.utility.Utility;

public class Mainbinary 
{
	
		public static void main(String[] args)
		{
			//BST bs = new BST();
			Node root = null;

			try {
				System.out.println("Enter a number of testcases ");
				int cases =Utility.integerInput();
				System.out.println("Enter a number of nodes ");

				while (cases != 0)
				{
					cases--;
					System.out.println(BinarySearch.countBinarySearchTree(Utility.doubleInput()));
				}
			} catch (Exception e) {
				System.out.println(" " + e);
			}
		

		}

	}

