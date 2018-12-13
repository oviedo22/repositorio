/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.tech.ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Ejecutable {
    
    public static void main (String [] args){
        Alumnos a= new Alumnos();
      
        String alumno= JOptionPane.showInputDialog("Ingrese nombre del Alumno");
     
        String notaP= JOptionPane.showInputDialog("Ingrese nota de practica");
        String notaProb=JOptionPane.showInputDialog("Ingrese nota de problemas");
        String notaTeo=JOptionPane.showInputDialog("Ingrese nota de teoria");
       
        Integer nota1= new Integer(notaP); 
        Integer nota2= new Integer(notaProb);
        Integer nota3= new Integer(notaTeo);
        a.notaFinal(nota1, nota2, nota3);
         System.out.println("La nota Final de "+ alumno+ " es "+a.notaFinal);
        a.estado(alumno);
    }
    
}
