package swing;

import java.awt.Frame;
import java.awt.Label;

public class testawt {
	testawt()
	{ 
		Frame f=new Frame();
		Label lb=new Label("welcome to  java program");
		f.add(lb);
		f.setSize(300, 300);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
	
	testawt t=new testawt();
	}

}
