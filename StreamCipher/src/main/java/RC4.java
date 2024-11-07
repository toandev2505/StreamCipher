
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class RC4 extends javax.swing.JFrame {

    /**
     * Creates new form RC4
     */
    public RC4() {
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

        jLabel1 = new javax.swing.JLabel();
        textP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textK = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taResult = new javax.swing.JTextArea();
        btnEn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RC4 Cipher");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Plaintext");

        jLabel2.setText("Key");

        taResult.setColumns(20);
        taResult.setRows(5);
        jScrollPane1.setViewportView(taResult);

        btnEn.setText("Encrypt");
        btnEn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textP)
                            .addComponent(textK, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(btnEn)
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEn))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnActionPerformed
        String plaintext = textP.getText().trim();
        String key = textK.getText().trim();
        if (plaintext.length() != 9){
            JOptionPane.showMessageDialog(null, "Plaintext phải được nhập đúng 9 bits.");
            return;
        }
        if (key.length() >= 9) {
            JOptionPane.showMessageDialog(null, "Key phải có độ dài nhỏ hơn 9 bits.");
            return;
        }
                // Kiểm tra xem plaintext chỉ chứa 0 và 1
        if (!plaintext.matches("[01]+")) {
            JOptionPane.showMessageDialog(null, "Plaintext chỉ được nhập chuỗi 0 và 1.");
            return;
        }
        String ciphertext = rc4Encrypt(plaintext, key);
        taResult.setText("Ciphertext: " + ciphertext);
    }//GEN-LAST:event_btnEnActionPerformed

    private String rc4Encrypt(String plaintext, String key) {
        // Khởi tạo S-box
        int[] S = new int[8];
        for (int i = 0; i < 8; i++) {
            S[i] = i;
        }

        // Khởi tạo key scheduling
        int keyLength = key.length();
        int j = 0;
        for (int i = 0; i < 8; i++) {
            j = (j + S[i] + key.charAt(i % keyLength)) % 8;
            // Hoán đổi S[i] và S[j]
            int temp = S[i];
            S[i] = S[j];
            S[j] = temp;
        }

        // Sinh keystream và mã hóa
        StringBuilder ciphertext = new StringBuilder();
        int i = 0;
        j = 0;
        StringBuilder keystreamBuilder = new StringBuilder();

        for (int k = 0; k < 3; k++) { // Sinh 3 số 3 bits
            for (int m = 0; m < 3; m++) { // Mỗi lần sinh 3 bits
                i = (i + 1) % 8;
                j = (j + S[i]) % 8;

                // Hoán đổi S[i] và S[j]
                int temp = S[i];
                S[i] = S[j];
                S[j] = temp;

                // Tạo keystream
                int ksj = S[(S[i] + S[j]) % 8];
                keystreamBuilder.append(String.format("%03d", Integer.valueOf(Integer.toBinaryString(ksj & 0x07)))); // 3 bits
            }
        }

        // Kết hợp 3 số 3 bits thành 9 bits
        String keystream = keystreamBuilder.toString();
        
        // Thực hiện XOR với plaintext
        for (int k = 0; k < plaintext.length(); k++) {
            char encryptedChar = (char) (plaintext.charAt(k) ^ (keystream.charAt(k) - '0')); // XOR với từng bit
            ciphertext.append(encryptedChar);
        }

        return ciphertext.toString();
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
            java.util.logging.Logger.getLogger(RC4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RC4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RC4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RC4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RC4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taResult;
    private javax.swing.JTextField textK;
    private javax.swing.JTextField textP;
    // End of variables declaration//GEN-END:variables
}