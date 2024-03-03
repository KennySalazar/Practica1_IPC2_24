/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cargaDeDatos;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

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
    
    public boolean seEntrega(){
        
        return true;
    }

    public String getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public String getCarnetE() {
        return carnetE;
    }

    public void setCarnetE(String carnetE) {
        this.carnetE = carnetE;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "codigoLibro=" + codigoLibro + ", carnetE=" + carnetE + ", fecha=" + fecha + '}';
    }
    
    
}
