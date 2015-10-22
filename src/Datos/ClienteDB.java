/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Logica.Auto;
import Logica.Cliente;
import java.util.ArrayList;

/**
 *
 * @author joshua
 */
public class ClienteDB {
    
    private ArrayList<Cliente> clientes;
    private ClienteDB() {
        clientes=new ArrayList<Cliente>();
        clientes.add(new Cliente("Francinie"));
        clientes.add(new Cliente("Jonathan"));
    }
    
    public static ClienteDB getInstance() {
        return ClienteDBHolder.INSTANCE;
    }

    public void crearCliente(String nombre) {
        clientes.add(new Cliente(nombre));
    }
    
    private static class ClienteDBHolder {

        private static final ClienteDB INSTANCE = new ClienteDB();
    }
    public ArrayList<Cliente> listarClientes(){
        return clientes;
    }
}
