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
    public Auto getAuto(){
        return auto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Date getFechaDevolucion() {
        return this.fechaDevolucion;
    }
    
}
