package models.nutricion;

public class InformacionNutricional {
    private Long id;
    private Double calorias;
    private Double proteinasG;
    private Double carbohidratosG;
    private Double grasasG;
    private Double sodioMg;
    private Long idProducto;

    public InformacionNutricional() {
    }

    public InformacionNutricional(Long id, Double calorias, Double proteinasG, Double carbohidratosG, Double grasasG,
            Double sodioMg, Long idProducto) {
        this.id = id;
        this.calorias = calorias;
        this.proteinasG = proteinasG;
        this.carbohidratosG = carbohidratosG;
        this.grasasG = grasasG;
        this.sodioMg = sodioMg;
        this.idProducto = idProducto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getCalorias() {
        return calorias;
    }

    public void setCalorias(Double calorias) {
        this.calorias = calorias;
    }

    public Double getProteinasG() {
        return proteinasG;
    }

    public void setProteinasG(Double proteinasG) {
        this.proteinasG = proteinasG;
    }

    public Double getCarbohidratosG() {
        return carbohidratosG;
    }

    public void setCarbohidratosG(Double carbohidratosG) {
        this.carbohidratosG = carbohidratosG;
    }

    public Double getGrasasG() {
        return grasasG;
    }

    public void setGrasasG(Double grasasG) {
        this.grasasG = grasasG;
    }

    public Double getSodioMg() {
        return sodioMg;
    }

    public void setSodioMg(Double sodioMg) {
        this.sodioMg = sodioMg;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public String toString() {
        return "InformacionNutricional [id=" + id + ", calorias=" + calorias + ", proteinasG=" + proteinasG
                + ", carbohidratosG=" + carbohidratosG + ", grasasG=" + grasasG + ", sodioMg=" + sodioMg
                + ", idProducto=" + idProducto + "]";
    }
    
}
