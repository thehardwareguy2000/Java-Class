

import java.io.Console;

class p2{
	public static void main(String []args){
	Console c= System.console();
	String org = c.readLine("Enter a string ");
	String data[]=org.split("");
	String nstr="";
	for(int i=data.length-1 ;i>=0;i--){
		nstr=nstr+data[i]+"" ;
	}

	System.out.println(nstr);
	}
}