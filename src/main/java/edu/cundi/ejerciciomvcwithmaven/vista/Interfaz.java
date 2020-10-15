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
import javax.swing.*;

/**
 *
 * @author LENOVO
 */
public class Interfaz extends JFrame implements ActionListener {

    ArrayList<Carro> vehiculo = new ArrayList<Carro>();
    public JTextField placa, modelo, tipo;
    public JButton insertar, modificar, eliminar, mostrar, salir;
    JLabel titulo, titulo1, titulo2, titulo3, titulo4;
    Carro car = new Carro();

    public Interfaz() {

        titulo = new JLabel("Andy Helper");
        titulo.setBounds(100, 5, 100, 40);
        titulo1 = new JLabel("Cedula :");
        titulo1.setBounds(20, 50, 100, 30);
        titulo2 = new JLabel("Descripcion :");
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
        modificar = new JButton("Modificar");
        modificar.setBounds(100, 220, 100, 30);
        eliminar = new JButton("Eliminar");
        eliminar.setBounds(100, 260, 100, 30);
        mostrar = new JButton("Mostrar");
        mostrar.setBounds(100, 300, 100, 30);
        salir = new JButton("salir");
        salir.setBounds(100, 340, 100, 30);

        titulo4 = new JLabel("Andy Brown (^.^)");
        titulo4.setBounds(100, 390, 100, 30);
        setLayout(null);
        setBounds(100, 400, 350, 500);
        modificar.addActionListener(this);
        eliminar.addActionListener(this);
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
        add(modificar);
        add(eliminar);
        add(mostrar);
        add(salir);
        add(titulo4);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        String compararBoton = ae.getActionCommand();
        if (compararBoton.equalsIgnoreCase("Insertar")) {

        }
        if (compararBoton.equalsIgnoreCase("Modificar")) {

        }
        if (compararBoton.equalsIgnoreCase("Eliminar")) {

        }
        if (compararBoton.equalsIgnoreCase("Mostrar")) {

        }
        if (compararBoton.equalsIgnoreCase("Salir")) {
           System.exit(0);
        }

    }

}
