/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Category;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import model.ModelCategory;

/**
 *
 * @author ChiCong
 */
public class ControllerCat extends AbstractTableModel {

    private JTable table;
    private String[] arCols = {"Id danh mục", "Tên danh mục"};
    private ArrayList<Category> alCat = null;
    private ModelCategory modelCat;

    public ControllerCat(JTable table) {
        this.table = table;

        modelCat = new ModelCategory();
        alCat = modelCat.getList();
//        alCat = new ArrayList<>();
//        alCat.add(new Category(1, "Tin game thủ"));
//        alCat.add(new Category(2, "Tin thể thao"));
//        alCat.add(new Category(12, "Tin thời trang"));
//        alCat.add(new Category(3, "Anh hùng xạ điêu"));
    }

    @Override
    public int getRowCount() {
        return alCat.size();
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
        if (columnIndex == 0) {
            return Integer.class;
        }
        return super.getColumnClass(columnIndex); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Category objCat = alCat.get(rowIndex);
        Object value = null;
        switch (columnIndex) {
            case 0:
                value = objCat.getId_cat();
                break;
            case 1:
                value = objCat.getName();
                break;
        }
        return value;

    }

    public void loadTable() {
        this.table.setModel(this);
        table.getTableHeader().setPreferredSize(new Dimension(0, 30));
        table.setRowHeight(28);
        table.getColumnModel().getColumn(0).setPreferredWidth(100);
        table.getColumnModel().getColumn(1).setPreferredWidth(500);
    }

    public int addItem(Category objCat) {
        //add to database
        int result = modelCat.addItem(objCat);

        objCat.setId_cat(result);
        //add to model
        alCat.add(objCat);
        this.fireTableDataChanged();
        table.scrollRectToVisible(table.getCellRect(this.getRowCount() - 1, 0, true));

        return result;
    }

    public int delItem(Category objCat, int row) {
        //del Database
        int result = modelCat.delItem(objCat.getId_cat());
        //del from model
        int rowModel = table.convertRowIndexToModel(row);
        alCat.remove(rowModel);
        this.fireTableRowsDeleted(rowModel, rowModel);
        return result;
    }

    public int editItem(Category objCat, int row) {
        //edit database
        int result = modelCat.editItem(objCat);
        //edit model
        int rowModel = table.convertRowIndexToModel(row);
        alCat.set(rowModel, objCat);
        this.fireTableRowsUpdated(rowModel, rowModel);

        return result;
    }
}
