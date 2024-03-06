/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;

import java.io.File;
import java.util.ArrayList;
import persistenciaDatos.PersistenciaDeDatos;

/**
 *
 * @author Kenny Salazar
 */
public class SaveAndReaderBinary {
    BinaryFileController controlBinario = new BinaryFileController();
    
    public void guardarArchivoBinario() {
        controlBinario.write("./DataBases/archivo.bin", controlBinario.convertirATextoDeArray(PersistenciaDeDatos.estudiantes, PersistenciaDeDatos.biblio, PersistenciaDeDatos.prestamos));
        controlBinario.writeArrayLists("./DataBases/archivo2.bin", PersistenciaDeDatos.sinMora, PersistenciaDeDatos.Mora);
    }

    public void leerArchivoBinario() {
        String txt = controlBinario.read("./DataBases/archivo.bin");
        controlBinario.cargarDatosDesdeArchivo("./DataBases/archivo2.bin", PersistenciaDeDatos.sinMora, PersistenciaDeDatos.Mora);
        System.out.println("Leyendo el archivo que trae el binario");
        System.out.println(txt);
        controlBinario.convertirtxtAArray(txt, PersistenciaDeDatos.biblio, PersistenciaDeDatos.estudiantes, PersistenciaDeDatos.prestamos);
        
    }
    
    
}
