import java.sql.*;
class p1{
	public static void main(String ...args){
	try{
	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");
	con.close();
	}
	catch(SQLException e){
	System.out.println("issue "+e);
	}
	}
}