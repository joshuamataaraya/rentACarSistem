package Control;


import Logica.Auto;
import Logica.Cliente;
import UI.AlquilarAutomovilUI;
import UI.UIMenuAdministrador;
import java.util.ArrayList;
import java.util.Date;

public class AlquilarAutoController {
    public AlquilarAutoController(javax.swing.JFrame ventana) {
        ventana.setVisible(false);
        
        AlquilarAutomovilUI alquilarAutomovilUI = new AlquilarAutomovilUI(ventana,null,null);
        alquilarAutomovilUI.setVisible(true);
    }
    public ArrayList<Auto> listarAutosDisponibles(){
        ArrayList<Auto> autos = new ArrayList<>();
        return autos;
    }
    public void alquilarAuto(Cliente pCliente, Date pFechaDevolucion, Auto pAuto){
        
    }
}
