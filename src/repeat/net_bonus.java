package repeat;

import java.util.Scanner;

public class net_bonus {
	public static void main(String[] args) {
		double salary,service,netamt;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter salary");
		salary=sc.nextFloat();
		System.out.println("enter service in year");
		service=sc.nextFloat();
		netamt=(0.05*salary)+salary;
		if(service>5)
		{
			System.out.println("Net salary is= "+netamt);
		}
		else
		{
			System.out.println("doesn't allow bonus");
		}
	}

}
