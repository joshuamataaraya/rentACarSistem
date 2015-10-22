package Datos;

import Logica.Cliente;
import Logica.Usuario;
import java.util.ArrayList;

public class Datos {
    private ArrayList<Usuario> usuarios;
    private Datos() {
        usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Joshua","123",1));
        usuarios.add(new Usuario("Auditor","123",2));
        usuarios.add(new Usuario("Cajero","123",3));
    }
    
    public static Datos getInstance() {
        return DatosHolder.INSTANCE;
    }

    

    public int tipoUsuario(String txtUsuario, String txtContraseña) {
        for (Usuario usuario : usuarios){
            if(usuario.getUsuario().equals(txtUsuario) && 
                    usuario.getContrasenia().equals(txtContraseña)){
                return usuario.getTipo();
            }
        }
        return 0;
    }
    
    private static class DatosHolder {

        private static final Datos INSTANCE = new Datos();
    }
}
