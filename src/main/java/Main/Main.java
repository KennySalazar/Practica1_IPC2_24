/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

import cargaDeDatos.Lector;
import vista.CargarDatos;

/**
 *
 * @author Kenny Salazar
 */
public class Main {

    public static void main(String[] args) {
        CargarDatos vista = new CargarDatos();
        vista.setVisible(true);
        vista.setEnabled(true);
        vista.setResizable(true);
        vista.setLocationRelativeTo(null);
        vista.setTitle("PRESTAMOS DE LIBROS CUNOC");
    }
}
