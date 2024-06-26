/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaceGrafica;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Pujol
 */
public class telaSaida extends javax.swing.JFrame {

    /**
     * Creates new form telaSaida
     */
    public telaSaida() {
        initComponents();
        btSim1.setVisible(false);
        btSim2.setVisible(false);
        btSim3.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sair = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btSim = new javax.swing.JButton();
        btNao = new javax.swing.JButton();
        btSim2 = new javax.swing.JButton();
        btSim1 = new javax.swing.JButton();
        btSim3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sair");

        Sair.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Vai me abandonar mesmo, depois de todo esse tempo?");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Tem certeza que deseja sair :(");

        btSim.setText("Sim");
        btSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimActionPerformed(evt);
            }
        });

        btNao.setText("Não");
        btNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNaoActionPerformed(evt);
            }
        });

        btSim2.setText("Sim");
        btSim2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSim2ActionPerformed(evt);
            }
        });

        btSim1.setText("Sim");
        btSim1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSim1ActionPerformed(evt);
            }
        });

        btSim3.setText("Sim");
        btSim3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSim3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SairLayout = new javax.swing.GroupLayout(Sair);
        Sair.setLayout(SairLayout);
        SairLayout.setHorizontalGroup(
            SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SairLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SairLayout.createSequentialGroup()
                        .addGroup(SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SairLayout.createSequentialGroup()
                        .addComponent(btSim2)
                        .addGap(39, 39, 39))))
            .addGroup(SairLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(btSim)
                .addGap(52, 52, 52)
                .addGroup(SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSim3)
                    .addComponent(btNao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SairLayout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(btSim1)
                    .addContainerGap(294, Short.MAX_VALUE)))
        );
        SairLayout.setVerticalGroup(
            SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SairLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSim2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSim)
                    .addComponent(btNao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSim3)
                .addGap(32, 32, 32))
            .addGroup(SairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SairLayout.createSequentialGroup()
                    .addContainerGap(203, Short.MAX_VALUE)
                    .addComponent(btSim1)
                    .addGap(22, 22, 22)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNaoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Obrigado por ficar comigo!", "EBAAAAAAAAAA", 1);
    }//GEN-LAST:event_btNaoActionPerformed

    private void btSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimActionPerformed
        // TODO add your handling code here:
        btSim.setVisible(false);
        btSim1.setVisible(true);
    }//GEN-LAST:event_btSimActionPerformed

    private void btSim2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSim2ActionPerformed
        // TODO add your handling code here:
        btSim2.setVisible(false);
        btSim3.setVisible(true);
        JOptionPane.showMessageDialog(null, "Me sinto mais solitario, sem ninguem, mas tudo bem, até logo!", "Você realmente fez isso?", 1);
        setVisible(false);
    }//GEN-LAST:event_btSim2ActionPerformed

    private void btSim1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSim1ActionPerformed
        // TODO add your handling code here:
        btSim1.setVisible(false);
        btSim2.setVisible(true);
    }//GEN-LAST:event_btSim1ActionPerformed

    private void btSim3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSim3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Me sinto mais solitario, sem ninguem, mas tudo bem, até logo!", "Você realmente fez isso?", 1);
    }//GEN-LAST:event_btSim3ActionPerformed

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
            java.util.logging.Logger.getLogger(telaSaida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaSaida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaSaida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaSaida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaSaida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Sair;
    private javax.swing.JButton btNao;
    private javax.swing.JButton btSim;
    private javax.swing.JButton btSim1;
    private javax.swing.JButton btSim2;
    private javax.swing.JButton btSim3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
