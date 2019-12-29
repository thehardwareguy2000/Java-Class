import org.hibernate.*;
import org.hibernate.cfg.*;
import java.io.*;

class HbopAdd{
	public static void main(String ... args){
	Console c=System.console();
	Configuration cfg =new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sfact=cfg.buildSessionFactory();
	Session session=sfact.openSession();
	Transaction t=null;
	try{
	System.out.println("begin");
	 t=session.beginTransaction();
	 Student s=new Student();
	 int rno=Integer.parseInt(c.readLine("enter rno "));
	 String name= c.readLine("Enter name ");
	 s.setRno(rno); s.setName(name);
	 session.save(s);   t.commit();
	System.out.println("record inserted  "); 
	System.out.println("end");
	}
	catch(Exception e){
	System.out.println(e);
	}
	finally{
	session.close();
	}

	}
}