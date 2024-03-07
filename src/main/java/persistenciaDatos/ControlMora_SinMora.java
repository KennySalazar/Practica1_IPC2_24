/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistenciaDatos;

import DataBase.SaveAndReaderBinary;
import Reportes.Mora;
import Reportes.sinMora;
import cargaDeDatos.Libro;
import java.io.Serializable;
import javax.swing.JTable;

/**
 *
 * @author denil
 */
//clase serializable para poder guardar en los arrayList 
public class ControlMora_SinMora implements Serializable {
    SaveAndReaderBinary LyE = new SaveAndReaderBinary();

    //metodo para guardar el array SinMora
    public void guardarSinMora(int SinMora, String fecha, String prestamo, JTable tabla) {
        sinMora nuevo = new sinMora(SinMora, fecha, prestamo);
        PersistenciaDeDatos.sinMora.add(nuevo);
        System.out.println(nuevo);
        LyE.guardarArchivoBinario();
    }
    //metodo para guardar el array con Mora
    public void guardarMora(int mora, String fecha,String prestamo, JTable tabla) {
        Mora nuevo = new Mora(mora, fecha, prestamo);
        PersistenciaDeDatos.Mora.add(nuevo);
        System.out.println(nuevo);
        LyE.guardarArchivoBinario();
    }
}
