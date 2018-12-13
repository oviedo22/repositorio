/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votador;

/**
 *
 * @author andre
 */
public class Voto implements Comparable<Voto> {

    private Alumno votado;
    private Integer cantidad;

    public Voto(Alumno votado) {
        this.votado = votado;
        this.cantidad = 0;
    }

    public void votar() {
        this.cantidad = cantidad + 1;
    }

    public Alumno getVotado() {
        return votado;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return votado.getApellido() + " " + votado.getNombre() + " " + votado.getDni()+ " votos: " + cantidad;
    }
    
    

    @Override
    public int compareTo(Voto o) {
        int comparacion = cantidad.compareTo(o.getCantidad()) * -1;
        if (comparacion == 0) {
            comparacion = votado.compareTo(o.getVotado());
        }
        return comparacion;
    }

}
