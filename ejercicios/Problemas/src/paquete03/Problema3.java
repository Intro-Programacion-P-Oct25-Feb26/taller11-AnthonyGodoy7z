/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese que desea calcular(1 = área del cuadrado, "
                + "2 = área del triángulo, 3 = área del rectángulo)");
        opcion = entrada.nextInt();
        
        if (opcion == 1){
            obtenerAreaCuadrado();
        }
        if (opcion == 2){
            triangulo();
        }
        if (opcion == 3){
            rectangulo();
        } else{
            System.out.println("Número invalido");
        }
    }
    
    public static void obtenerAreaCuadrado(){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double lado;
        double area;
        System.out.println("Ingrese lado del cuadrado");
        lado = entrada.nextDouble();
        area = lado * lado;
        
    }
}
