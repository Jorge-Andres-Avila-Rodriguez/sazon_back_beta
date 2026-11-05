package models.planificador;

import java.time.LocalDate;

public class Plan_Semanal {

    private Long id;
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Boolean activo;
    private Long idUsuario;
    public Plan_Semanal() {
    }
    public Plan_Semanal(Long id, String nombre, LocalDate fechaInicio, LocalDate fechaFin, Boolean activo,
            Long idUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.activo = activo;
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
    public Boolean getActivo() {
        return activo;
    }
    public void setActivo(Boolean activo) {
        this.activo = activo;        
    }
    public Long getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }
    @Override
    public String toString() {
        return "Plan_Semanal [id=" + id + ", nombre=" + nombre + ", fechaInicio=" + fechaInicio + ", fechaFin="
                + fechaFin + ", activo=" + activo + ", idUsuario=" + idUsuario + "]";
    }

    

}
