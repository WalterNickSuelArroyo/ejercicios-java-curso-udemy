
package problema;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un ArrayList de personas vacío
        ArrayList<Persona> personas = new ArrayList<Persona>();
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Declarar una variable para almacenar la opción seleccionada por el usuario
        int opcion = 0;

        // Iniciar un bucle do-while que se repetirá hasta que el usuario seleccione la opción "4. Salir"
        do {
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Crear una nueva persona");
            System.out.println("2. Modificar el telefono de una persona");
            System.out.println("3. Mostrar datos de las personas");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            // Leer la opción seleccionada por el usuario
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            // Realizar una acción dependiendo de la opción seleccionada por el usuario
            switch (opcion) {
                case 1:
                    System.out.print("Introduzca el nombre de la persona:");
                    String nombre = scanner.nextLine();
                    System.out.print("Introduzca la edad de la persona:");
                    int edad = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Introduzca el telefono de la persona:");
                    String telefono = scanner.nextLine();
                    System.out.print("Introduzca el numero de control de la persona:");
                    String numeroControl = scanner.nextLine();
                    personas.add(new Persona(nombre, edad, telefono, numeroControl));
                    break;
                case 2:
                    System.out.print("Introduzca el numero de control de la persona a la que desea modificar su telefono:");
                    String numeroControlModificar = scanner.nextLine();
                    boolean encontrado = false;
                    for (Persona persona : personas) {
                        if (persona.getNumeroControl().equals(numeroControlModificar)) {
                            System.out.print("Introduzca el nuevo telefono de la persona:");
                            String nuevoTelefono = scanner.nextLine();
                            persona.setTelefono(nuevoTelefono);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se encontró ninguna persona con ese numero de control.");
                    }
                    break;
                case 3:
                    for (Persona persona : personas) {
                        System.out.println("Nombre: " + persona.getNombre());
                        System.out.println("Edad: " + persona.getEdad());
                        System.out.println("Telefono: " + persona.getTelefono());
                        System.out.println("Numero de control: " + persona.getNumeroControl());
                        System.out.println("--------------");
                    }
                    break;
                case 4:
                    System.out.println("Chauu.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    break;
            }

        } while (opcion != 4);
    }
}

