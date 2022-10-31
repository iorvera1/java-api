/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_project;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author BEAST
 */
public class MySqlConnection {
        
    public static Connection getConnection() {
    
    Connection con = null;
    
    String url = "jdbc:mysql://localhost:3306/ioverenterprisedb";// database connection
    
    String username = "root";
    
    String password = "";


   try{
    Class.forName("com.mysql.jdbc.Driver");
    con = (Connection) DriverManager.getConnection(url, username, password);
    
}
    catch(Exception e) {
    JOptionPane.showMessageDialog(null, e);
}
    return con;
}
}
    
