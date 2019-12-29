import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


enum Selection{
	ROCK,PAPER,SCISSOR;

}

class G1 extends JFrame{
	Container c;
	JLabel lblNumber;
	JButton btnFind;
	JTextField txtNumber;

	G1(){

	c=getContentPane();
	FlowLayout f=new FlowLayout();
	c.setLayout(f);
	lblNumber = new JLabel("0-ROCK 1-PAPER 2-SCISSOR");
	txtNumber = new JTextField(10);
	btnFind=new JButton("PLAY");
	c.add(lblNumber);
	c.add(txtNumber);
	c.add(btnFind);
	btnFind.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
	try{
		Selection comp,user;
		int nt=0,nu=0,nc=0;
		int r=(int)(Math.random()*3);
		if(r==0) comp=Selection.ROCK;
		else if(r==1) comp=Selection.PAPER;
		else  comp=Selection.SCISSOR;
		int op=Integer.parseInt(txtNumber.getText());
		String res="";
		if(op==0)  user=Selection.ROCK;
		else if(op==1)  user=Selection.PAPER;
		else if(op==2) user=Selection.SCISSOR;
	JOptionPane.showMessageDialog(c,user+" ohh its a tie  "+comp);
	
	/*if (user==Selection.ROCK && comp==Selection.ROCK){
		JOptionPane.showMessageDialog(c,user+" ohh its a tie  "+comp);
		nt++;}
else if(user==Selection.PAPER && comp==Selection.PAPER){
		JOptionPane.showMessageDialog(c,user+" ohh its a tie  "+comp);
		nt++;}
else if(user==Selection.SCISSOR && comp==Selection.SCISSOR){
		JOptionPane.showMessageDialog(c,user+" ohh its a tie  "+comp);
		nt++;}
else if(user==Selection.PAPER && comp==Selection.ROCK){
		JOptionPane.showMessageDialog(c,user+" user wins "+comp);
		nu++;}
else if(user==Selection.ROCK && comp==Selection.SCISSOR){
		JOptionPane.showMessageDialog(c,user+" user wins "+comp);		
		nu++;}
else if(user==Selection.SCISSOR && comp==Selection.PAPER){
		JOptionPane.showMessageDialog(c,user+" user wins "+comp);
		nu++;}
else if(user==Selection.PAPER && comp==Selection.ROCK){
		JOptionPane.showMessageDialog(c,user+" comp wins "+comp);
		nc++;}
else if(user==Selection.SCISSOR && comp==Selection.PAPER){
		JOptionPane.showMessageDialog(c,user+" comp wins "+comp);
		nc++;}
else if(user==Selection.ROCK && comp==Selection.SCISSOR){
	JOptionPane.showMessageDialog(c,user+" comp wins "+comp);
		nc++;}

*/

	
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



class Game{
	public static void main(String args[]){
	G1 e= new G1();
	}
}