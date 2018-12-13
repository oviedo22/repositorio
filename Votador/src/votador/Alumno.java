package votador;

public class Alumno implements Comparable<Alumno>{
    
    String nombre;
    String apellido;
    Integer dni;
    
    Alumno(String n,String a,int documento){
       this.nombre=n;
       this.apellido=a;
       this.dni=documento;
               
    }

    public String getNombre() {
        return nombre;
    }

    
    

    public String getApellido() {
        return apellido;
    }

    public Integer getDni() {
        return dni;
    }
    
  
           
    @Override
    public String toString() {
        return apellido + " " + nombre + " " + dni;
    }
    
    
    @Override
    public int compareTo(Alumno o) {
        int comparacion = apellido.compareTo(o.getApellido());
        if(comparacion == 0){
            comparacion = nombre.compareTo(o.getNombre());
            if(comparacion == 0){
                comparacion = dni.compareTo(o.getDni());
            }
        } 
        return comparacion;
    }
    
    
    
    
    
    
 
   
}
