/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // desarrollo de la aplicación
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String propietario;
        String opcion;
        int tipo;
        double avaluo;
        double porcentaje;
        double tarifa;
        double recargo;
        double peaje;
        double total;

        System.out.println("Ingrese el nombre del propietario del vehículo");
        propietario = entrada.nextLine();

        System.out.println("Ingrese el avalúo del vehívulo");
        avaluo = entrada.nextDouble();

        System.out.println("Ingrese el tipo de vehículo\n"
                + "1 Vehículo liviano particular\n"
                + "2 Vehículo grande particular\n"
                + "3 taxi\n"
                + "4 bus urbano\n");
        tipo = entrada.nextInt();

        opcion = "Ninguna opción";
        porcentaje = 0;
        tarifa = 0;
        recargo = 0;
        peaje = 0;
        total = 0;

        switch (tipo) {
            case 1:
                opcion = "Vehículo liviano particular";
                porcentaje = (avaluo * 0.01) / 100;
                tarifa = 2;
                if (avaluo > 30000) {
                    recargo = 1.50;
                }
                break;
            case 2:
                opcion = "Vehículo pesado particular";
                porcentaje = (avaluo * 0.02) / 100;
                tarifa = 2.5;
                if (avaluo > 30000) {
                    recargo = 1.50;
                }
                break;
            case 3:
                opcion = "Taxi";
                porcentaje = (avaluo * 0.04) / 100;
                tarifa = 1.5;
                break;
            case 4:
                opcion = "Bus urbano";
                porcentaje = (avaluo * 0.05) / 100;
                tarifa = 2.2;
                break;
            default:
                System.out.println("Tipo no encontrado");
        }
        peaje = tarifa + porcentaje;
        total = peaje + recargo;

        System.out.printf("Peaje 'Buena Vía'\nPropietario: %s\nTipo: %s\n"
        + "    Avalúo: $%.2f\n"
        + "    Valor base del peaje: $%.2f\n"
        + "    Recargo: $%.2f\n\n"
        + "    Total a cancelar: $%.2f\n", propietario, opcion, avaluo, peaje, 
        recargo, total);
    }
 
}
