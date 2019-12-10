package jdbc_connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class Main {

public static void main(String[] args) throws ClassNotFoundException, Exception {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root",
				"Root");;
		Statement stmt = (Statement) con.createStatement();
		
		String mysql = "Select * from employees where first_name = first_name";
		
		ResultSet rs = stmt.executeQuery(mysql);
		
		while (rs.next()) {
			Thread.sleep(1000);
			int employee_id = rs.getInt("employee_id");
			String first_name = rs.getString("first_name");
			String last_name = rs.getString("last_name");
			long phone = rs.getLong("phone");
			String email = rs.getString("email");
			String address = rs.getString("address");
			int Salary = rs.getInt("Salary");
			System.out.println("Employee ID:"+" " +employee_id+", "+"First Name:"+""+first_name+", "+"Last Name:"+""+last_name+", "+"Phone Number:"+""+phone+",  "+"Email address:"+""+email+",  "+"Address:"+""+address+",  "+"Salary:"+""+Salary);
		}
		
		

	}
		

	}


