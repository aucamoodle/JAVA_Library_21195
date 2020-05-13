/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author <milly g@VNGTechnology>
 */
public enum CCategory {
    STUDENT(1),STAFF(2),EXTERNAL(3);
    private final Integer Category;

    private CCategory(Integer Category) {
        this.Category = Category;
    }

    public Integer getCategory() {
        return Category;
    }
    
    
    @Override
    public String toString() {
        return "" +Category ;
    }
    
}
