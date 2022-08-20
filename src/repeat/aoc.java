package repeat;

import java.util.Scanner;

public class aoc {

	public static void main(String[] args) {
		double aoc,r;
		Scanner s=new Scanner(System.in);
		System.out.println("enter radius");
		r=s.nextInt();
		aoc=r*r*3.14;
		System.out.println("aoc="+aoc);
	}

}
