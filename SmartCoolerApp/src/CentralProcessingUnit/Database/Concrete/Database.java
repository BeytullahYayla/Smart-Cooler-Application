package CentralProcessingUnit.Database.Concrete;

import CentralProcessingUnit.Database.Abstract.DatabaseRepository;
import Entity.Concrete.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Database implements DatabaseRepository {

	private Connection connect() {

        Connection conn=null;

        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/CoolerDb",
                    "postgres","Beytullah.123");

            System.out.println("Connected Database Successfully!");

        } catch (Exception e) {
            System.out.println("Something went wrong, wrong username or password!");
            e.printStackTrace();
        }
        return conn;
	}
	
	@Override
	public User validateUser(String username, String password) {
		   User user=null;

	        System.out.println("User is validating...");
	        
	       
	        
	        Connection conn=this.connect();

	        try
	        {

	            String sql= "SELECT *  FROM \"User\" WHERE \"userName\"="+"\'"+username+"\'"+" AND \"password\"="+ "\'"+password+"\'";

	            Statement stmt = conn.createStatement();
	            ResultSet rs = stmt.executeQuery(sql);

	            
	            conn.close();

	            String userName;
	            String passWord;

	            while(rs.next())
	            {
	                userName=rs.getString("username");
	                passWord=rs.getString("password");

	                user=new User(userName,passWord);
	                
	            }

	            rs.close();
	            stmt.close();
	           
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	       System.out.println("User validated successfully");
	       System.out.println(user.getUserName());

	       
		
	}

}
