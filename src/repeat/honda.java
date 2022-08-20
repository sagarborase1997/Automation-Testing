package repeat;


final 7class bike1{
	public
	  final void run()  //final mtd
	  {
		System.out.println("running");
	  }
}
public class honda extends bike1{   
	void run()
	{
		System.out.println("running safely with 100 kmph");
	}

	public static void main(String[] args) {

			honda h=new honda();
			h.run();
	}

}
