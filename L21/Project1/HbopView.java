import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;
class HbopView{
	public static void main(String ... args){
	Configuration cfg =new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sfact=cfg.buildSessionFactory();
	Session session=sfact.openSession();
	try{
	System.out.println("begin");
	//Crud operation here
	List<Student> stu = new ArrayList<>();
	stu=session.createQuery("from Student ").list();
	for(Student s:stu)
		System.out.println(s.getRno()+" "+s.getName());


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