//Prog to check palindrome


import java.io.Console;

class p1{
	public static void main(String []args){
	Console c= System.console();
	String org = c.readLine("Enter a string ");

	StringBuffer sb=new StringBuffer(org);
	sb.reverse();
	String rev = sb.toString();//to cancle out the extra space in buffer 

	if (org.equals(rev))
		System.out.println("its a palindrome");
	else
		System.out.println("no");

	}
}