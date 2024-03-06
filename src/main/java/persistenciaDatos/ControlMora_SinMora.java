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
public class ControlMora_SinMora implements Serializable {
    SaveAndReaderBinary LyE = new SaveAndReaderBinary();

    
    public void guardarSinMora(int SinMora, String fecha, JTable tabla) {
        sinMora nuevo = new sinMora(SinMora, fecha);
        PersistenciaDeDatos.sinMora.add(nuevo);
        System.out.println(nuevo);
        LyE.guardarArchivoBinario();
    }
    
    public void guardarMora(int mora, String fecha, JTable tabla) {
        Mora nuevo = new Mora(mora, fecha);
        PersistenciaDeDatos.Mora.add(nuevo);
        System.out.println(nuevo);
        LyE.guardarArchivoBinario();
    }
}
