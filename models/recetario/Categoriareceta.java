public class Categoriareceta {

    private Long id;
    private String nombre;
    private String descripcion;
    private Boolean activa;
    private Long idUsuarioCreador;

    
    public Categoriareceta() {
    }


    public Categoriareceta(Long id, String nombre, String descripcion, Boolean activa, Long idUsuarioCreador) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.activa = activa;
        this.idUsuarioCreador = idUsuarioCreador;
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


    public Boolean getActiva() {
        return activa;
    }


    public void setActiva(Boolean activa) {
        this.activa = activa;
    }


    public Long getIdUsuarioCreador() {
        return idUsuarioCreador;
    }


    public void setIdUsuarioCreador(Long idUsuarioCreador) {
        this.idUsuarioCreador = idUsuarioCreador;
    }


    @Override
    public String toString() {
        return "Categoriareceta [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", activa="
                + activa + ", idUsuarioCreador=" + idUsuarioCreador + "]";
    }

    

}
