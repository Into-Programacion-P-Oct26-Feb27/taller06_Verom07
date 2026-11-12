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
        String tipo;
        
        System.out.println("Ingrese el nombre del propietario del vehículo");
        propietario = entrada.nextLine();
        
        tipo = "Ningun tipo seleccionado";
        System.out.println("Ingrese el tipo de vehículo\n"
                + "1 Vehículo liviano particular\n"
                + "2 Vehículo grande particular\n"
                + "3 taxi\n"
                + "4 bus urbano\n");
        tipo = entrada.nextLine();
        
        
    }
    
}
