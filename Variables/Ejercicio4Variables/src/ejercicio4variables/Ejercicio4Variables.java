/*
Escribe un programa que declare variables de tipo char y de tipo String. 
Intenta mostrarlas por pantalla todas juntas en la misma línea y con una sola 
sentencia de java (con un solo println) ¿es posible?
Ejemplo:
	A-Z=ABECEDARIO
*/
package ejercicio4variables;

public class Ejercicio4Variables {

    public static void main(String[] args) {
        char inicio = 'A';
        char finals = 'Z';
        String palabra = "ABECEDARIO";
        
        System.out.println(inicio + " - " + finals + " = " + palabra);
    }
    
}
