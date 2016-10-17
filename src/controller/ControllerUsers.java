/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Users;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author cong
 */
public class ControllerUsers extends AbstractTableModel{
    private JTable table;
    private String[] arCols = {"Id User","Tên đăng nhập","Họ và tên", "Kích hoạt"};
    private ArrayList<Users> alUsers = null;

    public ControllerUsers(JTable tbMain) {
        this.table=tbMain;
        
        alUsers = new ArrayList<>();
        alUsers.add(new Users(1, "conghc94","hoangchicong","Hoàng Chí Công",true));
        alUsers.add(new Users(2, "conghc94","hoangchicong","Hoàng Chí Công",true));
        alUsers.add(new Users(3, "conghc94","hoangchicong","Hoàng Chí Công",true));
        alUsers.add(new Users(4, "conghc94","hoangchicong","Hoàng Chí Công",true));
        alUsers.add(new Users(5, "conghc94","hoangchicong","Hoàng Chí Công",true));
        alUsers.add(new Users(6, "conghc94","hoangchicong","Hoàng Chí Công",true));
    }
    
    public void loadTable() {
        table.setModel(this);
        
        ((JComponent) (table.getDefaultRenderer(Boolean.class))).setOpaque(true);
        
        table.getTableHeader().setPreferredSize(new Dimension(0, 30));
        table.setRowHeight(28);
        
        table.getColumnModel().getColumn(0).setPreferredWidth(50);
        table.getColumnModel().getColumn(1).setPreferredWidth(100);
        table.getColumnModel().getColumn(2).setPreferredWidth(100);
        table.getColumnModel().getColumn(3).setPreferredWidth(100);
    }

    @Override
    public int getRowCount() {
        return alUsers.size();
    }

    @Override
    public int getColumnCount() {
        return arCols.length;
    }
    
    @Override
    public String getColumnName(int column) {
        return arCols[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if(columnIndex==0){
            return Integer.class;
        }else if(columnIndex==3){
            return Boolean.class;
        }
        return super.getColumnClass(columnIndex); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Users objUser = alUsers.get(rowIndex);
        Object value = null;
        switch (columnIndex){
            case 0:
                value = objUser.getId_user();
                break;
            case 1:
                value = objUser.getUserName();
                break;
            case 2: 
                value = objUser.getFullName();
                break;
            case 3:
                value = objUser.isAction();
                break;
        }
        return value;
    }

    public int addItem(Users objUsers) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
