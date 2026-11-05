package models.nutricion;

import java.time.LocalDate;

public class RestricciónPerfil {
    private Long id;
    private String tipo;
    private String observación;
    private LocalDate fechaRegistro;
    private Long idAlérgeno;
    private Long idPerfilAlimentario;
    public RestricciónPerfil() {
    }
    public RestricciónPerfil(Long id, String tipo, String observación, LocalDate fechaRegistro, Long idAlérgeno,
            Long idPerfilAlimentario) {
        this.id = id;
        this.tipo = tipo;
        this.observación = observación;
        this.fechaRegistro = fechaRegistro;
        this.idAlérgeno = idAlérgeno;
        this.idPerfilAlimentario = idPerfilAlimentario;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getObservación() {
        return observación;
    }
    public void setObservación(String observación) {
        this.observación = observación;
    }
    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public Long getIdAlérgeno() {
        return idAlérgeno;
    }
    public void setIdAlérgeno(Long idAlérgeno) {
        this.idAlérgeno = idAlérgeno;
    }
    public Long getIdPerfilAlimentario() {
        return idPerfilAlimentario;
    }
    public void setIdPerfilAlimentario(Long idPerfilAlimentario) {
        this.idPerfilAlimentario = idPerfilAlimentario;
    }
    @Override
    public String toString() {
        return "RestricciónPerfil [id=" + id + ", tipo=" + tipo + ", observación=" + observación + ", fechaRegistro="
                + fechaRegistro + ", idAlérgeno=" + idAlérgeno + ", idPerfilAlimentario=" + idPerfilAlimentario + "]";
    }
    
}
