package repeat;

import java.util.Scanner;

public class while_return {

	public static void main(String[] args) {
		int i=1,n,fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n ");
		n=s.nextInt();
        while( i <= n ){  
            fact = fact * i;   
            i++; 
		}
        System.out.println("\nFactorial of " + n + " is: " + fact);  

	}

}
