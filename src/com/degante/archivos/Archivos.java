package com.degante.archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Archivos {
    
    public void crearArchivo() throws IOException {
        File file = new File("miArchivo.txt");
        BufferedWriter bw = null;
        
        try {
            bw = new BufferedWriter(new FileWriter(file));
            bw.write("Hola mundo en mi primer archivo XD");
        } finally {
            if (bw != null) { bw.close(); }
        }
    }


    public void agregarContenidoDesdeArreglo() throws IOException {
        // Agregar contenido de un arreglo
        File file = new File("miArchivo.txt");
        BufferedWriter bw = null;
        
        try {
            bw = new BufferedWriter(new FileWriter(file));
            String[] arreglo = {"Uno", "Dos"};

            for (int i = 0; i < arreglo.length; i++) {
                bw.write(arreglo[i] + "\n");
            }
        } finally {
            if (bw != null) { bw.close(); }
        }
    }

}
