package repeat;

class Cricketer
{
String name;
String team;
int age;
Cricketer () //default constructor.
{
name ="";
team ="";
age = 0;
}
Cricketer(String n, String t, int a) //constructor overloaded
{
name = n;
team = t;
age = a;
}
Cricketer(String name,int age)
{
	this.name=name;
	this.age=age;
}
Cricketer (Cricketer ckt) //constructor similar to copy constructor of c++
{
name = ckt.name;
team = ckt.team;
age = ckt.age;
}
public String toString()
{
return "this is " + name + " of "+team;
}
}

public class constructor1{
public static void main (String[] args)
{
Cricketer c1 = new Cricketer();
Cricketer c2 = new Cricketer("sachin", "India", 32);
Cricketer c3 = new Cricketer(c2 );
Cricketer c4 = new Cricketer("dhoni",26);
System.out.println(c2);
System.out.println(c3);
System.out.println(c4);
c1.name = "Virat";
c1.team= "India";
c1.age = 32;
System.out.println(c1);
}
}
