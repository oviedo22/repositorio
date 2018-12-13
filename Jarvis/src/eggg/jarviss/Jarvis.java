/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggg.jarviss;

import java.util.Locale;
import javax.speech.AudioException;
import javax.speech.Central;
import javax.speech.EngineException;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;

/**
 *
 * @author andre
 */
public class Jarvis {

    public void escribir(String texto) {
        System.out.print(texto);
    }

    public void saludar() {
        String saludo = "Hello! I am JARVIS.";
//        decir();
    }

    public void decir(String texto) {
        try {
            // set property as Kevin Dictionary  
            System.setProperty("freetts.voices",
                    "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");

            // Register Engine  
            Central.registerEngineCentral("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");

            // Create a Synthesizer  
            Synthesizer synthesizer = Central.createSynthesizer(new SynthesizerModeDesc(Locale.US));
            // Allocate synthesizer  
            synthesizer.allocate();

            // Resume Synthesizer  
            synthesizer.resume();

            // speaks the given text until queue is empty.  
            synthesizer.speakPlainText(texto, null);
            synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);

            // Deallocate the Synthesizer.  
            synthesizer.deallocate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void informacion(char caracter) {
        System.out.println("Analizando Caracter");
        System.out.println("El caracter ingresado es " + caracter);
        System.out.println("¿Es Letra?" + Character.isLetter(caracter));
        System.out.println("¿Es digito?" + Character.isDigit(caracter));
        System.out.println("La minuscula de A es " + Character.toLowerCase(caracter));
        System.out.println("La minuscula de A es " + Character.toUpperCase(caracter));

    }

    public void info(String frase) {
        int longitud_palabra;
        longitud_palabra = frase.length();
        longitud_palabra = (longitud_palabra - 1);
    
        System.out.println("Frase= Iron Man");
        System.out.println("Cantidad de Caracteres:" + longitud_palabra);
        System.out.println("Mayusculas " + frase.toUpperCase());
        System.out.println("Minusculas " + frase.toLowerCase());
        System.out.println("Primera mitad: " + frase.substring(0, longitud_palabra / 2));
        System.out.println("Ultima mitad: " + frase.substring(longitud_palabra / 2, longitud_palabra));
        System.out.println("Sin espacio: " + frase.replace(" ", ""));

    }
    
       public void fech (String fecha) {
        System.out.println("Informacion de fecha: "+fecha);
        System.out.println("dia: "+fecha.substring(0,2));
        System.out.println("mes: "+fecha.substring(3,5));
        System.out.println("año: "+fecha.substring(6,10));
    }

     public void jeringozo(String texto) {
          String jeringa = texto.replace("a", "apa");
          String jeringe=jeringa.replace("e", "epe");
          String jeringi=jeringe.replace("i", "ipi");
          String jeringo=jeringi.replace("o","opo");
          String jeringu=jeringo.replace("u","upu");
          System.out.println(jeringu);
          decir(texto);
    }
     
   

 
}
