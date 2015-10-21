package Logica;
public class Usuario {
    private String contrasenia;
    private String usuario;
    private int tipo;
    public Usuario(String usuario,String contrasenia, int tipo){
        this.contrasenia= contrasenia;
        this.usuario= usuario;
        //tipo 1 es Administrador
        //tipo 2 es Auditor
        //tipo 3 es Cajero
        this.tipo= tipo;
    }
    public String getUsuario(){
        return usuario;
    }
    public String getContrasenia(){
        return contrasenia;
    }
    public int getTipo(){
        return tipo;
    }
    public boolean verificarUsuario(String txtUsuario, String txtContraseña) {
        return usuario.equals(txtUsuario) && contrasenia.equals(txtContraseña);
    }
}
