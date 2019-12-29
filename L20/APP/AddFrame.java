import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class AddFrame extends JFrame{
	Container c;
	JLable lblrRno,lblName;
	JTextField txtRno,txtName;
	JButton btnSave,btnBack;

	AddFrame(){
	c=getContentPane();
	c.setLayout(new FlowLayout());
	lblrRno=new JLable("rno");
	txtRno=new JTextField(20);
	lblName=new JLable("Name");
	txtName=new JTextField(20);
	btnSave=new JButton("Save");
	btnBack=new JButton("Back");
	

	btnBack.addActionListner(new ActionListner(){

	public void acionPerformed(ActionEvent ae){
	MainFrame a = new MainFrame();
	dispose();

	}
	});
	c.add(lblrRno);
	c.add(txtRno);
	c.add(lblName);
	c.add(txtName);
	c.add(btnSave);
	c.add(btnBack);
	
	setTitle("Add.S.");
	setSize(300,400);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	}

	
}