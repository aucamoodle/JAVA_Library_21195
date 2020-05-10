/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unused;

/**
 *
 * @author <milly g@VNGTechnology>
 */
public class MyApp {
    
    private static boolean isAuthenticated;

    public static void main( String args[] ) {
        isAuthenticated = false;
        while( !isAuthenicated ) {
            authenticateUser();
            try{ Thread.sleep( 200 ); } catch( InterruptedException ie ){ }
        }

        new JFrame();
        // finish rest of GUI code.
    }

    private static void authenticateUser(){
        dialog = new MyAuthenticationDialog();
        dialog.show();
        if( isValid( dialog.getUsername(), dialog.getPassword() )
            isAuthenticated = true;
        else 
            isAuthenticated = false;
    }
}