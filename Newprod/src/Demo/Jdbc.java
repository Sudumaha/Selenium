package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {
public static void main(String [] ar) throws SQLException{
	String url="jdbc:mysql://localhost:3306/Bspider";
	String un= "root";
	String pwd="root";
	Connection connect = DriverManager.getConnection(url,un,pwd);
	Statement St = connect.createStatement();
	ResultSet Rs = St.executeQuery("select* from Class;");
	while(Rs.next()){
		String username= Rs.getString("name");
		String pass= Rs.getString("Id");
		System.out.println(username+""+pass);
	}
}
}
