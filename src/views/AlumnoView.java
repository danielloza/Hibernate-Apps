package views;

import Atxy2k.CustomTextField.RestrictedTextField;
import dao.impl.AlumnoDAOImplHibernate;
import dao.impl.GrupoDAOImplHibernate;
import java.awt.Component;
import java.awt.PopupMenu;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import models.Alumno;
import models.Grupo;
import utils.SiscomException;
import viewsmodel.AlumnoTableModel;

/**
 *
 * @author DANIEL LOZA
 */
public class AlumnoView extends javax.swing.JFrame {

    private AlumnoDAOImplHibernate dao = new AlumnoDAOImplHibernate();
    private String id;
    private GrupoDAOImplHibernate gruDAO = new GrupoDAOImplHibernate();

    public AlumnoView() throws SiscomException {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("Alumnos");
        this.setIconImage(new ImageIcon(getClass().getResource("/images/sale.jpg")).getImage());
        JLabel imagen = new JLabel();
        imagen.setIcon(new ImageIcon(getClass().getResource("/images/sale.jpg")));
        imagen.setBounds(0, 0, 395, 370);
        this.add(imagen);
        this.initTable();
        cargarCombo();

    }

    private void initTable() {
        try {
            List<Alumno> alumno = dao.findAll();
            AlumnoTableModel model = new AlumnoTableModel();
            for (Alumno alu : alumno) {
                model.inserData(new Object[]{alu.getCveAlu(), alu.getNomAlu(),
                    alu.getEdaAlu(), alu.getCveGru().getCveGru()});
            }
            tblAlumnos.setModel(model);
        } catch (SiscomException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar los datos del Alumno");
        }
    }

    public void clean() {
        txtcveAlu.setText("");
        txtNomAlu.setText("");
        txtEdad.setText("");
        cmbCveGru.setSelectedIndex(0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtcveAlu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNomAlu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        cmbCveGru = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlumnos = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 616));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cve Alumno");
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 30));

        txtcveAlu.setPreferredSize(new java.awt.Dimension(300, 30));
        txtcveAlu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcveAluKeyTyped(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre del Alumno:");
        jLabel3.setPreferredSize(new java.awt.Dimension(150, 30));

        txtNomAlu.setPreferredSize(new java.awt.Dimension(300, 30));
        txtNomAlu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomAluKeyTyped(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Edad:");
        jLabel5.setPreferredSize(new java.awt.Dimension(150, 30));

        txtEdad.setPreferredSize(new java.awt.Dimension(300, 30));
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Cve Grupo:");
        jLabel6.setPreferredSize(new java.awt.Dimension(150, 30));

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        btnSave.setBackground(new java.awt.Color(0, 153, 0));
        btnSave.setText("Aceptar");
        btnSave.setPreferredSize(new java.awt.Dimension(90, 35));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel4.add(btnSave);

        btnCancel.setBackground(new java.awt.Color(255, 153, 0));
        btnCancel.setText("Cancelar");
        btnCancel.setPreferredSize(new java.awt.Dimension(90, 35));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel4.add(btnCancel);

        btnUpdate.setBackground(new java.awt.Color(0, 153, 204));
        btnUpdate.setText("Actualizar");
        btnUpdate.setEnabled(false);
        btnUpdate.setPreferredSize(new java.awt.Dimension(90, 35));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel4.add(btnUpdate);

        cmbCveGru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCveGruActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtcveAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNomAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbCveGru, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(168, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcveAlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomAlu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCveGru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Alumnos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        tblAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cve Alumno", "Nombre ", "Edad", "Cve Grupo", "Eliminar", "Editar"
            }
        ));
        tblAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAlumnos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Atrás");
        btnBack.setPreferredSize(new java.awt.Dimension(90, 30));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 568, 497);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try {
            if (validaCampos()) {
                Alumno alumno = new Alumno();
                alumno = dao.get(txtcveAlu.getText());
                if (alumno == null) {
                    Alumno alu = new Alumno();
                    Grupo grupo = new Grupo();
                    grupo = gruDAO.get(cmbCveGru.getSelectedItem().toString());
                    alu.setCveAlu(txtcveAlu.getText());
                    alu.setNomAlu(txtNomAlu.getText());
                    alu.setEdaAlu(Integer.parseInt(txtEdad.getText()));
                    alu.setCveGru(grupo);

                    dao.saveOrUpdate(alu);
                    this.clean();
                    this.initTable();
                } else {
                    JOptionPane.showMessageDialog(this,"Ya existe esa clave");
                }
            }
        } catch (SiscomException ex) {
            Logger.getLogger(AlumnoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed

        // TODO add your handling code here:
        this.clean();

        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
        txtcveAlu.setEnabled(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ViewMain main = new ViewMain();
        main.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void tblAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlumnosMouseClicked
        // TODO add your handling code here:
        int row = tblAlumnos.rowAtPoint(evt.getPoint());
        int col = tblAlumnos.columnAtPoint(evt.getPoint());

        if (col == 4) {
            int respuesta = JOptionPane.showConfirmDialog(this, "¿Eliminar Alumno?", "Eliminar Alumno",
                    JOptionPane.YES_NO_OPTION);
            if (respuesta == 0) {
                try {
                    String id = String.valueOf(tblAlumnos.getValueAt(row, 0));
                    dao.delete(id);
                    this.initTable();
                    clean();
                } catch (SiscomException ex) {
                    JOptionPane.showMessageDialog(this, "No se pudo eliminar el registro");
                }
            }
        }
        if (col == 5) {
            txtcveAlu.setText(tblAlumnos.getValueAt(row, 0).toString());
            txtNomAlu.setText(tblAlumnos.getValueAt(row, 1).toString());
            txtEdad.setText(tblAlumnos.getValueAt(row, 2).toString());
            cmbCveGru.setSelectedItem(tblAlumnos.getValueAt(row, 3).toString());
            btnSave.setEnabled(false);
            btnUpdate.setEnabled(true);
            txtcveAlu.setEnabled(false);

        }
    }//GEN-LAST:event_tblAlumnosMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try {
            if (validaCampos()) {

                Alumno alu = new Alumno();
                Grupo grupo = new Grupo();
                grupo = gruDAO.get(cmbCveGru.getSelectedItem().toString());
                alu.setCveAlu(txtcveAlu.getText());
                alu.setNomAlu(txtNomAlu.getText());
                alu.setEdaAlu(Integer.parseInt(txtEdad.getText()));
                alu.setCveGru(grupo);

                dao.saveOrUpdate(alu);
                this.clean();
                this.initTable();
                btnUpdate.setEnabled(false);
                btnSave.setEnabled(true);

            }
            txtcveAlu.setEnabled(true);
        } catch (SiscomException ex) {
            Logger.getLogger(AlumnoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void cmbCveGruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCveGruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCveGruActionPerformed

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        // TODO add your handling code here:

        if (txtEdad.getText().length() > 0 && txtEdad.getText().length() >= 2) {
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Solo permite 2 carcteres");
            txtEdad.setEditable(rootPaneCheckingEnabled);

        }

        char validar = evt.getKeyChar();

        if (validar < '0' || validar > '9') {
            getToolkit().beep();
            evt.consume();
        }

    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtNomAluKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomAluKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar) || Character.isWhitespace(validar)
                || Character.isISOControl(validar)) {
            txtNomAlu.setEditable(true);

        } else {
            txtNomAlu.setEditable(false);
        }

        if (txtNomAlu.getText().length() > 0 && txtNomAlu.getText().length() >= 50) {
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Solo permite 50 carcteres");

        }
    }//GEN-LAST:event_txtNomAluKeyTyped

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void txtcveAluKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcveAluKeyTyped
        // TODO add your handling code here:
        if (txtcveAlu.getText().length() > 0 && txtcveAlu.getText().length() >= 15) {
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Solo permite 15 carcteres");

        }
    }//GEN-LAST:event_txtcveAluKeyTyped

    /**
     * @param args the command line arguments
     */
    private void cargarCombo() throws SiscomException {
        List<Grupo> lgrupos = new ArrayList<>();
        lgrupos = gruDAO.findAll();
        cmbCveGru.addItem("Selecciona Grupo");
        for (int i = 0; i < lgrupos.size(); i++) {
            cmbCveGru.addItem(lgrupos.get(i).getCveGru());

        }
    }

    private boolean validaCampos() {
        if (txtcveAlu.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingresa la clave del Alumno.");
            return false;
        }

        if (txtNomAlu.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingresa el nombre del Alumno.");
            return false;
        }

        if (txtEdad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingresa la edad.");
            return false;
        }

        if (cmbCveGru.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecciona el Grupo.");
            return false;
        }
        if (Integer.parseInt(txtEdad.getText()) >= 95) {
            JOptionPane.showMessageDialog(null, "Dato no aceptado");
            return false;
        }

        String cveA = txtcveAlu.getText();
        if (cveA.length() > 15) {
            JOptionPane.showMessageDialog(null, "La clave del Alumno ingresada es muy grande");
            return false;
        }
        return true;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            /*for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }*/
            UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AlumnoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlumnoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlumnoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlumnoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AlumnoView().setVisible(true);
                } catch (SiscomException ex) {
                    Logger.getLogger(AlumnoView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbCveGru;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAlumnos;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNomAlu;
    private javax.swing.JTextField txtcveAlu;
    // End of variables declaration//GEN-END:variables
}
