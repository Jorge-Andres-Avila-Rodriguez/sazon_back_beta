package models.catalogo;

public class Marcas {

    private Long id;
    private String nombre;
    private String descripcion;
    private String paisOrigen;
    private String urlLogo;
    private Boolean activa;
    private Long idUsuarioCreador;
    public Marcas() {
    }
    public Marcas(Long id, String nombre, String descripcion, String paisOrigen, String urlLogo, Boolean activa,
            Long idUsuarioCreador) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.paisOrigen = paisOrigen;
        this.urlLogo = urlLogo;
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
    public String getPaisOrigen() {
        return paisOrigen;
    }
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    public String getUrlLogo() {
        return urlLogo;
    }
    public void setUrlLogo(String urlLogo) {
        this.urlLogo = urlLogo;
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
        return "Marcas [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", paisOrigen=" + paisOrigen
                + ", urlLogo=" + urlLogo + ", activa=" + activa + ", idUsuarioCreador=" + idUsuarioCreador + "]";
    } 

    
}


