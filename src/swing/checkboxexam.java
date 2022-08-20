package swing;

import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class checkboxexam extends JFrame{
	
	public checkboxexam()
	{
		JCheckBox jcb =new JCheckBox("yes");
		add(jcb);
		
		jcb=new JCheckBox("no");
		add(jcb);

		jcb=new JCheckBox("maybe");
		add(jcb);
		
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);


	}
	public static void main(String[] args) {

		new checkboxexam();
	}

}
