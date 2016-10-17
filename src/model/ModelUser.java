/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import library.LibraryConnectDB;
import bean.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import library.LibraryString;

/**
 *
 * @author Windows
 */
public class ModelUser {

    private Connection conn;

    private LibraryConnectDB mConnect;
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;

    public ModelUser() {
        mConnect = new LibraryConnectDB();
    }

    public ArrayList<Users> getList() {
        ArrayList<Users> alItem = new ArrayList<>();

        conn = mConnect.getConnectMySQL();
        String sql = "SELECT * FROM users WHERE 1";

        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Users objUser = new Users(rs.getInt("id_user"), rs.getString("username"), rs.getString("password"), rs.getString("fullname"), rs.getBoolean("active"));
                alItem.add(objUser);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModelUser.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ModelUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return alItem;
    }

    public int addItem(Users objItem) {
        int result = 0;
        conn = mConnect.getConnectMySQL();
        String sql = "INSERT INTO users(username, password, fullname, active) VALUES(?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, objItem.getUserName());
            pst.setString(2, LibraryString.md5(objItem.getPassword()));
            pst.setString(3, objItem.getFullName());
            pst.setBoolean(4, objItem.isAction());
            pst.executeUpdate();
            result = 1;
        } catch (SQLException ex) {
            Logger.getLogger(ModelUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public int delItem(Users objItem) {
        int result = 0;
        conn = mConnect.getConnectMySQL();
        String sql = "DELETE FROM users WHERE id_user = ? LIMIT 1";
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, objItem.getId_user());
            pst.executeUpdate();
            result = 1;
        } catch (SQLException ex) {
            Logger.getLogger(ModelUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public int editItem(Users objItem) {
        int result = 0;
        conn = mConnect.getConnectMySQL();
        if (!objItem.getPassword().isEmpty()) {
            String sql = "UPDATE users SET username = ?, password = ?, fullname = ?, active = ? WHERE id_user = ? LIMIT 1";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, objItem.getUserName());
                pst.setString(2, LibraryString.md5(objItem.getPassword()));
                pst.setString(3, objItem.getFullName());
                pst.setBoolean(4, objItem.isAction());
                pst.setInt(5, objItem.getId_user());
                pst.executeUpdate();
                result = 1;
            } catch (SQLException ex) {
                Logger.getLogger(ModelUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            String sql = "UPDATE users SET username = ?, fullname = ?, active = ? WHERE id_user = ? LIMIT 1";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, objItem.getUserName());
                pst.setString(2, objItem.getFullName());
                pst.setBoolean(3, objItem.isAction());
                pst.setInt(4, objItem.getId_user());
                pst.executeUpdate();
                result = 1;
            } catch (SQLException ex) {
                Logger.getLogger(ModelUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result;
    }

    public Users getUserByUsername(String username) {
        Users objUser = null;

        conn = mConnect.getConnectMySQL();
        String sql = "SELECT * FROM users WHERE username = ? LIMIT 1";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            rs = pst.executeQuery();
            if (rs.next()) {
                objUser = new Users(rs.getInt("id_user"), rs.getString("username"), rs.getString("password"), rs.getString("fullname"), rs.getBoolean("active"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModelUser.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                pst.close();
                rs.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ModelUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return objUser;
    }

    public Users getUserByUsernamePassword(String user, String pass) {
        Users objUser = null;

        conn = mConnect.getConnectMySQL();
        String sql = "SELECT * FROM users WHERE username = ? && password = ? LIMIT 1";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, user);
            pst.setString(2, LibraryString.md5(pass));
            rs = pst.executeQuery();
            if (rs.next()) {
                objUser = new Users(rs.getInt("id_user"), rs.getString("username"), rs.getString("password"), rs.getString("fullname"), rs.getBoolean("active"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModelUser.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                pst.close();
                rs.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ModelUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return objUser;
    }

}
