package votador;

import java.util.ArrayList;
import java.util.TreeSet;

public class Votador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Simulador simulador = new Simulador();
        TreeSet<Alumno> alumnos = simulador.armarLista();

        
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
        
        ArrayList<Alumno> votados = simulador.simularVotacion(alumnos);
        simulador.recuentoVotos(votados);


    }

}
