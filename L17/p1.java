import java.util.*;
import java.util.stream.*;

class Employee implements Comparable<Employee>{
	int id;
	String name;
	double salary;
	String location;

Employee(int id,String name,double salary,String location){
	this.id=id;
	this.name=name;
	this.salary=salary;
	this.location=location;
}

public String toString(){
	return "id="+id+" name="+name+" salary="+salary+" location="+location;
}


public int compareTo(Employee e){
	return (int)(e.salary-salary);
}

}

class p1{
	

	public static void main (String args[]){
	Employee e1=new Employee(10,"amit",7900,"mumbai");
	Employee e2=new Employee(20,"sumit",7500,"mumbai");
	Employee e3=new Employee(30,"rumit",4900,"Thane");
	Employee e4=new Employee(40,"namit",8900,"mumbai");
	Employee e5=new Employee(50,"mit",5900,"Thane");

	ArrayList<Employee> e= new ArrayList<>();
	e.add(e1);	e.add(e2);	e.add(e3);	e.add(e4);	e.add(e5);	

	double sal= e.stream().filter(n->n.location.equals("Thane")).map(w->w.salary).reduce(0.0,(x,y)->(x+y));
	//Stream<Employee> s1=e.stream().sorted().filter(n->n.location.equals("mumbai"));
	//s1.forEach(r -> System.out.println(r));
	System.out.println("salary= "+ sal);


	}
}