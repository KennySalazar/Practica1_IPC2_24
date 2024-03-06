/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cargaDeDatos;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author DAVID
 */
public class Prestamo {

    private String codigoLibro;
    private String carnetE;
    private String fecha;
    private Date entrega;

    public Prestamo(String codigoLibro, String carnetE, String fecha) {
        this.codigoLibro = codigoLibro;
        this.carnetE = carnetE;
        this.fecha = fecha;
    }
    
    

    public boolean seEntrega() {
        String pattern = "yyyy-MM-dd";
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        try {
            // Parsear el String y obtener un objeto Date
            Date date = dateFormat.parse(fecha);
            int adelantar = 2;

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.DAY_OF_MONTH, adelantar);
            entrega = calendar.getTime();
            // Obtener la fecha actual como LocalDate
            LocalDate hoy = LocalDate.now();

            // Convertir hoy a today
            Date today = java.sql.Date.valueOf(hoy);

            if (entrega.equals(today)) {
                return true;
            } else {
                return false;
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return false;
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
