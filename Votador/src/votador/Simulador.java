/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

/**
 *
 * @author andre
 */
public class Simulador {

//   public static List <String> nombres = new ArrayList<String>();
//   public static List <String> apellidos = new ArrayList<String>();
//   public static List <Integer> documento = new ArrayList<Integer>();
    public TreeSet<Alumno> armarLista() {
        String[] name = {"Franco", "Axel", "Emi", "Willy", "Francisco", "Jonathan"};
        String[] lastName = {"Oviedo", "Garcia", "Tuma", "Muller", "Fernandez", "Heisemberg"};

        TreeSet<Alumno> alumnos = new TreeSet<>();

        for (int i = 1; i < 20; i = ++i) {
            Random objeto = new Random();
            int n = objeto.nextInt(5);
            int a = objeto.nextInt(5);
            String nombre = name[n];
            String apellido = lastName[a];
            int dni = (int) (Math.random() * (30000000 - 42000000) + 42000000);
            Alumno alumno = new Alumno(nombre, apellido, dni);
            alumnos.add(alumno);

        }

        return alumnos;
    }

    public void recuentoVotos(ArrayList<Alumno> votados) {

        HashMap<Integer, Voto> recuento = new HashMap<>();

        for (Alumno alumno : votados) {
            Integer dni = alumno.getDni();

            Voto v = null;
            if (recuento.containsKey(dni)) {
                v = recuento.get(dni);
            } else {
                v = new Voto(alumno);
                recuento.put(dni, v);
            }

            v.votar();
        }

//        for(Integer dni : recuento.keySet()){
//            Voto voto = recuento.get(dni);
//            System.out.println(voto);
//        }
        TreeSet<Voto> votos = new TreeSet<>();
        votos.addAll(recuento.values());

        System.out.println("=============================================");
        for (Voto voto : votos) {
            System.out.println(voto);

        }

        System.out.println("Los Facilitadores son:");

        ArrayList<Voto> copia = new ArrayList<>(votos);
//
//                Facilitador facilitador = new Facilitador(voto);
//                System.out.println(facilitador);       

        for (int i = 0; i <= 4; i++) {
           Facilitador facilitador=new Facilitador(copia.get(i));
           System.out.println(copia.get(i));
        }

    }

    public ArrayList<Alumno> simularVotacion(TreeSet<Alumno> alumnos) {

        Random random = new Random();

//        HashSet<Alumno> personas = new HashSet<Alumno>();
        ArrayList<Alumno> copia = new ArrayList<>(alumnos);

        ArrayList<Alumno> votados = new ArrayList<>();

        for (Alumno votante : alumnos) {

            HashSet<Alumno> votos = new HashSet<>();
            while (votos.size() < 3) {
                Alumno votado = copia.get(random.nextInt(alumnos.size()));
                if (!votado.getDni().equals(votante.getDni())) {
                    votos.add(votado);
                }
            }

            votados.addAll(votos);
        }

        return votados;
    }

}
