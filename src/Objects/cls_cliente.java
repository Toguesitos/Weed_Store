package Objects;

public class cls_cliente extends cls_usuarios {
 
    private long ID_cliente;
    private long Telefono;
    private String Direccion;

    public cls_cliente() {
        this.ID_cliente = 0;
        this.Telefono = 0;
        this.Direccion = "";
    }

    public cls_cliente( long ID_cliente,String Tipo_Documento, String Documento, String Nombres, String Apellidos,int Edad,long Telefono,
            String Sexo, String Direccion) {
        super(Tipo_Documento, Documento, Nombres, Apellidos, Sexo, Edad);
        this.ID_cliente = ID_cliente;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
    }

    public long getID_cliente() {
        return ID_cliente;
    }

    public long getTelefono() {
        return Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setID_cliente(long ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

    public void setTelefono(long Telefono) {
        this.Telefono = Telefono;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    
    }
