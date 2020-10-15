/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cundi.ejerciciomvcwithmaven.modelo;

/**
 *
 * @author LENOVO
 */
public class Carro {
    private int modelo;
    private String tipo;
    private String placa;

    public Carro(int modelo, String tipo, String placa) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.placa = placa;
    }

    public Carro() {
    }

    

    /**
     * @return the modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return  "\nmodelo: " + modelo + "\n tipo: "+ tipo + "\nplaca: " + placa;
    }
}
