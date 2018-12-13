/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.tech.ejercicio2;

/**
 *
 * @author andre
 */
public class Alumnos {
    
    String nombre;
    int edad;
    Notas notaPractico= new Notas();
    Notas notaProblemas= new Notas();
    Notas notaTeo= new Notas();
    double porcentPractico;
    double porcentProbl;
    double porcentTeo;
    double notaFinal;
    public int notaFinal( double nota1,double nota2, double nota3){
     
        porcentPractico= notaPractico.Resultado(nota1,0.10);
        porcentProbl= notaProblemas.Resultado(nota2, 0.50);
        porcentTeo=notaTeo.Resultado(nota3, 0.40);
        notaFinal=(porcentPractico+porcentProbl+porcentTeo);
       
        return (int)notaFinal; 
        
    }
        
       public void estado(String alumno ){
          
           if (notaFinal>=7){
               System.out.println("Alumno "+alumno+" aprobado");
           }
           else{
               System.out.println("Alumno "+alumno+" desaprobado");
           }
       } 
    
    
    
    
}
