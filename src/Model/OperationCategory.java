/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author millyg
 */
public enum OperationCategory {
    CHECK_IN,CHECK_OUT;
    private String opcat;
    @Override
    public String toString() {
        return ""+opcat;
    }
}
