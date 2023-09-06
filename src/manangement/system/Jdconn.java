package manangement.system;

import java.sql.*;

public class Jdconn {
	
	Connection c;
	Statement s;
	
	Jdconn()
	{
		// Register the driver 
		// Initialise
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/tmanagementsystem", "root", "Powerful@123");
			s = c.createStatement();
			
			
		} catch(Exception a) {}
	}

}
