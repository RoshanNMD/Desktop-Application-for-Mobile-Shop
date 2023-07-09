/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycode;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author thathsara
 */
public class DBconnect_1 {
    
    public static Connection connect()
    {
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/system","root","");
            
        }
       catch(Exception e)
       {
        System.out.print(e);  
       }
        return conn;
    
    }
    
}
