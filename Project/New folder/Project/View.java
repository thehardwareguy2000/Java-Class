
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;


class View extends JFrame{
	Container c;
	
	JButton btnback;
	JTextArea ta;

	View(){
	
		Configuration cfg =new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sfact=cfg.buildSessionFactory();
	Session session=sfact.openSession();

		
	c=getContentPane();
	FlowLayout f=new FlowLayout();
	c.setLayout(f);
	ta=new JTextArea(5,40);
	btnback=new JButton("BACK");
	ta.setText(" 	EID 	NAME	SALARY \n" );

	//ENTER DB CODE HERE
	java.util.List<Employee> emp = new ArrayList<>();
	emp=session.createQuery("from Employee ").list();
	for(Employee e:emp){
		ta.append("	"+e.getEid()+" 	"+e.getEname()+"	 "+e.getSalary()+"\n");
	}
		



	
	c.add(ta);
	c.add(btnback);


	btnback.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){

	Mainpage a=new Mainpage();
	dispose();

	}//anony
		}
		);

	setSize(400,300);
	setLocationRelativeTo(null);
	setTitle("Record View");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);

	}
}

