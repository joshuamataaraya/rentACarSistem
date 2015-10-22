/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Logica.Alquiler;
import Logica.Auto;
import Logica.Cliente;
import java.util.ArrayList;

import java.util.Date;

/**
 *
 * @author joshua
 */
public class AlquilerDB {
    private ArrayList<Alquiler> alquileres;
    private AlquilerDB() {
        alquileres=new ArrayList<Alquiler>();
    }
    
    public static AlquilerDB getInstance() {
        return AlquilerDBHolder.INSTANCE;
    }
    
    private static class AlquilerDBHolder {

        private static final AlquilerDB INSTANCE = new AlquilerDB();
    }
    public void alquilarAuto(Cliente pCliente, Date pFechaDevolucion, Auto pAuto){
        alquileres.add(new Alquiler(pCliente,pFechaDevolucion,pAuto));
    }
}
