/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistenciaDatos;

import cargaDeDatos.Estudiante;
import cargaDeDatos.Libro;
import cargaDeDatos.Prestamo;
import java.util.ArrayList;

/**
 *
 * @author Kenny Salazar
 */
public class PersistenciaDeDatos {
    public static ArrayList<Libro> biblio=new ArrayList<>();
    public static ArrayList<Estudiante> estudiantes=new ArrayList<>();
    public static ArrayList<Prestamo> prestamos = new ArrayList<>();
    
    public static void vaciarListas(){
        biblio.clear();
        estudiantes.clear();
        prestamos.clear();
    }

 
    
    
}
