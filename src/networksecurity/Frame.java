package networksecurity;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;

/**
 * @author aftab
 */
public class Frame extends javax.swing.JFrame {

    private String cipher;

    public Frame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cc = new javax.swing.JButton();
        vc = new javax.swing.JButton();
        ac = new javax.swing.JButton();
        rc = new javax.swing.JButton();
        sdes = new javax.swing.JButton();
        lc = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        textField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ecT = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dcT = new javax.swing.JLabel();
        ccHeading = new javax.swing.JLabel();
        solve = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        keyField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("NETWORK SECURITY CIPHERS");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setForeground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("   UNIVERCITY OF KARACHI  ");

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("DEPARTMENT OF COMPUTER SCIENCE  ");

        jPanel2.setBackground(new java.awt.Color(51, 102, 0));

        jLabel3.setForeground(new java.awt.Color(255, 255, 153));
        jLabel3.setText("CLICK THE CIPHER YOU WANT TO TRY:");

        cc.setText("Ceasor Cipher");
        cc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccActionPerformed(evt);
            }
        });

        vc.setText("Vigenere Cipher");
        vc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcActionPerformed(evt);
            }
        });

        ac.setText("AutoKey Cipher");
        ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acActionPerformed(evt);
            }
        });

        rc.setText("RailFence Cipher");
        rc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rcActionPerformed(evt);
            }
        });

        sdes.setText("SDES");
        sdes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdesActionPerformed(evt);
            }
        });

        lc.setText("Columnar Cipher");
        lc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(16, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(cc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(rc, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(ac, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(vc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(lc, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                                        .addComponent(sdes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                                        .addComponent(cc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(vc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ac, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sdes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        jPanel3.setEnabled(false);

        jLabel4.setText("PLANE TEXT:");

        textField.setEditable(false);
        textField.setForeground(new java.awt.Color(0, 51, 0));
        textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("ENCIPHERED TEXT:");

        ecT.setText("---");

        jLabel7.setText("DECIPHERED TEXT:");

        dcT.setText("---");

        ccHeading.setForeground(new java.awt.Color(255, 0, 0));
        ccHeading.setText("SELECT A CIPHER FIRST");

        solve.setText("SOLVE");
        solve.setEnabled(false);
        solve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveActionPerformed(evt);
            }
        });

        jLabel9.setText("KEY:");

        keyField.setEditable(false);
        keyField.setForeground(new java.awt.Color(0, 51, 0));
        keyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(ccHeading)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(solve))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(dcT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel4))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(textField)
                                                        .addComponent(keyField)
                                                        .addComponent(ecT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ccHeading)
                                .addGap(12, 12, 12)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(keyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(ecT))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(dcT))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(solve)
                                .addGap(12, 12, 12))
        );

        jLabel10.setText("SUBMITTED TO: MA`AM YUSRA");

        jLabel11.setText("SUBMITTED BY: AFTAB KHALIL");

        jLabel12.setText("B14158002 (BSSE 3rd Year Morning)");

        jLabel13.setText("SEC - A");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap(40, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(0, 31, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int a = JOptionPane.showConfirmDialog(this, "ARE YOU SURE TO WANT TO EXIT", "SEQURE ENOUGH??", YES_NO_OPTION, QUESTION_MESSAGE);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void vcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcActionPerformed
        setCipher("VIGENERE_CIPHER");
    }//GEN-LAST:event_vcActionPerformed

    private void solveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveActionPerformed
        String planeText = textField.getText();
        String key = keyField.getText();

        solve(planeText, key);
    }//GEN-LAST:event_solveActionPerformed

    private void ccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccActionPerformed
        setCipher("CEASOR_CIPHER");
    }//GEN-LAST:event_ccActionPerformed

    private void lcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lcActionPerformed
        setCipher("COLUMNAR_CIPHER");
    }//GEN-LAST:event_lcActionPerformed

    private void sdesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sdesActionPerformed
        setCipher("SDES_CIPHER");
    }//GEN-LAST:event_sdesActionPerformed

    private void rcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rcActionPerformed
        setCipher("RAILFENCE_CIPHER");
    }//GEN-LAST:event_rcActionPerformed

    private void acActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acActionPerformed
        setCipher("AUTOKEY_CIPHER");
    }//GEN-LAST:event_acActionPerformed

    private void textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldActionPerformed
        String planeText = textField.getText();
        String key = keyField.getText();

        solve(planeText, key);

    }//GEN-LAST:event_textFieldActionPerformed

    private void keyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyFieldActionPerformed

    }//GEN-LAST:event_keyFieldActionPerformed

    private void solve(String planeText, String key) {
        String encipheredText = "...";
        String deCipheredText = "...";
        if (planeText.equals("") || key.equals("")) {
            JOptionPane.showMessageDialog(this, "PLEASE WRITE VALID VALUES AND THEN TRY AGAIN!", "VALUE ERROR", ERROR_MESSAGE);
            return;
        }

        if ("AUTOKEY_CIPHER".equals(cipher)) {
            key = key.toUpperCase();

            for (int i = 0; i < key.length(); i++) {
                if (key.charAt(i) < 'A' || key.charAt(i) > 'Z') {
                    JOptionPane.showMessageDialog(this, "PLEASE WRITE A VALID KEY WITH ONLY ALPHABETS", "KEY ERROR", ERROR_MESSAGE);
                    return;
                }
            }

            encipheredText = AutoKeyCipher.enCipher(planeText, key);
            deCipheredText = AutoKeyCipher.deCipher(encipheredText, key);
        } else if ("RAILFENCE_CIPHER".equals(cipher)) {
            System.out.println("key is " + key);
            int k;
            try {
                k = Integer.valueOf(key);
                if (k <= 1) {
                    JOptionPane.showMessageDialog(this, "PLEASE WRITE A VALID INT KEY GREATER THAN 1", "KEY ERROR", ERROR_MESSAGE);
                    return;
                }
            } catch (NumberFormatException | HeadlessException e) {
                JOptionPane.showMessageDialog(this, "PLEASE WRITE A VALID INT KEY GREATER THAN 1", "KEY ERROR", ERROR_MESSAGE);
                return;
            }

            encipheredText = RailFenceCipher.enCipher(planeText, k);
            deCipheredText = RailFenceCipher.deCipher(encipheredText, k);
        } else if ("COLUMNAR_CIPHER".equals(cipher)) {
            key = key.toUpperCase();

            for (int i = 0; i < key.length(); i++) {
                if (key.charAt(i) < 'A' || key.charAt(i) > 'Z') {
                    JOptionPane.showMessageDialog(this, "PLEASE WRITE A VALID KEY WITH ONLY ALPHABETS", "KEY ERROR", ERROR_MESSAGE);
                    return;
                }
            }

            encipheredText = ColumnarCipher.enCipher(planeText, key);
            deCipheredText = ColumnarCipher.deCipher(encipheredText, key);
        } else if ("VIGENERE_CIPHER".equals(cipher)) {
            key = key.toUpperCase();

            for (int i = 0; i < key.length(); i++) {
                if (key.charAt(i) < 'A' || key.charAt(i) > 'Z') {
                    JOptionPane.showMessageDialog(this, "PLEASE WRITE A VALID KEY WITH ONLY ALPHABETS", "KEY ERROR", ERROR_MESSAGE);
                    return;
                }
            }

            encipheredText = VigenereCipher.enCipher(planeText, key);
            deCipheredText = VigenereCipher.deCipher(encipheredText, key);
        } else if ("CEASOR_CIPHER".equals(cipher)) {
            int k;
            try {
                k = Integer.valueOf(key);
                if (k < 0 || k > 26) {
                    JOptionPane.showMessageDialog(this, "PLEASE WRITE A VALID INT KEY BETWEEN 1 AND 26", "KEY ERROR", ERROR_MESSAGE);
                    return;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "PLEASE WRITE A VALID INT KEY BETWEEN 1 AND 26", "KEY ERROR", ERROR_MESSAGE);
                return;
            }
            encipheredText = CeasorCipher.enCipher(planeText, k);
            deCipheredText = CeasorCipher.deCipher(encipheredText, k);
        } else if ("SDES_CIPHER".equals(cipher)) {
            key = "0000000000";
            if (key.length() != 10) {
                JOptionPane.showMessageDialog(this, "THE LENGHT OF KEY MUST BE 10 CHARACTERS", "KEY ERROR", ERROR_MESSAGE);
                return;
            }
            for (int i = 0; i < key.length(); i++) {
                if (key.charAt(i) != '0' && key.charAt(i) != '1') {
                    JOptionPane.showMessageDialog(this, "THE KEY MUST BE IN THE FOR OF 1s AND 0s", "KEY ERROR", ERROR_MESSAGE);
                    return;
                }
            }
            for (int i = 0; i < planeText.length(); i++) {
                if (planeText.charAt(i) != '0' && planeText.charAt(i) != '1') {
                    JOptionPane.showMessageDialog(this, "THE PLANETEXT MUST BE IN THE FORM OF 1s AND 0s", "KEY ERROR", ERROR_MESSAGE);
                    return;
                }
            }

            if (planeText.length() % 8 != 0) {
                int required = 8 - planeText.length() % 8;
                char pt[] = new char[required];
                for (int i = 0; i < required; i++) {
                    pt[i] = '0';
                }
                planeText = String.valueOf(pt) + planeText;
            }
            int x = 0;
            encipheredText = "";
            deCipheredText = "";
            for (int i = 0; i < planeText.length() % 7; i++) {
                String planeTextP = planeText.substring(x, x + 8);
                encipheredText += SDES.Encryptor.encrypt(planeTextP, key);
                x = x + 8;
            }
            x = 0;
            for (int i = 0; i < encipheredText.length() % 7; i++) {
                String encipheredTextP = encipheredText.substring(x, x + 8);
                deCipheredText += SDES.Encryptor.encrypt(encipheredTextP, key);
                x = x + 8;
            }
        }

        ecT.setText(encipheredText);
        dcT.setText(deCipheredText);
        this.revalidate();
        this.repaint();
    }

    private void setCipher(String cipher) {
        this.cipher = cipher;
        ccHeading.setText(cipher);
        ccHeading.setForeground(java.awt.Color.ORANGE);
        textField.setEnabled(true);
        textField.setEditable(true);
        keyField.setEditable(true);
        keyField.setEnabled(true);
        solve.setEnabled(true);

        this.revalidate();
        this.repaint();

    }

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ac;
    private javax.swing.JButton cc;
    private javax.swing.JLabel ccHeading;
    private javax.swing.JLabel dcT;
    private javax.swing.JLabel ecT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField keyField;
    private javax.swing.JButton lc;
    private javax.swing.JButton rc;
    private javax.swing.JButton sdes;
    private javax.swing.JButton solve;
    private javax.swing.JTextField textField;
    private javax.swing.JButton vc;
    // End of variables declaration//GEN-END:variables
}
