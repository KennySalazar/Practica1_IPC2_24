/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reportes;

import cargaDeDatos.Estudiante;
import cargaDeDatos.Prestamo;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import static persistenciaDatos.PersistenciaDeDatos.Mora;
import static persistenciaDatos.PersistenciaDeDatos.estudiantes;
import static persistenciaDatos.PersistenciaDeDatos.prestamos;
import static persistenciaDatos.PersistenciaDeDatos.sinMora;

/**
 *
 * @author DAVID
 */
public class Reporte {

    private ArrayList<Prestamo> prestamosEntrega;
    private ArrayList<Prestamo> prestamosIntervalo;
    private ArrayList<Mora> moras;
    private ArrayList<sinMora> sinMoras;
    private ArrayList<Prestamo> prestamosCarrera;

    public Reporte() {
        this.prestamosCarrera = new ArrayList<>();
        this.prestamosIntervalo = new ArrayList<>();
        this.moras = new ArrayList<>();
        this.sinMoras = new ArrayList<>();
        this.prestamosEntrega = new ArrayList<>();
    }

    // recorre los rpestamos
    public void recorrerPrestamos() {
        for (Prestamo prestamo : prestamos) {
            if (prestamo.seEntrega()) {
                if (prestamosEntrega.isEmpty()) {
                    prestamosEntrega.add(prestamo);
                } else {
                    for (Prestamo prestamo1 : prestamosEntrega) {
                        if (prestamo.equals(prestamo1)) {
                            break;
                        } else {
                            prestamosEntrega.add(prestamo);
                            break;
                        }
                    }
                }

            }
        }
        for (Prestamo prestamo : prestamosEntrega) {
            System.out.println(prestamo);
        }
        System.out.println("prestamos de entrega hoy, cargados");
    }

    //metodo para mostrar historial de prestamos que el estudiante ya ha devuelto
    public void historialEstudiante(int carnet) {
        for (Estudiante estudiante : estudiantes) {
            if (carnet == estudiante.getCarnet()) {
                if (estudiante.getHistorial().isEmpty()) {
                    System.out.println("El estudiante: " + estudiante.getNombre() + " no tiene historial de prestamos");
                } else {
                    for (Prestamo prestamo : estudiante.getHistorial()) {
                        System.out.println(prestamo);
                    }
                }
            }
        }
    }

    public void prestamosEstudiante(int carnet) {
        for (Estudiante estudiante : estudiantes) {
            if (carnet == estudiante.getCarnet()) {
                if (estudiante.getPrestamosActivos().isEmpty()) {
                    System.out.println("El estudiante: " + estudiante.getNombre() + " no tiene prestamos actualmente");
                } else {
                    for (Prestamo prestamo : estudiante.getPrestamosActivos()) {
                        System.out.println(prestamo);
                    }
                }
            }
        }
    }

    //metodo que verifica presstamos en intervalo de timepo 
    public void prestamosEnIntervalo(Date dateUno, Date dateDos) throws ParseException {
        this.prestamosIntervalo.clear();
        String pattern = "yyyy-MM-dd";
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        Date fechaVerificar = null;
        for (Prestamo prestamo : prestamos) {
            fechaVerificar = dateFormat.parse(prestamo.getFecha());
            if (fechaVerificar.after(dateUno) && fechaVerificar.before(dateDos)) {
                this.prestamosIntervalo.add(prestamo);
            } else {
            }
        }

    }

    // metodo que verifica prestamos en intervalo de tiempo pero en array de carreras
    public void prestamosEnIntervaloCarrera(Date dateUno, Date dateDos) throws ParseException {
        this.prestamosIntervalo.clear();
        String pattern = "yyyy-MM-dd";
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        Date fechaVerificar = null;
        for (Prestamo prestamo : this.prestamosCarrera) {
            fechaVerificar = dateFormat.parse(prestamo.getFecha());
            if (fechaVerificar.after(dateUno) && fechaVerificar.before(dateDos)) {
                this.prestamosIntervalo.add(prestamo);
            }
        }

    }

    public void interMoras(Date dateUno, Date dateDos) throws ParseException {
        this.moras.clear();
        String pattern = "yyyy-MM-dd";
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        Date fechaVerificar = null;
        for (Mora mora : Mora) {
            fechaVerificar = dateFormat.parse(mora.getFecha());
            if (fechaVerificar.after(dateUno) && fechaVerificar.before(dateDos)) {
                this.moras.add(mora);
            }
        }

    }

    public void interSinMoras(Date dateUno, Date dateDos) throws ParseException {
        this.sinMoras.clear();
        String pattern = "yyyy-MM-dd";
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        Date fechaVerificar = null;
        for (sinMora sMora : sinMora) {
            fechaVerificar = dateFormat.parse(sMora.getFecha());
            if (fechaVerificar.after(dateUno) && fechaVerificar.before(dateDos)) {
                this.sinMoras.add(sMora);
            }
        }

    }

    public void calcularFondos(int caso) {
        int fondosSinMora = 0;
        int fondosConMora = 0;
        switch (caso) {
            case 1:
                for (sinMora sinMora1 : this.sinMoras) {
                    fondosSinMora += sinMora1.getSinmora();
                }
                for (Mora mora : this.moras) {
                    fondosConMora += mora.getMora();
                }

                System.out.println("fondos por prestamos recaudados: " + fondosSinMora);
                System.out.println("fondos por Moras recaudados: " + fondosConMora);
                System.out.println("total de fontos: " + (fondosSinMora + fondosConMora));
                break;
            case 2:
                for (sinMora sinMora1 : sinMora) {
                    fondosSinMora += sinMora1.getSinmora();
                }
                for (Mora mora : Mora) {
                    fondosConMora += mora.getMora();
                }

                System.out.println("fondos por prestamos recaudados: " + fondosSinMora);
                System.out.println("fondos por Moras recaudados: " + fondosConMora);
                System.out.println("total de fontos: " + (fondosSinMora + fondosConMora));

                break;
            default:
                throw new AssertionError();
        }
    }

    //metodo para mostrar los prestamos segun carrera en intervalo dado 
    public void mostrarIntervaloSinCarrera(Date dateUno, Date dateDos) throws ParseException {
        prestamosEnIntervalo(dateUno, dateDos);
        if (!prestamosIntervalo.isEmpty()) {
            for (Prestamo prestamo : prestamosIntervalo) {
                System.out.println(prestamo);
            }
        } else {
            System.out.println("no hay prestamos en ese intervalo de tiempo");
        }

    }

    public void mostrarInter() {
        if (!prestamosIntervalo.isEmpty()) {
            for (Prestamo prestamo : prestamosIntervalo) {
                System.out.println(prestamo);

            }
        } else {
            System.out.println("no hay prestamos en ese intervalo de tiempo");
        }

    }

    //metodo para clasificar los prestamos segun carrera
    public void clasificarPrestamos(int carrera) {
        this.prestamosCarrera.clear();
        switch (carrera) {
            case 1:
                for (Prestamo prestamo : prestamos) {
                    int carnet = Integer.parseInt(prestamo.getCarnetE());
                    for (Estudiante estudiante : estudiantes) {
                        if (estudiante.getCarnet() == carnet) {
                            if (estudiante.getCarrera() == 1) {
                                this.prestamosCarrera.add(prestamo);
                                break;
                            }
                        }
                    }
                }
                break;
            case 2:
                for (Prestamo prestamo : prestamos) {
                    int carnet = Integer.parseInt(prestamo.getCarnetE());
                    for (Estudiante estudiante : estudiantes) {
                        if (estudiante.getCarnet() == carnet) {
                            if (estudiante.getCarrera() == 1) {
                                this.prestamosCarrera.add(prestamo);
                                break;
                            }
                        }
                    }
                }
                break;
            case 3:
                for (Prestamo prestamo : prestamos) {
                    int carnet = Integer.parseInt(prestamo.getCarnetE());
                    for (Estudiante estudiante : estudiantes) {
                        if (estudiante.getCarnet() == carnet) {
                            if (estudiante.getCarrera() == 1) {
                                this.prestamosCarrera.add(prestamo);
                                break;
                            }
                        }
                    }
                }
                break;
            case 4:
                for (Prestamo prestamo : prestamos) {
                    int carnet = Integer.parseInt(prestamo.getCarnetE());
                    for (Estudiante estudiante : estudiantes) {
                        if (estudiante.getCarnet() == carnet) {
                            if (estudiante.getCarrera() == 1) {
                                this.prestamosCarrera.add(prestamo);
                                break;
                            }
                        }
                    }
                }
                break;
            case 5:
                for (Prestamo prestamo : prestamos) {
                    int carnet = Integer.parseInt(prestamo.getCarnetE());
                    for (Estudiante estudiante : estudiantes) {
                        if (estudiante.getCarnet() == carnet) {
                            if (estudiante.getCarrera() == 1) {
                                this.prestamosCarrera.add(prestamo);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                throw new AssertionError();
        }
        mostrarPrestamosCarrera();
    }

    //pintar los prestamos
    public void mostrarPrestamosCarrera() {
        for (Prestamo prestamo : prestamosCarrera) {
            System.out.println(prestamo);
        }
    }
}
