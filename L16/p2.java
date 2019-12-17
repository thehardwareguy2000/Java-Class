//p to count each letter in a string


import java.io.*;
import java.util.*;


class p2{
	public static void main(String args[]){
	Console c = System.console();
	String str =c.readLine("enter the sentence");
	HashMap<String,Integer> hm = new HashMap<>();

	for(int i=0;i<str.length();i++){
		String s=str.substring(i,i+1);
		Integer count=hm.get(s);
		if(count == null)
			hm.put(s,1);
		else
			hm.put(s,count+1);

	}
	System.out.print(hm);
	}
}