/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggg.jarviss;

import java.util.Random;

/**
 *
 * @author andre
 */
class Guante {

    boolean estadoGuant = true;
    int consumoGuant = 100;
    int resistenciaGuant = 100;
    int danger;

    public int usar(int intensidad, int tiempo) {
        Random aleatorio = new Random();
        if (aleatorio.nextBoolean()) {
            danger = aleatorio.nextInt(resistenciaGuant);
            System.out.println("Hemos recibido un daño en el guante Intesidad:" + danger);
            daño(danger);
            reparar(danger);
        }

        return consumoGuant * intensidad * tiempo;
    }

    public void daño(int daño) {
        resistenciaGuant = resistenciaGuant - daño;
        System.out.println("Resistencia de los guantes restante=" + resistenciaGuant);

        if (resistenciaGuant > 0) {
            estadoGuant = true;
        } else {
            estadoGuant = false;
        }
    }

    public void estado() {
        if (estadoGuant = true) {
            System.out.println("Los guantes se encuentran Ok");
        } else {
            estadoGuant = false;
            System.out.println("Los Guantes se encuentran Dañados");
        }
    }

    public void reparar(int daño) {
        Random rnd = new Random();
        int numero = rnd.nextInt(10);
        if (numero == 1 || numero == 2 || numero == 3 || numero == 4) {
            resistenciaGuant = resistenciaGuant + daño;
            System.out.println("Intento de Reparacion exitoso, nuevo nivel de resistencia " + resistenciaGuant +" Rockwells");
        } else {
            System.out.println("Fallo en el intento de reparación");
        }

    }
}
