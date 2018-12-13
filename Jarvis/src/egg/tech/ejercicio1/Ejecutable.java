/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.tech.ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Ejecutable {

    public static void main(String[] args) {
        Año a = new Año();

        String texto = JOptionPane.showInputDialog("Ingrese el año");
        Integer year = new Integer(texto);

        a.añobis(year);

    }

}
