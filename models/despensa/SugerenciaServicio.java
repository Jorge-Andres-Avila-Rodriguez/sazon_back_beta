package models.despensa;

import java.time.LocalDateTime;

public class SugerenciaServicio {

    private Long id;
    private LocalDateTime fechaGeneracion;
    private Double porcentajeCoincidencia;
    private Boolean aceptada;
    private Long idReceta;
    private Long idDespensa;

    
    public SugerenciaServicio() {
    }


    public SugerenciaServicio(Long id, LocalDateTime fechaGeneracion, Double porcentajeCoincidencia, Boolean aceptada,
            Long idReceta, Long idDespensa) {
        this.id = id;
        this.fechaGeneracion = fechaGeneracion;
        this.porcentajeCoincidencia = porcentajeCoincidencia;
        this.aceptada = aceptada;
        this.idReceta = idReceta;
        this.idDespensa = idDespensa;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public LocalDateTime getFechaGeneracion() {
        return fechaGeneracion;
    }


    public void setFechaGeneracion(LocalDateTime fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }


    public Double getPorcentajeCoincidencia() {
        return porcentajeCoincidencia;
    }


    public void setPorcentajeCoincidencia(Double porcentajeCoincidencia) {
        this.porcentajeCoincidencia = porcentajeCoincidencia;
    }


    public Boolean getAceptada() {
        return aceptada;
    }


    public void setAceptada(Boolean aceptada) {
        this.aceptada = aceptada;
    }


    public Long getIdReceta() {
        return idReceta;
    }


    public void setIdReceta(Long idReceta) {
        this.idReceta = idReceta;
    }


    public Long getIdDespensa() {
        return idDespensa;
    }


    public void setIdDespensa(Long idDespensa) {
        this.idDespensa = idDespensa;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SugerenciaServicio{");
        sb.append("id=").append(id);
        sb.append(", fechaGeneracion=").append(fechaGeneracion);
        sb.append(", porcentajeCoincidencia=").append(porcentajeCoincidencia);
        sb.append(", aceptada=").append(aceptada);
        sb.append(", idReceta=").append(idReceta);
        sb.append(", idDespensa=").append(idDespensa);
        sb.append('}');
        return sb.toString();

        
    }

    
}
