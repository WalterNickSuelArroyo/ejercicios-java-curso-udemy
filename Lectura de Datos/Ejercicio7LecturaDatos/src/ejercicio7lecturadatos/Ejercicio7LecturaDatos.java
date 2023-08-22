/*
Ejercicio 7: Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la asignatura de Programación 
para obtener la medida deseada. Hay que tener en cuenta que la nota del primer examen cuenta el 40% y la del segundo examen un 60%.

    Introduce la nota del primer examen: 7
    ¿Qué nota quieres sacar?: 8.5
    Para tener un 8.5 necesitas sacar un 9.5 en el segundo examen

*/
package ejercicio7lecturadatos;

import java.util.Scanner;

public class Ejercicio7LecturaDatos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce la nota del primer examen: ");
        double nota1 = input.nextDouble();
        
        System.out.print("¿Que nota quieres sacar?: ");
        double notaFinal = input.nextDouble();
        
        /*
        notaFinal = 0.4 * nota1 + 0.6 * nota2
        notaFinal - 0.4 * nota1 = 0.6 * nota2
        (notaFinal - 0.4 * nota1) / 0.6 = nota2       
        */
        
        double nota2 = (notaFinal - 0.4 * nota1) / 0.6;
        
        System.out.println("Para obtener un " + notaFinal + " necesitas sacar un " + nota2 + " en el segundo examen");
    }
    
}
