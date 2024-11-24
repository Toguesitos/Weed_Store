package Objects;


public class cls_usuarios {
    
    //VARIABLES
    
    private String Tipo_Documento, Documento, Nombres,Apellidos,Sexo;
    private int Edad;
    //CONSTRUCTORES

    public cls_usuarios() {
        this.Tipo_Documento = "";
        this.Documento = "";
        this.Nombres = "";
        this.Apellidos = "";
        this.Sexo = "";
        this.Edad = 0;
    }
    

    public cls_usuarios(String Tipo_Documento, String Documento, String Nombres, String Apellidos, String Sexo, int Edad) {
        this.Tipo_Documento = Tipo_Documento;
        this.Documento = Documento;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Sexo = Sexo;
        this.Edad = Edad;
    }

    public String getTipo_Documento() {
        return Tipo_Documento;
    }

    public String getDocumento() {
        return Documento;
    }

    public String getNombres() {
        return Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getSexo() {
        return Sexo;
    }

    public int getEdad() {
        return Edad;
    }

    public void setTipo_Documento(String Tipo_Documento) {
        this.Tipo_Documento = Tipo_Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    
   
    
}
