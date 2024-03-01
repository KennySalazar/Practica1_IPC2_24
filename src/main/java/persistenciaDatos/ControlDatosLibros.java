/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistenciaDatos;

import cargaDeDatos.Estudiante;
import cargaDeDatos.Libro;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kenny Salazar
 */
public class ControlDatosLibros {
            public void llenarTablaLibros(JTable tabla){
        String titulo[] ={
          "Título","Autor","Codigo","Cantidad de Copias", "Fecha de Publicación", "Editorial" 
        };
        String[] columnas= new String[6];
        DefaultTableModel modelo = new DefaultTableModel(null, titulo);
        for (Libro libro : persistenciaDatos.PersistenciaDeDatos.biblio) {
            columnas[0]=libro.getTitulo();
            columnas[1]=libro.getAutor();
            columnas[2]=libro.getCodigo();
            columnas[3]=""+libro.getCantidad();
            columnas[4]=libro.getFechaDePublicacion();
            columnas[5]=libro.getEditorial();
            modelo.addRow(columnas);
        }
        tabla.setModel(modelo);
    }
    
}
