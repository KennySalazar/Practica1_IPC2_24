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
    private int SinMora;
    private String fecha;

    public sinMora(int SinMora, String fecha) {
        this.SinMora = SinMora;
        this.fecha = fecha;
    }

    public int getSinmora() {
        return SinMora;
    }

    public String getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Sinmora=" + SinMora + ", fecha=" + fecha ;
    }
    
}
