package icsfinal;

import java.awt.Component;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import java.util.Scanner;
import javax.swing.SpinnerNumberModel;

public class Message extends javax.swing.JFrame {

    public Message() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pane = new javax.swing.JTabbedPane();
        Encrypt = new javax.swing.JPanel();
        JLabel1 = new javax.swing.JLabel();
        ELoadFile = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        EncryptBtn = new javax.swing.JButton();
        EjSpinner = new javax.swing.JSpinner();
        ESaveFile = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        OriginalMsg = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        EncryptedMsg = new javax.swing.JTextArea();
        Decrypt = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        DLoadFile = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        DSaveFile = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        DjSpinner = new javax.swing.JSpinner();
        DecryptBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        OriginalMsg2 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        DecryptedMsg = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ian & Nahyun's Encryptor-Decryptor");
        setResizable(false);

        JLabel1.setText("Original Message:");

        ELoadFile.setText("Load from file");
        ELoadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELoadFileActionPerformed(evt);
            }
        });

        jLabel3.setText("Encrypted Message:");

        jLabel6.setText("Shift:");

        EncryptBtn.setText("Encrypt");
        EncryptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncryptBtnActionPerformed(evt);
            }
        });

        EjSpinner.setModel(new javax.swing.SpinnerNumberModel());

        ESaveFile.setText("Save to file");
        ESaveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ESaveFileActionPerformed(evt);
            }
        });

        OriginalMsg.setBackground(new java.awt.Color(153, 255, 153));
        OriginalMsg.setColumns(20);
        OriginalMsg.setRows(5);
        jScrollPane3.setViewportView(OriginalMsg);

        EncryptedMsg.setEditable(false);
        EncryptedMsg.setColumns(20);
        EncryptedMsg.setRows(5);
        jScrollPane4.setViewportView(EncryptedMsg);

        javax.swing.GroupLayout EncryptLayout = new javax.swing.GroupLayout(Encrypt);
        Encrypt.setLayout(EncryptLayout);
        EncryptLayout.setHorizontalGroup(
            EncryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncryptLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EncryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4)
                    .addGroup(EncryptLayout.createSequentialGroup()
                        .addComponent(JLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ELoadFile))
                    .addGroup(EncryptLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ESaveFile))
                    .addGroup(EncryptLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(EjSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EncryptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 226, Short.MAX_VALUE)))
                .addContainerGap())
        );
        EncryptLayout.setVerticalGroup(
            EncryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncryptLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EncryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabel1)
                    .addComponent(ELoadFile))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EncryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(EjSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EncryptBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(EncryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(ESaveFile))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Pane.addTab("Encrypt", Encrypt);

        jLabel2.setText("Encrypted Message");

        DLoadFile.setText("Load from file");
        DLoadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DLoadFileActionPerformed(evt);
            }
        });

        jLabel4.setText("Decrypted Message");

        DSaveFile.setText("Save to file");
        DSaveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DSaveFileActionPerformed(evt);
            }
        });

        jLabel5.setText("Shift:");

        DjSpinner.setModel(new javax.swing.SpinnerNumberModel());

        DecryptBtn.setText("Decrypt");
        DecryptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecryptBtnActionPerformed(evt);
            }
        });

        OriginalMsg2.setColumns(20);
        OriginalMsg2.setRows(5);
        jScrollPane1.setViewportView(OriginalMsg2);

        DecryptedMsg.setEditable(false);
        DecryptedMsg.setColumns(20);
        DecryptedMsg.setRows(5);
        jScrollPane2.setViewportView(DecryptedMsg);

        javax.swing.GroupLayout DecryptLayout = new javax.swing.GroupLayout(Decrypt);
        Decrypt.setLayout(DecryptLayout);
        DecryptLayout.setHorizontalGroup(
            DecryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DecryptLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DecryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addGroup(DecryptLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 311, Short.MAX_VALUE)
                        .addComponent(DLoadFile))
                    .addGroup(DecryptLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DSaveFile))
                    .addGroup(DecryptLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(DjSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DecryptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        DecryptLayout.setVerticalGroup(
            DecryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DecryptLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DecryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DLoadFile)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DecryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(DjSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DecryptBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DecryptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DSaveFile)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Pane.addTab("Decrypt", Decrypt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Pane)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void ELoadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELoadFileActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();  
        if (fc.showOpenDialog(null) == 0) {
          File file = fc.getSelectedFile();
          try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) { //hasNextLine() returns true if there is another line for input
              String input = sc.nextLine();
              OriginalMsg.setText(input);
            } 
            sc.close();
          } 
          catch (FileNotFoundException e) {
              EncryptedMsg.setText("Error occurred");
          } 
        } 
    }//GEN-LAST:event_ELoadFileActionPerformed

    private void ESaveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ESaveFileActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        if (fc.showSaveDialog(null) == 0)
          try {
            FileWriter fw = new FileWriter(fc.getSelectedFile().getAbsolutePath());
            String output = EncryptedMsg.getText();
            fw.write(output);
            fw.close();
          } 
          catch (IOException ex) {
            EncryptedMsg.setText("Error occurred");
          }  
    }//GEN-LAST:event_ESaveFileActionPerformed

    private void DecryptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecryptBtnActionPerformed
        // TODO add your handling code here:
        String result = "";
        char x = Character.MIN_VALUE;
        for (int i=0; i<OriginalMsg2.getText().split(" ").length; i++) {
          String encrypted = OriginalMsg2.getText().split(" ")[i];
          char[] message = encrypted.toCharArray();
          int shift = ((Integer)DjSpinner.getValue()).intValue();
          for (int j=0; j<message.length; j++) {
              char c = message[j];
            if (c >= 'a' && c <= 'z') {
                if(shift < 0){
                    x = (char)(c - (26+shift));
                  }
                else if(shift >= 0){
                    x = (char)(c - shift);
                }
              if(x < 'a'){
                  x = (char)(x + 26);
              }
              result = result + x;
            } 
            else if (c >= 'A' && c <= 'Z') {
                if(shift < 0){
                    x = (char)(c - (26+shift));
                  }
                else if(shift >= 0){
                    x = (char)(c - shift);
                }
              if(x < 'A'){
                  x = (char)(x + 26);
              }
              result = result + x;
            } 
            else if (c <= '9' && c >= '0') {
                if(shift < 0){
                    x = (char)(c - (10+shift));
                  }
                else if(shift >= 0){
                    x = (char)(c - shift);
                }
              if(x < '0'){
                  x = (char)(x + 10);
              }
              result = result + x;
            } 
            else if (c != ' ') {
              DecryptedMsg.setText("Invalid input");
              return;
            } 
          } 
          result = result + " ";
        } 
        result = result+ "(" + OriginalMsg2.getText().split(" ").length + ")";
        DecryptedMsg.setText(result);
    }//GEN-LAST:event_DecryptBtnActionPerformed

    private void EncryptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncryptBtnActionPerformed
        // TODO add your handling code here:     
        String result = "";
        char x = Character.MIN_VALUE;
        for (int i=0; i<OriginalMsg.getText().split(" ").length; i++) {
            String original = OriginalMsg.getText().split(" ")[i];
          char[] message = original.toCharArray();
          int shift = ((Integer)EjSpinner.getValue()).intValue();
          for (int j=0; j<message.length; j++) {
              char c = message[j];
            if (c >= 'a' && c <= 'z') {
                if(shift < 0){
                    x = (char)(c + (26+shift));
                  }
                else if(shift >= 0){
                    x = (char)(c + shift);
                }
              if(x > 'z'){
                  x = (char)(x - 26);
              }
              result = result + x;
            } 
            else if (c <= '9' && c >= '0') {
              if(shift < 0){
                    x = (char)(c + (10+shift));
                  }
                else if(shift >= 0){
                    x = (char)(c + shift);
                }
              if(x > '9'){
                  x = (char)(x - 10);
              }
              result = result + x;
            } 
            else if (c >= 'A' && c <= 'Z') {
              if(shift < 0){
                    x = (char)(c + (26+shift));
                  }
                else if(shift >= 0){
                    x = (char)(c + shift);
                }
              if(x > 'Z'){
                  x = (char)(x - 26);
              }
              result = result + x;
            } 
            else if (c != ' ') {
              EncryptedMsg.setText("Invalid Input");
              return;
            } 
          } 
          result = result + " ";
        } 
        EncryptedMsg.setText(result);
    }//GEN-LAST:event_EncryptBtnActionPerformed

    private void DLoadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DLoadFileActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        if (fc.showOpenDialog(null) == 0) {
          File file = fc.getSelectedFile();
          try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) { //hasNextLine() returns true if there is another line for input
              String input = sc.nextLine();
              OriginalMsg2.setText(input);
            } 
            sc.close();
          } 
          catch (FileNotFoundException e) {
            EncryptedMsg.setText("Error occurred");
          } 
        } 
          
    }//GEN-LAST:event_DLoadFileActionPerformed

    private void DSaveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DSaveFileActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        if (fc.showSaveDialog(null) == 0)
          try {
            FileWriter fw = new FileWriter(fc.getSelectedFile().getAbsolutePath());
            String output = EncryptedMsg.getText();
            fw.write(output);
            fw.close();
          } 
          catch (IOException ex) {
            EncryptedMsg.setText("Error occurred");
          }  
    }//GEN-LAST:event_DSaveFileActionPerformed

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
            java.util.logging.Logger.getLogger(Message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Message().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DLoadFile;
    private javax.swing.JButton DSaveFile;
    private javax.swing.JPanel Decrypt;
    private javax.swing.JButton DecryptBtn;
    private javax.swing.JTextArea DecryptedMsg;
    private javax.swing.JSpinner DjSpinner;
    private javax.swing.JButton ELoadFile;
    private javax.swing.JButton ESaveFile;
    private javax.swing.JSpinner EjSpinner;
    private javax.swing.JPanel Encrypt;
    private javax.swing.JButton EncryptBtn;
    private javax.swing.JTextArea EncryptedMsg;
    private javax.swing.JLabel JLabel1;
    private javax.swing.JTextArea OriginalMsg;
    private javax.swing.JTextArea OriginalMsg2;
    private javax.swing.JTabbedPane Pane;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
