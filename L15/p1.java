//program to read marks from the user and display max and min

import java.util.*;
import java.io.*;
class p1{
	public static void main(String... args){
	Console c=System.console();
	ArrayList<Integer> marks = new ArrayList<>();

	String reply = c.readLine("Y/N");
	while(reply.equals("Y")){
	int m = Integer.parseInt(c.readLine("marks please "));
	marks.add(m);
	reply=c.readLine("Y/N");
	}
	Collections.sort(marks);
	System.out.println("lowest marks are "+marks.get(0));

	System.out.println(" highest marks are "+marks.get(marks.size() -1));
	}
}
