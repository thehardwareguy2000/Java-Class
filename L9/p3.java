

import java.io.Console;

class p3{
	public static void main(String []args){
	Console c= System.console();
	String org = c.readLine("Enter a string ");
	String data[]=org.split("");
	String nstr="";
	for(int i=data.length-1 ;i>=0;i--){
	StringBuffer sb=new StringBuffer(org);
	sb.reverse();
	String rev = sb.toString();
		nstr=nstr+data[i]+"" ;
	}

	System.out.println(nstr);
	}
}