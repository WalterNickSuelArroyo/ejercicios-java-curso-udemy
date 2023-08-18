/*
Ejercicio 4: Escribe un programa que calcule el área de un rectángulo
*/
package ejercicio4lecturadatos;

import java.util.Scanner;

public class Ejercicio4LecturaDatos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la base del rectangulo: ");
        double  base = input.nextDouble();
        System.out.print("Ingrese la altura del rectangulo: ");
        double altura = input.nextDouble();
        double area = base * altura;
        System.out.println("El area del rectangulo es: " + area);
    }
    
}
