/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import DataBase.SaveAndReaderBinary;
import cargaDeDatos.Estudiante;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import persistenciaDatos.ControlDatosEstudiante;
import persistenciaDatos.PersistenciaDeDatos;

/**
 *
 * @author Kenny
 */
public class NuevoEstudiante extends javax.swing.JFrame {

    /**
     * Creates new form NuevoEstudiante
     */
    boolean isEdit;
    Estudiante est;
    JTable tabla;
    SaveAndReaderBinary LyE = new SaveAndReaderBinary();

    NuevoEstudiante(boolean isEdit, Estudiante est, JTable tabla) {
        this.isEdit = isEdit;
        this.est = est;
        this.tabla = tabla;
        initComponents();
        this.combocarrera.addItem("Ingenieria");
        this.combocarrera.addItem("Medicina");
        this.combocarrera.addItem("Derecho");
        this.combocarrera.addItem("Arquitectura");
        this.combocarrera.addItem("Administracion");
        IniciarCombosFecha();

        if (isEdit) {
            this.carnetField.setText(String.valueOf(est.getCarnet()));
            this.carnetField.setEditable(false);
            this.nombreField.setText(est.getNombre());
            this.combocarrera.setSelectedIndex((est.getCarrera()) - 1);
            System.out.println(est.getFechaNacimiento());
            try {
                String fechaNacimiento[] = est.getFechaNacimiento().split("-");
                this.comboAnio.setSelectedItem(fechaNacimiento[0]);
                this.comboMes.setSelectedItem(fechaNacimiento[1]);
                this.comboDia.setSelectedItem(fechaNacimiento[2]);
            } catch (Exception e) {
                System.out.println("No trae fecha");
            }

        }
    }

    public void IniciarCombosFecha() {
        for (int i = 1900; i < 2024; i++) {
            this.comboAnio.addItem("" + i);
        }
        for (int i = 1; i <= 12; i++) {
            this.comboMes.addItem("" + i);
        }
        for (int i = 1; i <= 31; i++) {
            this.comboDia.addItem("" + i);
        }
    }

    public NuevoEstudiante() {

        initComponents();
        this.combocarrera.addItem("Ingenieria");
        this.combocarrera.addItem("Medicina");
        this.combocarrera.addItem("Derecho");
        this.combocarrera.addItem("Arquitectura");
        this.combocarrera.addItem("Administracion");
        IniciarCombosFecha();
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
        carnetField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboAnio = new javax.swing.JComboBox<>();
        comboMes = new javax.swing.JComboBox<>();
        comboDia = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        combocarrera = new javax.swing.JComboBox<>();
        botonGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Ingrese los datos del nuevo estudiante");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 17, -1, -1));

        carnetField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carnetFieldActionPerformed(evt);
            }
        });
        jPanel1.add(carnetField, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 62, 287, -1));

        jLabel2.setText("Carnet:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 40, -1, -1));

        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 100, -1, -1));
        jPanel1.add(nombreField, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 128, 287, -1));

        jLabel4.setText("Carrera");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 166, -1, -1));

        jLabel5.setText("Fecha de nacimiento");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 228, -1, -1));

        comboAnio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAnioActionPerformed(evt);
            }
        });
        jPanel1.add(comboAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 269, -1, -1));

        comboMes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMesActionPerformed(evt);
            }
        });
        jPanel1.add(comboMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 269, -1, -1));

        comboDia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(comboDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 269, -1, -1));

        jLabel6.setText("Año");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 250, -1, -1));

        jLabel7.setText("Mes");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 250, -1, -1));

        jLabel8.setText("Dia");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 250, -1, -1));

        jPanel1.add(combocarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 194, 287, 22));

        botonGuardar.setText("Guardar");
        botonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 313, 148, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMesActionPerformed

    private void comboAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAnioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAnioActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        // TODO add your handling code here:
        ControlDatosEstudiante control = new ControlDatosEstudiante();
        JFrame jFrame = new JFrame();
        if (!isEdit) {
            try {
                if (!nombreField.getText().equalsIgnoreCase("")) {
                    int carnet = Integer.parseInt(carnetField.getText());
                    String fechaNacimiento = (String) comboAnio.getSelectedItem() + "-" + comboMes.getSelectedItem() + "-" + comboDia.getSelectedItem();
                    control.guardarNuevoEstudiante(carnet, nombreField.getText(), String.valueOf(combocarrera.getSelectedIndex() + 1), fechaNacimiento, tabla);
                    JOptionPane.showMessageDialog(jFrame, "Se ha guardado el nuevo estudiante");

                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(jFrame, "Debes rellenar todos los campos");
                }

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(jFrame, "El carnet debe ser un numero entero");
            }
        } else {
            for (int i = 0; i < PersistenciaDeDatos.estudiantes.size(); i++) {
                if (PersistenciaDeDatos.estudiantes.get(i).getCarnet()==(est.getCarnet())) {
                    PersistenciaDeDatos.estudiantes.get(i).setNombre(nombreField.getText());
                    PersistenciaDeDatos.estudiantes.get(i).setCarrera((combocarrera.getSelectedIndex() + 1));
                    String fechaNacimiento = (String) comboAnio.getSelectedItem() + "-" + comboMes.getSelectedItem() + "-" + comboDia.getSelectedItem();
                    PersistenciaDeDatos.estudiantes.get(i).setFechaNacimiento(fechaNacimiento);
                    JOptionPane.showMessageDialog(jFrame, "Se ha modificado el estudiante: " + est.getCarnet());
                    control.llenarTablaEstudiantes(tabla);
                    LyE.guardarArchivoBinario();
                    i = PersistenciaDeDatos.estudiantes.size();
                }

            }
            this.dispose();
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void carnetFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carnetFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carnetFieldActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField carnetField;
    private javax.swing.JComboBox<String> comboAnio;
    private javax.swing.JComboBox<String> comboDia;
    private javax.swing.JComboBox<String> comboMes;
    private javax.swing.JComboBox<String> combocarrera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombreField;
    // End of variables declaration//GEN-END:variables
}
