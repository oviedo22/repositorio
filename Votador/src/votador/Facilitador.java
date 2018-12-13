/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votador;

import java.util.Date;

/**
 *
 * @author andre
 */
public class Facilitador {

    Date Fecha;
    Voto titular;
    boolean titu = false;

    public Facilitador(Voto titular) {
        this.titular = titular;
        this.titu = true;
//        this.Fecha = Fecha;

    }
    
//     public Facilitador() {
//        this.titular = titular;
//        this.titu = true;
//     }
   
    
}
