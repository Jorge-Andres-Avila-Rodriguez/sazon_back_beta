package models.nutricion;

public class Alerjeno {
    private long id;
    private String nombre;
    private String descripcion;
    private String nivelRiego;
    private boolean activo;
    private long idUsuarioCreador;

    public Alerjeno() {
    }

    public Alerjeno(long id, String nombre, String descripcion, String nivelRiego, boolean activo,
            long idUsuarioCreador) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nivelRiego = nivelRiego;
        this.activo = activo;
        this.idUsuarioCreador = idUsuarioCreador;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getNivelRiego() {
        return nivelRiego;
    }

    public void setNivelRiego(String nivelRiego) {
        this.nivelRiego = nivelRiego;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public long getIdUsuarioCreador() {
        return idUsuarioCreador;
    }

    public void setIdUsuarioCreador(long idUsuarioCreador) {
        this.idUsuarioCreador = idUsuarioCreador;
    }

    @Override
    public String toString() {
        return "Alerjeno [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", nivelRiego="
                + nivelRiego + ", activo=" + activo + ", idUsuarioCreador=" + idUsuarioCreador + "]";
    }
    
}
