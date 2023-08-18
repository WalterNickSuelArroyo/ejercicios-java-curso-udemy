/*
Escribe un programa que calcule el total de una factura a partir de la 
base imponible (precio sin IVA). La base imponible estará almacenada en una variable

    IVA = 18%
*/
package ejercicio3variables;
public class Ejercicio3Variables {
    public static void main(String[] args) {
        float baseImponible = 42.5f;
        float iva = (float)(baseImponible * 0.18);
        float total = baseImponible + iva;
        
        System.out.println("Base Imponible: "+ baseImponible);
        System.out.println("Impuestos: "+ iva);
        System.out.println("Total Factura: "+ total);
    }
}
