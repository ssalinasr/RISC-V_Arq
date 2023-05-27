/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import interfaces.IRegistro;

/**
 *
 * @author sebas
 */
public class Registro implements IRegistro {

    private int valor;

    public Registro() {
        this.valor = 0;
    }

    @Override
    // Reemplaza el valor actual almacenado en el registro con newVal	 
    public void setValor(byte newVal) {
        this.valor = newVal;
    }

    @Override
    // Devuelve el valor almacenado actualmente en el registro, como un byte
    public int getValor() {
        return this.valor;
    }

    @Override
    // Borra el contenido del registro.
    public void clear() {
        this.valor = 0;
    }

}
