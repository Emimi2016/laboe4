/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import javax.swing.*;

public class AddPrescription extends javax.swing.JFrame {

    /**
     * Creates new form AddPrescription
     */
    public AddPrescription() {
      initComponents();
      
      jButton1.setVisible(true);
      jButton2.setVisible(true);
      name.setEditable(true);
      date.setEditable(true);
       examens.setEditable(true);
      diagnostique.setEditable(true);
      description.setEditable(true);
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
        name = new javax.swing.JTextField();
        diagnostique = new javax.swing.JComboBox();
        examens = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        description = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        date = new javax.swing.JFormattedTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name);
        name.setBounds(340, 290, 160, 20);

        diagnostique.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Maladie des coronaires", "Cardiomyopathie", "Insuffisance cardique", "Valvulopathie cardiaque","Hypertension artérielle","Hyportension artérielle" }));
        diagnostique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagnostiqueActionPerformed(evt);
            }
        });
        jPanel1.add(diagnostique);
        diagnostique.setBounds(340, 370, 160, 30);

        examens.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Electrocardiographie", "Radiographie de thorax", "Scanner coronaire" }));
        jPanel1.add(examens);
        examens.setBounds(340, 420, 160, 30);

        jLabel6.setText("Description ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(130, 490, 120, 40);
        jPanel1.add(description);
        description.setBounds(340, 470, 160, 80);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus_k01-20111007231358-00029.png"))); // NOI18N
        jButton1.setText("    Ajouter");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 32, 32), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(420, 630, 120, 50);

        jLabel5.setText("Examens");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(130, 420, 170, 20);

        jLabel4.setText("Diagnostique");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(130, 370, 180, 20);

        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        jPanel1.add(date);
        date.setBounds(340, 330, 160, 20);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        jButton2.setText("   Annuler");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 32, 32), 2, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(280, 630, 110, 50);

        jLabel1.setText("Date");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 330, 70, 20);

        jLabel3.setText("Nom du patient");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(130, 290, 100, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ordo.jpg"))); // NOI18N
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(224, 32, 32), 5, true));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 600, 840);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
      
        
        PrescriptionsList prlist = new PrescriptionsList();
        //Date is now a string
        prlist.addPrescription(new Prescription(name.getText(),date.getText(), (String)diagnostique.getSelectedItem(), (String)examens.getSelectedItem(), description.getText()));
       JOptionPane.showMessageDialog(null,"L'ordonnance a été ajoutée!");
        clearAll();
        DoctorsFrame d = new DoctorsFrame();
        d.setVisible(true);
        d.setLocationRelativeTo(null);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_dateActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    this.clearAll();
        
        // TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed

private void diagnostiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagnostiqueActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_diagnostiqueActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AddPrescription().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField date;
    private javax.swing.JTextField description;
    private javax.swing.JComboBox diagnostique;
    private javax.swing.JComboBox examens;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables

    private void clearAll() {
        if(this != null)
            setVisible(false);
            removeAll();
            getRootPane().removeAll();
            dispose();
    }

    void fillFields(Prescription c) {
       
        name.setText(c.getName());
        date.setText(c.getDate());
        diagnostique.setSelectedItem(c.getDescription());
        examens.setSelectedItem(c.getExamen());
        description.setText(c.getDescription());
      
    }
    
    
    public void hamid(){
    jButton1.setVisible(false);
    jButton2.setVisible(false);
    name.setEditable(false);
    date.setEditable(false);
  
    description.setEditable(false);
    }
}
