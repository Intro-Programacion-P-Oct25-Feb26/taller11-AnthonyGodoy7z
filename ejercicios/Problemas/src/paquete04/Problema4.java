/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        int cedula;
        System.out.println("Ingrese que desea calcular(1 = calcular planilla "
                + "de luz, 2 = calcular predio)");
        opcion = entrada.nextInt();
        entrada.nextLine();
        if (opcion == 1 || opcion == 2) {
            System.out.println("Ingrese su nombre");
            nombre = entrada.nextLine();
            System.out.println("Ingrese su cédula de indentidad");
            cedula = entrada.nextInt();

            if (opcion == 1) {
                calcularValorLuz(nombre, cedula);
            }
            if (opcion == 2) {
                calcularPredio(nombre, cedula);
            }
        } else {
            System.out.println("Número Invalido");
        }
    }

    public static void calcularValorLuz(String a, int b) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double kilowatio;
        double kilomes;
        double total;
        System.out.println("Ingrese valor del kilowatio");
        kilowatio = entrada.nextDouble();
        System.out.println("Ingrese número de kilowatios gastados en el mes");
        kilomes = entrada.nextDouble();
        total = kilowatio * kilomes;
        System.out.printf("REPORTE\n"
                + "-------------------------------------\n"
                + "%s con cédula %d debe cancelar el valor de $%.2f\n", a, b,
                total);

    }

    public static void calcularPredio(String a, int b) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double inmueble;
        double predio;
        System.out.println("Ingrese valor del inmueble");
        inmueble = entrada.nextDouble();
        predio = inmueble * 0.02;
        System.out.printf("REPORTE\n"
                + "-------------------------------------\n"
                + "%s con cédula %d tiene un bien inmueble valorado en $%.2f "
                + "y tiene que pagar de predio $%.2f.\n", a, b, inmueble, predio);

    }
}
