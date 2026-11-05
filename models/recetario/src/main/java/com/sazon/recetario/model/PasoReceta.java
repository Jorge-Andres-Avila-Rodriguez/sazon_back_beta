package com.sazon.recetario.model;

public class PasoReceta {

private Long id;
private Integer numeroPaso;
private String instruccion;
private Integer duracionMin;
private Long idReceta; // id se obtiene de la tabla receta, es una llave foránea

public PasoReceta() {}

public PasoReceta(Long id, Integer numeroPaso, String instruccion, Integer duracionMin, Long idReceta) {
    this.id = id;
    this.numeroPaso = numeroPaso;
    this.instruccion = instruccion;
    this.duracionMin = duracionMin;
    this.idReceta = idReceta;
}

public Long getId() { return id;}

public void setId(Long id) {this.id = id;}

public Integer getNumeroPaso() { return numeroPaso;}

public void setNumeroPaso(Integer numeroPaso) { this.numeroPaso = numeroPaso;}

public String getInstruccion() { return instruccion;}

public void setInstruccion(String instruccion) {this.instruccion = instruccion;}

public Integer getDuracionMin() { return duracionMin;}

public void setDuracionMin(Integer duracionMin) { this.duracionMin = duracionMin;}

public Long getIdReceta() { return idReceta;}

public void setIdReceta(Long idReceta) {this.idReceta = idReceta;}

public String toString(){
    return "PasoReceta id= " + id + ", numeroPaso= " + numeroPaso + ", instruccion= " + instruccion + ", duracionMin= "
            + duracionMin + ", idReceta= " + idReceta ;
}

}
