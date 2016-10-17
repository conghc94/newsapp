/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author ChiCong
 */
public class Category {
    private int id_cat;
    private String name;

    public int getId_cat() {
        return id_cat;
    }

    public String getName() {
        return name;
    }

    public void setId_cat(int id_cat) {
        this.id_cat = id_cat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category(int id_cat, String name) {
        this.id_cat = id_cat;
        this.name = name;
    }
    
}
