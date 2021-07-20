import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Connect_jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     try {
	         // Step 1: Construct a database 'Connection' object called 'conn'
	    	  Class.forName("com.mysql.jdbc.Driver");
	    	 Connection con = DriverManager.getConnection("jdbc:mysql:///test?cloudSqlInstance=jdbc-connection-319914:asia-south1:connectjdbc&socketFactory=com.google.cloud.sql.mysql.SocketFactory&useSSL=false&user=test&password=password");
	    	 // For MySQL only    		    	

	    		  PreparedStatement stmt = con.prepareStatement("select * from jdbc");
	    		  ResultSet rs=stmt.executeQuery();
	        	 			 
	         while(rs.next()) {
	        	 System.out.println(rs.getInt(1)+" "+rs.getString(2));
	         }
	      }
	       catch(Exception ex) {
	         ex.printStackTrace();
	      } 
	}

}
