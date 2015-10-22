package Logica;

import java.util.ArrayList;

public class Auto {
    private String nombre;
    private String modelo;
    private String fabricante;
    public Auto(String nombre,String modelo,String fabricante){
        this.nombre=nombre;
        this.modelo=modelo;
        this.fabricante=fabricante;
    }
    
    @Override
    public String toString(){
        return fabricante+" "+nombre+" " +modelo;
    }
}
