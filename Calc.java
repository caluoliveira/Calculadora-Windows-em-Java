/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author senac
 */
public class Calc extends javax.swing.JFrame {
     
   Double valor1, valor2;
   String operacao;
    public Calc() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B0 = new javax.swing.JButton();
        BVIRGULA = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        BDIVISAO = new javax.swing.JButton();
        BSOMA = new javax.swing.JButton();
        BRESULTADO = new javax.swing.JButton();
        BMULTIPLICACAO = new javax.swing.JButton();
        BSUBTRACAO = new javax.swing.JButton();
        BLIGA = new javax.swing.JButton();
        BC = new javax.swing.JButton();
        JTFResultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        B4.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        B4.setText("4");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B5.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        B5.setText("5");
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        B2.setText("2");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B7.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        B7.setText("7");
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B8.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        B8.setText("8");
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        B1.setText("1");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B0.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        B0.setText("0");
        B0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B0ActionPerformed(evt);
            }
        });

        BVIRGULA.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        BVIRGULA.setText(",");
        BVIRGULA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVIRGULAActionPerformed(evt);
            }
        });

        B9.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        B9.setText("9");
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        B6.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        B6.setText("6");
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B3.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        B3.setText("3");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        BDIVISAO.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        BDIVISAO.setText("/");
        BDIVISAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDIVISAOActionPerformed(evt);
            }
        });

        BSOMA.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        BSOMA.setText("+");
        BSOMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSOMAActionPerformed(evt);
            }
        });

        BRESULTADO.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        BRESULTADO.setText("=");
        BRESULTADO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRESULTADOActionPerformed(evt);
            }
        });

        BMULTIPLICACAO.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        BMULTIPLICACAO.setText("x");
        BMULTIPLICACAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMULTIPLICACAOActionPerformed(evt);
            }
        });

        BSUBTRACAO.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        BSUBTRACAO.setText("-");
        BSUBTRACAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSUBTRACAOActionPerformed(evt);
            }
        });

        BLIGA.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 10)); // NOI18N
        BLIGA.setText("ON");
        BLIGA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLIGAActionPerformed(evt);
            }
        });

        BC.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        BC.setText("C");
        BC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCActionPerformed(evt);
            }
        });

        JTFResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFResultadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JTFResultado)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(B4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(B1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(B2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(B5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(B0, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(B3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BVIRGULA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BDIVISAO, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BLIGA, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(BSUBTRACAO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BSOMA, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BRESULTADO, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BMULTIPLICACAO, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(JTFResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BLIGA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BDIVISAO, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BMULTIPLICACAO, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BC, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BSUBTRACAO, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B0, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BVIRGULA, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BSOMA, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(BRESULTADO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
               JTFResultado.setText(JTFResultado.getText() + "5");
    }//GEN-LAST:event_B5ActionPerformed

    private void BDIVISAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDIVISAOActionPerformed
        valor1 = Double.parseDouble(JTFResultado.getText());
        JTFResultado.setText("");
        operacao="divisao";
    }//GEN-LAST:event_BDIVISAOActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
           JTFResultado.setText(JTFResultado.getText() + "4");
    }//GEN-LAST:event_B4ActionPerformed

    private void B0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B0ActionPerformed
        // Botao Zero
        JTFResultado.setText(JTFResultado.getText() + "0");
    }//GEN-LAST:event_B0ActionPerformed

    private void JTFResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFResultadoActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
          JTFResultado.setText(JTFResultado.getText() + "1");
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
       JTFResultado.setText(JTFResultado.getText() + "2");
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
       JTFResultado.setText(JTFResultado.getText() + "3");
    }//GEN-LAST:event_B3ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        JTFResultado.setText(JTFResultado.getText() + "6");
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        JTFResultado.setText(JTFResultado.getText() + "7");
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        JTFResultado.setText(JTFResultado.getText() + "8");
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        JTFResultado.setText(JTFResultado.getText() + "9");
    }//GEN-LAST:event_B9ActionPerformed

    private void BVIRGULAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVIRGULAActionPerformed
        JTFResultado.setText(JTFResultado.getText() + ".");
    }//GEN-LAST:event_BVIRGULAActionPerformed

    private void BLIGAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLIGAActionPerformed
        JTFResultado.setText(""); 
    }//GEN-LAST:event_BLIGAActionPerformed

    private void BCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCActionPerformed
         valor1=null;
         valor2=null;
         JTFResultado.setText("");
    }//GEN-LAST:event_BCActionPerformed

    private void BSOMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSOMAActionPerformed
        valor1 = Double.parseDouble(JTFResultado.getText());
        operacao="soma";
        JTFResultado.setText("");
    }//GEN-LAST:event_BSOMAActionPerformed

    private void BSUBTRACAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSUBTRACAOActionPerformed
        valor1 = Double.parseDouble(JTFResultado.getText());
        operacao="subtracao";
        JTFResultado.setText("");
    }//GEN-LAST:event_BSUBTRACAOActionPerformed

    private void BMULTIPLICACAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMULTIPLICACAOActionPerformed
        valor1 = Double.parseDouble(JTFResultado.getText());
        operacao="multiplicacao";
        JTFResultado.setText("");
    }//GEN-LAST:event_BMULTIPLICACAOActionPerformed

    private void BRESULTADOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRESULTADOActionPerformed
        valor2=Double.parseDouble(JTFResultado.getText());
        
        if ("soma".equals(operacao)) {
            JTFResultado.setText(String.valueOf(valor1 + valor2));
        } else if ("subtracao".equals(operacao)) {
            JTFResultado.setText(String.valueOf(valor1 - valor2));
        } else if ("multiplicacao".equals(operacao) ) {
            JTFResultado.setText(String.valueOf(valor1 * valor2));
        } else if ("divisao".equals(operacao)) {
            JTFResultado.setText(String.valueOf(valor1 / valor2));
        }      
    }//GEN-LAST:event_BRESULTADOActionPerformed
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
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B0;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton BC;
    private javax.swing.JButton BDIVISAO;
    private javax.swing.JButton BLIGA;
    private javax.swing.JButton BMULTIPLICACAO;
    private javax.swing.JButton BRESULTADO;
    private javax.swing.JButton BSOMA;
    private javax.swing.JButton BSUBTRACAO;
    private javax.swing.JButton BVIRGULA;
    private javax.swing.JTextField JTFResultado;
    // End of variables declaration//GEN-END:variables
}
