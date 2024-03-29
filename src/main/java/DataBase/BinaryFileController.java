package DataBase;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Kenny Salazar
 */
import Reportes.Mora;
import Reportes.sinMora;
import cargaDeDatos.Estudiante;
import cargaDeDatos.Libro;
import cargaDeDatos.Prestamo;
import java.io.*;
import java.util.ArrayList;

public class BinaryFileController {

    //metodo para leer dos arrayList
    //esto se hizo afuera para evitar problemas con la lectura del txt
    public  void writeArrayLists(String nombreArchivo, ArrayList<sinMora> sinMoraList, ArrayList<Mora> moraList) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nombreArchivo))) {
            for (sinMora dato : sinMoraList) {
                writer.println("sinMora: " + dato);
            }
            for (Mora dato : moraList) {
                writer.println("Mora: " + dato);
            }
            System.out.println("Se almacenaron los datos en el archivo txt.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("No se pudieron almacenar los datos en el archivo txt.");
        }
    }
    //lectura del arrayList de moras y prestamos esto se hizo asi por la estructura distinta 
     public void cargarDatosDesdeArchivo(String nombreArchivo, ArrayList<sinMora> sinMoraList, ArrayList<Mora> moraList) {
        try (BufferedReader lectura = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = lectura.readLine()) != null) {
                if (linea.startsWith("sinMora:")) {
                    // Parsea los datos para crear un objeto sinMora
                    String[] partes = linea.split(", ");
                    int mora = Integer.parseInt(partes[0].split("=")[1]);
                    String fecha = partes[1].split("=")[1];
                    String prestamo = partes[2].split("=")[1];
                    sinMoraList.add(new sinMora(mora, fecha, prestamo));
                } else if (linea.startsWith("Mora:")) {
                    // Parsea los datos para crear un objeto Mora
                    String[] partes = linea.split(", ");
                    int mora = Integer.parseInt(partes[0].split("=")[1]);
                    String fecha = partes[1].split("=")[1];
                    String prestamo = partes[2].split("=")[1];
                    moraList.add(new Mora(mora, fecha, prestamo));
                }
            }
            System.out.println("Datos cargados en los ArrayList.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al leer el archivo.");
        }
    }

     
        public void write(String name, String texto) {
        try {
            File file = new File(name);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(texto);
            objectOutputStream.close();
            System.out.println("archivo almacenado");
        } catch (IOException e) {
            System.out.println("Archivo no encontrado");
        }
    }
        
    public String read(String name) {
        String datos = "";
        try {
            File file = new File(name);
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            datos = (String) objectInputStream.readObject();
            //System.out.println(datos);
            objectInputStream.close();
        } catch (IOException e) {
            System.out.println("Archivo no encontrado");
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada");
        }
        return datos;
    }

    public String convertirATextoDeArray(ArrayList<Estudiante> est, ArrayList<Libro> lb, ArrayList<Prestamo> ps) {
        String txt = "";
        for (Libro l : lb) {
            txt += "LIBRO\n" + "TITULO:" + l.getTitulo() + "\nAUTOR:" + l.getAutor() + "\nCODIGO:" + l.getCodigo() + "\nCANTIDAD:" + l.getCantidad()
                    + "\nFECHAPUBLICACION:" + l.getFechaDePublicacion() + "\nEDITORIAL:" + l.getEditorial() + "\n\n";
        }
        for (Estudiante e : est) {
            txt += "ESTUDIANTE\n" + "CARNET:" + e.getCarnet() + "\nNOMBRE:" + e.getNombre() + "\nCARRERA:" + e.getCarrera()
                    + "\nFECHANACIMIENTO:" + e.getFechaNacimiento() + "\n\n";
        }
        for (Prestamo p : ps) {
            txt += "PRESTAMO\nCODIGOLIBRO:" + p.getCodigoLibro() + "\nCARNET:" + p.getCarnetE()
                    + "\nFECHA:" + p.getFecha() + "\n\n";
        }
        return txt;
    }

    public void convertirtxtAArray(String archivo, ArrayList<Libro> biblio, ArrayList<Estudiante> estudiantes, ArrayList<Prestamo> prestamos) {
        try {
            //archivo = new FileReader("C:\\Users\\DAVID\\Desktop\\practica 1\\Practica1_IPC2PS24\\entrada\\pruebaa.txt");

            if (!archivo.equalsIgnoreCase(" ")) {
                //String texto="";
                System.out.println("empezando a leer el archivo para los arraylist");
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
                String fechaPublicacion = null;
                String editorial = null;
                String fechaNacimiento = null;
                int caso = 0;
                int casoE = 0;
                int casoP = 0;
                String entidad = "";
                for (String texto : archivo.split("\n")) {

                    if (texto.equals("ï»¿LIBRO") || texto.equals("LIBRO")) {
                        entidad = "LIBRO";
                    } else if (texto.equals("ï»¿ESTUDIANTE") || texto.equals("ESTUDIANTE")) {
                        entidad = "ESTUDIANTE";
                    } else if (texto.equals("ï»¿PRESTAMO") || texto.equals("PRESTAMO")) {
                        entidad = "PRESTAMO";
                    }
                    System.out.println("La entidad es: " + entidad);
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
                                
                                caso = 5;
                                break;
                            case 5:
                                
                                String[] cadenaF = texto.split("FECHAPUBLICACION:");
                                fechaPublicacion = cadenaF[1].trim();
                                
                                caso = 6;
                                break;
                            case 6:
                               
                                String[] cadenaE = texto.split("EDITORIAL:");
                                editorial = cadenaE[1].trim();
                                caso = 0;
                                Libro newLibro = new Libro(titulo, autor, codigo, Integer.parseInt(cantidad), fechaPublicacion, editorial);
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
                                casoE = 4;
                                break;
                            case 4:
                                String[] cadenafecha = texto.split("FECHANACIMIENTO:");
                                fechaNacimiento = cadenafecha[1].trim();
                                casoE = 0;
                                Estudiante estudiante = new Estudiante(Integer.parseInt(carnet), nombre, Integer.parseInt(carrera), fechaNacimiento);
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
            System.out.println("Error al leer el archivo" + e.getLocalizedMessage());
        }
    }

}
