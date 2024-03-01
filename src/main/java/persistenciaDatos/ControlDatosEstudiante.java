/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistenciaDatos;

import cargaDeDatos.Estudiante;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kenny Salazar
 */
public class ControlDatosEstudiante {
        public void llenarTablaEstudiantes(JTable tabla){
        String titulo[] ={
          "Carnet","Nombre","Carrera","Fecha Nacimiento" 
        };
        String[] columnas= new String[4];
        DefaultTableModel modelo = new DefaultTableModel(null, titulo);
        for (Estudiante est : persistenciaDatos.PersistenciaDeDatos.estudiantes) {
            columnas[0]=""+est.getCarnet();
            columnas[1]=""+est.getNombre();
            columnas[2]=""+est.getCarrera();
            columnas[3]= est.getFechaNacimiento();
            modelo.addRow(columnas);
        }
        tabla.setModel(modelo);
    }
}
