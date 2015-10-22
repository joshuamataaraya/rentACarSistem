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

    public void eliminarUsuario(Usuario usuarioO, String usuario, String contraseña) {
        LoginController loginController=new LoginController();
        if(loginController.tipoUsuario(usuario,contraseña)==1 and usuario.equals("Joshua")){
            
        }
    }
    
}
