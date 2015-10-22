package Control;

import Datos.AutoDB;
import UI.CrearAutoUI;
import UI.UIMenuAdministrador;

public class CrearAutoController {

    public CrearAutoController(javax.swing.JFrame ventana) {
        ventana.setVisible(false);
        CrearAutoUI crearAutoUI =new CrearAutoUI(ventana,this);
        crearAutoUI.setVisible(true);
    }
    public void crearAuto(String nombre,String modelo,String fabricante ){
        AutoDB.getInstance().crearAuto(nombre,modelo,fabricante);
    }
}
