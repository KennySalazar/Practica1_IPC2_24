/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cargaDeDatos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author DAVID
 */
public class Lector {
    
    private FileReader archivo;
    private BufferedReader lector;
    private ArrayList<Libro> biblio;
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Prestamo> prestamos;
    
    public Lector(){
        this.biblio = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }
    
    public void leer() {
        try {
            //archivo = new FileReader("C:\\Users\\DAVID\\Desktop\\practica 1\\Practica1_IPC2PS24\\entrada\\pruebaa.txt");
            archivo = new FileReader("C:\\Users\\Kenny Salazar\\Documents\\NetBeansProjects\\Practica1_IPC2_24\\resources\\data.txt");
            lector = new BufferedReader(archivo);
            if (archivo.ready()) {
                String texto;
                String titulo = null;
                String autor = null;
                String codigo = null;
                String cantidad = null;
                String carnet = null;
                String nombre = null;
                String carrera = null;
                String codigoLibrom = null;
                String carnetP = null;
                String fecha = null;
                int caso = 0;
                int casoE = 0;
                int casoP = 0;
                String entidad = "";
                while ((texto = lector.readLine()) != null) {
                    
                    if (texto.equals("ï»¿LIBRO") || texto.equals("LIBRO")) {
                        entidad = "LIBRO";
                    } else if (texto.equals("ï»¿ESTUDIANTE") || texto.equals("ESTUDIANTE")) {
                        entidad = "ESTUDIANTE";
                    } else if (texto.equals("ï»¿PRESTAMO") || texto.equals("PRESTAMO")) {
                        entidad = "PRESTAMO";
                    }
                    if (entidad.equals("LIBRO")) {
                        switch (caso) {
                            case 0:
                                if (texto.equals("")) {
                                    break;
                                }
                                caso = 1;
                                break;
                            case 1:
                                String[] cadenaT = texto.split("TITULO:");
                                titulo = cadenaT[1].trim();
                                caso = 2;
                                break;
                            case 2:
                                String[] cadenaA = texto.split("AUTOR:");
                                autor = cadenaA[1].trim();
                                caso = 3;
                                break;
                            case 3:
                                String[] cadenaC = texto.split("CODIGO:");
                                codigo = cadenaC[1].trim();
                                caso = 4;
                                break;
                            case 4:
                                String[] cadenaN = texto.split("CANTIDAD:");
                                cantidad = cadenaN[1].trim();
                                caso = 0;
                                Libro newLibro = new Libro(titulo, autor, codigo, cantidad);
                                System.out.println(newLibro);
                                biblio.add(newLibro);
                                break;
                            default:
                                throw new AssertionError();
                        }
                    } else if (entidad.equals("ESTUDIANTE")) {
                        switch (casoE) {
                            case 0:
                                if (texto.equals("")) {
                                    break;
                                }
                                casoE = 1;
                                break;
                            case 1:
                                String[] cadenaC = texto.split("CARNET:");
                                carnet = cadenaC[1].trim();
                                casoE = 2;
                                break;
                            case 2:
                                String[] cadenaN = texto.split("NOMBRE:");
                                nombre = cadenaN[1].trim();
                                casoE = 3;
                                break;
                            case 3:
                                String[] cadena = texto.split("CARRERA:");
                                carrera = cadena[1].trim();
                                casoE = 0;
                                Estudiante estudiante = new Estudiante(carnet, nombre, carrera);
                                System.out.println(estudiante);
                                estudiantes.add(estudiante);
                                break;
                            default:
                                throw new AssertionError();
                        }
                    } else if (entidad.equals("PRESTAMO")) {
                        switch (casoP) {
                            case 0:
                                if (texto.equals("")) {
                                    break;
                                }
                                casoP = 1;
                                break;
                            case 1:
                                String[] cadenaP = texto.split("CODIGOLIBRO:");
                                codigoLibrom = cadenaP[1].trim();
                                casoP = 2;
                                break;
                            case 2:
                                String[] cadenaC = texto.split("CARNET:");
                                carnetP = cadenaC[1].trim();
                                casoP = 3;
                                break;
                            case 3:
                                String[] cadenaF = texto.split("FECHA:");
                                fecha = cadenaF[1].trim();
                                casoP = 0;
                                Prestamo prestamo = new Prestamo(codigoLibrom, carnetP, fecha);
                                System.out.println(prestamo);
                                prestamos.add(prestamo);
                                break;
                            default:
                                throw new AssertionError();
                        }
                    }

                }

            } else {
                System.out.println("archivo no redy xD");
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo" + e);
        }
    }
}
