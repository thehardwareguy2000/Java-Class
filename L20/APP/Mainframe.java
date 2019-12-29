import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MainFrame extends JFrame{
	Container c;
	JButton btnAdd,btnView;

	MainFrame(){
	c=getContentPane();
	c.setLayout(new FlowLayout());
	btnAdd=new JButton("Add");
	btnView=new JButton("View");
	c.add(btnAdd);
	c.add(btnView);

	btnAdd.addActionListner(new ActionListner(){

	public void acionPerformed(ActionEvent ae){
	AddFrame a = new AddFrame();
	dispose();

	}
	});

	btnView.addActionListner(new ActionListner(){

	public void acionPerformed(ActionEvent ae){
	ViewFrame a = new ViewFrame();
	dispose();

	}
	});

	setTitle("S.S.");
	setSize(300,400);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	}

	public static void main(String args[]){
	MainFrame m=new MainFrame();
	}
}