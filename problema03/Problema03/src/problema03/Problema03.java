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
        double porcentaje;
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
        
        
    }

}
