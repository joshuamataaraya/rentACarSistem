/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Logica.Auto;
import java.util.ArrayList;

/**
 *
 * @author joshua
 */
public class AutoDB {
    private ArrayList<Auto> autos;
    private AutoDB() {
        autos=new ArrayList<Auto>();
        autos.add(new Auto("FO","2016","BYD"));
        autos.add(new Auto("Rav4","2012","Toyota"));
        
            
    }
    
    public static AutoDB getInstance() {
        return AutoDBHolder.INSTANCE;
    }

    public void crearAuto(String nombre, String modelo, String fabricante) {
        autos.add(new Auto(nombre, modelo, fabricante));
    }
    
    private static class AutoDBHolder {

        private static final AutoDB INSTANCE = new AutoDB();
    }
    public ArrayList<Auto> listarAutosDisponibles(){
        return autos;
    }
}
