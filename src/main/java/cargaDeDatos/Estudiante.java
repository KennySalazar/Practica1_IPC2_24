package cargaDeDatos;

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
    }

    @Override
    public String toString() {
        return "Estudiante{" + "carnet=" + carnet + ", nombre=" + nombre + ", carrera=" + carrera +", nacimiento="+fechaNacimiento+ '}';
    }

    
}
