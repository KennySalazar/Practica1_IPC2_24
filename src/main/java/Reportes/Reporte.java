/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reportes;

import cargaDeDatos.Estudiante;
import cargaDeDatos.Prestamo;
import java.util.ArrayList;
import static persistenciaDatos.PersistenciaDeDatos.estudiantes;
import static persistenciaDatos.PersistenciaDeDatos.prestamos;

/**
 *
 * @author DAVID
 */
public class Reporte {

    private ArrayList<Prestamo> prestamosEntrega;
    private ArrayList<Mora> moras;
    private ArrayList<sinMora> devolusiones;

    public Reporte() {
        this.devolusiones = new ArrayList<>();
        this.moras = new ArrayList<>();
        this.prestamosEntrega = new ArrayList<>();
    }

    public void recorrerPrestamos() {
        for (Prestamo prestamo : prestamos) {
            if (prestamo.seEntrega()) {
                for (Prestamo prestamo1 : prestamosEntrega) {
                    if(prestamo.equals(prestamo)){
                        break;
                    } else {
                        prestamosEntrega.add(prestamo);
                        break;
                    }
                }
            }
        }
        for (Prestamo prestamo : prestamosEntrega) {
            System.out.println(prestamo);
        }
        System.out.println("prestamos de entrega hoy, cargados");
    }

    public void historialEstudiante(int carnet) {
        for (Estudiante estudiante : estudiantes) {
            if (carnet == estudiante.getCarnet()) {
                if (estudiante.getHistorial().isEmpty()) {
                    System.out.println("El estudiante: "+estudiante.getNombre()+" no tiene historial de prestamos");
                } else {
                    for (Prestamo prestamo : estudiante.getHistorial()) {
                        System.out.println(prestamo);
                    }
                }
            }
        }
    }
    
    public void prestamosEstudiante(int carnet) {
        for (Estudiante estudiante : estudiantes) {
            if (carnet == estudiante.getCarnet()) {
                if (estudiante.getPrestamosActivos().isEmpty()) {
                    System.out.println("El estudiante: "+estudiante.getNombre()+" no tiene prestamos actualmente");
                } else {
                    for (Prestamo prestamo : estudiante.getPrestamosActivos()) {
                        System.out.println(prestamo);
                    }
                }
            }
        }
    }
}
