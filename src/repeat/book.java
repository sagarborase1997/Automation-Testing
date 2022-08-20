package repeat;

import java.util.Scanner;

class book1{
	private
    int bookid;
    String name;
    float price;

 public 
     void access()
{
     Scanner obj=new Scanner(System.in);
     System.out.println(" enter book id,name,price");
     bookid=obj.nextInt();
     name=obj.next();
     price=obj.nextFloat();
}
void Display()
{
System.out.println("book id="+bookid);
System.out.println("name= "+name);
System.out.println("marks="+price);
}

}
public class book {

	public static void main(String[] args) {
         book1[] b=new book1[3];
     	int i;
    	for(i=0;i<=2;i++) 
    	{
    		b[i]=new book1();

    	}

    	for(i=0;i<=2;i++) 
    	{
    		b[i].access();

    	}
    	for(i=0;i<=2;i++) 
    	{
    		b[i].Display();

    	}


	}

}
