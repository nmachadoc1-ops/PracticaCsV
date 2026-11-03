/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicacsv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class PracticaCsV {
    
    private static final String RUTA = "Datos.csv";
    private static final String SEPARADOR = ",";
    
    public List<String[]> leerFilas() throws IOException{
        List<String[]> filas = new ArrayList<>();
        
        if(!new File(RUTA).exists()) return filas;
        
        try(FileReader fr= new FileReader(RUTA, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(fr)){
            String Linea;
            boolean primero=true;
            while((Linea = br.readLine()) != null){
                if(primero){
                    primero  =false; continue;
                    
                }
                
                if(!Linea.trim().isEmpty()){
                    filas.add(Linea.split(SEPARADOR));
                }
            }
            
        }
        return filas;
    }
    
    
    
 
    public static void main(String[] args) {
        
    }
}
