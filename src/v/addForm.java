/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import m.user;

/**
 *
 * @author Farisya
 */
public class addForm extends javax.swing.JFrame {

    String tanggal;

    public addForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void addUserView() {
        label1.setText("NamaLengkap");
        label2.setText("Alamat");
        label3.setText("Umur");
        label4.setText("Telepon");
        label5.setText("Jabatan");
        label6.setText("Username");
        label7.setText("Password");
        label8.setText("Level");
    }

    public void addLainView() {
        label1.setText("Nama");
        label2.setText("Anu");
        label3.setVisible(false);
        label4.setVisible(false);
        label5.setVisible(false);
        label6.setVisible(false);
        label7.setVisible(false);
        label8.setVisible(false);
        textfield3.setVisible(false);
        textfield4.setVisible(false);
        textfield5.setVisible(false);
        textfield6.setVisible(false);
        textfield7.setVisible(false);
        pilihlevel.setVisible(false);
    }

    public void addPenebaranBibitView() {
        label1.setText("Tanggal");
        label2.setText("Nama Bibit");
        label3.setText("Umur Bibit");
        label4.setText("Jumlah Bibit");
        label5.setVisible(false);
        label6.setVisible(false);
        label7.setVisible(false);
        label8.setVisible(false);
        textfield1.setVisible(false);
        textfield2.setVisible(false);
        textfield3.setVisible(true);
        textfield4.setVisible(true);
        textfield5.setVisible(false);
        textfield6.setVisible(false);
        textfield7.setVisible(false);
        pilihlevel.setVisible(false);
    }

    public void klikCancel(ActionListener a) {
        cancelbutton.addActionListener(a);
    }

    public void klikSave(ActionListener a) {
        savebutton.addActionListener(a);
    }

    public String getTgl() {
        DateFormat sdf;
        sdf = new SimpleDateFormat("yyyy-MM-dd");
        if (tgl.getDate() == null) {
            Calendar cal = Calendar.getInstance();
            tgl.getDateEditor().setDate(cal.getTime());
        }
        System.out.println(tgl.getDate());
        tanggal = sdf.format(tgl.getDate());
        return tanggal;
    }

    public String getTextField1() {
        String isi = textfield1.getText();
        return isi;
    }

    public String getTextField2() {
        String isi = textfield2.getText();
        return isi;
    }

    public String getTextField3() {
        String isi = textfield3.getText();
        return isi;
    }

    public String getTextField4() {
        String isi = textfield4.getText();
        return isi;
    }

    public String getTextField5() {
        String isi = textfield5.getText();
        return isi;
    }

    public String getTextField6() {
        String isi = textfield6.getText();
        return isi;
    }

    public String getTextField7() {
        String isi = textfield7.getText();
        return isi;
    }

    public String getLevel() {
        String isi = (String) pilihlevel.getSelectedItem();
        return isi;
    }
    public String getIkan() {
        String isi = (String) pilihikan.getSelectedItem();
        return isi;
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
        cancelbutton = new javax.swing.JButton();
        savebutton = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        label8 = new javax.swing.JLabel();
        textfield1 = new javax.swing.JTextField();
        textfield2 = new javax.swing.JTextField();
        textfield3 = new javax.swing.JTextField();
        textfield4 = new javax.swing.JTextField();
        textfield5 = new javax.swing.JTextField();
        textfield6 = new javax.swing.JTextField();
        textfield7 = new javax.swing.JTextField();
        dataLabel = new javax.swing.JLabel();
        FormEditLabel = new javax.swing.JLabel();
        pilihlevel = new javax.swing.JComboBox<>();
        tgl = new com.toedter.calendar.JDateChooser();
        pilihikan = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cancelbutton.setBackground(new java.awt.Color(244, 198, 198));
        cancelbutton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cancelbutton.setText("Cancel");
        cancelbutton.setBorder(null);
        cancelbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelbuttonMouseExited(evt);
            }
        });
        cancelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(cancelbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 140, 40));

        savebutton.setBackground(new java.awt.Color(59, 140, 180));
        savebutton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        savebutton.setForeground(new java.awt.Color(255, 255, 255));
        savebutton.setText("Save");
        savebutton.setBorder(null);
        savebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        savebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                savebuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                savebuttonMouseExited(evt);
            }
        });
        savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebuttonActionPerformed(evt);
            }
        });
        jPanel1.add(savebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 140, 40));

        label1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 90, 30));

        label2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 90, 30));

        label3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 90, 30));

        label4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 90, 30));

        label5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 90, 30));

        label6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 90, 30));

        label7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        label7.setForeground(new java.awt.Color(255, 255, 255));
        label7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 90, 30));

        label8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        label8.setForeground(new java.awt.Color(255, 255, 255));
        label8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 90, 30));
        jPanel1.add(textfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 260, 30));

        textfield2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield2ActionPerformed(evt);
            }
        });
        jPanel1.add(textfield2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 260, 30));

        textfield3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield3ActionPerformed(evt);
            }
        });
        jPanel1.add(textfield3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 260, 30));

        textfield4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield4ActionPerformed(evt);
            }
        });
        jPanel1.add(textfield4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 260, 30));

        textfield5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield5ActionPerformed(evt);
            }
        });
        jPanel1.add(textfield5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 260, 30));

        textfield6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield6ActionPerformed(evt);
            }
        });
        jPanel1.add(textfield6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 260, 30));

        textfield7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfield7ActionPerformed(evt);
            }
        });
        jPanel1.add(textfield7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 260, 30));

        dataLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dataLabel.setForeground(new java.awt.Color(255, 255, 255));
        dataLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dataLabel.setText("Data User");
        jPanel1.add(dataLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 120, 30));

        FormEditLabel.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        FormEditLabel.setForeground(new java.awt.Color(204, 204, 255));
        FormEditLabel.setText("Form Add");
        jPanel1.add(FormEditLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 200, -1));

        pilihlevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Pegawai" }));
        pilihlevel.setSelectedIndex(1);
        jPanel1.add(pilihlevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 100, 30));
        jPanel1.add(tgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 150, 30));

        pilihikan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lele", "Bawal", "Gurame", "Patin", "Nila" }));
        pilihikan.setSelectedIndex(-1);
        jPanel1.add(pilihikan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 100, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbuttonMouseEntered
        cancelbutton.setBackground(new Color(252, 169, 169));
        cancelbutton.setForeground(Color.white);
    }//GEN-LAST:event_cancelbuttonMouseEntered

    private void cancelbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbuttonMouseExited
        cancelbutton.setBackground(new Color(244, 198, 198));
        cancelbutton.setForeground(Color.black);
    }//GEN-LAST:event_cancelbuttonMouseExited

    private void cancelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelbuttonActionPerformed

    private void savebuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebuttonMouseEntered
        savebutton.setBackground(new Color(56, 126, 160));
        savebutton.setForeground(Color.white);
    }//GEN-LAST:event_savebuttonMouseEntered

    private void savebuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebuttonMouseExited
        savebutton.setBackground(new Color(59, 140, 180));
        savebutton.setForeground(Color.white);
    }//GEN-LAST:event_savebuttonMouseExited

    private void savebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_savebuttonActionPerformed

    private void textfield7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield7ActionPerformed

    private void textfield3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield3ActionPerformed

    private void textfield4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield4ActionPerformed

    private void textfield5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield5ActionPerformed

    private void textfield6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield6ActionPerformed

    private void textfield2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfield2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfield2ActionPerformed

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
            java.util.logging.Logger.getLogger(addForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FormEditLabel;
    private javax.swing.JButton cancelbutton;
    private javax.swing.JLabel dataLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JComboBox<String> pilihikan;
    private javax.swing.JComboBox<String> pilihlevel;
    private javax.swing.JButton savebutton;
    private javax.swing.JTextField textfield1;
    private javax.swing.JTextField textfield2;
    private javax.swing.JTextField textfield3;
    private javax.swing.JTextField textfield4;
    private javax.swing.JTextField textfield5;
    private javax.swing.JTextField textfield6;
    private javax.swing.JTextField textfield7;
    private com.toedter.calendar.JDateChooser tgl;
    // End of variables declaration//GEN-END:variables
}
