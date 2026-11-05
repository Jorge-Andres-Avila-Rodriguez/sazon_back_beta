package com.sazon.recetario.modelo;

import java.time.LocalDate;

/**
 * Criterios de Aceptación:
 * 1. Existe src/main/java/com/sazon/recetario/modelo/fotoreceta.java
 * 2. El proyecto compila sin errores
 * 3. Atributos privados: id, nombre, fechaCreacion, presupuesto, completada, idPlanSemanal
 */
public class fotoReceta {

    private Long id;
    private String nombre;
    private LocalDate fechaCreacion;
    private Double presupuesto;
    private Boolean completada;
    private Long idPlanSemanal;

    public fotoReceta() {
    }

    public fotoReceta(Long id, String nombre, LocalDate fechaCreacion, Double presupuesto, Boolean completada, Long idPlanSemanal) {
        this.id = id;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.presupuesto = presupuesto;
        this.completada = completada;
        this.idPlanSemanal = idPlanSemanal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Boolean getCompletada() {
        return completada;
    }

    public void setCompletada(Boolean completada) {
        this.completada = completada;
    }

    public Long getIdPlanSemanal() {
        return idPlanSemanal;
    }

    public void setIdPlanSemanal(Long idPlanSemanal) {
        this.idPlanSemanal = idPlanSemanal;
    }

    @Override
    public String toString() {
        return "ListaMercado [id=" + id + ", nombre=" + nombre + ", fechaCreacion=" + fechaCreacion + ", presupuesto="
                + presupuesto + ", completada=" + completada + ", idPlanSemanal=" + idPlanSemanal + "]";
    }
}