/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.tpi135_2018.practica.mantenimiento.mantenimientolib;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author doratt
 */
public class ManejoDeArchivos {

    public boolean mostrarContenidoArchivo(String path) {
boolean salida=false;
        FileReader f = null;
        try {
            String cadena;
            File archivo = new File(path);
            f = new FileReader(archivo);
            BufferedReader br = new BufferedReader(f);
            try {
                int i=0;
                while ((cadena = br.readLine()) != null) {
                    i=i+1;
                    System.out.println(cadena+" "+i);
                    if(cadena.contains("Prueba")){
                        salida=true;
                    }
                    
                }
            } catch (IOException ex) {
                Logger.getLogger(ManejoDeArchivos.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(ManejoDeArchivos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManejoDeArchivos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                f.close();
            } catch (IOException ex) {
                Logger.getLogger(ManejoDeArchivos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return salida;
    }

}
