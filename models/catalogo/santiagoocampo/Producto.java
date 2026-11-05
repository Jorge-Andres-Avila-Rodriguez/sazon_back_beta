package santiagoocampo;

public class Producto {

    private Long id;
    private String nombre;
    private String descripcion;
    private Double precioReferencia;
    private Boolean activo;
    private Long idMarca;
    private Long idCategoria;

    
    public Producto() {
    }


    public Producto(Long id, String nombre, String descripcion, Double precioReferencia, Boolean activo, Long idMarca,
            Long idCategoria) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioReferencia = precioReferencia;
        this.activo = activo;
        this.idMarca = idMarca;
        this.idCategoria = idCategoria;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public Double getPrecioReferencia() {
        return precioReferencia;
    }


    public void setPrecioReferencia(Double precioReferencia) {
        this.precioReferencia = precioReferencia;
    }


    public Boolean getActivo() {
        return activo;
    }


    public void setActivo(Boolean activo) {
        this.activo = activo;
    }


    public Long getIdMarca() {
        return idMarca;
    }


    public void setIdMarca(Long idMarca) {
        this.idMarca = idMarca;
    }


    public Long getIdCategoria() {
        return idCategoria;
    }


    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }


    @Override
    public String toString() {
        return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precioReferencia="
                + precioReferencia + ", activo=" + activo + ", idMarca=" + idMarca + ", idCategoria=" + idCategoria
                + "]";
    }

    

}
