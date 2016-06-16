
package connector;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class DBConnector {
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/obbs_data";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
            
    public static java.sql.Connection getConnection() {
  java.sql.Connection con = null;
        PreparedStatement pstmt = null;
        int i=0;
        
        try {
            
            //connecting to driver
            
            
            Class.forName(JDBC_DRIVER);
            
            System.out.println("driver found");
            con = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            System.out.println("Connected successfully");
        }
        catch( Exception e){
            System.out.println(e);
        }
        return con;
}
}
    

