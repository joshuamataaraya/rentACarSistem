package Control;
import UI.CrearClienteUI;
import UI.UIMenuAdministrador;
import java.util.ArrayList;

public class ClienteController {

    public ClienteController(javax.swing.JFrame ventana) {
        ventana.setVisible(false);
        
        CrearClienteUI crearClienteUI= new CrearClienteUI(ventana);
        crearClienteUI.setVisible(true);
    }
    public void listarClientes(){
        
    }
}
