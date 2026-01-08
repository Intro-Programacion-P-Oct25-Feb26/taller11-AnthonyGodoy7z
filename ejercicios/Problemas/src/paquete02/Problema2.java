/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String[] viviendas = new String[10];
        double[][] mes = new double[10][12];
        double[] anual = new double[10];

        viviendas = datosVivienda();
        mes = consumoElectrico();
        anual = consumoAnual(mes);
        mensajeFinal(viviendas, anual);

    }

    public static String[] datosVivienda() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String[] datos = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.printf("Ingrese identificador de vivienda %d\n", i + 1);
            datos[i] = entrada.nextLine();
        }
        return datos;
    }

    public static double[][] consumoElectrico() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[][] consumo = new double[10][12];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.printf("Ingrese consumo de la vivienda %d en el mes "
                        + "%d\n", i + 1, j + 1);
                consumo[i][j] = entrada.nextDouble();
            }
        }
        return consumo;
    }

    public static double[] consumoAnual(double[][] totalAño) {
        double[] anual = new double[10];
        double suma;
        for (int i = 0; i < totalAño.length; i++) {
            suma = 0;
            for (int j = 0; j < totalAño[i].length; j++) {
                suma = suma + totalAño[i][j];
            }
            anual[i] = suma;
        }
        return anual;
    }

    public static void mensajeFinal(String[] vivi, double[] year) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String mensaje = "REPORTE DE CONSUMO ELECTRICO ANUAL \n"
                + "-----------------------------------------------\n";
        for (int i = 0; i < vivi.length; i++) {
            mensaje = String.format("%sEl consumo anual de electricidad de la "
                    + "vivienda %s en total de %.2f\n", mensaje, vivi[i],
                    year[i]);
        }
        System.out.printf(mensaje);
    }
}
