//prog to delete a file 


import java.io.*;
class p3{
	public static void main(String args[]) throws IOException{
	Console c=System.console();
	String File_name=c.readLine("File name please ");
	File f=new File(File_name);


	if (!f.exists()){
		System.out.println(File_name+" not exists ");

	}
	else{
		f.delete();
		System.out.println(File_name+" Deleted ");	
	}
	}
}