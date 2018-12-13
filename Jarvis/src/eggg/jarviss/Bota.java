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
class Bota {

    boolean estadoBot = true;
    int consumoBot = 200;
    int resistenciaBot = 100;
    int danger;

    public int usar(int intensidad, int tiempo) {
        Random aleatorio = new Random();
        if (aleatorio.nextBoolean()) {
            danger = aleatorio.nextInt(resistenciaBot);
            System.out.println("Hemos recibido un daño en las botas, Intesidad:" + danger);
            daño(danger);
            reparacionBot(danger);

        }
        return consumoBot * intensidad * tiempo;
    }

    public void daño(int daño) {
        resistenciaBot = resistenciaBot - daño;
        System.out.println("Resistencia de las botas restante=" + resistenciaBot);

        if (resistenciaBot > 0) {
            estadoBot = true;

        } else if (resistenciaBot == 0) {
            estadoBot = false;

        }

    }

    public void reparacionBot(int daño) {
        Random rnd = new Random();
        int numero = rnd.nextInt(10);

       

        if (numero == 1 || numero == 2 || numero == 3 || numero == 4) {
            resistenciaBot = resistenciaBot + daño;
             System.out.println("Intento de Reparacion exitoso, nuevo nivel de resistencia " + resistenciaBot + " Rockwells");
        }else {
            System.out.println("Fallo en el intento de reparación");

        }

    }

    public void estado() {
        if (estadoBot = true) {
            System.out.println("Las Botas se encuentran Ok");

        } else if (estadoBot = false) {

            System.out.println("Las botas se encuentran Dañadas");

        }

    }

}
