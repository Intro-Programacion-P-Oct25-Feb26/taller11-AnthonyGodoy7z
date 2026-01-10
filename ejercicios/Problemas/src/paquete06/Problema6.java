/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Problema6 {
    public static void main(String[] args){
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        double mediaArit = obtenerMedia(informacion);
        double desviacion = obtenerDes(informacion, mediaArit);
        System.out.printf("Media aritmetica: %.2f\n"
                + "Desviacion estandar: %.2f\n", mediaArit, desviacion);
        
    }
    
    public static double obtenerMedia(int [] a){
        double suma = 0;
        for (int i = 0; i < a.length; i++){
            suma = suma + a[i];
    }
        double media = suma / a.length;
        return media;
    }
    
    public static double obtenerDes(int[] a, double b){
        double suma = 0;
        for (int i = 0; i < a.length; i++){
            suma = suma + Math.pow(a[i] - b, 2);
        }
        return Math.sqrt(suma / a.length);
    }
}
