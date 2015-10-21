/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author joshua
 */
public class AutoDB {
    
    private AutoDB() {
    }
    
    public static AutoDB getInstance() {
        return AutoDBHolder.INSTANCE;
    }
    
    private static class AutoDBHolder {

        private static final AutoDB INSTANCE = new AutoDB();
    }
}
