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
class Consola {
   
    int consumoConsola=10;
    public Bota b = new Bota();
    public Guante g = new Guante();
    public Armadura arm= new Armadura();
    public int usar(int intensidad, int tiempo){
        return consumoConsola * intensidad * tiempo;
    }
     
     public void estadobota(){
      b.estado();
     }
      public void estadoguante(){
       g.estado();
     }
     public void estadoArmadura(){
       arm.estado();
     }
}
