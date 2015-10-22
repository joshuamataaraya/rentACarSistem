package Logica;

import java.util.Date;

public class Alquiler {
    private Cliente cliente;
    private Date fechaDevolucion;
    private Auto auto;
    public Alquiler(Cliente pCliente, Date pFechaDevolucion, Auto pAuto) {
        cliente=pCliente;
        fechaDevolucion=pFechaDevolucion;
        auto=pAuto;
    }
    
}
