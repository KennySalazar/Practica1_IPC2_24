/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistenciaDatos;

import DataBase.SaveAndReaderBinary;
import cargaDeDatos.Libro;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kenny Salazar
 */
public class ControlDatosLibros {
    SaveAndReaderBinary LyE = new SaveAndReaderBinary();

    public void llenarTablaLibros(JTable tabla) {
        String titulo[] = {
            "No. ", "Título", "Autor", "Codigo", "Cantidad de Copias", "Fecha de Publicación", "Editorial"
        };
        String[] columnas = new String[7];
        DefaultTableModel modelo = new DefaultTableModel(null, titulo);
        int i = 1;
        for (Libro libro : persistenciaDatos.PersistenciaDeDatos.biblio) {
<<<<<<< HEAD
            columnas[0]=String.valueOf(i);
            columnas[1] = libro.getTitulo();
            columnas[2] = libro.getAutor();
            columnas[3] = libro.getCodigo();
            columnas[4] = libro.getCantidad();
            columnas[5] = libro.getFechaDePublicacion();
            columnas[6] = libro.getEditorial();
=======
            columnas[0]=libro.getTitulo();
            columnas[1]=libro.getAutor();
            columnas[2]=libro.getCodigo();
            columnas[3]=""+libro.getCantidad();
            columnas[4]=libro.getFechaDePublicacion();
            columnas[5]=libro.getEditorial();
>>>>>>> ae96f202ab6b372e386fc3445dfee35beecaeb0a
            modelo.addRow(columnas);
            i++;
        }
        tabla.setModel(modelo);
    }

    public void guardarNuevoLibro(String titulo, String autor, String codigo, String cantidadCopias, String fechaP, String editorial, JTable tabla) {
        Libro nuevo = new Libro("" + titulo, autor, ""+codigo, cantidadCopias, fechaP, editorial);
        PersistenciaDeDatos.biblio.add(nuevo);
        System.out.println(nuevo);
        llenarTablaLibros(tabla);
        LyE.guardarArchivoBinario();
    }

}
