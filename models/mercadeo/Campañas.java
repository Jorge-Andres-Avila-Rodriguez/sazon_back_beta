import java.time.LocalDate;

public class Campañas {

    
    private Long id;
    private String nombre;
    private String descripción;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Boolean activa;
    private Long idUsuarioCreador;

    public Campañas() {
    }

    public Campañas(Long id, String nombre, String descripción, LocalDate fechaInicio, LocalDate fechaFin,
            Boolean activa, Long idUsuarioCreador) {
        this.id = id;
        this.nombre = nombre;
        this.descripción = descripción;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
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

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
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
        return "Campañas [id=" + id + ", nombre=" + nombre + ", descripción=" + descripción + ", fechaInicio="
                + fechaInicio + ", fechaFin=" + fechaFin + ", activa=" + activa + ", idUsuarioCreador="
                + idUsuarioCreador + "]";
    }

}
