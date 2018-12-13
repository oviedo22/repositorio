/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggg.jarviss;

import java.util.Random;
import java.lang.Math;
/**
 *
 * @author andre
 */
public class Armadura {

    Boolean estadoArm = true;
    String colopri = "Rojo";
    String colorsec = "Dorado";
    public int reactor = 100;
    int resistencia = 1000;
    public Guante guanteDerecho = new Guante();
    public Guante guanteIzquierdo = new Guante();
    public Bota botaIzquierda = new Bota();
    public Bota botaDerecha = new Bota();

    public Bota b = new Bota();
    public Guante g = new Guante();

    public Bateria estado = new Bateria();
    public Sintetizador sint = new Sintetizador();
    public Bateria bateria = new Bateria();
    private int aleat;
    int ubic = 1;
    public int powerAtaq = 80;
    double distanc;

    public void caminar(int tiempo) {
        if (botaDerecha.estadoBot == false || botaIzquierda.estadoBot == false) {
            System.out.println("Dispositivo dañado Señor Stark, accion imposible de realizar");
        } else {
            if (bateria.carga == 0) {
                System.out.println("Bateria insuficiente Señor Stark");
                sint.informeVoz("Low Battery");
                sint.usar(1, tiempo);
            } else {
                System.out.println("Caminando...");

                int energia = 0;
                energia += botaIzquierda.usar(1, tiempo);
                energia += botaDerecha.usar(1, tiempo);
                bateria.estado(energia);
                bateria.consumir(energia);
                sint.informeVoz("Walk willy Walk");
                sint.usar(1, tiempo);
            }
        }
    }

    public void correr(int tiempo) {
        if (botaDerecha.estadoBot == false || botaIzquierda.estadoBot == false) {
            System.out.println("Dispositivo dañado Señor Stark, accion imposible de realizar");
        } else {
            if (bateria.carga == 0) {
                System.out.println("Bateria insuficiente Señor Stark");
                sint.informeVoz("Low Battery");
                sint.usar(1, tiempo);
            } else {
                System.out.println("Corriendo...");

                int energia = 0;
                energia += botaIzquierda.usar(2, tiempo);
                energia += botaDerecha.usar(2, tiempo);
                bateria.estado(energia);
                bateria.consumir(energia);
                sint.informeVoz("Run willy Run");
                sint.usar(1, tiempo);
            }
        }

    }

    public void propulsarse(int tiempo) {
        if (botaDerecha.estadoBot == false || botaIzquierda.estadoBot == false) {
            System.out.println("Dispositivo dañado Señor Stark, accion imposible de realizar");
        } else {
            if (bateria.carga == 0) {
                System.out.println("Bateria insuficiente Señor Stark");
                sint.informeVoz("Low Battery");
                sint.usar(1, tiempo);
            } else {
                System.out.println("Propulsandose...");

                int energia = 0;
                energia += botaIzquierda.usar(3, tiempo);
                energia += botaDerecha.usar(3, tiempo);
                bateria.estado(energia);
                bateria.consumir(energia);
                sint.informeVoz("Propulse willy Propulse!");
                sint.usar(1, tiempo);
            }
        }
    }

    public void volar(int tiempo) {
        if (botaDerecha.estadoBot == false || botaIzquierda.estadoBot == false || guanteDerecho.estadoGuant == false || guanteIzquierdo.estadoGuant == false) {
            System.out.println("Dispositivo dañado Señor Stark, accion imposible de realizar");
        } else {
            if (bateria.carga == 0) {
                System.out.println("Bateria insuficiente Señor Stark");
                sint.informeVoz("Low Battery");
                sint.usar(1, tiempo);
            } else {
                System.out.println("Volando...");

                int energia = 0;
                energia += botaIzquierda.usar(3, tiempo);
                energia += botaDerecha.usar(3, tiempo);
                energia += guanteDerecho.usar(2, tiempo);
                energia += guanteIzquierdo.usar(2, tiempo);
                bateria.estado(energia);
                bateria.consumir(energia);
                sint.informeVoz("Willy i'm fliying");
                sint.usar(1, tiempo);
            }
        }
    }

    public void ataque(int tiempo) {
        if (guanteDerecho.estadoGuant == false && guanteIzquierdo.estadoGuant == false) {
            System.out.println("Dispositivos dañados Señor Stark, accion imposible de realizar");
        } else {
            if (bateria.carga == 0) {
                System.out.println("Bateria insuficiente Señor Stark");
                sint.informeVoz("Low Battery");
            } else {
                System.out.println("Ataque en proceso...");

                int energia = 0;
                energia += guanteDerecho.usar(3, tiempo);
                energia += guanteIzquierdo.usar(3, tiempo);
                bateria.estado(energia);
                bateria.consumir(energia);
                sint.informeVoz("RATATATATATATA Willy!");

            }
        }
    }

    public void daño(int daño) {
        resistencia = resistencia - daño;
        System.out.println("Resistencia Restante de la Armadura:" + resistencia);
        if (resistencia > 0) {
            estadoArm = true;

        } else {
            estadoArm = false;

        }

    }

    public void reparacionArm(int daño) {
        Random rnd = new Random();
        int numero = rnd.nextInt(10);

        if (numero == 1 || numero == 2 || numero == 3 || numero == 4) {
            resistencia = resistencia + (daño);
            System.out.println("Intento de Reparacion exitoso, nuevo nivel de resistencia " + resistencia);
        } else {
            System.out.println("Fallo en el intento de reparación");
        }

    }

    public void reparadorGuant() {

        if (guanteDerecho.estadoGuant == false || guanteIzquierdo.estadoGuant == false) {
            do {
                Random num = new Random();
                int aleat = num.nextInt(10);
                guanteDerecho.estadoGuant = true;
                guanteIzquierdo.estadoGuant = true;
            } while (aleat > 3);

            System.out.println("Guantes dañados e imposibles de reparar");
        }
    }

    public void reparadorBot() {

        if (botaDerecha.estadoBot == false || botaIzquierda.estadoBot == false) {
            do {
                Random num = new Random();
                int aleat = num.nextInt(10);
                botaDerecha.estadoBot = true;
                botaIzquierda.estadoBot = true;
            } while (aleat > 3);

            System.out.println("Botas dañadas e imposibles de reparar");
        }
    }

    public void Radar() {
        for(int i = 1; i <11; i = ++i){
        int[][][] rad = new int[10][10][10];
        rad[0][0][0] = ubic;
        Random objeto = new Random();
        int posone = objeto.nextInt(10);
        int postwo = objeto.nextInt(10);
        int posthree = objeto.nextInt(10);
        int resistObj = objeto.nextInt(100);
        rad[posone][postwo][posthree] = resistObj;
        distanc = Math.sqrt((posone * posone) + (postwo * postwo) + (posthree * posthree));
        distanc=Math.round(distanc);
        if (objeto.nextBoolean() == false) {
            System.out.println("Objeto encontrado en las coordenadas x:" + posone + " y:" + postwo + " z:" + posthree);
            System.out.println("Distancia=" + distanc + " metros");
            System.out.println("Objeto no hostil");

        } else {
            System.out.println("Objeto encontrado en las coordenadas x:" + posone + " y:" + postwo + " z:" + posthree);
            System.out.println("Distancia=" + distanc + " metros");
            System.out.println("Objeto hostil con resistencia " + resistObj);
            int timeAtaq = objeto.nextInt(5);
            ataque(timeAtaq);
            rad[posone][postwo][posthree] = resistObj - powerAtaq;
            if (rad[posone][postwo][posthree] <= 0) {
                System.out.println("Objetivo Destruido!");
            } else {
                System.out.println("Objetivo Aun con vida");
                ataque(timeAtaq);
                rad[posone][postwo][posthree] = rad[posone][postwo][posthree] - powerAtaq;
                System.out.println("Objetivo destruido con exito");
                
            }
        }
        }
    }

    public void estado() {
        if (estadoArm = true) {

            System.out.println("La armadura se encuentra Ok");

        } else {
            estadoArm = false;
            System.out.println("La armadura se encuentra Dañada");

        }

    }

    public void estadobota() {
        b.estado();
    }

    public void estadoguante() {
        g.estado();
    }
}
