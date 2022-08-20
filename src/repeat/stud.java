package repeat;

import java.util.Scanner;

class student{
	private
		int rollno;
	String name;
	float marks;
	public 
	void accept()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println(" enter roll no,name,marks");
		rollno=obj.nextInt();
		name=obj.next();
		marks=(float) obj.nextDouble();
	}
	void Display()
	{
		System.out.println("roll no="+rollno);
		System.out.println("name= "+name);
		System.out.println("marks="+marks);
	}
	
}
public class stud {

	public static void main(String[] args) {
		
		student s=new student();
		s.accept();
		s.Display();
		}

}
