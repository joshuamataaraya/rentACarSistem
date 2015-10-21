package Control;

import UI.CrearAutoUI;
import UI.UIMenuAdministrador;

public class CrearAutoController {

    public CrearAutoController(javax.swing.JFrame ventana) {
        ventana.setVisible(false);
        CrearAutoUI crearAutoUI =new CrearAutoUI(ventana);
        crearAutoUI.setVisible(true);
    }
    public void crearAuto(String pInformacion){
        
    }
}
