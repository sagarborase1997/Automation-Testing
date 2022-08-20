package repeat;

public class mtd_loading {
	void sum (int a, int b)
{
System.out.println("sum is"+(a+b)) ;
}
void sum (float a, float b)
{
System.out.println("sum is"+(a+b));
}

	public static void main(String[] args) {
		mtd_loading m1=new mtd_loading();
		m1.sum(7, 3);
		m1.sum(1.2f, 1.5f);
	}

}
