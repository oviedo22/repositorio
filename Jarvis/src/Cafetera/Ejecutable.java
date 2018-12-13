/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cafetera;

import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Ejecutable {

    public static void main(String[] args) {

        Cafetera nespresso = new Cafetera(1000, 0);
        System.out.println("Cafetera vacia");

//     String texto = JOptionPane.showInputDialog("¿Llenar Cafetera?");
//     if (texto.equalsIgnoreCase("SI")){
//     String text = JOptionPane.showInputDialog("Cuanto desea de cafe?");
//     Integer cant = new Integer(text);
//     do{
//         System.out.println("Capacidad Maxima superada, ingrese capacidad menor o igual a 1000 cc ");
//     }while (cant>1000);
//     }
        boolean boton = true;
        int actual;
        while (boton == true) {
            String[] acciones = {
                "Llenar Cafetera",
                "Servir Taza",
                "Vaciar Cafetera",
                "Agregar Cafe",
                "Salir",};
            MyIcon icon = new MyIcon();
            String resp = (String) JOptionPane.showInputDialog(null, "Que accion desea realizar?", "Accion", JOptionPane.DEFAULT_OPTION, icon, acciones, acciones[0]);

            switch (resp) {

                case "Llenar Cafetera":
                    String[] opciones = {"Si", "No"};
                    int text = JOptionPane.showOptionDialog(null, "Desea Llenar la Cafetera?", "Opcion", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon, opciones, opciones[0]);
                    switch (text) {
                        case 0:
                            nespresso.llenarCafetera(1000);
                            break;
                        case 1:
                            break;
                    }
                    break;

                case "Servir Taza":

                    String[] options = {"Cafe", "Cortado", "Latte"};
                    int seleccion = JOptionPane.showOptionDialog(null, "Que desea servirse?", "Servir Taza", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);
                    switch (seleccion) {
                        case 0:
                            actual = nespresso.getCapacidadActual();
                            if (actual > 0) {
                                nespresso.servirTaza(50);
                                break;
                            } else {
                                System.out.println("Cafetera Vacia");
                                break;
                            }
                        case 1:
                            actual = nespresso.getCapacidadActual();
                            if (actual > 0) {
                                nespresso.servirTaza(40);
                                System.out.println("Agregando Lechita");
                                nespresso.servirTaza(10);
                                break;
                            } else {
                                System.out.println("Cafetera Vacia");
                                break;
                            }

                        case 2:
                            actual = nespresso.getCapacidadActual();
                            if (actual > 0) {
                                nespresso.servirTaza(20);
                                System.out.println("Agregando Lechita");
                                nespresso.servirTaza(30);
                                break;
                            } else {
                                System.out.println("Cafetera Vacia");
                                break;
                            }
                    }
                    break;
                case "Vaciar Cafetera":
                    actual = nespresso.getCapacidadActual();
                    System.out.println("Vaciando");
                    nespresso.servirTaza(actual);
                    break;
                case "Agregar Cafe":
                    String texttres = JOptionPane.showInputDialog("Desea agregar cafe");
                    Integer cantres = new Integer(texttres);
                    nespresso.agregarCafe(cantres);
                    break;
                case "Salir":
                    boton = false;
                    break;

            }

        }

    }
}
