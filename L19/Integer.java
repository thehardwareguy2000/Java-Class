import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Integer extends JFrame{
	Container c;
	JLable lblNumber;
	JTextField txtNumber;
	JButton btnNext;

	Integer(){
	c=getContentPane();
	c.setLayout(new FlowLayout());
	lblNumber=new JLable("Enter number of games to play	");
	txtNumber=new JTextField(20);
	
	btnNext=new JButton("Lets Play");
	

	btnNext.addActionListner(new ActionListner(){

	public void acionPerformed(ActionEvent ae){
		int ng=Integer.parseInt(txtNumber.getText());
	G12 a = new G12();
	dispose();

	}
	});
	c.add(lblNumber);
	c.add(txtNumber);
	c.add(btnNext);
	
	setTitle("Integer Entry.");
	setSize(300,400);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	}
	public static void main(String args[]){
	Integer m=new Integer();
	}

	
}