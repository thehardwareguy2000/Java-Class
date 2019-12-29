import org.hibernate.*;
import org.hibernate.cfg.*;
class Hbop{
	public static void main(String ... args){
	Configuration cfg =new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sfact=cfg.buildSessionFactory();
	Session session=sfact.openSession();
	try{
	System.out.println("begin");
	//Crud operation here 
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