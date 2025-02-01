/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fabi.retoanimales;

/**
 *
 * @author fabia
 */
public class Acuatico extends Animal {
    public Acuatico(String nombre, String onomatopeya) {
        super(nombre, onomatopeya);
    }

    @Override
    public TipoAnimal getTipo() {
        return TipoAnimal.ACUATICO;
    }
}
