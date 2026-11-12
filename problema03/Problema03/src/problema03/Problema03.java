/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        int tipo;
        int servicio;
        double sueldo;
        int porcentaje;
        double incremento;
        double bonificacion;
        double nuevo;

        System.out.println("Ingrese el nombre del empleado");
        nombre = entrada.nextLine();

        System.out.println("Ingrese el tipo de empleado\n"
                + "1\n"
                + "2\n"
                + "3\n"
                + "4\n"
                + "5 o cualquier otro tipo\n");
        tipo = entrada.nextInt();

        System.out.println("Ingrese los años de servicio");
        servicio = entrada.nextInt();

        System.out.println("Ingrese su sueldo actual");
        sueldo = entrada.nextDouble();

        switch (tipo) {
            case 1:
                porcentaje = 5;
                break;
            case 2:
                porcentaje = 7;
                break;
            case 3:
                porcentaje = 9;
                break;
            case 4:
                porcentaje = 12;
                break;
            default:
                porcentaje = 15;
                break;
        }
        if (servicio < 2) {
            bonificacion = 0;
        } else {
            if (servicio >= 2 && servicio < 5) {
                bonificacion = 30;
            } else {
                if (servicio >= 5 && servicio < 10) {
                    bonificacion = 60;
                } else {
                    bonificacion = 100;
                }
            }
        }
        
        incremento = (sueldo * porcentaje) / 100;
        nuevo = sueldo + incremento + bonificacion;
        
        System.out.printf("REPORTE DE INCREMENTO SALARIAL\n\n"
                + "Empleado: %s\n"
                + "Tipo de empleado: %d\n"
                + "Años de servicio: %d\n\n"
                + "Sueldo incial: $%.2f\n"
                + "Porcentaje de incremento: %d%%\n"
                + "Incremento salarial: $%.2f\n"
                + "Bonificación por antigüedad: $%.2f\n\n"
                + "Nuevo sueldo: $%.2f\n", nombre, 
                tipo, servicio, sueldo, porcentaje, incremento, 
                bonificacion, nuevo);
    }
 
}
