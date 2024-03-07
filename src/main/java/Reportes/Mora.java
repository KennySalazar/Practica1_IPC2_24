/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reportes;

import java.io.Serializable;

/**
 *
 * @author DAVID
 */
public class Mora implements Serializable {
    
    //cantidad de cada prestamo, la fecha actual y prestamos
    private int mora;
    private String fecha;
    private String prestamo;
    
    public Mora(int mora, String fecha, String prestamo) {
        this.mora = mora;
        this.fecha = fecha;
        this.prestamo = prestamo;
    }

    public int getMora() {
        return mora;
    }

    public String getFecha() {
        return fecha;
    }
    
    public String getPrestamo(){
        return prestamo;
    }

    @Override
    public String toString() {
        return "mora=" + mora + ", fecha=" + fecha + ", prestamo=" + prestamo;
    }
    
}
