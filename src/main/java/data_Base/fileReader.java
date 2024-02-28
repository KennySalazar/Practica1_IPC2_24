/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data_Base;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.plaf.FileChooserUI;

/**
 *
 * @author denil
 */
//clase para poder leer archivos con file chowser
public class fileReader {
    //file chosser 
    JFileChooser fileChooser = new JFileChooser();
    int returnValue = fileChooser.showOpenDialog(null);
   
    //arrays
    ArrayList<arrayBooks> books = new ArrayList<>();
    ArrayList<arrayStudent> student = new ArrayList<>();
    ArrayList<arrayLoans> loans = new ArrayList<>();
    
    //lector de file chosser
    public void abrirChosser() throws IOException {
        System.out.println("si se esta llegando a este metodo");
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            if (selectedFile.exists() && selectedFile.isFile()) {
                 File file = fileChooser.getSelectedFile();
                // Aquí puedes trabajar con el archivo seleccionado
                System.out.println("Selecione el Archivo " + selectedFile.getAbsolutePath());
                System.out.println(file);
                storage( file, books, student, loans);
                
            } else {
                JOptionPane.showMessageDialog(null, "Error: No se seleccionó un archivo válido.");
            }
        } else if (returnValue == JFileChooser.CANCEL_OPTION) {
            System.out.println("No se seleeciono nada.");
        } else if (returnValue == JFileChooser.ERROR_OPTION) {
            JOptionPane.showMessageDialog(null, "Error: Ocurrió un problema al seleccionar el archivo.");
        }else{
            System.out.println("erro");
        }
        System.out.println("Libros");
        for (arrayBooks book : books) {
            System.out.println(book);
        }
        System.out.println("Estudiantes");
         for (arrayStudent students : student) {
            System.out.println(students);
        }
         System.out.println("Prestamos");
          for (arrayLoans pres : loans) {
            System.out.println(pres);
        }
    }
    
    
        public static void storage(File file, ArrayList<arrayBooks> books, ArrayList<arrayStudent> student, ArrayList<arrayLoans> loans) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.equals("LIBRO")) {
                    // Comienza a leer los datos de un libro
                    arrayBooks book = leerLibro(br);
                    if (book != null) {
                        books.add(book);
                    }
                } else if (line.equals("ESTUDIANTE")) {
                    arrayStudent students = leerEstudiante(br);
                    if (students != null) {
                        student.add(students);
                    // Comienza a leer los datos de un estudiante
                    // Implementa la lógica para leer y almacenar datos de estudiantes aquí
                    }
                } else if (line.equals("PRESTAMO")) {
                    arrayLoans pres = leerPrestamos(br);
                    if (pres != null) {
                        loans.add(pres);
                }
                    // Comienza a leer los datos de un préstamo
                    // Implementa la lógica para leer y almacenar datos de préstamos aquí
                } else {
                    // Otra lógica o línea desconocida
                }
            }
            
        }
            
         catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al leer el archivo");
        }
    }
        

    public static arrayBooks leerLibro(BufferedReader br) throws IOException {
        String line;
        String titulo = null;
        String autor = null;
        String codigo = null;
        int cantidad = 0;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            String[] parts = line.split(":");
            if (parts.length < 2) {
                // Línea mal formateada, salta al siguiente
                continue;
            }
            String key = parts[0].trim();
            String value = parts[1].trim();
            switch (key) {
                case "TITULO":
                    titulo = value;
                    break;
                case "AUTOR":
                    autor = value;
                    break;
                case "CODIGO":
                    codigo = value;
                    break;
                case "CANTIDAD":
                    try {
                        cantidad = Integer.parseInt(value);
                    } catch (NumberFormatException e) {
                        System.err.println("Error al parsear cantidad: " + e.getMessage());
                    }
                    break;
                default:
                    // Clave desconocida, ignorar o manejar según sea necesario
                    break;
            }
        }
        if (titulo != null && autor != null && codigo != null) {
            return new arrayBooks("LIBRO", titulo, autor, codigo, cantidad);
        } else {
            // Los datos del libro están incompletos
            return null;
        }
    }
    
    public static arrayStudent leerEstudiante(BufferedReader br) throws IOException {
        String line;
        int carnet = 0;
        String nombre = null;
        int carrera = 0;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            String[] parts = line.split(":");
            if (parts.length < 2) {
                // Línea mal formateada, salta al siguiente
                continue;
            }
            String key = parts[0].trim();
            String value = parts[1].trim();
            switch (key) {
                case "CARNET":
                   try {
                        carnet = Integer.parseInt(value);
                    } catch (NumberFormatException e) {
                        System.err.println("Error al parsear cantidad: " + e.getMessage());
                    }
                    break;
                case "NOMBRE":
                    nombre = value;
                    break;
                case "CARRERA":
                     try {
                        carrera = Integer.parseInt(value);
                    } catch (NumberFormatException e) {
                        System.err.println("Error al parsear cantidad: " + e.getMessage());
                    }
                    break;
                
                default:
                    // Clave desconocida, ignorar o manejar según sea necesario
                    break;
            }
        }
        if (carnet != 0 && nombre != null && carrera != 0) {
            return new arrayStudent("ESTUDIANTE", carnet, nombre, carrera);
        } else {
            // Los datos del libro están incompletos
            return null;
        }
    }
    public static arrayLoans leerPrestamos(BufferedReader br) throws IOException {
        String line;
        String codeBooks = null;
        int carnet = 0;
        String date = null;
        
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            String[] parts = line.split(":");
            if (parts.length < 2) {
                // Línea mal formateada, salta al siguiente
                continue;
            }
            String key = parts[0].trim();
            String value = parts[1].trim();
            switch (key) {
                case "CODIGOLIBRO":
                    codeBooks = value;
                    break;
                case "CARNET":
                    try {
                        carnet = Integer.parseInt(value);
                    } catch (NumberFormatException e) {
                        System.err.println("Error al parsear cantidad: " + e.getMessage());
                    }
                    break;
                case "FECHA":
                    date = value;
                    break;
                
                default:
                    // Clave desconocida, ignorar o manejar según sea necesario
                    break;
            }
        }
        int a = 15;
        if (codeBooks != null && carnet != 0 && date != null) {
            return new arrayLoans("PRESTAMOS", codeBooks, carnet, date);
        } else {
            // Los datos del libro están incompletos
            return null;
        }
    }
    }

