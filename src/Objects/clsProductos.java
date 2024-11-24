package Objects;

public class clsProductos {
    
    // Variable
    
    private long IDProd;
    private String NombreProd;
    private String DescripProd;
    private int CantidadProd;
    private String CategoriaProd;
    private double PrecioCompra;
    private double PrecioVenta;
    
    // Constructor 

    public clsProductos() {
        this.IDProd = 0;
        this.NombreProd = "";
        this.DescripProd = "";
        this.CantidadProd = 0;
        this.CategoriaProd = "";
        this.PrecioCompra = 0;
        this.PrecioVenta = 0;
    }

    public clsProductos(long IDProd, String NombreProd, String DescripProd, int CantidadProd, String CategoriaProd, double PrecioCompra, double PrecioVenta) {
        this.IDProd = IDProd;
        this.NombreProd = NombreProd;
        this.DescripProd = DescripProd;
        this.CantidadProd = CantidadProd;
        this.CategoriaProd = CategoriaProd;
        this.PrecioCompra = PrecioCompra;
        this.PrecioVenta = PrecioVenta;
    }

    public long getIDProd() {
        return IDProd;
    }

    public String getNombreProd() {
        return NombreProd;
    }

    public String getDescripProd() {
        return DescripProd;
    }

    public int getCantidadProd() {
        return CantidadProd;
    }

    public String getCategoriaProd() {
        return CategoriaProd;
    }

    public double getPrecioCompra() {
        return PrecioCompra;
    }

    public double getPrecioVenta() {
        return PrecioVenta;
    }

    public void setIDProd(long IDProd) {
        this.IDProd = IDProd;
    }

    public void setNombreProd(String NombreProd) {
        this.NombreProd = NombreProd;
    }

    public void setDescripProd(String DescripProd) {
        this.DescripProd = DescripProd;
    }

    public void setCantidadProd(int CantidadProd) {
        this.CantidadProd = CantidadProd;
    }

    public void setCategoriaProd(String CategoriaProd) {
        this.CategoriaProd = CategoriaProd;
    }

    public void setPrecioCompra(double PrecioCompra) {
        this.PrecioCompra = PrecioCompra;
    }

    public void setPrecioVenta(double PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }


}
