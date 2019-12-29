// prg to write into a file


import java.io.*;
class p4{
	public static void main(String args[]) throws IOException{
	Console c=System.console();
	String File_name=c.readLine("File name please ");
	File f=new File(File_name);


	if (f.exists()){
		FileWriter fw= new FileWriter(f,true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		String data =c.readLine("Enter data to write  ");
	
		pw.println(data);

		pw.close();

	}
	else{
		System.out.println(File_name+" Does not exist ");	
	}
	}
}