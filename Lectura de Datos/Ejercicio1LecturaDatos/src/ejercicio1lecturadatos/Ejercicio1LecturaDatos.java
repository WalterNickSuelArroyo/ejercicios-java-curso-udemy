/*
Realice un programa que pida dos números y que luego muestre el resultado de su multiplicación
*/
package ejercicio1lecturadatos;
import java.util.Scanner;

public class Ejercicio1LecturaDatos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero: ");
        int numero1 = sc.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        int numero2 = sc.nextInt();
        
        int resultado = numero1 * numero2;
        
        System.out.println("El resultado de la multiplicacion es: "+ resultado);
        
        //System.out.println("La multiplicacion es: "+numero1*numero2);
    }
    
}
