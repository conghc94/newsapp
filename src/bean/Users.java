/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author cong
 */
public class Users {

    private int id_user;
    private String fullName;
    private String userName;
    private String password;
    private boolean action;

    public int getId_user() {
        return id_user;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAction() {
        return action;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAction(boolean action) {
        this.action = action;
    }

    public Users(int id_user, String userName, String password, String fullName, boolean action) {
        this.id_user = id_user;
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
        this.action = action;
    }

}
