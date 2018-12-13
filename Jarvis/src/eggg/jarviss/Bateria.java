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
public class Bateria {
    double cargaMax = 900000;
    double carga=900000;
    double nivel;
    
//    public void consumo(int tiempo, int consumo){
//       carga = carga - (tiempo*consumo);
//    }
    
    public void consumir(int energia){
        carga = carga - energia;
        nivel = ((carga / cargaMax)* 100);
        System.out.println("Nivel de bateria restante:"); System.out.printf("%.0f",nivel); System.out.println(" ");
      
        
    }
    public void estado(int energia){
       carga = carga - energia;
        System.out.println("La carga de su bateria es de "+carga);
    }
        
}

