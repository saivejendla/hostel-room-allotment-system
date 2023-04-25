import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class databaseconnection {
    public static Connection connection()
    {
        
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:4306/hostel","root","");
        
        return conn;
        }
        catch(Exception e)
        { 
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
    }
}
