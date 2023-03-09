/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.Scanner;

/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese nombre: ");
        String nombre = leer.next(); leer.nextLine();
        
        System.out.println("bienvenido " + nombre);
    }    
}
