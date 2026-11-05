```java
package models.nutricion;

public abstract class RestriccionesPerfil {

    private Long id;
    private double calorias;
    private double proteinas;
    private double carbohidratos;
    private double grasas;
    private double azucares;
    private double sodio;

    public RestriccionesPerfil() {
    }

    public RestriccionesPerfil(Long id, double calorias, double proteinas,
            double carbohidratos, double grasas, double azucares, double sodio) {
        this.id = id;
        this.calorias = calorias;
        this.proteinas = proteinas;
        this.carbohidratos = carbohidratos;
        this.grasas = grasas;
        this.azucares = azucares;
        this.sodio = sodio;
    }

    // Cada tipo de perfil implementa su propia validación nutricional.
    public abstract boolean cumpleRestricciones(
            double calorias,
            double proteinas,
            double carbohidratos,
            double grasas,
            double azucares,
            double sodio
    );

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getProteinas() {
        return proteinas;
    }

    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }

    public double getCarbohidratos() {
        return carbohidratos;
    }

    public void setCarbohidratos(double carbohidratos) {
        this.carbohidratos = carbohidratos;
    }

    public double getGrasas() {
        return grasas;
    }

    public void setGrasas(double grasas) {
        this.grasas = grasas;
    }

    public double getAzucares() {
        return azucares;
    }

    public void setAzucares(double azucares) {
        this.azucares = azucares;
    }

    public double getSodio() {
        return sodio;
    }

    public void setSodio(double sodio) {
        this.sodio = sodio;
    }
}
```