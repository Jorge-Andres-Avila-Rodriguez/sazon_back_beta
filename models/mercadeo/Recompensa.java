public class Recompensa {

private long id;
private String nombre;
private String descripcion;
private Integer puntosRequeridos;
private Integer stock;
private long idCampaña;

public Recompensa() {
}

public Recompensa(long id, String nombre, String descripcion, Integer puntosRequeridos, Integer stock, long idCampaña) {
    this.id = id;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.puntosRequeridos = puntosRequeridos;
    this.stock = stock;
    this.idCampaña = idCampaña;
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

    public Integer getPuntosRequeridos() {
        return puntosRequeridos;
    }

    public void setPuntosRequeridos(Integer puntosRequeridos) {
        this.puntosRequeridos = puntosRequeridos;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public long getIdCampaña() {
        return idCampaña;
    }

    public void setIdCampaña(long idCampaña) {
        this.idCampaña = idCampaña;
    }



}
