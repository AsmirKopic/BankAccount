package bankATMmachine.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connection {
	

	try {
		
	// 1. Get connection to data base
		
		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "toor");
			
	// 2. Create a statement
		Statement myStm = myConn.createStatement();
	// 3. Execute sql query
		ResultSet myRs = myStm.executeQuery("select * from account ");
	// 4. Process the result set
		
		String test1 = "asmir";
		String test2 = "1600";
		
		
		while(myRs.next()) {
			System.out.println(myRs.getString("username") + myRs.getString("balance"));
			
			if (myRs.getString("username").equals(test1) && myRs.getString("balance").equals(test2)) {
			System.out.println("Confirmed access!!");
		}
		
		
			
		}
		
	}
	
	catch (Exception exc) {
		exc.printStackTrace();
	}
	
	
	

}

}


