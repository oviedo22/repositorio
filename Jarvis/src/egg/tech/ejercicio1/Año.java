/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.tech.ejercicio1;

/**
 *
 * @author andre
 * 
 */



public class Año {
    double resto;
    double resto1;
    double resto2;
            
    
    public void añobis(int año){
        resto= año % 4;
        resto1=año % 100;
        resto2=año % 400;
       
        if (resto==0 || resto1==0 && resto2==0){
            System.out.println("Su año es bisiesto");
        }
        else{
             System.out.println("Su año no es bisiesto");       
                    }
        }
    }
    

