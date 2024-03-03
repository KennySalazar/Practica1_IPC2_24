/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import DataBase.SaveAndReaderBinary;
import cargaDeDatos.Estudiante;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.management.modelmbean.ModelMBean;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import persistenciaDatos.ControlDatosLibros;
import persistenciaDatos.ControlDePrestamos;
import persistenciaDatos.PersistenciaDeDatos;

/**
 *
 * @author Kenny Salazar
 */
public class NuevoPrestamo extends javax.swing.JFrame {

    boolean isEdyt;
    SaveAndReaderBinary LyE = new SaveAndReaderBinary();
    ControlDePrestamos controlPres = new ControlDePrestamos();
    JFrame jFrame = new JFrame();
    JTable tabla;
    JTable tablaLibro;
    Date fecha = new Date();
    SimpleDateFormat year = new SimpleDateFormat("yyyy");
    SimpleDateFormat month = new SimpleDateFormat("MM");
    SimpleDateFormat day = new SimpleDateFormat("dd");
    String anio = year.format(fecha);
        String mes = month.format(fecha);
        String dia = day.format(fecha);
        String fechaPrestamo = anio + "-" + mes + "-" + dia;
    
    
    NuevoPrestamo(JTable tabla, JTable tablaLibro) {
        this.tabla = tabla;
        this.tablaLibro = tablaLibro;
        initComponents();

    }

    /**
     * Creates new form NuevoPrestamo
     */
    public NuevoPrestamo() {
        initComponents();
        //IniciarCombosFecha();

    }

//    public void IniciarCombosFecha() {
//        for (int i = 1900; i < 2024; i++) {
//            this.comboAnio.addItem("" + i);
//        }
//        for (int i = 1; i <= 12; i++) {
//            this.comboMes.addItem("" + i);
//        }
//        for (int i = 1; i <= 31; i++) {
//            this.comboDia.addItem("" + i);
//        }
//    }

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
        codigoLibroTxField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        carnetEstudianteTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        me = new javax.swing.JTextField();
        ani = new javax.swing.JTextField();
        di = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Ingrese las datos del nuevo prestamo ");

        jLabel2.setText("Código de Libro");

        jLabel3.setText("Carnet del Estudiante");

        jLabel5.setText("Fecha de nacimiento");

        jLabel6.setText("Año");

        jLabel7.setText("Mes");

        jLabel8.setText("Dia");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        me.setText("-----");

        ani.setText("-----");

        di.setText("-----");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(codigoLibroTxField, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                            .addComponent(carnetEstudianteTextField)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ani, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(me, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(di, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(94, 94, 94)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(34, 34, 34)))))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codigoLibroTxField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(carnetEstudianteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(me, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(di, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //control para guardar el boton 
        // if secundario
        ControlDePrestamos control = new ControlDePrestamos();
        if (!carnetEstudianteTextField.getText().isEmpty() && !carnetEstudianteTextField.getText().isEmpty()) {
            if (verificacionCarnet()) {
                System.out.println("si funciono el codigo");
                if (verificacionPrestamosStudent()) {
                    System.out.println("paso dos filtros");
                    if (verificacionLibro()) {
                        System.out.println("Si puede prestar un libro");
                        String carnet = carnetEstudianteTextField.getText();
                        String codigo = codigoLibroTxField.getText();
                        
                        control.guardarPrestamos(codigo, carnet, fechaPrestamo, tabla);
                        JOptionPane.showMessageDialog(jFrame, "Se ha guardado un nuevo Prestamo");
                        this.dispose();
                    } else {
                        System.out.println("el codigo incorrecto");
                       JOptionPane.showMessageDialog(jFrame, "El Codigo Del Libro es Incorrecto \n"
                        + "O ya no hay Copias Existentes");
                    }
                } else {
                    JOptionPane.showMessageDialog(jFrame, "El estudiante ya ha Prestado Tres Libros");
                    
                }
            } else {
                JOptionPane.showMessageDialog(jFrame, "El Carnet no se Encuentra en la Base de Datos");
            }
        } else {
            JOptionPane.showMessageDialog(jFrame, "Se tiene que llenar todos los espacios");
        }//fin del if secundario
    }//GEN-LAST:event_jButton1ActionPerformed

    public boolean verificacionCarnet() {
        int carnet = 0;
        carnet = Integer.parseInt(carnetEstudianteTextField.getText());
        System.out.println(carnet);
        for (int i = 0; i < PersistenciaDeDatos.estudiantes.size(); i++) {
            if (PersistenciaDeDatos.estudiantes.get(i).getCarnet() == carnet) {
                System.out.println(PersistenciaDeDatos.estudiantes.get(i).getCarnet() + " y tambien en carnet" + carnet);
                return true;
            }
        }
        return false;
    }

    public boolean verificacionLibro() {
        ControlDatosLibros controlLibro = new ControlDatosLibros();
        String codigo = "";
        codigo = codigoLibroTxField.getText();
        System.out.println(codigo + "Este es el codigo del libro");
        for (int i = 0; i < PersistenciaDeDatos.biblio.size(); i++) {
            if (PersistenciaDeDatos.biblio.get(i).getCodigo().equals(codigo)) {
                int indice = i;
                if (PersistenciaDeDatos.biblio.get(i).getCantidad() > 0) {
                    System.out.println("si hay libros");
                    int num1 = PersistenciaDeDatos.biblio.get(i).getCantidad();
                    int num2 = num1 - 1;
                    PersistenciaDeDatos.biblio.get(i).setCantidad(num2);
                    controlLibro.llenarTablaLibros(tablaLibro);
                    System.out.println("");
                    System.out.println("El numero final es " + num2);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean verificacionPrestamosStudent() {
        VentanaPrincipal vent = new VentanaPrincipal();
        JTable tabla = vent.getTablaPrestamos();
        DefaultTableModel cantidad = (DefaultTableModel) tabla.getModel();
        int conteo = 0;
        String carnet = "";
        carnet = carnetEstudianteTextField.getText();
        for (int i = 0; i < cantidad.getRowCount(); i++) {
            String columnaCarnet = cantidad.getValueAt(i, 1).toString();
            if (columnaCarnet.equals(carnet)) {
                conteo++;
                System.out.println("el conteo es " + conteo);
                if (conteo < 0 || conteo >= 3) {
                    return false;
                }
            }//fin del if comparativo
        }

        return true;
    }
    

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(NuevoPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(NuevoPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(NuevoPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(NuevoPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new NuevoPrestamo().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ani;
    private javax.swing.JTextField carnetEstudianteTextField;
    private javax.swing.JTextField codigoLibroTxField;
    private javax.swing.JTextField di;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField me;
    // End of variables declaration//GEN-END:variables
}
