package Control;

import UI.CrearUsuarioUI;
import UI.EliminarUsuarioUI;
import UI.UIMenuAdministrador;

public class UsuarioController {
    
    public UsuarioController(int i, javax.swing.JFrame ventana) {
        ventana.setVisible(false);
        
        switch(i){
            case 1:
                CrearUsuarioUI crearUsuarioUI= new CrearUsuarioUI(ventana);
                crearUsuarioUI.setVisible(true);
                break;
            case 2:
                EliminarUsuarioUI eliminarUsuarioUI = new EliminarUsuarioUI(ventana);
                eliminarUsuarioUI.setVisible(true);
                break;
        }
    }
    
}