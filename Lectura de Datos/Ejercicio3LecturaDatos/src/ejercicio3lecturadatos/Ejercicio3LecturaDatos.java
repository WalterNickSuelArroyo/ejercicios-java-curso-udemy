/*
Ejercicio 3:
Escribe un programa que sume, reste, multiplique y divida dos números introducidos por teclado.
*/
package ejercicio3lecturadatos;

import java.util.Scanner;


public class Ejercicio3LecturaDatos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        //Ingreso de datos
        System.out.print("Ingrese el primer numero: ");
        float numero1 = input.nextFloat();
        System.out.print("Ingrese el segundo numero: ");
        float numero2 = input.nextFloat();
        
        //Operaciones
        System.out.println("El resultado de la suma es: " + (numero1 + numero2));
        System.out.println("El resultado de la resta es: " + (numero1 - numero2));
        System.out.println("El resultado de la multiplicacion es: " + (numero1 * numero2));
        System.out.println("El resultado de la division es: " + (numero1 / numero2));
    }
    
}
