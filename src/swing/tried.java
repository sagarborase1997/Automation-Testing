package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class tried 
{
	tried()
	{
		JFrame js=new JFrame();
		
		JLabel j21=new JLabel("sagar");
		js.add(j21);
		JButton j11=new JButton("back");
		js.add(j11);
		JButton j12=new JButton("next");
		j12.setBounds(40, 40, 40, 40);
		js.add(j12);
		
		
		
		
		js.setLayout(new FlowLayout());
		js.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		js.setSize(400,400);
		js.setVisible(true);
	}
		public static void main(String args[])
		{
			tried t1 =new tried();
			
		}

}
