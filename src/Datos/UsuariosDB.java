package Datos;

import Logica.Usuario;
import java.util.ArrayList;

public class UsuariosDB {
    private ArrayList<Usuario> usuarios;
    private UsuariosDB() {
        usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Administrador","123",1));
        usuarios.add(new Usuario("Auditor","123",2));
        usuarios.add(new Usuario("Cajero","123",3));
    }
    
    public static UsuariosDB getInstance() {
        return UsuariosDBHolder.INSTANCE;
    }

    public void crearUsuario(String usuario, String contrasenia, int tipo) {
        usuarios.add(new Usuario(usuario,contrasenia,tipo+1));
    }
    
    private static class UsuariosDBHolder {

        private static final UsuariosDB INSTANCE = new UsuariosDB();
    }
    public ArrayList<Usuario> getUsuarios(){
        return usuarios;
    }
    public void eliminarUsuario(Usuario u){
        usuarios.remove(u);
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
    
}
