/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistenciaDatos;

import DataBase.SaveAndReaderBinary;
import cargaDeDatos.Estudiante;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kenny Salazar
 */
public class ControlDatosEstudiante {
    SaveAndReaderBinary LyE = new SaveAndReaderBinary();

    public void llenarTablaEstudiantes(JTable tabla) {
        String titulo[] = {"No.",
            "Carnet", "Nombre", "Carrera", "Fecha Nacimiento"
        };
        String[] columnas = new String[5];
        DefaultTableModel modelo = new DefaultTableModel(null, titulo);
         int i=1;
        for (Estudiante est : persistenciaDatos.PersistenciaDeDatos.estudiantes) {
           
            columnas[0]=String.valueOf(i);
            columnas[1] = est.getCarnet();
            columnas[2] = est.getNombre();
            columnas[3] = est.getCarrera();
            columnas[4] = est.getFechaNacimiento();
            modelo.addRow(columnas);
            i++;
        }
        tabla.setModel(modelo);
    }
    
    public void guardarNuevoEstudiante(int carnet, String nombre, String carrera, String fechaNacimiento, JTable tabla){
        Estudiante nuevo = new Estudiante(""+carnet, nombre, carrera, fechaNacimiento);
        PersistenciaDeDatos.estudiantes.add(nuevo);
        System.out.println(nuevo);
        llenarTablaEstudiantes(tabla);
        LyE.guardarArchivoBinario();
    }
}
