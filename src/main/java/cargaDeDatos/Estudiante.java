package cargaDeDatos;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAVID
 */
public class Estudiante {
    
    private int carnet;
    private String nombre;
    private int carrera;
    private String fechaNacimiento;
    private ArrayList<Prestamo> prestamosActivos;
    private ArrayList<Prestamo> historial;

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCarrera() {
        return carrera;
    }

    public void setCarrera(int carrera) {
        this.carrera = carrera;
    }

    public String getFechaNacimiento() {
        if(fechaNacimiento.equalsIgnoreCase("")){
            fechaNacimiento=" ";
        }
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Estudiante(int carnet, String nombre, int carrera, String fechaNacimiento) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.carrera = carrera;
        this.fechaNacimiento = fechaNacimiento;
        this.prestamosActivos = new ArrayList<>();
        this.historial = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Estudiante{" + "carnet=" + carnet + ", nombre=" + nombre + ", carrera=" + carrera +", nacimiento="+fechaNacimiento+ '}';
    }

    public ArrayList<Prestamo> getPrestamosActivos() {
        return prestamosActivos;
    }

    public void setLibrosPrestados(ArrayList<Prestamo> librosPrestados) {
        this.prestamosActivos = librosPrestados;
    }

    public ArrayList<Prestamo> getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList<Prestamo> historial) {
        this.historial = historial;
    }

    
}
