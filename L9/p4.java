
import java.util.Arrays;
import java.io.Console;

class p4{
	public static void main(String []args){
	Console c= System.console();
	String org = c.readLine("Enter a string ");
	String data[]=org.split("");
	String nstr="";
	for(int i=data.length-1 ;i>=0;i--){
	char ch[]=data[i].toCharArray();
	Arrays.sort(ch);
	data[i] = new String(ch);

	nstr=data[i]+nstr+"";
	}

	System.out.println(nstr);
	}
}