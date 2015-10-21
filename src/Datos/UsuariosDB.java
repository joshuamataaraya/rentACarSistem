package Datos;

import Logica.Usuario;
import java.util.ArrayList;

public class UsuariosDB {
    private ArrayList<Usuario> usuarios;
    private UsuariosDB() {
        usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Joshua","123",1));
        usuarios.add(new Usuario("Auditor","123",2));
        usuarios.add(new Usuario("Cajero","123",3));
    }
    
    public static UsuariosDB getInstance() {
        return UsuariosDBHolder.INSTANCE;
    }
    
    private static class UsuariosDBHolder {

        private static final UsuariosDB INSTANCE = new UsuariosDB();
    }
    public ArrayList<Usuario> getUsuarios(){
        return usuarios;
    }
}
