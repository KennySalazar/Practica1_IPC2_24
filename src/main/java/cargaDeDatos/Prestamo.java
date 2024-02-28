/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cargaDeDatos;

/**
 *
 * @author DAVID
 */
public class Prestamo {
    
    private String codigoLibro;
    private String carnetE;
    private String fecha;

    public Prestamo(String codigoLibro, String carnetE, String fecha) {
        this.codigoLibro = codigoLibro;
        this.carnetE = carnetE;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "codigoLibro=" + codigoLibro + ", carnetE=" + carnetE + ", fecha=" + fecha + '}';
    }
    
    
}
