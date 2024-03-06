/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import DataBase.SaveAndReaderBinary;
import Reportes.Mora;
import Reportes.sinMora;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import persistenciaDatos.ControlDatosLibros;
import persistenciaDatos.ControlDePrestamos;
import persistenciaDatos.ControlMora_SinMora;
import persistenciaDatos.PersistenciaDeDatos;

/**
 *
 * @author denil
 */
public class regresoDeLibro extends javax.swing.JFrame {

    /**
     * Creates new form regresoDeLibro
     */
    //clase para gurdar 
    SaveAndReaderBinary LyE = new SaveAndReaderBinary();
    ControlMora_SinMora control = new ControlMora_SinMora();
    JFrame jFrame = new JFrame();
    JTable tabla;
    JTable tablaLibro;
    //logica para el obtener la fecha actual
    Date date = new Date();
    SimpleDateFormat year = new SimpleDateFormat("yyyy");
    SimpleDateFormat month = new SimpleDateFormat("MM");
    SimpleDateFormat day = new SimpleDateFormat("dd");
    String anio = year.format(date);
    String mes = month.format(date);
    String dia = day.format(date);
    String fechaHoy = anio + "-" + mes + "-" + dia;

    regresoDeLibro(JTable tabla, JTable tablaLibro) {
        this.tabla = tabla;
        this.tablaLibro = tablaLibro;
        initComponents();
    }

    public regresoDeLibro() {
        initComponents();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        codigoLibroTxField = new javax.swing.JTextField();
        carnetEstudianteTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fechaPresTextField = new javax.swing.JTextField();
        fechaFinalTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        camJLable = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        totalDayTextField = new javax.swing.JTextField();
        cuotaTextField = new javax.swing.JTextField();
        totalPagoTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(500, 475));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 475));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Datos del Libro y el Estudiante");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel2.setText("Código de Libro");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        codigoLibroTxField.setEditable(false);
        jPanel1.add(codigoLibroTxField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 230, -1));

        carnetEstudianteTextField.setEditable(false);
        jPanel1.add(carnetEstudianteTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 230, -1));

        jLabel3.setText("Fecha Actual");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        jLabel4.setText("Carnet del Estudiante");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        jLabel5.setText("Fecha De Prestamo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        fechaPresTextField.setEditable(false);
        jPanel1.add(fechaPresTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 130, -1));

        fechaFinalTextField.setEditable(false);
        jPanel1.add(fechaFinalTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 130, -1));

        jLabel6.setText("Detalles de Pago");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));

        jLabel7.setText("Dias Total");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        camJLable.setText("-----");
        jPanel1.add(camJLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        jLabel9.setText("Total a Pagar");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, -1));

        totalDayTextField.setEditable(false);
        jPanel1.add(totalDayTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 170, -1));

        cuotaTextField.setEditable(false);
        jPanel1.add(cuotaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 170, -1));

        totalPagoTextField.setEditable(false);
        jPanel1.add(totalPagoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 170, -1));

        jButton1.setText("Recibir Pago de Prestamo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, -1, -1));

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //boton para cancelar lo del estudiante
        //se cancela la eliminacion
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Boton para recibir todo lo del estudiante
        VentanaPrincipal vt = new VentanaPrincipal();
        String fecha = "";
        int total = 0;
        fecha = fechaFinalTextField.getText();
        total = Integer.parseInt(totalPagoTextField.getText());
        try {//manejo de errores
            if (verificacionPrestamo()) {//
                System.out.println("llega aca");
                if (eliminacionPrestamo()) {
                    //if para declarar los valores 
                    if (total >= 16 && total != 0) {
                        control.guardarMora(total, fecha, tabla);
                        LyE.guardarArchivoBinario();
                        System.out.println("es con mora");
                    } else {
                        control.guardarSinMora(total, fecha, tabla);
                        LyE.guardarArchivoBinario();
                        System.out.println("es sin mora");
                    }

                    JOptionPane.showMessageDialog(jFrame, "El libro se ha Regresado");
                    LyE.guardarArchivoBinario();
                    System.out.println("se ha guardado el nuevo prestamo con la mora y la fecha actual");
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(jFrame, "Ocurrio un error");
                }
            } else {
                JOptionPane.showMessageDialog(jFrame, "No existe el Libro en la base de Datos");
                this.dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jFrame, "Algo salio Mal");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.out.println("se presiona");
        for (int i = 0; i < PersistenciaDeDatos.sinMora.size(); i++) {
            System.out.println(PersistenciaDeDatos.sinMora);
        }
        for (int i = 0; i < PersistenciaDeDatos.Mora.size(); i++) {
            System.out.println(PersistenciaDeDatos.Mora);
        }

    }//GEN-LAST:event_jButton3ActionPerformed
    //llena los textField
    public void llenado(String codigo, String carnet, String fecha) {
        codigoLibroTxField.setText(codigo);
        carnetEstudianteTextField.setText(carnet);
        fechaPresTextField.setText(fecha);
        fechaFinalTextField.setText(fechaHoy);

    }

    //calculo de la mora segun el tiempo pasado, tambien se calcula sin mora
    public void diasEfectivos() {

        String dateInicio = fechaPresTextField.getText();
        String dateFinal = fechaFinalTextField.getText();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            LocalDate fechaInicio = LocalDate.parse(dateInicio, formato);
            LocalDate fechaFin = LocalDate.parse(dateFinal, formato);

            //aca se realiza la operacion de dias efectivos
            long contDiasEfectivos = 0;
            LocalDate fechaActual = fechaInicio;
            while (!fechaActual.isAfter(fechaFin)) {
                if (fechaActual.getDayOfWeek().getValue() < 8) {
                    contDiasEfectivos++;
                }
                fechaActual = fechaActual.plusDays(1);
            }

            //System.out.println("dias efectivos : " + contDiasEfectivos);
            totalDayTextField.setText(Long.toString(contDiasEfectivos));
            //if con la logica que maneja si se cobra o no la mora
            if (contDiasEfectivos >= 0 && contDiasEfectivos <= 3) {
                camJLable.setText("Sin mora:");
                int totalSinMora = 0;
                totalSinMora = (int) (contDiasEfectivos * 5);
                cuotaTextField.setText(Integer.toString((int) contDiasEfectivos));
                totalPagoTextField.setText(Integer.toString(totalSinMora));

            } else if (contDiasEfectivos != 0 && contDiasEfectivos >= 4) {
                int dias = 0;
                int total = 0;
                camJLable.setText("Tiene de mora");
                dias = (int) (contDiasEfectivos - 3);
                cuotaTextField.setText(Integer.toString(dias));
                contDiasEfectivos = dias * 10;
                total = (int) (contDiasEfectivos + 15);
                totalPagoTextField.setText(Integer.toString(total));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jFrame, "Fecha invalida, Revise el Documento");
        }
    }

    //verifica si realmente el estudiante tiene prestado el libro 
    public boolean verificacionPrestamo() {
        ControlDatosLibros controlLibro = new ControlDatosLibros();
        String codigo = "";
        codigo = codigoLibroTxField.getText();
        System.out.println(codigo);
        for (int i = 0; i < PersistenciaDeDatos.biblio.size(); i++) {
            if (PersistenciaDeDatos.biblio.get(i).getCodigo().equals(codigo)) {
                System.out.println("si esta el libro en existencia");
                int num1 = PersistenciaDeDatos.biblio.get(i).getCantidad();
                int num2 = num1 + 1;
                System.out.println("el numero es " + num2);
                PersistenciaDeDatos.biblio.get(i).setCantidad(num2);
                controlLibro.llenarTablaLibros(tablaLibro);
                return true;
            }
        }
        return false;
    }

    //elimina el prestamo en la base de datos y reajusta la base de datos
    public boolean eliminacionPrestamo() {
        ControlDePrestamos pres = new ControlDePrestamos();
        String codigo = "";
        String carnet = "";
        codigo = codigoLibroTxField.getText();
        carnet = carnetEstudianteTextField.getText();
        for (int i = 0; i < PersistenciaDeDatos.prestamos.size(); i++) {
            if (PersistenciaDeDatos.prestamos.get(i).getCodigoLibro().equals(codigo)
                    && PersistenciaDeDatos.prestamos.get(i).getCarnetE().equals(carnet)) {
                PersistenciaDeDatos.prestamos.remove(i);
                pres.llenarTablaPrestamos(tabla);
                return true;
            }
        }
        return false;
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel camJLable;
    private javax.swing.JTextField carnetEstudianteTextField;
    private javax.swing.JTextField codigoLibroTxField;
    private javax.swing.JTextField cuotaTextField;
    private javax.swing.JTextField fechaFinalTextField;
    private javax.swing.JTextField fechaPresTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField totalDayTextField;
    private javax.swing.JTextField totalPagoTextField;
    // End of variables declaration//GEN-END:variables
}
