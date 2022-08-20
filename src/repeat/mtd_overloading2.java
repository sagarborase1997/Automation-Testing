package repeat;

public class mtd_overloading2 {
	void find(long l, long b)
	{
	System.out.println("Area is"+(l*b)) ;
	}
	void find(long l, long b,long h)
	{
	System.out.println("Area is"+(l*b*h));
	}

	public static void main(String[] args) {
		mtd_overloading2 m2=new mtd_overloading2();
		m2.find(8, 5);
		m2.find(4, 5, 6);
	}

}
