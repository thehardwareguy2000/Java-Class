//menu driven program for school management


import java.util.*;
import java.io.*;

class Student implements Comparable<Student>{
	int rno;
	String name;
	Student(int rno,String name){
		this.rno=rno;
		this.name=name;
	}

public String toString(){
	return rno+""+name;

}

public boolean equals(Object o){
	Student s=(Student)o;
	return rno == s.rno;
}
public int hashCode(){
	return rno;
}
public int compareTo(Student s){
	return rno - s.rno;	
} 

}





class p1{
	public static void main(String Args[]){
		Console c=System.console();
		TreeSet<Student>s=new TreeSet<>();

		boolean i = true;
		while(i){
			int op=Integer.parseInt(c.readLine("1.add 2.view 3.remove 4.exit"));
			switch(op){
			case 1:int rno=Integer.parseInt(c.readLine("enter rno"));
					String name= c.readLine("enter name");
					Student s1 =new Student(rno,name);
					boolean res=s.add(s1);
					if(res)
						System.out.println("reord added");
					else
						System.out.println("reord not added");
					break;

			case 2:for(Student s2:s)
						System.out.println(s2);
						break;
			case 3: 
					int r=Integer.parseInt(c.readLine("enter rno to delete"));			
					Student p= new Student(r,"");
					boolean rs= s.remove(p);
					if(rs)
							System.out.println("delete sucess");					
					else
							System.out.println("delete failed");	

					break;

			case 4: i=false;
					break;

			default: System.out.println("invalid input");
		}




		}



	}
}