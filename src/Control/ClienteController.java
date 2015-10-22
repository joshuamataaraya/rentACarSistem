package Control;
import Datos.ClienteDB;
import UI.CrearClienteUI;
import UI.UIMenuAdministrador;
import java.util.ArrayList;

public class ClienteController {

    public ClienteController(javax.swing.JFrame ventana) {
        ventana.setVisible(false);
        
        CrearClienteUI crearClienteUI= new CrearClienteUI(ventana,this);
        crearClienteUI.setVisible(true);
    }

    public void crearCliente(String nombre) {
        ClienteDB.getInstance().crearCliente(nombre);
    }
    
}
