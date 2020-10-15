/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informatique;
import java.sql.DriverManager; 
import java.sql.SQLException;

/**
 *
 * @author android
 */

public class Connexion {          
 
    /**
     *
     */
  com.mysql.jdbc.Connection conn; 
 { 
            String url= "jdbc:mysql://localhost:3306/";             
            String dbName;             
            dbName = "gestionstock"; 
            String driver= "com.mysql.jdbc.Driver"; 
            String userName= "root"; 
            String password=""; 
                         try 
            { 
                Class.forName(driver).newInstance(); 
                conn= (com.mysql.jdbc.Connection) 
DriverManager.getConnection(url+dbName,userName, password); 
                System.out.println("la connexion a reussie"); 
            }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) 
            { 
                             System.out.println("la connexion est echoué"); 
 
            } 
  
} 

    void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} 

