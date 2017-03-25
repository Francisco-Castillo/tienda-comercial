/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Splash;

/**
 *
 * @author Cesar Castillo
 */
public class Main {
    
    public static void Main (String args[]){
        
        java.awt.EventQueue.invokeLater(new Runnable() {
        
        @Override
        public void run(){
            
            new InicioAplicacion().setVisible(true);
            
        }
    });
    }
    
}
