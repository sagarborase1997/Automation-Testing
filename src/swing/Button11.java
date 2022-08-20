package swing;

import java.awt.*;
public class Button11 extends Frame 
{

	Button11()
	{
		Button bt =new Button("hello");
		add(bt);
		setTitle("spark");
		
		setSize(400,500);
		setLayout(new FlowLayout());
		setVisible(true);
		
	}
	public static void main(String[] args) {

		Button11 b=new Button11();
	}

}
