package swing;
import java.awt.*;
import javax.swing.*;
import javax.swing.*;
public class Login {
	Login()
	{
		JFrame jf=new JFrame();
		JLabel j1=new JLabel("Username");
		jf.setBounds(20, 20, 80, 30);
		jf.add(j1);
			
				
		JTextField t1=new JTextField(20);
		t1.setBounds(50, 20, 100, 30);
		jf.add(t1);



		
		JLabel j2=new JLabel("password");
		j2.setBounds(20, 40, 80, 30);
        jf.add(j2);
        
        
		
		JTextField t2=new JTextField(20);
		t2.setBounds(20, 40, 100, 0);
		jf.add(t2);


		
		JButton bt=new JButton("Login");
		t2.setBounds(100, 100, 100, 30);
		jf.add(bt);

		
		
		jf.setLayout(new FlowLayout());
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(400, 400);
		jf.setVisible(true);

	}
	public static void main(String[] args) {

		Login jj=new Login();
	}


}
