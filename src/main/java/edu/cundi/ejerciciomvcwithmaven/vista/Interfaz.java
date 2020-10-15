/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cundi.ejerciciomvcwithmaven.vista;

import edu.cundi.ejerciciomvcwithmaven.modelo.Carro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.*;

/**
 *
 * @author LENOVO
 */
public class Interfaz extends JFrame implements ActionListener {
    /*variables utilizadas*/
    ArrayList<Carro> vehiculo = new ArrayList<Carro>();
    public JTextField placa, modelo, tipo;
    public JButton insertar, ordenar, mostrar, salir;
    JLabel titulo, titulo1, titulo2, titulo3, titulo4;
    Carro car = new Carro();
/*programacion de la interfaz*/
    public Interfaz() {
       /*vista del programa*/
        titulo = new JLabel("Andy Helper");
        titulo.setBounds(100, 5, 100, 40);
        titulo1 = new JLabel("Placa :");
        titulo1.setBounds(20, 50, 100, 30);
        titulo2 = new JLabel("Modelo :");
        titulo2.setBounds(20, 80, 100, 30);
        titulo3 = new JLabel("Tipo :");
        titulo3.setBounds(20, 110, 100, 30);
        placa = new JTextField(10);
        placa.setBounds(100, 50, 100, 30);
        modelo = new JTextField(10);
        modelo.setBounds(100, 80, 200, 30);
        tipo = new JTextField(10);
        tipo.setBounds(100, 110, 100, 30);
        insertar = new JButton("Insertar");
        insertar.setBounds(100, 180, 100, 30);
        ordenar = new JButton("ordenar");
        ordenar.setBounds(100, 220, 100, 30);
        mostrar = new JButton("Mostrar");
        mostrar.setBounds(100, 300, 100, 30);
        salir = new JButton("salir");
        salir.setBounds(100, 340, 100, 30);

        titulo4 = new JLabel("Andy Brown (^.^)");
        titulo4.setBounds(100, 390, 100, 30);
        setLayout(null);
        setBounds(100, 400, 350, 500);
        ordenar.addActionListener(this);
        insertar.addActionListener(this);
        salir.addActionListener(this);
        mostrar.addActionListener(this);
        add(titulo);
        add(titulo1);
        add(placa);
        add(titulo2);
        add(modelo);
        add(titulo3);
        add(tipo);
        add(insertar);
        add(ordenar);
        add(mostrar);
        add(salir);
        add(titulo4);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
/*metodos para el programa
    insertar
    mostrar
    ordenar
    salir
    */
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == insertar) {
            vehiculo.add(new Carro(modelo.getText(), tipo.getText(), placa.getText()));
            JOptionPane.showMessageDialog(null, "Se ha agregado el vehiculo satisfactoriamente.");
            limpiar();
        }

        if (e.getSource() == ordenar) {
            Collections.sort(vehiculo);
            JOptionPane.showMessageDialog(null, "Se ha organizado satisfactoriamente.");
        }

        if (e.getSource() == mostrar) {
            String listaCompleta = "";
            // recorrido con while y un iterator.

            //recorrido con forEach
            for (Carro listaDeVehiculo : vehiculo) {
                listaCompleta += "\n" + listaDeVehiculo.toString();
            }
            JOptionPane.showMessageDialog(null, "-----LISTA DE VEHICULOS-----" + listaCompleta);

        }
        if (e.getSource() == salir) {
            System.exit(0);
        }

    }
/*metodo para limpiar las casillas*/
    private void limpiar() {
        placa.setText("");
        modelo.setText("");
        tipo.setText("");
    }

}
