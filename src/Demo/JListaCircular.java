/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Demo;
import ListaCircular.ListaC;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Marko
 */
public class JListaCircular extends javax.swing.JFrame {

    /**
     * Creates new form JListaCircular
     */
    public JListaCircular() {
        initComponents();
        this.setLocationRelativeTo(null);
        /*ImageIcon imagen = new ImageIcon("src/Imagenes/Image10.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(Fondo.getWidth(), Fondo.getHeight(), java.awt.Image.SCALE_DEFAULT));
        Fondo.setIcon(icono);
        this.repaint();*/
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/LogoMB.png"));
        setIconImage(icon);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        btnInsertarI = new javax.swing.JButton();
        btnInsertarF = new javax.swing.JButton();
        btnEliminarI = new javax.swing.JButton();
        btnEliminarF = new javax.swing.JButton();
        btnEstado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setText("LISTA CIRCULAR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 11, -1, -1));

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 119, -1));

        btnInsertarI.setText("Insertar Inicio");
        btnInsertarI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarIActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsertarI, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 93, 119, -1));

        btnInsertarF.setText("Insertar Final");
        btnInsertarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarFActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsertarF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 119, -1));

        btnEliminarI.setText("Eliminar Inicio");
        btnEliminarI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarIActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarI, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 178, 119, -1));

        btnEliminarF.setText("Eliminar Final");
        btnEliminarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 227, 119, -1));

        btnEstado.setText("Estado");
        btnEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 256, 119, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 62, 214, 198));

        jButton1.setText("Insertar Antes De");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 122, -1, -1));

        jButton2.setText("Eliminar Buscado");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 205, 119, -1));

        jButton3.setText("Menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Image10.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-270, -10, 680, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ListaC a;
    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        
        a = new ListaC();
        JOptionPane.showMessageDialog(null, "Lista Circular Creada");
        jTextArea1.setText("==Ingrese Elementos de la Lista==");
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnInsertarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarIActionPerformed
        // TODO add your handling code here:
        
        a.insertar(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese elemento")));
        jTextArea1.setText("Lista: \n"+a.toString());
    }//GEN-LAST:event_btnInsertarIActionPerformed

    private void btnInsertarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarFActionPerformed
        // TODO add your handling code here:
        
        a.insertarF(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese elemento")));
        jTextArea1.setText("Lista: \n"+a.toString());
    }//GEN-LAST:event_btnInsertarFActionPerformed

    private void btnEliminarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarIActionPerformed
        // TODO add your handling code here:
        try{
            a.Eliminar();
        }
        catch(Exception Ex){
            JOptionPane.showInputDialog(null,"Lista Vacia");
        }
        jTextArea1.setText("Lista: \n"+a.toString());
    }//GEN-LAST:event_btnEliminarIActionPerformed

    private void btnEliminarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFActionPerformed
        // TODO add your handling code here:
        
        try{
            a.EliminarF();
        }
        catch(Exception Ex){
            JOptionPane.showInputDialog(null,"Lista Vacia");
        }
        jTextArea1.setText("Lista: \n"+a.toString());
    }//GEN-LAST:event_btnEliminarFActionPerformed

    private void btnEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadoActionPerformed
        // TODO add your handling code here:
        if(a.isEmpty(a))
            jTextArea1.setText("La lista esta vacia");
        else
            jTextArea1.setText("La lista no esta vacia");
    }//GEN-LAST:event_btnEstadoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        a.InsertarAntesD(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese elemento")), a);
        jTextArea1.setText("Lista: \n"+a.toString());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        a.eliminarB(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese elemento")));
        jTextArea1.setText("Lista: \n"+a.toString());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(JListaCircular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JListaCircular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JListaCircular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JListaCircular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JListaCircular().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminarF;
    private javax.swing.JButton btnEliminarI;
    private javax.swing.JButton btnEstado;
    private javax.swing.JButton btnInsertarF;
    private javax.swing.JButton btnInsertarI;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
