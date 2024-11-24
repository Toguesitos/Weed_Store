
package Objects;


public class cls_administrativos {

    /**
     * @return the contrasena
     */
    public static String getContrasena() {
        return contrasena;
    }

    /**
     * @param aContrasena the contrasena to set
     */
    public static void setContrasena(String aContrasena) {
        contrasena = aContrasena;
    }

    /**
     * @return the usuario1
     */
    public static String getUsuario1() {
        return usuario1;
    }

    /**
     * @param aUsuario1 the usuario1 to set
     */
    public static void setUsuario1(String aUsuario1) {
        usuario1 = aUsuario1;
    }
    String Nombres,Apellidos,Usuario,Contraseña,Tipo_usuario;

    public cls_administrativos() {
        this.Nombres = "";
        this.Apellidos = "";
        this.Usuario = "";
        this.Contraseña = "";
        this.Tipo_usuario = "";
    }
    private static String usuario1="";
    private static String contrasena="";
    
    public cls_administrativos(String Nombres, String Apellidos, String Usuario, String Contraseña, String Tipo_usuario) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.Tipo_usuario = Tipo_usuario;
    }

    public String getNombres() {
        return Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getUsuario() {
        return Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public String getTipo_usuario() {
        return Tipo_usuario;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public void setTipo_usuario(String Tipo_usuario) {
        this.Tipo_usuario = Tipo_usuario;
    }
    
}
