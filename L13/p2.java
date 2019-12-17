import java.io.*;

class p2{
	public static void main(String ... args){
	Console c = System.console();
	while(true){
	try{
	int a = Integer.parseInt(c.readLine("enter an Integer "));
	System.out.println("maaf kar na gusse me thoda idhar uddhar nikkal jata hu");
	System.exit(1);
	}
	catch(NumberFormatException n){
	System.out.println("abe saale integer enter kar ");
	}

	}
}
} 