package com.sazon.recetario;

import com.sazon.recetario.model.PasoReceta;

public class MainPrueba {
    public static void main(String[] args) {
        System.out.println("Clase MainPrueba ejecutada");

        //Objeto con constructor vacío

        PasoReceta pasoUno = new PasoReceta();
        pasoUno.setId(2L);
        pasoUno.setNumeroPaso(1); 
        pasoUno.setInstruccion("Precalentar el horno a 180 grados Celsius.");
        pasoUno.setDuracionMin(10);
        pasoUno.setIdReceta(1L);

        // objeto con constructor con parámetros
        PasoReceta pasoDos = new PasoReceta (3L, 2, "Mezclar los ingredientes secos en un bol grande.", 5, 1L);


        System.out.println("Pasos de la receta:");
        System.out.println("- " + pasoUno.toString());
        System.out.println("- " + pasoDos.toString());
        
    }
}
