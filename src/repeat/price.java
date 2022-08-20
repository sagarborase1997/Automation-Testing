package repeat;

import java.util.Scanner;

public class price {

	public static void main(String[] args) {
		double a,cost;
		Scanner s=new Scanner(System.in);
		System.out.println("enter quantity");
		a=s.nextDouble();
		if(a>1000)
		{
			cost=(a*100)-(a*100*0.1);
			System.out.println("price is "+cost);
		}
		else
		{
			cost=a*100;
			System.out.println("price is "+cost);
		}

	}

}
