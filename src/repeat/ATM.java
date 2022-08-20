package repeat;

import java.util.Scanner;


public class ATM {

	public static void main(String[] args) {
		int ch,mbal=100000,a,tbal,b,rbal;
		Scanner obj=new Scanner(System.in);
		System.out.println("1.deposit money \n2.withdraw money  \n3.check balance");
		System.out.println("enter choice");
		ch=obj.nextInt();
		switch(ch)
		{
		case 1:
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter deposit amount");
			a=sc.nextInt();
			tbal=mbal+a;
			System.out.println("Total Balance is="+tbal);
		}break;
		case 2:{
			Scanner sb=new Scanner(System.in);
			System.out.println("enter withdraw amount");
			b=sb.nextInt();
			rbal=mbal-b;
			System.out.println("Remaining balance="+rbal);
		}break;
		case 3:
		{
			System.out.println("main balance ="+mbal);
		}break;
		default:
			System.out.println("invalid choice");
			
		}		
			

	}

}
