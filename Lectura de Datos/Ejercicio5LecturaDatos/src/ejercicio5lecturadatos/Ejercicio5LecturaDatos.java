/*
Ejercicio 5: Escribe un programa que calcule el salario semanal de un empleado en base 
a las horas trabajadas, a razón de 12 euros la hora
*/

package ejercicio5lecturadatos;

import java.util.Scanner;

public class Ejercicio5LecturaDatos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el total de horas trabajadas durante la semana: ");
        int horas = input.nextInt();
        double salario = 12 * horas;
        System.out.println("Su salario semanal es de: " + salario + " euros");
    }
    
}
