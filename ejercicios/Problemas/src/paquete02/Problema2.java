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

    }

    public static String[] datosVivienda() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String[] datos = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.printf("Ingrese identificador de vivienda %d", i + 1);
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
                System.out.printf("Ingrese consumo de la vivienda %d en el mes"
                        + "%d", j + 1, i + 1);
                consumo[i][j] = entrada.nextDouble();
            }
        }
        return consumo;
    }
    
    public static double[][] consumoAnual(double[][] totalAño) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[] anual = new double[10];
        double suma;
        for(int i = 0; i < totalAño.length; i++){
            suma = 0;
            for(int j = 0; j < totalAño[i].length; j++){
                suma = suma + totalAño[i][j];
                
            }
        }
}
}