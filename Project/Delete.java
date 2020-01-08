
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
	Transaction t=null;
	try{
	 t=session.beginTransaction();
	String queryString = "from Employee where eid = :eid";
            Query query = session.createQuery(queryString);
            
	c=getContentPane();
	FlowLayout f=new FlowLayout();
	c.setLayout(f);
	lblid = new JLabel("ID:");
	txtid = new JTextField(10);
	
	btnsave=new JButton("SAVE");
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
				//crud operation here
				query.setInteger("eid", 2);
            Employee employee = (Employee) query.uniqueResult();
            session.delete(employee);
				JOptionPane.showMessageDialog(c,"employee with id "+eid+" is deleted");
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
	setTitle("Even Odd Finder");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);

		}//TRY

		catch (HibernateException err) {
 
           // t.rollback();
        }
        finally {
 
            session.close();
 
        }

	}
}

