
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// This class can be used to initialize the database connection
public class DatabaseConnection {
    
    
    
	protected static Connection initializeDatabase()throws SQLException, ClassNotFoundException {
		// Initialize all the information regarding
		// Database Connection
		String dbDriver = "com.mysql.jdbc.Driver";
		String dbURL = "jdbc:mysql:// localhost:3306/";
		// Database name to access
		String dbName = "test";
		String dbUsername = "root";
		String dbPassword = "";

		Class.forName(dbDriver);
		Connection con = DriverManager.getConnection(dbURL + dbName,
													dbUsername,
													dbPassword);
		return con;
	}
        
        public String insertOrder(String name1,String name2) throws SQLException, ClassNotFoundException{
            
        Connection con=  initializeDatabase();
          PreparedStatement st = con.prepareStatement("INSERT INTO `order` (`id`, `name`, `details`, `item`) VALUES (NULL, '"+name2+"', '"+name1+"', 'item4');");
            st.executeUpdate();
            st.close();
            con.close();
        return null;
        }
         public String getOrder() throws SQLException, ClassNotFoundException{
            
        Connection con=  initializeDatabase();
       
            
            PreparedStatement ps=con.prepareStatement("SELECT * FROM `order`"); 
             ResultSet  rs = ps.executeQuery(); 
               String name=null;
              while(rs.next()) 
             { 
                name = rs.getString("name"); 
                      //  int sal = rs.getInt("details"); 
        }
              
                      return name;

         }
}


