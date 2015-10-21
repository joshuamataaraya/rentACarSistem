package Control;

import Datos.UsuariosDB;
import Logica.Login;
import Logica.Usuario;
import UI.LoginUI;
import javax.swing.JTextField;

public class LoginController {
    private Login login;
    public LoginController(){
        LoginUI Uinterface = new LoginUI(this);
        Uinterface.setVisible(true);
        
        login = new Login();
    }

    public boolean validarUsuario(String txtUsuario, String txtContraseña) {
        //llama los usuarios y a cada uno le pide que se verifique
        for(Usuario usuario: UsuariosDB.getInstance().getUsuarios()){
            if(usuario.verificarUsuario(txtUsuario, txtContraseña)){
                return true;
            }
        }
        return false;
    }

    public int tipoUsuario(String usuario, String Contrasena) {
        return login.tipoUsuario(usuario, Contrasena);
    }
}
