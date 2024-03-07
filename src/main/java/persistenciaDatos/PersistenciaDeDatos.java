/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistenciaDatos;

import Reportes.Mora;
import Reportes.sinMora;
import cargaDeDatos.Estudiante;
import cargaDeDatos.Libro;
import cargaDeDatos.Prestamo;
import java.util.ArrayList;

/**
 *
 * @author Kenny Salazar
 */
public class PersistenciaDeDatos {
    //metodos para poder acceder a los arrayList necesarios para la base de datos
    public static ArrayList<Libro> biblio=new ArrayList<>();
    public static ArrayList<Estudiante> estudiantes=new ArrayList<>();
    public static ArrayList<Prestamo> prestamos = new ArrayList<>();
    public static ArrayList<sinMora> sinMora = new ArrayList<>();
    public static ArrayList<Mora> Mora = new ArrayList<>();
    
    //metodo el cual vacia los ArrayList
    public static void vaciarListas(){
        biblio.clear();
        estudiantes.clear();
        prestamos.clear();
        sinMora.clear();
        Mora.clear();
    }

 
    
    
}
