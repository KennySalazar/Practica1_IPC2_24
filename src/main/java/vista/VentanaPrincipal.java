/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import cargaDeDatos.Estudiante;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import persistenciaDatos.ControlDatosEstudiante;
import persistenciaDatos.ControlDatosLibros;

/**
 *
 * @author Kenny
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    

    public VentanaPrincipal() {
        
        initComponents();
        ControlDatosEstudiante controlDatosEstudiante = new ControlDatosEstudiante();
        ControlDatosLibros controlDatosLibros = new ControlDatosLibros();
        this.editarEstudianteBt.setEnabled(false);
        this.eliminarEstudianteBt.setEnabled(false);
        this.editarLibro.setEnabled(false);
        this.eliminarLibro.setEnabled(false);
        controlDatosEstudiante.llenarTablaEstudiantes(this.tablaStudents);
        controlDatosLibros.llenarTablaLibros(this.tablaLibros);
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        nuevoEstudiante = new javax.swing.JButton();
        editarEstudianteBt = new javax.swing.JButton();
        eliminarEstudianteBt = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        labelBusqueda = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaStudents = new javax.swing.JTable();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jDesktopPane5 = new javax.swing.JDesktopPane();
        nuevoLibroButton = new javax.swing.JButton();
        editarLibro = new javax.swing.JButton();
        eliminarLibro = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        labelBusquedaLibro = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaLibros = new javax.swing.JTable();
        jDesktopPane4 = new javax.swing.JDesktopPane();
        jDesktopPane6 = new javax.swing.JDesktopPane();
        nuevoPrestamosBt = new javax.swing.JButton();
        eliminarPrestamosBt = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        labelBusquedaLibro1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jDesktopPane3 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        nuevoEstudiante.setText("Nuevo");
        nuevoEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoEstudianteActionPerformed(evt);
            }
        });

        editarEstudianteBt.setText("Editar");

        eliminarEstudianteBt.setText("Eliminar");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        labelBusqueda.setText("Busqueda");

        tablaStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "1212", "1212", "1212"},
                {"2", "232", "2323", "2323"},
                {"23", "2323", "343", "dews"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Carnet", "Nombre", "Carrera", "Fecha de Nacimiento"
            }
        ));
        tablaStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaStudentsMouseClicked(evt);
            }
        });
        tablaStudents.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaStudentsKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaStudents);

        jDesktopPane1.setLayer(nuevoEstudiante, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(editarEstudianteBt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(eliminarEstudianteBt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelBusqueda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(nuevoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(editarEstudianteBt, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(eliminarEstudianteBt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevoEstudiante)
                    .addComponent(editarEstudianteBt)
                    .addComponent(eliminarEstudianteBt))
                .addGap(28, 28, 28)
                .addComponent(labelBusqueda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Estudiantes", jDesktopPane1);

        nuevoLibroButton.setText("Nuevo");
        nuevoLibroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoLibroButtonActionPerformed(evt);
            }
        });

        editarLibro.setText("Editar");

        eliminarLibro.setText("Eliminar");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        labelBusquedaLibro.setText("Busqueda");

        tablaLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "1212", "1212", "1212", null, null},
                {"2", "232", "2323", "2323", null, null},
                {"23", "2323", "343", "dews", null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Título", "Autor", "Código", "Cantidad de Copias", "Fercha de Publicación", "Editorial"
            }
        ));
        tablaLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaLibrosMouseClicked(evt);
            }
        });
        tablaLibros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaLibrosKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tablaLibros);
        if (tablaLibros.getColumnModel().getColumnCount() > 0) {
            tablaLibros.getColumnModel().getColumn(3).setHeaderValue("Cantidad de Copias");
            tablaLibros.getColumnModel().getColumn(4).setHeaderValue("Fercha de Publicación");
            tablaLibros.getColumnModel().getColumn(5).setHeaderValue("Editorial");
        }

        jDesktopPane5.setLayer(nuevoLibroButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane5.setLayer(editarLibro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane5.setLayer(eliminarLibro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane5.setLayer(jTextField2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane5.setLayer(labelBusquedaLibro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane5.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane5Layout = new javax.swing.GroupLayout(jDesktopPane5);
        jDesktopPane5.setLayout(jDesktopPane5Layout);
        jDesktopPane5Layout.setHorizontalGroup(
            jDesktopPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane5Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jDesktopPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane5Layout.createSequentialGroup()
                        .addComponent(nuevoLibroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(editarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(eliminarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelBusquedaLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(jDesktopPane5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2))
        );
        jDesktopPane5Layout.setVerticalGroup(
            jDesktopPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jDesktopPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevoLibroButton)
                    .addComponent(editarLibro)
                    .addComponent(eliminarLibro))
                .addGap(28, 28, 28)
                .addComponent(labelBusquedaLibro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jDesktopPane2.setLayer(jDesktopPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 779, Short.MAX_VALUE)
            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                    .addContainerGap(10, Short.MAX_VALUE)
                    .addComponent(jDesktopPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(11, Short.MAX_VALUE)))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDesktopPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Libros", jDesktopPane2);

        nuevoPrestamosBt.setText("Nuevo");
        nuevoPrestamosBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoPrestamosBtActionPerformed(evt);
            }
        });

        eliminarPrestamosBt.setText("Eliminar");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        labelBusquedaLibro1.setText("Busqueda");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "1212", "1212"},
                {"2", "232", "2323"},
                {"23", "2323", "343"},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CódigoLibro", "Carnet", "Fecha"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jTable3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable3KeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jDesktopPane6.setLayer(nuevoPrestamosBt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane6.setLayer(eliminarPrestamosBt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane6.setLayer(jTextField3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane6.setLayer(labelBusquedaLibro1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane6.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane6Layout = new javax.swing.GroupLayout(jDesktopPane6);
        jDesktopPane6.setLayout(jDesktopPane6Layout);
        jDesktopPane6Layout.setHorizontalGroup(
            jDesktopPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane6Layout.createSequentialGroup()
                .addGroup(jDesktopPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane6Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jDesktopPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jDesktopPane6Layout.createSequentialGroup()
                                .addComponent(nuevoPrestamosBt, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(295, 295, 295)
                                .addComponent(eliminarPrestamosBt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelBusquedaLibro1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3)))
                    .addGroup(jDesktopPane6Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jDesktopPane6Layout.setVerticalGroup(
            jDesktopPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jDesktopPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevoPrestamosBt)
                    .addComponent(eliminarPrestamosBt))
                .addGap(28, 28, 28)
                .addComponent(labelBusquedaLibro1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jDesktopPane4.setLayer(jDesktopPane6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane4Layout = new javax.swing.GroupLayout(jDesktopPane4);
        jDesktopPane4.setLayout(jDesktopPane4Layout);
        jDesktopPane4Layout.setHorizontalGroup(
            jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 779, Short.MAX_VALUE)
            .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane4Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDesktopPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jDesktopPane4Layout.setVerticalGroup(
            jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
            .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane4Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDesktopPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Prestamos", jDesktopPane4);

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 779, Short.MAX_VALUE)
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 591, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Reportes", jDesktopPane3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void nuevoEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoEstudianteActionPerformed
        // TODO add your handling code here:
        ventanaNuevoEst();
    }//GEN-LAST:event_nuevoEstudianteActionPerformed

    private void tablaStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaStudentsMouseClicked
        // TODO add your handling code here:
        this.editarEstudianteBt.setEnabled(true);
        this.eliminarEstudianteBt.setEnabled(true);
        int fila = tablaStudents.getSelectedRow();
        String carnet= (String) tablaStudents.getValueAt(fila, 0);
        labelBusqueda.setText(""+carnet);
    }//GEN-LAST:event_tablaStudentsMouseClicked

    private void tablaStudentsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaStudentsKeyPressed
        
    }//GEN-LAST:event_tablaStudentsKeyPressed

    private void nuevoLibroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoLibroButtonActionPerformed
        // TODO add your handling code here:
        ventanaNuevoLibro();
    }//GEN-LAST:event_nuevoLibroButtonActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void tablaLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaLibrosMouseClicked
        // TODO add your handling code here:
        this.editarLibro.setEnabled(true);
        this.eliminarLibro.setEnabled(true);
        int fila = tablaLibros.getSelectedRow();
        String codigo= (String) tablaLibros.getValueAt(fila, 0);
        labelBusquedaLibro.setText(""+codigo);
    }//GEN-LAST:event_tablaLibrosMouseClicked

    private void tablaLibrosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaLibrosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaLibrosKeyPressed

    private void nuevoPrestamosBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoPrestamosBtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevoPrestamosBtActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3MouseClicked

    private void jTable3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3KeyPressed

    public void ventanaNuevoEst(){
        NuevoEstudiante ne =new  NuevoEstudiante();
        ne.setVisible(true);
        ne.setResizable(false);
        ne.setLocationRelativeTo(null);
    }
    public void ventanaNuevoLibro(){
        NuevoLibro nuevoLibro = new NuevoLibro();
        nuevoLibro.setVisible(true);
        nuevoLibro.setResizable(false);
        nuevoLibro.setLocationRelativeTo(null);
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editarEstudianteBt;
    private javax.swing.JButton editarLibro;
    private javax.swing.JButton eliminarEstudianteBt;
    private javax.swing.JButton eliminarLibro;
    private javax.swing.JButton eliminarPrestamosBt;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JDesktopPane jDesktopPane4;
    private javax.swing.JDesktopPane jDesktopPane5;
    private javax.swing.JDesktopPane jDesktopPane6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel labelBusqueda;
    private javax.swing.JLabel labelBusquedaLibro;
    private javax.swing.JLabel labelBusquedaLibro1;
    private javax.swing.JButton nuevoEstudiante;
    private javax.swing.JButton nuevoLibroButton;
    private javax.swing.JButton nuevoPrestamosBt;
    private javax.swing.JTable tablaLibros;
    private javax.swing.JTable tablaStudents;
    // End of variables declaration//GEN-END:variables
}
