/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderitp;

import DB.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class DBconnec {
    
    public static com.mysql.jdbc.Connection connect()
    
    {
     com.mysql.jdbc.Connection con = null;
       
     try 
     {
      Class.forName("com.mysql.jdbc.Driver");
      con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/system","root","");
     }
     catch(Exception e)
     {
         
         System.out.println(e );
     }
     
      return con;  
        
    }


}
