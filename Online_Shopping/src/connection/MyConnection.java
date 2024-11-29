/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import user.Login;

/**
 *
 * @author LENOVO
 */
public class MyConnection {
    
    public static final String username = "root";
    public static final String password = "ashen1234";
    public static final String url = "jdbc:mysql://localhost:3306/online_shopping";
    public static Connection con = null;
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null,""+ex,"",JOptionPane.WARNING_MESSAGE);
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE,null,ex);
        }
        return con;
    }
    
}
