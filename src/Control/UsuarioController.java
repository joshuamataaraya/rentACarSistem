package Control;

import Datos.UsuariosDB;
import Logica.Usuario;
import UI.CrearUsuarioUI;
import UI.EliminarUsuarioUI;
import UI.UIMenuAdministrador;

public class UsuarioController {
    
    public UsuarioController(int i, javax.swing.JFrame ventana) {
        ventana.setVisible(false);
        
        switch(i){
            case 1:
                CrearUsuarioUI crearUsuarioUI= new CrearUsuarioUI(ventana,this);
                crearUsuarioUI.setVisible(true);
                break;
            case 2:
                EliminarUsuarioUI eliminarUsuarioUI = new EliminarUsuarioUI(ventana,this,
                UsuariosDB.getInstance().getUsuarios());
                eliminarUsuarioUI.setVisible(true);
                break;
        }
    }

    public void crearUsuario(String usuario, String contrasenia, int tipo) {
        UsuariosDB.getInstance().crearUsuario(usuario,contrasenia,tipo);
    }

    public void eliminarUsuario(Usuario usuario1, String usuario, String contraseña) {
        /**
         * El primer administrador puede eliminar al que sea, 
         * pero los otros administradores no pueden eliminar administradores
         *
         */
        if(UsuariosDB.getInstance().tipoUsuario(usuario,contraseña)==1 && usuario.equals("Joshua")){
            UsuariosDB.getInstance().eliminarUsuario(usuario1);
        }else{
            if(UsuariosDB.getInstance().tipoUsuario(usuario,contraseña)==1){
                if(usuario1.getTipo()!=1){
                    UsuariosDB.getInstance().eliminarUsuario(usuario1);
                }
            }
        }
    }
}
