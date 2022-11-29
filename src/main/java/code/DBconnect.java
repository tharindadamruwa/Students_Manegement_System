package code;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBconnect {
    
    public static Connection connect(){
        
        Connection conn = null;
        
        try{
            
            Class.forName("org.sqlite.JDBC");
            conn = (Connection) DriverManager.getConnection("jdbc:sqlite:sms.sqlite");
            
        } catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
            
        }
        
        return conn;
        
    }
    
}
