/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo31 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Random aleatorios = new Random();
        double cantidad = 0;
        int[] datos = new int[6];
        int notas = 0;
        String[] rangos = {"0-8", "8.1-12", "12.1-16", "16.1-19", "19.1-20", "20.1-adelante"};
        System.out.println("Ingrese el numero de notas: ");
        notas = entrada.nextInt();

        for (int i = 1; i <= notas; i++) {
            System.out.printf("Ingresa la nota %d\n", i);
            cantidad = entrada.nextDouble();

            if (cantidad <= 8) {
                datos[0] = datos[0] + 1;
            } else {
                if (cantidad >= 8.1 && cantidad <= 12) {
                    datos[1] = datos[1] + 1;
                } else {
                    if (cantidad >= 12.1 && cantidad <= 16) {
                        datos[2] = datos[2] + 1;
                    } else {
                        if (cantidad >= 16.1 && cantidad <= 19) {
                            datos[3] = datos[3] + 1;
                        } else {
                            if (cantidad >= 19.1 && cantidad <= 20) {
                                datos[4] = datos[4] + 1;
                            } else {
                                datos[5] = datos[5] + 1;
                            }
                        }
                    }
                }
            }
        }
            System.out.println("Notas ingresadas\nRangos:");

            for (notas = 0; notas < datos.length; notas++) {
                System.out.printf("%s = %d\n", rangos[notas], datos[notas]);
            }

        }
    }
