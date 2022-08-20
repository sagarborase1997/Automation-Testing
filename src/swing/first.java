package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class first {
	JFrame jf;
	public first() {
		jf=new JFrame("mywindow");
		JButton btn=new JButton("submit");
		jf.add(btn);
		jf.setLayout(new FlowLayout());
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(400,400);
		jf.setVisible(true);
		}
		public static void main(String[] args) 
		{
			first f1=new first();
		}
		//kirti kulkarni tcs 8408925112
		//abhijit bansal gigaspace 9834125267
	}
