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
public enum fot {
    id(1),
    name(2);
    private Integer gn;

    private fot(Integer gn) {
        this.gn = gn;
    }

    public Integer getGn() {
        return gn;
    }
   
}
