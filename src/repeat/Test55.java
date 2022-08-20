package repeat;

public class Test55 	{
	static int x = 100;
	int y = 100;
	public void increment()
	{
	x++; y++;
	}
	public static void main( String[] args )
	{
	Test55 t1 = new Test55();
	Test55 t2 = new Test55();
	t1.increment();
	t2.increment();
	System.out.println(t2.y);
	System.out.println(Test55.x); //accessed without any instance of class.
	}
	
	
}
