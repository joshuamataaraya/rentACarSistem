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
public class ClienteDB {
    
    private ClienteDB() {
    }
    
    public static ClienteDB getInstance() {
        return ClienteDBHolder.INSTANCE;
    }
    
    private static class ClienteDBHolder {

        private static final ClienteDB INSTANCE = new ClienteDB();
    }
}
