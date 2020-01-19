
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


class Add extends JFrame{
	Container c;
	JLabel lblname,lblid,lblsalary;
	JButton btnsave,btnback;
	JTextField txtname,txtid,txtsalary;

	Add(){
	c=getContentPane();
	FlowLayout f=new FlowLayout();
	c.setLayout(f);
	lblid = new JLabel("ID:");
	txtid = new JTextField(20);
	lblname = new JLabel("NAME:");
	txtname = new JTextField(20);
	lblsalary = new JLabel("SALARY:");
	txtsalary = new JTextField(20);
	
	btnsave=new JButton("SAVE");
	btnback=new JButton("BACK");

	c.add(lblid);
	c.add(txtid);
	c.add(lblname);
	c.add(txtname);
	c.add(lblsalary);
	c.add(txtsalary);
	c.add(btnsave);
	c.add(btnback);



	btnsave.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){

		try{
			int eid=Integer.parseInt(txtid.getText());
			if (eid>=0)
				JOptionPane.showMessageDialog(c,eid);
			else{
				JOptionPane.showMessageDialog(c,"enter positive Integer only");
				txtid.setText("");
				txtid.requestFocus();
				}

		}//eid try
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(c,"abe salle Integer enter kar!!!! ");
			txtid.setText("");
			txtid.requestFocus();
		}




		String name=txtname.getText();
			
		
			  if(name.matches("[0-9]*")){
				JOptionPane.showMessageDialog(c,"Abe robot ka version hai kaya ");
				txtname.setText("");
				txtname.requestFocus();
				}
			else if (name.length()>=2)
				JOptionPane.showMessageDialog(c,name);


			else{
				JOptionPane.showMessageDialog(c,"Enter proper name ");
				txtname.setText("");
				txtname.requestFocus();
			}





		try{
			int sal=Integer.parseInt(txtsalary.getText());
			if (sal>=8000)
				JOptionPane.showMessageDialog(c,sal);
			else if(sal>=0){
				JOptionPane.showMessageDialog(c,"thoda pagar baddha 8000 is minimum");
				txtsalary.setText("");
				txtsalary.requestFocus();
				}
			else{
				JOptionPane.showMessageDialog(c,"salary cant be negative ");
				txtsalary.setText("");
				txtsalary.requestFocus();
			}

		}//eid try
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(c,"abe salle Integer enter kar!!!! ");
			txtsalary.setText("");
			txtsalary.requestFocus();
		}

	}//anony
		}
		);





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

