package jdbc_connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Update {

	public static void main(String[] args) throws ClassNotFoundException, Exception {
		
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Instagram_db", "root",
			"Root");;
	Statement stm = (Statement) con.createStatement();
	
	String updateSql = "Update comments set comment_discription = 'Good luck' where comment_discription = 'Good lucj'";
		
	stm.executeUpdate(updateSql);
	
	
	stm.close();
	
	
	con.close();
		

	}

}

	

