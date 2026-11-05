package models.despensa;

import java.time.LocalDate;

public class AlertaVencimiento {

    private Long id;
    private String mensaje;
    private LocalDate fechaAlerta;
    private Integer diasRestantes;
    private Boolean leida;
    private Long idItemDespensa;

    public AlertaVencimiento() {
    }

    public AlertaVencimiento(Long id, String mensaje, LocalDate fechaAlerta, Integer diasRestantes, Boolean leida,
            Long idItemDespensa) {
        this.id = id;
        this.mensaje = mensaje;
        this.fechaAlerta = fechaAlerta;
        this.diasRestantes = diasRestantes;
        this.leida = leida;
        this.idItemDespensa = idItemDespensa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public LocalDate getFechaAlerta() {
        return fechaAlerta;
    }

    public void setFechaAlerta(LocalDate fechaAlerta) {
        this.fechaAlerta = fechaAlerta;
    }

    public Integer getDiasRestantes() {
        return diasRestantes;
    }

    public void setDiasRestantes(Integer diasRestantes) {
        this.diasRestantes = diasRestantes;
    }

    public Boolean getLeida() {
        return leida;
    }

    public void setLeida(Boolean leida) {
        this.leida = leida;
    }

    public Long getIdItemDespensa() {
        return idItemDespensa;
    }

    public void setIdItemDespensa(Long idItemDespensa) {
        this.idItemDespensa = idItemDespensa;
    }

    @Override
    public String toString() {
        return "AlertaVencimiento [id=" + id + ", mensaje=" + mensaje + ", fechaAlerta=" + fechaAlerta
                + ", diasRestantes=" + diasRestantes + ", leida=" + leida + ", idItemDespensa=" + idItemDespensa + "]";
    }
    
    

}
