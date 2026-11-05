import java.time.LocalDateTime;

public class Favorito {
    private Long id;
    private LocalDateTime fechaAgregado;
    private String nota;
    private Long idReceta;
    private Long idUsuario;
   
    public Favorito() {
    }

    public Favorito(Long id, LocalDateTime fechaAgregado, String nota, Long idReceta, Long idUsuario) {
        this.id = id;
        this.fechaAgregado = fechaAgregado;
        this.nota = nota;
        this.idReceta = idReceta;
        this.idUsuario = idUsuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getFechaAgregado() {
        return fechaAgregado;
    }

    public void setFechaAgregado(LocalDateTime fechaAgregado) {
        this.fechaAgregado = fechaAgregado;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
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
        return "Favorito [id=" + id + ", fechaAgregado=" + fechaAgregado + ", nota=" + nota + ", idReceta=" + idReceta
                + ", idUsuario=" + idUsuario + "]";
    }

    

    

    
    
}
