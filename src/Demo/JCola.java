/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Consola.java
 *
 * Created on Jul 1, 2015, 12:27:17 PM
 */

package Demo;
import Cola.cola;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



/**
 *
 * @author Marko
 */
public class JCola extends javax.swing.JFrame {

    /** Creates new form Consola */
    public JCola() {
        initComponents();
        this.setLocationRelativeTo(null);
        /*ImageIcon imagen = new ImageIcon("src/Imagenes/Image6.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(Fondo.getWidth(), Fondo.getHeight(), java.awt.Image.SCALE_DEFAULT));
        Fondo.setIcon(icono);
        this.repaint();*/
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/LogoMB.png"));
        setIconImage(icon);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        crear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        encolar = new javax.swing.JButton();
        desencolar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        eliminarcola = new javax.swing.JButton();
        primerelemento = new javax.swing.JButton();
        estado = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setText("COLAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, 24));

        crear.setText("Crear");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });
        getContentPane().add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 100, -1));

        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 100, -1));

        encolar.setText("Encolar");
        encolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encolarActionPerformed(evt);
            }
        });
        getContentPane().add(encolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 82, 90, -1));

        desencolar.setText("Desencolar");
        desencolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desencolarActionPerformed(evt);
            }
        });
        getContentPane().add(desencolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 117, 109, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 30, 218, 245));

        eliminarcola.setText("Eliminar Cola");
        eliminarcola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarcolaActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarcola, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 164, 109, -1));

        primerelemento.setText("Primer Elemento");
        primerelemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primerelementoActionPerformed(evt);
            }
        });
        getContentPane().add(primerelemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 199, -1, -1));

        estado.setText("Estado");
        estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoActionPerformed(evt);
            }
        });
        getContentPane().add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 246, 109, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Image6.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, 0, 500, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    cola b;
    private void encolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encolarActionPerformed
        // TODO add your handling code here:        
        b.enColar(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese elemento")));
        jTextArea1.setText("Cola: \n"+b.toString()); 
    }//GEN-LAST:event_encolarActionPerformed

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        // TODO add your handling code here: 
        b = new cola();
        JOptionPane.showMessageDialog(null, "Cola Creada");
        jTextArea1.setText("==Ingrese Elementos de la Cola==");
    }//GEN-LAST:event_crearActionPerformed

    private void desencolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desencolarActionPerformed
        // TODO add your handling code here:
        try{  
            b.desEncolar();            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Cola Vacia");    
        }       
        jTextArea1.setText("Cola: \n"+b.toString());

    }//GEN-LAST:event_desencolarActionPerformed

    private void eliminarcolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarcolaActionPerformed
        // TODO add your handling code here:
        try{
            b.clear();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Cola Vacia");     
        }
        jTextArea1.setText("Cola: \n"+b.toString());
    }//GEN-LAST:event_eliminarcolaActionPerformed

    private void primerelementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primerelementoActionPerformed
        // TODO add your handling code here:
        try{
            jTextArea1.setText("Primer elemento es: \n"+b.firstElement());
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Cola Vacia");     
        }
      
        
        
    }//GEN-LAST:event_primerelementoActionPerformed

    private void estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoActionPerformed
        // TODO add your handling code here:
        if(b.isEmpty())
           jTextArea1.setText("La cola esta vacia"); 
            
        else
            jTextArea1.setText("La cola no esta vacia");
               
    }//GEN-LAST:event_estadoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JCola().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton crear;
    private javax.swing.JButton desencolar;
    private javax.swing.JButton eliminarcola;
    private javax.swing.JButton encolar;
    private javax.swing.JButton estado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton primerelemento;
    // End of variables declaration//GEN-END:variables

}