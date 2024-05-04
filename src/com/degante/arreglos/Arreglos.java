package com.degante.arreglos;

import java.util.Arrays;

public class Arreglos {

    public void copiarArreglo() {
        // Crear arreglo con datos enteros
        int[] arregloOriginal = {1, 2, 5, 10};
        int[] copia = new int[arregloOriginal.length];

        copia = Arrays.copyOf(arregloOriginal, copia.length);

        for (int i = 0; i < copia.length; i++) {
            System.out.println("Elemento del nuevo arreglo: " + copia[i]);
        }
    }


    public void copiarOtroArreglo() {
        String[] palabras = {"Mouse", "Teclado", "Papel"};
        String[] copiaDePalabras = new String[palabras.length];
    
        copiaDePalabras = Arrays.copyOf(palabras, copiaDePalabras.length);

        for (int i = 0; i < copiaDePalabras.length; i++) {
            System.out.print(copiaDePalabras[i] + "\t\t");
        }
    }

}