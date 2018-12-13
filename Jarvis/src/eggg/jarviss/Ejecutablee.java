/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggg.jarviss;

import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Ejecutablee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Armadura a = new Armadura();

        while (true) {
            String texto = JOptionPane.showInputDialog("ingrese accion");
            String tiempo = JOptionPane.showInputDialog("ingrese tiempo");

//            String danger = JOptionPane.showInputDialog("Ingrese cantidad de daño");
//            String dan = JOptionPane.showInputDialog("ingrese Zona del traje");
//            Integer d = new Integer(danger);
            Integer t = new Integer(tiempo);
        
            if (texto.equalsIgnoreCase("salir")) {
                break;
            }

            if (texto.equalsIgnoreCase("caminar")) {
                a.caminar(t);
            }

            if (texto.equalsIgnoreCase("correr")) {
                a.correr(t);

            }
            if (texto.equalsIgnoreCase("propulsarse")) {
                a.propulsarse(t);

            }
            if (texto.equalsIgnoreCase("volar")) {
                a.volar(t);

            }
            if (texto.equalsIgnoreCase("ataque")) {
                a.ataque(t);

            }
   a.Radar();
//
//            if (dan.equalsIgnoreCase("Bota")) {
//                System.out.println("Daño recibido en la Bota " + d);
//                a.botaDerecha.daño(d);
//                a.sint.informeVoz("Has recibido un Ataque Willy" + d);
//                //a.botaDerecha.reparar(d);
//
//            }
//
//            if (dan.equalsIgnoreCase("Guante")) {
//                System.out.println("Daño recibido en el guante " + d);
//                a.guanteDerecho.daño(d);
//                a.sint.informeVoz("Has recibido un Ataque Willy" + d);
//                a.guanteDerecho.reparar(d);
//            }
//            if (dan.equalsIgnoreCase("Armadura")) {
//                System.out.println("Daño recibido en la Armadura " + d);
//                a.daño(d);
//                a.sint.informeVoz("Has recibido un Ataque Willy" + d);
//                //a.ran.reparacionArm(d);
//            }

//            c.estadoArmadura();
//            c.estadobota();
//            c.estadoguante();
       a.estadobota();
       a.estadoguante();
        }
    }

}
