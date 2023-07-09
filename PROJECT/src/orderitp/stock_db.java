
package orderitp;
import DB.*;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author PC-LIFE
 */
public class stock_db {
    
    public static Connection connect(){
      Connection con = null;
      
      try{
         Class.forName("com.mysql.jdbc.Driver");
         con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/system", "root", "");
      }
      catch(Exception e){
          System.out.println(e);
      }
      
      return con;
    }
}
