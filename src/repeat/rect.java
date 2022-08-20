package repeat;

import java.util.Scanner;

class rectangle{
	private 
	float l,b,area;
	public
	 void accept()
	{
		     Scanner obj=new Scanner(System.in);
		     System.out.println(" enter length and breadth");
		     l=obj.nextInt();
		     b=obj.nextFloat();
	}
	void Display()
	{
		area=l*b;
		System.out.println("area"+area);
	}

}
public class rect {

	public static void main(String[] args) {
	rectangle[] r=new rectangle[3];
	int i;
	for(i=0;i<=2;i++) 
	{
		r[i]=new rectangle();

	}

	for(i=0;i<=2;i++) 
	{
		r[i].accept();

	}
	for(i=0;i<=2;i++) 
	{
		r[i].Display();

	}


	/*int i,n;
    Scanner obj1=new Scanner(System.in);
	System.out.println("enter total records");
	n=obj1.nextInt();
	
	for(i=1;i<=n;i++) 
	{
		r.accept();
	    r.Display();

	}*/
	}

}
