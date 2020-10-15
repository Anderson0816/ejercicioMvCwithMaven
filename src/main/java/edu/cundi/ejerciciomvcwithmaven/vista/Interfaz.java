/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cundi.ejerciciomvcwithmaven.vista;

import edu.cundi.ejerciciomvcwithmaven.modelo.Carro;
import java.util.ArrayList;
import javax.swing.*;


/**
 *
 * @author LENOVO
 */
public class Interfaz {
     ArrayList<Carro> vehiculo = new  ArrayList<Carro>();
    public JTextField placa,modelo,tipo;
    public JButton insertar ,modificar , eliminar, mostrar,salir;
    JLabel titulo ,titulo1,titulo2,titulo3,titulo4;
    Carro car = new Carro();
}
