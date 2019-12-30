package Com.Bridgelabz.Fellowship.DataStructure;

import java.math.BigInteger;

public class BinarySearch 
{
	public static BigInteger countBinarySearchTree(double d) {

		
		double a = 2 * d;
		double b = d + 1;
		BigInteger x = calculateNode(a);
		BigInteger y = calculateNode(b);
		BigInteger c = calculateNode(d);
		/*
		 * System.out.println("a"+a); System.out.println("b"+b);
		 * System.out.println("c"+c);
		 */
		return x.divide(y.multiply(c));
		// return x / (y * c);

	}

	public static BigInteger calculateNode(double a) {
		BigInteger factorial = BigInteger.ONE;

		for (double i = a; i > 0; i--) {
			factorial = factorial.multiply(BigInteger.valueOf((long) i));
		}

		return factorial;

	}

}
 

