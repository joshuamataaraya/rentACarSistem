package Control;

import UI.GenerarReporteUI;
import UI.UIMenuAdministrador;

public class GenerarReporteController {

    public GenerarReporteController(javax.swing.JFrame ventana) {
        ventana.setVisible(false);
        GenerarReporteUI generarReporteUI = new GenerarReporteUI(ventana,this);
        generarReporteUI.setVisible(true);
    }
    
}
