package startuploginandregisteration;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class Booking extends javax.swing.JFrame {
    // Variables to store selected values
    String seat; //store value seat radio
    String Driver;
    String pick;
    String drop;
    String a ="Uitm";
    String b = "KTM";
    String c ="Taman Perumahan";
    String d = "Pekan Tapah";
    double fare=0.0;

    public Booking() {
        // Initialize the Booking frame
        initComponents();
        // Populate the driver combo box from the text file
        combofromtxt();
    }
    public void combofromtxt()
    {
        // Method to populate the driver combo box from the text file
        String filePath = "C:\\Users\\user\\Documents\\DRIVER.txt";
        File file = new File(filePath);
        
        try{
            BufferedReader br = new BufferedReader(new FileReader (file));
            Object[] lines = br.lines().toArray();
            
            for(int i =0; i <lines.length; i++)
            {
                String line = lines[i].toString();
                inDriver.addItem(line);         
            }
        }
        catch(FileNotFoundException ex)
                {
                    Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        inPhone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        inPick = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        inDrop = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        seat4 = new javax.swing.JRadioButton();
        seat6 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        inDriver = new javax.swing.JComboBox<>();
        confirmbtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        inFare = new javax.swing.JTextField();
        savebtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        inDate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(17, 71, 125));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 650));
        jPanel1.setLayout(null);

        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 500));

        jLabel5.setFont(new java.awt.Font("Candara", 3, 26)); // NOI18N
        jLabel5.setText("Your Journey , Our Priority");

        jLabel6.setText("Full Name* :");

        jLabel7.setText("Phone Number* :");

        jLabel8.setText("Date* :");

        jLabel9.setText("Pickup Point* : ");

        inPick.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Uitm", "Pekan Tapah", "Taman Perumahan", "KTM" }));
        inPick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inPickActionPerformed(evt);
            }
        });

        jLabel10.setText("Drop Point* :");

        inDrop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Uitm", "Pekan Tapah", "Taman Perumahan", "KTM" }));
        inDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inDropActionPerformed(evt);
            }
        });

        jLabel11.setText("Car Option* :");

        buttonGroup1.add(seat4);
        seat4.setText("4 seater");
        seat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(seat6);
        seat6.setText("6 seater");
        seat6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat6ActionPerformed(evt);
            }
        });

        jLabel12.setText("Driver Option* :");

        inDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inDriverActionPerformed(evt);
            }
        });

        confirmbtn.setBackground(new java.awt.Color(17, 71, 125));
        confirmbtn.setForeground(new java.awt.Color(255, 255, 255));
        confirmbtn.setText("Confirm");
        confirmbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmbtnActionPerformed(evt);
            }
        });

        jLabel13.setText("Fare:");

        inFare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inFareActionPerformed(evt);
            }
        });

        savebtn.setBackground(new java.awt.Color(17, 71, 125));
        savebtn.setForeground(new java.awt.Color(255, 255, 255));
        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("(exp.Maisarah Binti Tobroni)");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("(exp.01155721899)");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("(exp.DD/MM/YYYY)");

        inDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(308, 308, 308))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inFare, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inDrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inPick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seat4)
                            .addComponent(seat6)
                            .addComponent(inDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(confirmbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(inDate)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel16)
                                .addGap(141, 141, 141)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14))))
                .addContainerGap(253, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(inName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(inPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(inDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inPick, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(inDrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(seat4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seat6)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(inDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(confirmbtn)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(inFare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(savebtn)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 110, 1000, 540);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/LOGO.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 0, 80, 110);

        jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("JOY");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 20, 80, 42);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("HOPS");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 60, 150, 42);

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ride into Tomorrow :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(430, 80, 260, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat4ActionPerformed
        // TODO add your handling code here:
        seat=seat4.getText();
    }//GEN-LAST:event_seat4ActionPerformed

    private void seat6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat6ActionPerformed
        // TODO add your handling code here:
        seat=seat6.getText();
    }//GEN-LAST:event_seat6ActionPerformed

    private void confirmbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmbtnActionPerformed
         // Calculate fare based on pick and drop locations
        if(pick.equalsIgnoreCase(a))
        {
            if(drop.equalsIgnoreCase(b))
                {fare=7.00;}
            else if(drop.equalsIgnoreCase(c))
                {fare=4.00;}
            else if(drop.equalsIgnoreCase(d))
                {fare=10.00;}
        }
        else if(pick.equalsIgnoreCase(b))
        {
            if(drop.equalsIgnoreCase(a))
                {fare=7.00;}
            else if(drop.equalsIgnoreCase(c))
                {fare=8.00;}
            else if(drop.equalsIgnoreCase(d))
                {fare=13.00;}   
        }
        else if(pick.equalsIgnoreCase(c))
        {
            if(drop.equalsIgnoreCase(a))
                {fare=4.00;}
            else if(drop.equalsIgnoreCase(b))
                {fare=8.00;}
            else if(drop.equalsIgnoreCase(d))
                {fare=9.00;}   
        }
        else if(pick.equalsIgnoreCase(d))
        {
            if(drop.equalsIgnoreCase(a))
                {fare=10.00;}
            else if(drop.equalsIgnoreCase(c))
                {fare=9.00;}
            else if(drop.equalsIgnoreCase(b))
                {fare=13.00;}   
        }
         // Additional fare adjustment based on selected seat type
        if(seat.equalsIgnoreCase("6 seat"))
            {fare=fare+4;}
        // Set the calculated fare in the fare text field
        inFare.setText(String.valueOf(fare));
    }//GEN-LAST:event_confirmbtnActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // Retrieve user input
        String name = inName.getText();
        String phone = inPhone.getText();
        String Date = inDate.getText();
    
        try
        {
            // Write booking details to the Booking.txt file
            FileWriter Writer =new FileWriter("Booking.txt",true);
            Writer.write(name+";"+phone+";"+ Date +";"+ pick +";"+drop+";"+ seat +";"+Driver+";"+fare);
            Writer.write(System.getProperty("line.separator"));
            Writer.close();
            // Display success message and open Payment window
            JOptionPane.showMessageDialog(null, "success");
            /*double fares=Double.parseDouble(inFare.getText());
            setVisible(false);
            new Payment (fares).setVisible(true);*/
             // Create a new instance of the Payment class
            double fares = 0;
            Payment paymentWindow = new Payment(fares);
            paymentWindow.setLocationRelativeTo(null);
            paymentWindow.setVisible(true);    
        
        }catch(Exception e){ 
             // Display error message if an exception occurs
            JOptionPane.showMessageDialog(null, "error");
        }
    }//GEN-LAST:event_savebtnActionPerformed

    private void inDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inDriverActionPerformed
        // TODO add your handling code here:
        Driver = inDriver.getSelectedItem().toString();
    }//GEN-LAST:event_inDriverActionPerformed

    private void inPickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inPickActionPerformed
        // TODO add your handling code here:
        pick =inPick.getSelectedItem().toString();
    }//GEN-LAST:event_inPickActionPerformed

    private void inDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inDropActionPerformed
        // TODO add your handling code here:
        drop =inDrop.getSelectedItem().toString();
    }//GEN-LAST:event_inDropActionPerformed

    private void inDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inDateActionPerformed

    private void inFareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inFareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inFareActionPerformed

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
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton confirmbtn;
    private javax.swing.JTextField inDate;
    private javax.swing.JComboBox<String> inDriver;
    private javax.swing.JComboBox<String> inDrop;
    private javax.swing.JTextField inFare;
    private javax.swing.JTextField inName;
    private javax.swing.JTextField inPhone;
    private javax.swing.JComboBox<String> inPick;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JButton savebtn;
    private javax.swing.JRadioButton seat4;
    private javax.swing.JRadioButton seat6;
    // End of variables declaration//GEN-END:variables
}
