//program to remove all the duplicate names form created list



import java.util.*;
import java.io.*;
class p2{
	public static void main(String... args){
	Console c=System.console();
	ArrayList<String> name = new ArrayList<>();
	String reply = c.readLine("Y/N");
	while(reply.equals("y")){
	String n = c.readLine("name please ");
	name.add(n);
	reply=c.readLine("Y/N");
	}
	ArrayList<String> names = new ArrayList<>();

	for(String p : name){


		if(! names.contains(p))
			names.add(p);
	}
	System.out.println("original:- "+ name);
	System.out.println("Changed:- "+ names);

}
}