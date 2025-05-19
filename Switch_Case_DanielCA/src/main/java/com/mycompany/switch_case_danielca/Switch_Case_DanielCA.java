/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SwitchCase_Daniel;

import java.util.Scanner;

public class SwitchCase_Daniel {

    public static void main (String [] args) {
    Scanner Scanner = new Scanner(System.in);
    
    System.out.println("Ingrese un número del 1 al 7: ");
    int dia = Scanner.nextInt();

switch(dia) {
        case 1 -> System.out.println("Lunes");
        case 2 -> System.out.println("Martes");
        case 3 -> System.out.println("Miercoles");
        case 4 -> System.out.println("Jueves");
        case 5 -> System.out.println("Viernes");
        case 6 -> System.out.println("Sabado");
        case 7 -> System.out.println("Domingo");
        default -> System.out.println("Numéro no válido!")
    }
}
}
