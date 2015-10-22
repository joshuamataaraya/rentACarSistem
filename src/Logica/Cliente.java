package Logica;
public class Cliente {
    private String nombre;
    private String contrasenia;
    private String usuario;
    public Cliente(String nombre){
        this.nombre= nombre;
        this.contrasenia= contrasenia;
        this.usuario= usuario;
    }
    public String toString(){
        return nombre;
    }
}
