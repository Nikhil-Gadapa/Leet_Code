/* aim to fetch records from table */
/*JDBC_2.java*/

import java.sql.*;
import java.util.*;

class JDBC_2{
	public static void main(String rags[]) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pat","pat");
		
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from register order by regid");
		// to iterate through all records
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" ");
			System.out.println(rs.getString(2)+" ");
			System.out.println(rs.getString(3)+" ");
			System.out.println(rs.getString(4)+" ");
			System.out.println(rs.getString(5)+" ");
			System.out.println(rs.getLong(6)+" ");
			System.out.println(rs.getString(7)+" ");
		}
		rs.close(); stmt.close(); con.close();
	}
}
