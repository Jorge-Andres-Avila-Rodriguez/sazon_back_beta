package FelipeHincapié;

import java.time.LocalDateTime;

public class Valoracion {
    private Integer puntuacion;
    private LocalDateTime fecha;
    private Boolean recomendaria;
    private Long idReceta;
    private Long idUsuario;

    public Valoracion() {
    }
    
    public Valoracion(Integer puntuacion, LocalDateTime fecha, Boolean recomendaria, Long idReceta, Long idUsuario) {
        this.puntuacion = puntuacion;
        this.fecha = fecha;
        this.recomendaria = recomendaria;
        this.idReceta = idReceta;
        this.idUsuario = idUsuario;
    }
    public Integer getPuntuacion() {
        return puntuacion;
    }
    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion = puntuacion;
    }
    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    public Boolean getRecomendaria() {
        return recomendaria;
    }
    public void setRecomendaria(Boolean recomendaria) {
        this.recomendaria = recomendaria;
    }
    public Long getIdReceta() {
        return idReceta;
    }
    public void setIdReceta(Long idReceta) {
        this.idReceta = idReceta;
    }
    public Long getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "Valoracion [puntuacion=" + puntuacion + ", fecha=" + fecha + ", recomendaria=" + recomendaria
                + ", idReceta=" + idReceta + ", idUsuario=" + idUsuario + "]";
    }
    
}
