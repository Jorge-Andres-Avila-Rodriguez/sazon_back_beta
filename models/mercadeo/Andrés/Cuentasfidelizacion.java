import java.time.LocalDate;

public class Cuentasfidelizacion {

    
    private long id;
    private Integer puntosAcumulados;
    private String nivel;
    private LocalDate fechaAfiliciación;
    private Long idUsuario;
    public Cuentasfidelizacion() {
    }
    public Cuentasfidelizacion(long id, Integer puntosAcumulados, String nivel, LocalDate fechaAfiliciación,
            Long idUsuario) {
        this.id = id;
        this.puntosAcumulados = puntosAcumulados;
        this.nivel = nivel;
        this.fechaAfiliciación = fechaAfiliciación;
        this.idUsuario = idUsuario;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Integer getPuntosAcumulados() {
        return puntosAcumulados;
    }
    public void setPuntosAcumulados(Integer puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }
    public String getNivel() {
        return nivel;
    }
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    public LocalDate getFechaAfiliciación() {
        return fechaAfiliciación;
    }
    public void setFechaAfiliciación(LocalDate fechaAfiliciación) {
        this.fechaAfiliciación = fechaAfiliciación;
    }
    public Long getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cuentasfidelizacion{");
        sb.append("id=").append(id);
        sb.append(", puntosAcumulados=").append(puntosAcumulados);
        sb.append(", nivel=").append(nivel);
        sb.append(", fechaAfiliciaci\u00f3n=").append(fechaAfiliciación);
        sb.append(", idUsuario=").append(idUsuario);
        sb.append('}');
        return sb.toString();
    }


}
