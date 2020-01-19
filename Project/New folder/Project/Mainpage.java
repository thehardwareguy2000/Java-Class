
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


class Mainpage extends JFrame{
	Container c;
	
	JButton btnAdd,btnView,btnUpdate,btnDelete;

	Mainpage(){
	c=getContentPane();
	FlowLayout f=new FlowLayout();
	c.setLayout(f);
	
	btnAdd=new JButton("ADD");
	btnView=new JButton("View");
	btnUpdate=new JButton("Update");
	btnDelete=new JButton("Delete");
	c.add(btnAdd);
	c.add(btnView);
	c.add(btnUpdate);
	c.add(btnDelete);
	btnAdd.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){

	Add a=new Add();
	dispose();

	}//anony
		}
		);


	btnView.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){

	View a=new View();
	dispose();

	}//anony
		}
		);



	btnUpdate.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){

	Update a=new Update();
	dispose();

	}//anony
		}
		);



	btnDelete.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){

	Delete a=new Delete();
	dispose();

	}//anony
		}
		);
	

	setSize(400,300);
	setLocationRelativeTo(null);
	setTitle("EMPLOYEE RECORD ");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);

	}



	public static void main(String args[]){
		Mainpage e= new Mainpage();	
	}
}