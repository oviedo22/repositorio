/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggg.jarviss;

import java.util.Random;

public class Reparador {

    Armadura a = new Armadura();
    Bota b = new Bota();
    Guante g = new Guante();
    double resultado;
    int minimo = 1;
    int numero;

    
    public void reparacionArm(int daño) {
        Random rnd = new Random();
        int numero = rnd.nextInt(10);

        if (numero == 1 || numero == 2 || numero == 3 || numero == 4) {
            a.resistencia = a.resistencia + (daño);
            System.out.println("Intento de Reparacion exitoso, nuevo nivel de resistencia " + a.resistencia);
        } else {
            System.out.println("Fallo en el intento de reparación");
        }

    }

    public void reparacionBot(int daño) {
        Random rnd = new Random();
        int numero = rnd.nextInt(4);

        System.out.println(numero);

        if (numero == 1 || numero == 2 || numero == 3 || numero == 4) {
            b.resistenciaBot = b.resistenciaBot + (daño);
        }
        
        if (b.resistenciaBot > 100) {
            b.resistenciaBot = 100;
            System.out.println("Intento de Reparacion exitoso, nuevo nivel de resistencia " + b.resistenciaBot + " Rockwell");

        } else if (b.resistenciaBot < 100) {

            System.out.println("Intento de Reparacion exitoso, nuevo nivel de resistencia " + b.resistenciaBot + " Rockwell");
        } else {
            System.out.println("Fallo en el intento de reparación");

        }

    }

    public void reparacionGuant(int daño) {
        Random rnd = new Random();
        int numero = rnd.nextInt(10);

        if (numero == 1 || numero == 2 || numero == 3 || numero == 4) {
            g.resistenciaGuant = g.resistenciaGuant + (daño);
            System.out.println("Intento de Reparacion exitoso, nuevo nivel de resistencia " + g.resistenciaGuant);
        } else {
            System.out.println("Fallo en el intento de reparación");
        }

    }

}
