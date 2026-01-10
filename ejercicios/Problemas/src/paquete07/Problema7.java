/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {

    public static void main(String[] args) {
        String[] ciudades = numCiudad();
        imprimirCiudades(ciudades);
    }

    public static String[] numCiudad() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int numero;
        System.out.println("Ingrese número de ciudades limite");
        numero = entrada.nextInt();
        entrada.nextLine();
        String[] arreglo = new String[numero];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf("Ingrese nombre de ciudad del Ecuador para la "
                    + "ciudad %d\n", i + 1);
            arreglo[i] = entrada.nextLine();
        }
        return arreglo;
    }

    public static void imprimirCiudades(String[] a) {
        System.out.println("\nCiudades con 4 o 5 caracteres: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() == 4 || a[i].length() == 5) {
                System.out.println(a[i]);
            }
        }
    }
}

