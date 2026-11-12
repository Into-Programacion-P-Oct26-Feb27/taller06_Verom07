/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // desarrollo de la aplicación
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int numero1;
        int numero2;
        int opcion;
        int operacion;
        String seleccion;

        System.out.println("Ingrese el primer número");
        numero1 = entrada.nextInt();

        System.out.println("Ingrese el segundo  número, debe ser menor al primero"
                + "para continuar");
        numero2 = entrada.nextInt();

        seleccion = "Ninguna operación";
        operacion = 0;
        System.out.println("Ingrese la operación\n"
                + "1 suma\n"
                + "2 resta\n"
                + "3 multiplicación\n"
                + "4 división\n"
                + "5 Módulo (residuo de la división)\n"
                + "6 potencia\n");
        opcion = entrada.nextInt();

        if (numero1 > numero2) {
            switch (opcion) {
                case 1:
                    seleccion = "Suma";
                    operacion = numero1 + numero2;
                    break;
                case 2:
                    seleccion = "Resta";
                    operacion = numero1 - numero2;
                    break;
                case 3:
                    seleccion = "Multiplicación";
                    operacion = numero1 * numero2;
                    break;
                case 4:
                    seleccion = "División";
                    operacion = numero1 / numero2;
                    break;
                case 5:
                    seleccion = "Módulo";
                    operacion = numero1 % numero2;
                    break;
                case 6:
                    seleccion = "potencia";
                    operacion = Math.powExact(numero1, numero2);
                    break;
                default:
                    System.out.println("Operación inválida");

            } 
        } else {
            System.out.println("No es posible realizar la operación solicitada."
                    + "El primer número debe ser mayor al segundo");
        }
        System.out.printf("OPERACIONES ARITMÉTICAS\n\n"
                + "Primer número: %d\nSegundo número: %d\n"
                + "Operación selecionada: %s\n\nResultado: %d\n", numero1,
                numero2, seleccion, operacion);
    }

}
