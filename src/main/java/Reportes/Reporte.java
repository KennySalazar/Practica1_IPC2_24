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
import javax.swing.JTextPane;
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
    private ArrayList<sinMora> devolusiones;
    private int fondosSinMora = 0;
    private int fondosConMora = 0;

    public Reporte() {
        this.prestamosCarrera = new ArrayList<>();
        this.prestamosIntervalo = new ArrayList<>();
        this.moras = new ArrayList<>();
        this.sinMoras = new ArrayList<>();
        this.devolusiones = new ArrayList<>();
        this.moras = new ArrayList<>();
        this.prestamosEntrega = new ArrayList<>();
    }

    // recorre los rpestamos
    public ArrayList<Prestamo> recorrerPrestamos() {
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
        return prestamosEntrega;
    }

    //metodo para mostrar historial de prestamos que el estudiante ya ha devuelto
    public ArrayList<Prestamo> historialEstudiante(int carnet) {
        ArrayList<Prestamo> historial = null;
        for (Estudiante estudiante : estudiantes) {
            if (carnet == estudiante.getCarnet()) {
                if (estudiante.getHistorial().isEmpty()) {
                    historial = estudiante.getHistorial();
                    System.out.println("El estudiante: " + estudiante.getNombre() + " no tiene historial de prestamos");
                } else {
                    for (Prestamo prestamo : estudiante.getHistorial()) {
                        System.out.println(prestamo);
                    }
                    historial = estudiante.getHistorial();
                }
            }
        }
        return historial;
    }

    public ArrayList<Prestamo> prestamosEstudiante(int carnet) {
        ArrayList<Prestamo> activos = null;
        for (Estudiante estudiante : estudiantes) {
            if (carnet == estudiante.getCarnet()) {
                if (estudiante.getPrestamosActivos().isEmpty()) {
                    activos = estudiante.getPrestamosActivos();
                    System.out.println("El estudiante: " + estudiante.getNombre() + " no tiene prestamos actualmente");
                } else {
                    for (Prestamo prestamo : estudiante.getPrestamosActivos()) {
                        System.out.println(prestamo);
                    }
                    activos = estudiante.getPrestamosActivos();
                }
            }
        }
        return activos;
    }

    //metodo que verifica presstamos en intervalo de timepo 
    public ArrayList<Prestamo> prestamosEnIntervalo(Date dateUno, Date dateDos) throws ParseException {
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
        return prestamosIntervalo;

    }

    // metodo que verifica prestamos en intervalo de tiempo pero en array de carreras
    public ArrayList<Prestamo> prestamosEnIntervaloCarrera(Date dateUno, Date dateDos) throws ParseException {
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
        return prestamosIntervalo;
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

    public void calcularFondos(int caso, JTextPane panel) {
        fondosSinMora = 0;
        fondosConMora = 0;
        String text = "";
        switch (caso) {
            case 1:
                for (sinMora sinMora1 : this.sinMoras) {
                    text += sinMora1.getPrestamo()+"\n";
                    fondosSinMora += sinMora1.getSinmora();
                }
                for (Mora mora : this.moras) {
                    text += mora.getPrestamo()+"\n";
                    fondosConMora += mora.getMora();
                }

                System.out.println("fondos por prestamos recaudados: " + fondosSinMora);
                System.out.println("fondos por Moras recaudados: " + fondosConMora);
                System.out.println("total de fontos: " + (fondosSinMora + fondosConMora));
                break;
            case 2:
                for (sinMora sinMora1 : sinMora) {
                    text += sinMora1.getPrestamo()+"\n";
                    fondosSinMora += sinMora1.getSinmora();
                }
                for (Mora mora : Mora) {
                    text += mora.getPrestamo()+"\n";
                    fondosConMora += mora.getMora();
                }

                System.out.println("fondos por prestamos recaudados: " + fondosSinMora);
                System.out.println("fondos por Moras recaudados: " + fondosConMora);
                System.out.println("total de fontos: " + (fondosSinMora + fondosConMora));

                break;
            default:
                throw new AssertionError();
        }
        panel.setText(text);
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
                            if (estudiante.getCarrera() == 2) {
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
                            if (estudiante.getCarrera() == 4) {
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
                            if (estudiante.getCarrera() == 5) {
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
    public ArrayList<Prestamo> mostrarPrestamosCarrera() {
        for (Prestamo prestamo : prestamosCarrera) {
            System.out.println(prestamo);
        }
        return prestamosCarrera;
    }

    public int getFondosSinMora() {
        return fondosSinMora;
    }

    public void setFondosSinMora(int fondosSinMora) {
        this.fondosSinMora = fondosSinMora;
    }

    public int getFondosConMora() {
        return fondosConMora;
    }

    public void setFondosConMora(int fondosConMora) {
        this.fondosConMora = fondosConMora;
    }
    
}
