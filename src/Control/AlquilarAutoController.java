package Control;


import Datos.AlquilerDB;
import Datos.AutoDB;
import Datos.ClienteDB;
import Logica.Auto;
import Logica.Cliente;
import UI.AlquilarAutomovilUI;
import UI.UIMenuAdministrador;
import java.util.ArrayList;
import java.util.Date;

public class AlquilarAutoController {
    public AlquilarAutoController(javax.swing.JFrame ventana) {
        ventana.setVisible(false);
        
        AlquilarAutomovilUI alquilarAutomovilUI = 
                new AlquilarAutomovilUI(ventana, this,
                        AutoDB.getInstance().listarAutosDisponibles()
                        ,ClienteDB.getInstance().listarClientes());
        alquilarAutomovilUI.setVisible(true);
    }
    public ArrayList<Auto> listarAutosDisponibles(){
        ArrayList<Auto> autos = new ArrayList<>();
        return autos;
    }
    public void alquilarAuto(Cliente pCliente, Date FechaDuracion, Auto pAuto){
        AlquilerDB.getInstance().alquilarAuto(pCliente, FechaDuracion, pAuto);
    }
}
