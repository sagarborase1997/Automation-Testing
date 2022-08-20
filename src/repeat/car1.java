package repeat;

import java.util.Scanner;

class car{
	private
	    int modno;
        String name;
        float price;

     public 
         void accept()
{
	     Scanner obj=new Scanner(System.in);
	     System.out.println(" enter module no,name,price");
	     modno=obj.nextInt();
	     name=obj.next();
	     price=obj.nextFloat();
}
void Display()
{
	System.out.println("roll no="+modno);
	System.out.println("name= "+name);
	System.out.println("marks="+price);
}
}
public class car1 {

	public static void main(String[] args) {
		car c=new car();
		c.accept();
		c.Display();


	}

}
