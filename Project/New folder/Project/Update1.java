
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;


class Update1 extends JFrame{
	Container c;
	JLabel lblname,lblid,lblsalary;
	JButton btnsave,btnback;
	JTextField txtname,txtid,txtsalary;

	Update1(int eid){
	c=getContentPane();
	FlowLayout f=new FlowLayout();
	c.setLayout(f);

	lblname = new JLabel("NAME:");
	txtname = new JTextField(30);
	lblsalary = new JLabel("SALARY:");
	txtsalary = new JTextField(30);
	
	btnsave=new JButton("SAVE");
	btnback=new JButton("BACK");

	
	c.add(lblname);
	c.add(txtname);
	c.add(lblsalary);
	c.add(txtsalary);
	c.add(btnsave);
	c.add(btnback);

	btnsave.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
			Configuration cfg =new Configuration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory sfact=cfg.buildSessionFactory();
			Session session=sfact.openSession();
			Transaction t=null;
			 t=session.beginTransaction();
			 int n=0,s=0;

		try{
			
				
				Employee e=(Employee)session.get(Employee.class,eid);

				if(e!=null){
					String name=txtname.getText();
			
		
			 		 if(name.matches("[0-9]*")){
						JOptionPane.showMessageDialog(c,"señor por favor ingrese su nombre no un número");
						txtname.setText("");
						txtname.requestFocus();
						}
					else if (name.length()>=2){
						n=1;
						e.setEname(name);	session.save(e);
						}


					else{
						JOptionPane.showMessageDialog(c,"Entrez le nom propre ");
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

				}//sal try
		catch(NumberFormatException err){
			JOptionPane.showMessageDialog(c,"salary must be in a number  ");
			txtsalary.setText("");
			txtsalary.requestFocus();
		}//sal catch

			}//if null
			else{
			JOptionPane.showMessageDialog(c,"No Employee with such record Exist ");
				}
			
			
		
		if( n==1 && s==1){
			t.commit();
		JOptionPane.showMessageDialog(c,"Your information is SAVED ");	
		}
		else{
			t.rollback();
		}
		}//eid try
		catch(NumberFormatException err){
			JOptionPane.showMessageDialog(c,"abe salle Integer enter kar!!!! ");
			txtid.setText("");
			txtid.requestFocus();
		}


	}//anony
		}
		);




	btnback.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){

	Update a=new Update();
	dispose();

	}//anony
		}
		);
	

	setSize(400,300);
	setLocationRelativeTo(null);
	setTitle("Update Record");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);

	}
}

