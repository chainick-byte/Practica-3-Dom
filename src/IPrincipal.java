
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author igorr
 */
public class IPrincipal extends javax.swing.JFrame {

    AbreFile miFile = new AbreFile();
    gesDom miGestorDom = new gesDom();

    /**
     * Creates new form IPrincipal
     */
    public IPrincipal() {
        initComponents();
        refrescar.setEnabled(false);
        nuevo.setEnabled(false);
        guardar.setEnabled(false);
        modificarTitulo.setEnabled(false);
        modificarAutor.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ventanaLectura = new javax.swing.JTextArea();
        muestrameInformacion = new javax.swing.JLabel();
        refrescar = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        modificarTitulo = new javax.swing.JButton();
        modificarAutor = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        LeerDom = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ventanaLectura.setColumns(20);
        ventanaLectura.setRows(5);
        jScrollPane1.setViewportView(ventanaLectura);

        refrescar.setText("Refrescar");
        refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refrescarActionPerformed(evt);
            }
        });

        nuevo.setText("Nuevo ");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        modificarTitulo.setText("Modificar Titulo");
        modificarTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarTituloActionPerformed(evt);
            }
        });

        modificarAutor.setText("Modificar Autor");
        modificarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarAutorActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        LeerDom.setText("Leer DOM");
        LeerDom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeerDomActionPerformed(evt);
            }
        });
        jMenu1.add(LeerDom);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(muestrameInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(refrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(guardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modificarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modificarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(muestrameInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(refrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modificarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modificarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LeerDomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeerDomActionPerformed
        if (miFile.dameFile() == 1) {
            muestrameInformacion.setText(miFile.getRutaAuxiliar());
        } else {
            muestrameInformacion.setText("la has cagado");
        }
        File file = miFile.getFile();
        if (miGestorDom.abrirMiXml(file) == 1) {
            muestrameInformacion.setText("\n" + "he abierto el dom");
            ventanaLectura.setText(miGestorDom.dameMiXml());
            refrescar.setEnabled(true);
            nuevo.setEnabled(true);
            guardar.setEnabled(true);
            modificarTitulo.setEnabled(true);
            modificarAutor.setEnabled(true);
        } else {
            muestrameInformacion.setText("\n" + "Dom no se ha abierto");
        }

    }//GEN-LAST:event_LeerDomActionPerformed

    private void refrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refrescarActionPerformed
        String salida = "";

        salida = miGestorDom.dameMiXml();
        ventanaLectura.setText(salida);
       
    }//GEN-LAST:event_refrescarActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        IFormNuevoLibro nl = new IFormNuevoLibro();
        nl.setVisible(true);

    }//GEN-LAST:event_nuevoActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        if (miGestorDom.guardarDomComoFile() == -1) {

            muestrameInformacion.setText("Algo ha ido mal");
        } else {
            muestrameInformacion.setText("tutto bene!!!");
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void modificarTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarTituloActionPerformed
        IModificar im = new IModificar();
        im.setVisible(true);
    }//GEN-LAST:event_modificarTituloActionPerformed

    private void modificarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarAutorActionPerformed
       IModificarAutor ima=new IModificarAutor();
       ima.setVisible(true);
    }//GEN-LAST:event_modificarAutorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem LeerDom;
    private javax.swing.JButton guardar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificarAutor;
    private javax.swing.JButton modificarTitulo;
    private javax.swing.JLabel muestrameInformacion;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton refrescar;
    private javax.swing.JTextArea ventanaLectura;
    // End of variables declaration//GEN-END:variables
}