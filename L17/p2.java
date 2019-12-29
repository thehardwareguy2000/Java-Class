// program to create a file


import java.io.*;
class p2{
	public static void main(String args[]) throws IOException{
	Console c=System.console();
	String File_name=c.readLine("File name please ");
	File f=new File(File_name);


	if (f.exists()){
		System.out.println(File_name+" already exists ");

	}
	else{
		f.createNewFile();
		System.out.println(File_name+" create ");	
	}
	}
}