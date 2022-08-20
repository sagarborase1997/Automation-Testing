package swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class second extends JFrame
{
	public second()
	{
		setTitle("my window");
		JLabel lb=new JLabel("welcom to my window ");
		add(lb);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);
	}

	public static void main(String[] args) {

		new second();
	}

}
