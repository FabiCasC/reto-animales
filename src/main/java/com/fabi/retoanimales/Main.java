/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fabi.retoanimales;

/**
 *
 * @author fabia
 */
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Lista de animales que se va a llenar a partir de los argumentos
        List<Animal> animales = new ArrayList<>();

        // Se procesa cada argumento de la línea de comandos
        for (String arg : args) {
            String[] datos = arg.split("\\|");

            // Se verifica si el argumento tiene la forma correcta
            if (datos.length == 3) {
                String nombre = datos[0];
                String tipo = datos[1].toUpperCase();
                String onomatopeya = datos[2];

                // Se agrega el animal correspondiente a la lista, dependiendo del tipo
                switch (tipo) {
                    case "TERRESTRE" -> animales.add(new Terrestre(nombre, onomatopeya));
                    case "VOLADOR" -> animales.add(new Volador(nombre, onomatopeya));
                    case "ACUATICO" -> animales.add(new Acuatico(nombre, onomatopeya));
                    default -> System.out.println("Tipo de animal no válido: " + tipo);
                }
            } else {
                System.out.println("Formato incorrecto para el argumento: " + arg);
            }
        }

        // Se agrupa los animales por tipo
        Map<TipoAnimal, List<Animal>> agrupados = animales.stream()
                .collect(Collectors.groupingBy(Animal::getTipo));

        // Se muestra los animales agrupados por tipo
        agrupados.forEach((tipo, lista) -> {
            System.out.println("\nAnimales " + tipo + ":");
            lista.forEach(System.out::println); 
        });
    }
}
