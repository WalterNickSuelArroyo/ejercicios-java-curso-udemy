/*
Realiza un conversor de dólares a soles. La cantidad en dólares que se quiere convertir 
deberá estar almacenada en una variable.

Dato: 1 dólar = 3.80 soles

*/
package ejercicio2variables;

public class Ejercicio2Variables {

    public static void main(String[] args) {
        
        int dolares = 500;
        float soles = (float)(dolares * 3.80);
        
        System.out.println(dolares + " dolares son " + soles + " soles");
    }   
}
