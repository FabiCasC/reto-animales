/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fabi.retoanimales;

/**
 *
 * @author fabia
 */

public abstract class Animal {
    private String nombre;
    private String onomatopeya;

    public Animal(String nombre, String onomatopeya) {
        this.nombre = nombre;
        this.onomatopeya = onomatopeya;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOnomatopeya() {
        return onomatopeya;
    }

    public abstract TipoAnimal getTipo();

    @Override
    public String toString() {
        return nombre + " hace " + onomatopeya;
    }
}

