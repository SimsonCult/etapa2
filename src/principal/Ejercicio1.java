/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.Scanner;

/**
Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese numero1");
        double num1 = leer.nextDouble();
        System.out.println("ingrese numero2");
        double num2 = leer.nextDouble();
        
        double resultadoSuma = num1 + num2;
        System.out.println("el resultado de la suma es: " + resultadoSuma);
        
        System.out.println("el resultado de la suma es: " + (num1+num2)    );
        
        leer.close();
    }    
}
