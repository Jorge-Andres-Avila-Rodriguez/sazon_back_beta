public class categoria {
    
    private Long id;
    private String nombre;
    private String descripcion;
    private String urlIcono;
    private Boolean activa;
    private Long idUsuarioCreador;
    public categoria() {
    }
    public categoria(Long id, String nombre, String descripcion, String urlIcono, Boolean activa,
            Long idUsuarioCreador) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.urlIcono = urlIcono;
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
    public String getUrlIcono() {
        return urlIcono;
    }
    public void setUrlIcono(String urlIcono) {
        this.urlIcono = urlIcono;
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
        return "categoria [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", urlIcono=" + urlIcono
                + ", activa=" + activa + ", idUsuarioCreador=" + idUsuarioCreador + "]";
    }


}
