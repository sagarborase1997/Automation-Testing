package repeat;

public class callbyvalue {
	public void callByValue(int x)
	{
	x=100;
	}
	public static void main(String[] args) {
		int x=50;
		callbyvalue t = new callbyvalue();
		t.callByValue(x); //function call
		System.out.println(x);
	}

}
