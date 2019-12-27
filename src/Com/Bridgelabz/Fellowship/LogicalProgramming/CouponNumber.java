package Com.Bridgelabz.Fellowship.LogicalProgramming;

public class CouponNumber 
{
public static void main(String[] args) 
{
	
			// making a stack of values from which coupon is to be made
			char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
			int max=100000000;
			int random=(int) (Math.random()*max);	
			String sb="";
			
			while (random>0)
			{
				sb=sb+(chars[random % chars.length]);
				random /= chars.length;
			}

			String couponCode=sb;
			System.out.println("Coupon Code: "+couponCode);	
		}
	

}
