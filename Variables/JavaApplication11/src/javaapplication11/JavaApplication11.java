
package javaapplication11;

public class JavaApplication11 {

    public static void main(String[] args) {
        float precio = 3.14f;
        float iva = (float)(precio*0.18);
        float total = precio + iva;
        
        System.out.println("Base imponible: " + precio);
        System.out.println(iva);
        System.out.println(total);
    }
    
}
