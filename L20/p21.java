import java.sql.*;
import java.io.*;
class p21{
	public static void main(String ...args){
	Console c=System.console();
	try{
		int rno=20;
		String name="naman";
	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");
	
	String sql="insert into student values(100,name)";
	PreparedStatement pst=con.prepareStatement(sql);
	int r=pst.executeUpdate();
	//System.out.println(r+" records inseted ");
	con.close();
	}
	catch(SQLException e){
	System.out.println("issue "+e);
	}
	}
}