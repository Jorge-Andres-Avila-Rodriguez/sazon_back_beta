package models.despensa.hernan;

import java.time.LocalDate;

public class Despensa {
    private Long id;
    private String nombre;
    private String descripcion;
    private LocalDate fechaCreacion;
    private Boolean activa;
    private Long idUsuario;

    public Despensa() {
    }

    public Despensa(Long id, String nombre, String descripcion, LocalDate fechaCreacion, Boolean activa,
            Long idUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.activa = activa;
        this.idUsuario = idUsuario;
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

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Boolean getActiva() {
        return activa;
    }

    public void setActiva(Boolean activa) {
        this.activa = activa;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "Despensa [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fechaCreacion="
                + fechaCreacion + ", activa=" + activa + ", idUsuario=" + idUsuario + "]";
    }
}
