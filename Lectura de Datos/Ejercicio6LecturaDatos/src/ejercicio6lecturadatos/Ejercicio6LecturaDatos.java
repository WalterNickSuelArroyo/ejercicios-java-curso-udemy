/*
Ejercicio 6: Escribe un programa que calcule el volumen de un cono según la fórmula: (1/3)πr^2h
*/

package ejercicio6lecturadatos;

import java.util.Scanner;


public class Ejercicio6LecturaDatos {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca el valor del radio: ");
        double radio = input.nextDouble();
        System.out.print("Introduzca el valor de la altura: ");
        double altura = input.nextDouble();
        
        double PI = Math.PI;
        
        double volumen = (double)1/3 * PI * radio * radio * altura;
        
        System.out.println("El volumen del cono es de: " + volumen);
    }
    
}
