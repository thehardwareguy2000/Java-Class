
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


class View extends JFrame{
	Container c;
	
	JButton btnback;
	JTextArea ta;

	View(){
	


		
	c=getContentPane();
	FlowLayout f=new FlowLayout();
	c.setLayout(f);
	ta=new JTextArea(5,40);
	btnback=new JButton("BACK");

	//ENTER DB CODE HERE



	
	c.add(ta);
	c.add(btnback);


	btnback.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){

	Mainpage a=new Mainpage();
	dispose();

	}//anony
		}
		);

	setSize(400,300);
	setLocationRelativeTo(null);
	setTitle("Even Odd Finder");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);

	}
}

