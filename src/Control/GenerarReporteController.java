package Control;

import Datos.AlquilerDB;
import Logica.Alquiler;
import UI.GenerarReporteUI;
import UI.UIMenuAdministrador;
import java.util.Date;

public class GenerarReporteController {

    public GenerarReporteController(javax.swing.JFrame ventana) {
        ventana.setVisible(false);
        GenerarReporteUI generarReporteUI = new GenerarReporteUI(ventana,this);
        generarReporteUI.setVisible(true);
    }

    public String getReporte(Date fechaInicial,Date fechaFinal) {
        String Reporte = "";
        for(Alquiler a:AlquilerDB.getInstance().getAlquileres()){
            if(a.getFechaDevolucion().after(fechaInicial) &&
                    a.getFechaDevolucion().before(fechaFinal)){
                Reporte += "Se ha alquilado el auto: "+ a.getAuto().toString()
                        + " al cliente: " + a.getCliente().toString() + "\n" ;                
            }
        }
        return Reporte;
    }
    
}
