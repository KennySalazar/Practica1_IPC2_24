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
    
    //cantidad de cada prestamo y la fecha actual
    private int mora;
    private String fecha;

    public Mora(int mora, String fecha) {
        this.mora = mora;
        this.fecha = fecha;
    }

    public int getMora() {
        return mora;
    }

    public String getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "mora=" + mora + ", fecha=" + fecha;
    }
    
}
