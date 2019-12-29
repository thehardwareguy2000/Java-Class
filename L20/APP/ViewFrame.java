import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ViewFrame extends JFrame{
	Container c;
	
	JTextArea ta;
	JButton btnBack;

	ViewFrame(){
	c=getContentPane();
	c.setLayout(new FlowLayout());
	ta=new JTextArea(5,30);
	btnBack=new JButton("Back");
	

	btnBack.addActionListner(new ActionListner(){

	public void acionPerformed(ActionEvent ae){
	MainFrame a = new MainFrame();
	dispose();

	}
	});
	c.add(ta);
	
	c.add(btnBack);
	
	setTitle("Add.S.");
	setSize(300,400);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	}

	
}