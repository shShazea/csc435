package startuploginandregisteration;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Register extends javax.swing.JFrame {
    // File path for storing user data
    private static final String usersFilePath = "C:/Users/user/Documents/UserData.txt";
    public Register() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtICNo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPN = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtUN = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPswrd = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        txtCPswrd = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jcShow_Pass1 = new javax.swing.JCheckBox();
        jcShow_Pass2 = new javax.swing.JCheckBox();
        Message = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTERATION");

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(17, 71, 125));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(244, 242, 242));
        jPanel3.setPreferredSize(new java.awt.Dimension(390, 420));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/photo_2024-01-16_01-23-33.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel5.setText("Ride into Tomorrow :");

        jLabel6.setFont(new java.awt.Font("Candara", 3, 24)); // NOI18N
        jLabel6.setText("Your Journey , Our Priority");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel6)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(19, 19, 19))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 130, 390, 470);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/LOGO.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(90, 30, 80, 100);

        jLabel3.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("JOY");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(180, 40, 100, 42);

        jLabel4.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("HOPS");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(180, 80, 110, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 390, 600);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(17, 71, 125));
        jLabel7.setText("REGISTERATION");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Full Name*");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("IC Number*");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Phone Number*");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Username*");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Password*");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("Confirm Password*");

        jButton1.setBackground(new java.awt.Color(17, 71, 125));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("I already have an account.");

        jButton2.setBackground(new java.awt.Color(17, 71, 125));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jcShow_Pass1.setBackground(new java.awt.Color(255, 255, 255));
        jcShow_Pass1.setText("Show Password");
        jcShow_Pass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcShow_Pass1ActionPerformed(evt);
            }
        });

        jcShow_Pass2.setBackground(new java.awt.Color(255, 255, 255));
        jcShow_Pass2.setText("Show Password");
        jcShow_Pass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcShow_Pass2ActionPerformed(evt);
            }
        });

        Message.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtName)
                        .addComponent(txtICNo)
                        .addComponent(txtPN)
                        .addComponent(txtUN, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addComponent(jLabel12)
                        .addComponent(jLabel11)
                        .addComponent(jLabel10)
                        .addComponent(jLabel9)
                        .addComponent(jLabel8)
                        .addComponent(jButton1)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPswrd)
                                .addComponent(txtCPswrd))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jcShow_Pass1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jcShow_Pass2, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addComponent(Message, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(94, 94, 94))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(30, 30, 30)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtICNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPswrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcShow_Pass1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcShow_Pass2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCPswrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(390, 0, 410, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Check if the entered password matches the confirmed password
        if(String.valueOf(txtPswrd.getPassword()).equals(String.valueOf(txtCPswrd.getPassword()))){
         // If passwords match, retrieve user input
            String name = txtName.getText();
            String icNo = txtICNo.getText();
            String phoneNo = txtPN.getText();
            String username = txtUN.getText();
            String pswrd = String.valueOf(txtPswrd.getPassword());
            String conPswrd = String.valueOf(txtCPswrd.getPassword());
            // Create a file object for user data
            File file = new File(usersFilePath);
        
            try {
                // Append user information to the file
                FileWriter fw = new FileWriter (file,true);
                fw.write("\nName: "+ name);
                fw.write("\nIC NO:"+ icNo);
                fw.write("\nPhone No:"+ phoneNo);
                fw.write("\nUsername:"+ username);
                fw.write("\nPassword:"+ pswrd);
                fw.write("\n---------------");
                fw.close();
            
            } catch (IOException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }  
            // Display a success message and open the Login window
            JOptionPane.showMessageDialog(null, "Register Successful");
            Login LoginFrame = new Login();
            LoginFrame.setVisible(true);
            LoginFrame.pack();
            LoginFrame.setLocationRelativeTo(null);
            this.dispose();
        }else{
            // Display an error message if passwords don't match
            Message.setText("The password doesn't match!");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Open the Login window
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void jcShow_Pass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcShow_Pass1ActionPerformed
        // Check if the "Show Password" checkbox is selected
        if (jcShow_Pass1.isSelected()){
            // If selected, the actual characters shown.
            txtPswrd.setEchoChar((char)0);
        }else{
            // If not selected, the character hidden.
            txtPswrd.setEchoChar('*');
        }
    }//GEN-LAST:event_jcShow_Pass1ActionPerformed

    private void jcShow_Pass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcShow_Pass2ActionPerformed
        // Check if the "Show Password" checkbox is selected
        if (jcShow_Pass2.isSelected()){
            // If selected, the actual characters shown.
            txtCPswrd.setEchoChar((char)0);
        }else{
            // If not selected, the character hidden.
            txtCPswrd.setEchoChar('*');
        }
    }//GEN-LAST:event_jcShow_Pass2ActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Message;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JCheckBox jcShow_Pass1;
    private javax.swing.JCheckBox jcShow_Pass2;
    private javax.swing.JPasswordField txtCPswrd;
    private javax.swing.JTextField txtICNo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPN;
    private javax.swing.JPasswordField txtPswrd;
    private javax.swing.JTextField txtUN;
    // End of variables declaration//GEN-END:variables

   
}
