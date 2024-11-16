public class objetos {
    private int codigo, precio, stock;
    private String descripcion, categoria;

    public objetos() {
    }

    public objetos(int codigo, int precio, int stock, String descripcion, String categoria) {
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
        this.descripcion = descripcion;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "objetos{" + "codigo=" + codigo + ", precio=" + precio + ", stock=" + stock + ", descripcion=" + descripcion + ", categoria=" + categoria + '}';
    }
    
    public void imprimir_producto(){
    }
    
    public void registrar_producto (){
    }
    public void eliminar_producto (){
        }

}   
    