
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;


class Delete extends JFrame{
	Container c;
	JLabel lblid;
	JButton btnsave,btnback;
	JTextField txtid;

	Delete(){

	Configuration cfg =new Configuration();
	cfg.configure(	);
	SessionFactory sfact=cfg.buildSessionFactory();
	Session session=sfact.openSession();
	

	 
	
            
	c=getContentPane();
	FlowLayout f=new FlowLayout();
	c.setLayout(f);
	lblid = new JLabel("ID:");
	txtid = new JTextField(10);
	
	btnsave=new JButton("DELETE");
	btnback=new JButton("BACK");

	c.add(lblid);
	c.add(txtid);
	c.add(btnsave);
	c.add(btnback);

	
	btnsave.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
		Transaction t=null;
			t=session.beginTransaction();
		try{
			int eid=Integer.parseInt(txtid.getText());
			if (eid>=0){
				//crud operation here
				Employee e=(Employee)session.get(Employee.class,eid);
				if(e !=null){
            session.delete(e);
            
             t.commit();
           
				JOptionPane.showMessageDialog(c,"employee with id "+eid+" is deleted");
			}
			else{
				JOptionPane.showMessageDialog(c,"EMPLOYEE WITH THAT ID NOT PRESENT");
				txtid.setText("");
				txtid.requestFocus();
			}
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
		catch (HibernateException err) {
 
            t.rollback();
        }
        finally {
 
           // session.close();//this creates an except after running for 2 times 
 
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
	setTitle("Employee Deletion");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);

		
		

	}
}

