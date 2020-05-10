/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author milly g
 */
public enum ClientCategory {
    STUDENT
    ,STAFF
    ,EXTERNAL;
private String category;
    @Override
    public String toString() {
        return "" + category;
    }
    
}
