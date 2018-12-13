/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggg.jarviss;

/**
 *
 * @author andre
 */



class Sintetizador {
    int consumoSinteti=10;
    public Jarvis jarv = new Jarvis();
 
    public int usar(int intensidad, int tiempo){
        return consumoSinteti * intensidad * tiempo;
    }
  
    public void informeVoz(String texto){
    jarv.decir(texto);
}
    
}
