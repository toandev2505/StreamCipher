
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class A5 extends javax.swing.JFrame {

    /**
     * Creates new form A5
     */
    public A5() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtP = new javax.swing.JTextField();
        txtX = new javax.swing.JTextField();
        txtY = new javax.swing.JTextField();
        txtZ = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextArea();
        btnEn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("A5 Cipher");

        jLabel1.setText("Plaintext");

        jLabel2.setText("Key x");

        jLabel3.setText("Key y");

        jLabel4.setText("Key z");

        txtResult.setColumns(20);
        txtResult.setRows(5);
        jScrollPane1.setViewportView(txtResult);

        btnEn.setText("Encrypt");
        btnEn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnActionPerformed(evt);
            }
        });

        jLabel5.setText("Độ dài: 3");

        jLabel6.setText("Độ dài: 6");

        jLabel7.setText("Độ dài: 8");

        jLabel8.setText("Độ dài: 9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtP, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtX))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtY))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtZ)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEn)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEn)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnActionPerformed
        String plaintext = txtP.getText().trim();
        String keyX = txtX.getText().trim();
        String keyY = txtY.getText().trim();
        String keyZ = txtZ.getText().trim();
        if (plaintext.length() != 3){
            JOptionPane.showMessageDialog(null, "Plaintext phải có độ dài"
                    + " bằng 3");
        }
        if (keyX.length() != 6){
            JOptionPane.showMessageDialog(null, "Plaintext phải có độ dài"
                    + " bằng 6");
        }
        if (keyY.length() != 8){
            JOptionPane.showMessageDialog(null, "Plaintext phải có độ dài"
                    + " bằng 8");
        }
        if (keyZ.length() != 9){
            JOptionPane.showMessageDialog(null, "Plaintext phải có độ dài"
                    + " bằng 9");
        }
        if (!plaintext.matches("[01]+") || !keyX.matches("[01]+") || 
                !keyY.matches("[01]+") || !keyZ.matches("[01]+")) {
            JOptionPane.showMessageDialog(null, "Chỉ được nhập chuỗi 0 và 1.");
        }
        txtResult.setText(a5Encrypt(plaintext, keyX, keyY, keyZ));
    }//GEN-LAST:event_btnEnActionPerformed

    private int major(int x, int y, int z){
        int sum = x + y + z;
        return (sum >= 2) ? 1 : 0;
    }
    
    private String a5Encrypt(String plaintext, String keyx, String keyy, String keyz){
        StringBuilder bitGen = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for (int j = 0; j < plaintext.length(); j++){
            int x = keyx.charAt(1) - '0';
            int y = keyy.charAt(3) - '0';
            int z = keyz.charAt(3) - '0';
            int majorBit = major(x, y, z);
            StringBuilder xResult = new StringBuilder(keyx);
            StringBuilder yResult = new StringBuilder(keyy);
            StringBuilder zResult = new StringBuilder(keyz);
            if (x == majorBit){
                char lastChar = keyx.charAt(keyx.length()-1);
                for (int i = 0; i < keyx.length()-1; i++){
                    xResult.setCharAt(i + 1, keyx.charAt(i));
                }
                xResult.setCharAt(0, lastChar);
                xResult.setLength(keyx.length());
                keyx = xResult.toString();
            }
            if (y == majorBit){
                char lastChar = keyy.charAt(keyy.length()-1);
                for (int i = 0; i < keyy.length()-1; i++){
                    yResult.setCharAt(i + 1, keyy.charAt(i));
                }
                yResult.setCharAt(0, lastChar);
                yResult.setLength(keyy.length());
                keyy = yResult.toString();
            }
            if (z == majorBit){
                char lastChar = keyz.charAt(keyz.length()-1);
                for (int i = 0; i < keyz.length()-1; i++){
                    zResult.setCharAt(i + 1, keyz.charAt(i));
                }
                zResult.setCharAt(0, lastChar);
                zResult.setLength(keyz.length());
                keyz = zResult.toString();
            }
            char enChar = (char) (xResult.charAt(5) ^ yResult.charAt(7) ^ zResult.charAt(8));
            bitGen.append(enChar);
        }
        for (int i = 0; i < plaintext.length(); i++){
            char enChar = (char) ((plaintext.charAt(i) - '0') ^ (bitGen.charAt(i) - '0') + '0');
            result.append(enChar);
        }
        return result.toString();
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
            java.util.logging.Logger.getLogger(A5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new A5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtP;
    private javax.swing.JTextArea txtResult;
    private javax.swing.JTextField txtX;
    private javax.swing.JTextField txtY;
    private javax.swing.JTextField txtZ;
    // End of variables declaration//GEN-END:variables
}