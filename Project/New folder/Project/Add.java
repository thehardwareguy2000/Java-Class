
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;


class Add extends JFrame{
	Container c;
	JLabel lblname,lblid,lblsalary;
	JButton btnsave,btnback;
	JTextField txtname,txtid,txtsalary;
	
	

	Add(){
		Configuration cfg =new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sfact=cfg.buildSessionFactory();
			Session session=sfact.openSession();
			

	
	
			
				
	c=getContentPane();
	FlowLayout f=new FlowLayout();
	c.setLayout(f);
	lblid = new JLabel("EID:");
	txtid = new JTextField(33);
	lblname = new JLabel("NAME:");
	txtname = new JTextField(32);
	lblsalary = new JLabel("SALARY:");
	txtsalary = new JTextField(30);
	
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
		 		Transaction t=null;
			 t=session.beginTransaction();

		 		try{

		 	int u=0,n=0,s=0;
		 	
			 Employee e=new Employee();

		try{


			int eid=Integer.parseInt(txtid.getText());
			if (eid>=0){
				u=1;
				e.setEid(eid);	session.save(e);
			}
			else{
				JOptionPane.showMessageDialog(c,"enter positive Integer only");
				txtid.setText("");
				txtid.requestFocus();
				}
			 
				 

		}//eid try
		catch(NumberFormatException er){
			JOptionPane.showMessageDialog(c,"abe salle Integer enter kar!!!! ");
			txtid.setText("");
			txtid.requestFocus();
		}




		String name=txtname.getText();
			
		
			  if(! name.matches("[A-z]*")){
				JOptionPane.showMessageDialog(c,"Abe robot ka version hai kaya ");
				txtname.setText("");
				txtname.requestFocus();
				}
			else if (name.length()>=2){
				n=1;
				e.setEname(name);	session.save(e);
			}


			else{
				JOptionPane.showMessageDialog(c,"Enter proper name ");
				txtname.setText("");
				txtname.requestFocus();
			}
			




		try{
			int sal=Integer.parseInt(txtsalary.getText());
			if (sal>=8000){
				s=1;
				e.setSalary(sal);		session.save(e);	 
			}
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
		catch(NumberFormatException er){
			JOptionPane.showMessageDialog(c,"abe salle Integer enter kar!!!! ");
			txtsalary.setText("");
			txtsalary.requestFocus();
		}
		if(u==1 && n==1 && s==1){
			t.commit();
		JOptionPane.showMessageDialog(c,"Your information is SAVED ");	
		}
		else{
			t.rollback();
		}
	}

	catch(Exception err){
	t.rollback();
	JOptionPane.showMessageDialog(c,err);
	}

	finally{
	//session.close();
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
	setTitle("ADDING EMPLOYEE");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
}




	}
	


	


