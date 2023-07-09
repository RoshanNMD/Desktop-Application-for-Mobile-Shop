package orderitp;




import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NIROYAN
 */
public class DB_connection {
    Connection conn;
    public static Connection connect(){
    try{
         Class.forName("java.sql.Driver");
        Connection conn;
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/system" , "root" , "" );
        return conn ;
    }catch (Exception e ){
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Connection faliure");
        return null ;
    }
        
    }

    

    
    
    
    
    
}
