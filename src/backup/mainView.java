/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backup;

import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Farisya
 */
public class mainView extends javax.swing.JFrame {

    /**
     * Creates new form mainmenu
     */
    public mainView() {
        initComponents();
    }

    public String getUsername() {
        String username = usernamefield.getText();
//      System.out.println("' " + username + " '");
        return username;
    }
    public String getPassword() {
        String pass = passwordfield.getText();
//      System.out.println("' " + username + " '");
        return pass;
    }
      public void klikLogin(ActionListener action) {
        login.addActionListener(action);
    }

    public void tampilPesan(String pesan) {
        JOptionPane.showMessageDialog(this, pesan);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passwordfield = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        usernamefield = new javax.swing.JTextField();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordfield.setFont(new java.awt.Font("Amatic", 0, 24)); // NOI18N
        passwordfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordfield.setPreferredSize(new java.awt.Dimension(232, 43));
        getContentPane().add(passwordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 520, -1, -1));

        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/loginbtn.png"))); // NOI18N
        login.setBorder(null);
        login.setBorderPainted(false);
        login.setContentAreaFilled(false);
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 630, 110, -1));

        usernamefield.setFont(new java.awt.Font("Amatic", 0, 24)); // NOI18N
        usernamefield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernamefield.setPreferredSize(new java.awt.Dimension(232, 43));
        getContentPane().add(usernamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 430, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/mainmenu.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
      
    }//GEN-LAST:event_loginActionPerformed

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
        ImageIcon hovery = new ImageIcon(getClass().getResource("/assets/login hover.png"));
        this.login.setIcon(hovery);
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
        ImageIcon release = new ImageIcon(getClass().getResource("/assets/loginbtn.png"));
        this.login.setIcon(release);
    }//GEN-LAST:event_loginMouseExited

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
            java.util.logging.Logger.getLogger(mainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField passwordfield;
    private javax.swing.JTextField usernamefield;
    // End of variables declaration//GEN-END:variables

}
