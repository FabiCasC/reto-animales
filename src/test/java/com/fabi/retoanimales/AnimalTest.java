package com.fabi.retoanimales;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author fabia
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalTest {
    
    @Test
    public void testCrearAnimal() {
        // Crear un animal de tipo Terrestre
        Terrestre perro = new Terrestre("Perro", "Guau");
        
        // Verificar los valores
        assertEquals("Perro", perro.getNombre());  // Usamos el getter
        assertEquals("Guau", perro.getOnomatopeya());  // Usamos el getter
        assertEquals(TipoAnimal.TERRESTRE, perro.getTipo());  // Comprobamos que el tipo es TERRESTRE
    }
}
