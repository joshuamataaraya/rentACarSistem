package Logica;

import Datos.Datos;

public class Login {
    
    
    public int tipoUsuario(String txtUsuario, String txtContraseña) {
        return Datos.getInstance().tipoUsuario(txtUsuario,txtContraseña);
    }
    
}
