package repeat;

import java.util.Scanner;

public class do_while {

	public static void main(String[] args) {
		int i=1,n,fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n ");
		n=s.nextInt();
       do {  
            fact = fact * i;   
            i++; 
		}
        while( i <= n );
        System.out.println("\nFactorial of " + n + " is: " + fact);
	}

}
