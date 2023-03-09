/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.Scanner;

/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese frase");
        String frase = leer.nextLine();
        
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
        
        
        
        
    }
}
