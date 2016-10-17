/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ChiCong
 */
public class LibraryConnectDB {
    private Connection conn;
    private String db;
    private String url;
    private String userName;
    private String password;
    
    public LibraryConnectDB(){
        this.db = "newsapp";
        this.url= "jdbc:mysql://localhost:3306/" + db + "?useUnicode=true&characterEncoding=UTF-8";
        this.userName="root";
        this.password="";
    }
    
    public Connection getConnectMySQL(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                conn = DriverManager.getConnection(url,userName,password);
            } catch (SQLException ex) {
                Logger.getLogger(LibraryConnectDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LibraryConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
