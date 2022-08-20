package repeat;

import java.util.Scanner;

public class swap_without {

	public static void main(String[] args) {
		double a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a ,b");
		a=s.nextDouble();
		b=s.nextDouble();
		System.out.println("before swap a= "+a+"b= "+b );
		a = a + b;   
        b = a - b;   
        a = a - b;   
        System.out.println("after swap a="+a+"b= "+b);

	}

}
