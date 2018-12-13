/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cafetera;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Cafetera {

    private int capacidadMaxima;
    private int capacidadActual;
  

    Cafetera(int x, int z) {
        capacidadMaxima = x;
        capacidadActual = z;

    }

    public void llenarCafetera(int cantidad) {
        System.out.println("Llenando");
        try {
            setCapacidadActual(cantidad);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        if (cantidad == 1000) {
            System.out.println("Cafetera llena");

        } else {
            System.out.println("Cafetera llena a la capacidad de " + cantidad + "cc");
        }
    }

    public void servirTaza(int cantidad) {
       
        System.out.println("Llenando Taza");
        if (capacidadActual == 0) {
            System.out.println("Cafetera Vacia,Recargue");
        } else 
            if (cantidad >= capacidadActual) {
          
            capacidadActual = 0;
            System.out.println("Llenando Taza");
            System.out.println("Ready");
            System.out.println("Cafetera Vacia");
        } else {
            capacidadActual = capacidadActual - cantidad;
            System.out.println("Ready");
            System.out.println("Cafetera llena a la capacidad de " + capacidadActual + " cc");
        }

    }

    public void agregarCafe(int cantidad) {
        System.out.println("Agregando Cafe");
        try {
            setCapacidadActual(cantidad);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        if (cantidad == 1000) {
            System.out.println("Cafetera llena");

        } else {
            System.out.println("Cafetera llena a la capacidad de " + cantidad + "cc");
        }
        
    }

    public void setCapacidadActual(int ca) throws Exception {
        if (capacidadActual == 1000) {
            throw new Exception("La cafetera se encuentra llena");
        }
        if (ca < 0 || ca > 1000) {
            throw new Exception("Ingrese Capacidad Valida");
        }
        this.capacidadActual = ca;

    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

}
