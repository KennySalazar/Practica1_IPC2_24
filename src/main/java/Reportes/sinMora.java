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
public class sinMora implements Serializable  {
    //metodo para saber la cantidad sin mora, fecha y prestamo
    private int SinMora;
    private String fecha;
    private String prestamo;

    public sinMora(int SinMora, String fecha, String prestamo) {
        this.SinMora = SinMora;
        this.fecha = fecha;
        this.prestamo = prestamo;
    }

    public int getSinmora() {
        return SinMora;
    }

    public String getFecha() {
        return fecha;
    }
    public String getPrestamo(){
        return prestamo;
    }

    @Override
    public String toString() {
        return "Sinmora=" + SinMora + ", fecha=" + fecha  + ", prestamo=" + prestamo;
    }
    
}
