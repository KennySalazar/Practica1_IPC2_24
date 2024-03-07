/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistenciaDatos;

import DataBase.SaveAndReaderBinary;
import cargaDeDatos.Estudiante;
import cargaDeDatos.Libro;
import cargaDeDatos.Prestamo;
import java.awt.Container;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static persistenciaDatos.PersistenciaDeDatos.estudiantes;

/**
 *
 * @author Kenny Salazar
 */
public class ControlDePrestamos {
        SaveAndReaderBinary LyE = new SaveAndReaderBinary();
    
    public void llenarTablaPrestamos(JTable tabla){
        String titulo[] ={
          "Codigo de Libro","Carnet","Fecha" 
        };
        String[] columnas= new String[3];
        DefaultTableModel modelo = new DefaultTableModel(null, titulo);
        int i = 1;
        for (Prestamo prestamo : persistenciaDatos.PersistenciaDeDatos.prestamos) {
            columnas[0]= prestamo.getCodigoLibro();
            columnas[1]=prestamo.getCarnetE();
            columnas[2]= prestamo.getFecha();
            modelo.addRow(columnas);
            
        }
        tabla.setModel(modelo);
    }
    
    public void guardarPrestamos(String codigoLibro, String carnet, String fecha, JTable tabla, int carnett){
        
        Prestamo nuevoPres= new Prestamo(codigoLibro, carnet, fecha);
        PersistenciaDeDatos.prestamos.add(nuevoPres);
        for (Estudiante estudiante : estudiantes) {
            if(carnett == estudiante.getCarnet()){
                estudiante.getHistorial().add(nuevoPres);
                estudiante.getPrestamosActivos().add(nuevoPres);
            }
        }
        System.out.println(nuevoPres);
        llenarTablaPrestamos(tabla);
        LyE.guardarArchivoBinario();

       
    }//fin de la clase para guardar prestamos

    
    
}
