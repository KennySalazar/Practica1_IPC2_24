/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cargaDeDatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;

/**
 *
 * @author DAVID
 */
public class Lector {

    private FileReader archivo;
    private BufferedReader lector;
    private int linea;
    private ArrayList<String> erroresDeCarga;

    public Lector() {
        this.erroresDeCarga = new ArrayList<>();
        this.linea = 0;
    }

    public void leer(File archivo1, ArrayList<Libro> biblio, ArrayList<Estudiante> estudiantes, ArrayList<Prestamo> prestamos) {
        try {
            //archivo = new FileReader("C:\\Users\\DAVID\\Desktop\\practica 1\\Practica1_IPC2PS24\\entrada\\pruebaa.txt");
            archivo = new FileReader(archivo1.getPath());
            lector = new BufferedReader(archivo);
            if (archivo.ready()) {
                String texto = null;
                String titulo = null;
                String autor = null;
                String codigo = "";
                String cantidad = null;
                String carnet = null;
                String nombre = null;
                String carrera = "";
                String codigoLibrom = "";
                String carnetP = null;
                String fecha = null;
                int caso = 0;
                int casoE = 0;
                int casoP = 0;
                String entidad = "";
                while ((texto = lector.readLine()) != null) {
                    linea++;
                    if (texto.equals("ï»¿LIBRO") || texto.equals("﻿LIBRO")) {
                        entidad = "LIBRO";
                    } else if (texto.equals("ï»¿ESTUDIANTE") || texto.equals("ESTUDIANTE")) {
                        entidad = "ESTUDIANTE";
                    } else if (texto.equals("ï»¿PRESTAMO") || texto.equals("PRESTAMO")) {
                        entidad = "PRESTAMO";
                    }
                    if (entidad.equals("LIBRO")) {
                        String expresionR = "^\\d{3}-[A-Z]{3}$";
                        Pattern pattern = Pattern.compile(expresionR);
                        Matcher matcher = pattern.matcher(codigo);
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
                                matcher = pattern.matcher(codigo);
                                caso = 4;
                                break;
                            case 4:
                                String[] cadenaN = texto.split("CANTIDAD:");
                                cantidad = cadenaN[1].trim();
                                caso = 0;
                                if (matcher.matches()) {
                                    Libro newLibro = new Libro(titulo, autor, codigo, Integer.parseInt(cantidad), "", "");
                                    System.out.println(newLibro);
                                    biblio.add(newLibro);
                                } else {
                                    String error = "El codigo del libro " + codigo + " es invalido, en linea: " + linea;
                                    this.erroresDeCarga.add(error);
                                    System.out.println(error);
                                }

                                break;
                            default:
                                throw new AssertionError();
                        }
                    } else if (entidad.equals("ESTUDIANTE")) {
                        String expresionR = "[1-5]{1}";
                        Pattern pattern = Pattern.compile(expresionR);
                        Matcher matcher = pattern.matcher(carrera);
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
                                matcher = pattern.matcher(carrera);
                                casoE = 0;
                                if (matcher.matches()) {
                                    Estudiante estudiante = new Estudiante(Integer.parseInt(carnet), nombre, Integer.parseInt(carrera), "");
                                    System.out.println(estudiante);
                                    estudiantes.add(estudiante);
                                } else {
                                    String error = "El codigo de carrera " + carrera + " es invalido, en linea: " + linea;
                                    this.erroresDeCarga.add(error);
                                    System.out.println(error);
                                }
                                break;
                            default:
                                throw new AssertionError();
                        }
                    } else if (entidad.equals("PRESTAMO")) {
                        String expresionR = "^\\d{3}-[A-Z]{3}$";
                        Pattern pattern = Pattern.compile(expresionR);
                        Matcher matcher = pattern.matcher(codigoLibrom);
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
                                matcher = pattern.matcher(codigoLibrom);
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
                                if (matcher.matches()) {
                                    Prestamo prestamo = new Prestamo(codigoLibrom, carnetP, fecha);
                                    System.out.println(prestamo);
                                    prestamos.add(prestamo);
                                } else {
                                    String error = "El codigo del libro " + codigoLibrom + " es invalido, en linea: " + linea;
                                    this.erroresDeCarga.add(error);
                                    System.out.println(error);
                                }
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
