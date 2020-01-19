
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


class Update extends JFrame{
	Container c;
	JLabel lblid;
	JButton btnsave,btnback;
	JTextField txtid;

	Update(){

	           
	c=getContentPane();
	FlowLayout f=new FlowLayout();
	c.setLayout(f);
	lblid = new JLabel("ID:");
	txtid = new JTextField(10);
	
	btnsave=new JButton("Update");
	btnback=new JButton("BACK");

	c.add(lblid);
	c.add(txtid);
	c.add(btnsave);
	c.add(btnback);

	
	btnsave.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
		
		try{
			int eid=Integer.parseInt(txtid.getText());
			if (eid>=0){
				Update1 u=new Update1(eid);
				dispose();
				
			}
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
	setTitle("Update:-EID");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);

		
		

	}
}

