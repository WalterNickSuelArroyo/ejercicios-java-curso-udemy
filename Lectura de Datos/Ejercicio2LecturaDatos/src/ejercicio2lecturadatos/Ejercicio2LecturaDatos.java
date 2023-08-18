/*
Realiza un conversor de dolares a soles. La cantidad de dolares que se
quiere convertir debe ser introducida por teclado
*/
package ejercicio2lecturadatos;

import java.util.Scanner;

public class Ejercicio2LecturaDatos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float tasaDeCambio = 3.80f;
        System.out.print("Ingrese la cantidad de dolares a convertir: ");
        float dolares = sc.nextFloat();
        float soles = dolares * tasaDeCambio;
        System.out.println(dolares + " dolares son " + soles + " soles");
    }
    
}
