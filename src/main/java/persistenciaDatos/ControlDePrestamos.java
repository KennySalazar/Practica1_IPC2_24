/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistenciaDatos;

import cargaDeDatos.Libro;
import cargaDeDatos.Prestamo;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kenny Salazar
 */
public class ControlDePrestamos {
    
    public void llenarTablaPrestamos(JTable tabla){
        String titulo[] ={
          "Codigo de Libro","Carnet","Carrera" 
        };
        String[] columnas= new String[3];
        DefaultTableModel modelo = new DefaultTableModel(null, titulo);
        for (Prestamo prestamo : persistenciaDatos.PersistenciaDeDatos.prestamos) {
            columnas[0]= prestamo.getCodigoLibro();
            columnas[1]=prestamo.getCarnetE();
            columnas[2]= prestamo.getFecha();
            modelo.addRow(columnas);
        }
        tabla.setModel(modelo);
    }
    
}
