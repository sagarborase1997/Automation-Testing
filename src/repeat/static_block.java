package repeat;

public class static_block 	{
	int eid;
	String name;
	static String company_name;
	static {
	company_name ="Spark"; //static block invoked before main() method
	}
	public void show()
	{
	System.out.println(eid+" "+name+" "+company_name);
	}
	public static void main( String[] args )
	{
		static_block se1 = new static_block();
	se1.eid = 104;
	se1.name = "Abhijit";
	se1.show();
	}
}
