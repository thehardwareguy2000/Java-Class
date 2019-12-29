import java.sql.*;
class p3{
	public static void main(String ...args){
	try{
	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","abc123");
	String sql="select * from student";
	Statement stmt=con.createStatement();
	ResultSet rs =stmt.executeQuery(sql);
	while(rs.next()){
		System.out.println("Roll no= "+rs.getInt(1)+" name = "+rs.getString(2));
	}

	con.close();
	}
	catch(SQLException e){
	System.out.println("issue "+e);
	}
	}
}