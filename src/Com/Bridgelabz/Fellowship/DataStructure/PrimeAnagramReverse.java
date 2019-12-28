package Com.Bridgelabz.Fellowship.DataStructure;

import Com.bridgelabz.Fellowship.utility.Utility;

public class PrimeAnagramReverse {
	public static void main(String[] args) {
		StackUsingLinkedList stl = new StackUsingLinkedList();

		int arr[] = Utility.primeNumberArray(1000);
		int arr2[] = Utility.anagramArray(arr);
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] != 0)
				stl.push(arr2[i]);

		}

		stl.display();

	}

}
