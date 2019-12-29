package p2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


class E1 extends JFrame{
	Container c;
	JLabel lblNumber;
	JButton btnFind;
	JTextField txtNumber;

	E1(){
	c=getContentPane();
	FlowLayout f=new FlowLayout();
	c.setLayout(f);
	lblNumber = new JLabel("enter no:");
	txtNumber = new JTextField(10);
	btnFind=new JButton("Find");
	c.add(lblNumber);
	c.add(txtNumber);
	c.add(btnFind);
	btnFind.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
	try{
		int num=Integer.parseInt(txtNumber.getText());
		String res="";
		if(num%2==0) res="even";
		else    	 res="odd";

	JOptionPane.showMessageDialog(c,res);
		}//try end

		

	catch(NumberFormatException e){

		JOptionPane.showMessageDialog(c,"enter integer only");
		txtNumber.setText("");
		txtNumber.requestFocus();
		}//catch
	}
}//anony
	);
	

	setSize(400,300);
	setLocationRelativeTo(null);
	setTitle("Even Odd Finder");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);

	}
}


class E1Test{
	public static void main(String args[]){
		E1 e= new E1();	
	}
}