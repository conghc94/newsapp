/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renderer;

import bean.Category;
import controller.ControllerCat;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
import model.ModelCategory;

/**
 *
 * @author PhiLong
 */
public class RendererComboBoxModelCat implements ComboBoxModel {
//    private ArrayList<Category>  alCat = new ArrayList<Category>();
    private ArrayList<Category> alCat = new ArrayList<Category>();
    private ModelCategory dbCategory;
    private Category selectedItem;

    public RendererComboBoxModelCat() {
        dbCategory = new ModelCategory();
        alCat = dbCategory.getList();
        selectedItem = alCat.get(0);
//Category objCity1 = new Category(1,"Da Nang");
//        Category objCity2 = new Category(2,"Hue");
//        Category objCity3 = new Category(3,"Sai Gon");
//        Category objCity4 = new Category(4,"HCM");
//        Category objCity5 = new Category(5,"BMT");
//        alCat.add(objCity1);
//        alCat.add(objCity2);
//        alCat.add(objCity3);
//        alCat.add(objCity4);
//        alCat.add(objCity5);
//        
//        selectedItem = alCat.get(4);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem = (Category) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }

    @Override
    public int getSize() {
        return alCat.size();
    }
    @Override
    public Object getElementAt(int index) {
        return alCat.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
    }
    
}
