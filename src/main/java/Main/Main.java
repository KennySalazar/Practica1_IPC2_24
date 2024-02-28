/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

import data_Base.fileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kenny Salazar
 */
public class Main {

    public static void main(String[] args) throws IOException {
        fileReader FR = new fileReader();
        FR.abrirChosser();
    }
}
