import java.io.*;

class p1{
	public static void main(String ... args){
	Console c = System.console();
	
	try{
	int a = Integer.parseInt(c.readLine("enter an Integer  	"));
	System.out.println("yes");
	
	}
	catch(NumberFormatException n){
	System.out.println("no");
	}

	}
}
