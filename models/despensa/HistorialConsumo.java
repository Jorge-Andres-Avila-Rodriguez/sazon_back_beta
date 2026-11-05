package models.despensa;

import java.time.LocalDate;

public class HistorialConsumo {

    private Long id;
    private Double cantidadConsumida;
    private LocalDate fechaConsumo;
    private String observacion;
    private Long itemDespensa;


    public HistorialConsumo(Long id, Double cantidadConsumida, LocalDate fechaConsumo, String observacion,
            Long itemDespensa) {
        this.id = id;
        this.cantidadConsumida = cantidadConsumida;
        this.fechaConsumo = fechaConsumo;
        this.observacion = observacion;
        this.itemDespensa = itemDespensa;
    }

    public HistorialConsumo() {
    }

    @Override
    public String toString() {
        return "HistorialConsumo [id=" + id + ", cantidadConsumida=" + cantidadConsumida + ", fechaConsumo="
                + fechaConsumo + ", observacion=" + observacion + ", itemDespensa=" + itemDespensa + "]";
    }

    
    
}