package posx.Account;



import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import posx.Admin.*;
import posx.Login.*;
import posx.Order.*;
import posx.main.*;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaden Ade
 */
public class Account extends javax.swing.JFrame {
    

    /**
     * Creates new form LoginHome
     */
    public Account() {
        initComponents();
                

        
    }
    public Account(String para){
        initComponents();
        empid2.setText(para);
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
        jButton6 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        empid2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1440, 800));
        setMinimumSize(new java.awt.Dimension(1440, 800));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1440, 800));
        setResizable(false);
        setSize(new java.awt.Dimension(1440, 800));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Ayuthaya", 1, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Account Settings");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(450, 70, 560, 60);

        jButton6.setText("HOME");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(0, 0, 210, 30);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(null);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(610, 490, 360, 40);

        jButton3.setFont(new java.awt.Font("Ayuthaya", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 0, 204));
        jButton3.setText("UPDATE PHONE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1030, 490, 200, 40);

        jButton5.setFont(new java.awt.Font("Ayuthaya", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(102, 0, 204));
        jButton5.setText("UPDATE EMAIL");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(1030, 370, 200, 40);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/posx/main/logosmal.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(1180, 610, 330, 230);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(null);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(610, 370, 360, 40);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phone:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(410, 490, 120, 40);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Employee ID:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(410, 250, 190, 40);

        jButton9.setText("EXIT");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(1230, 0, 210, 30);

        empid2.setEditable(false);
        empid2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        empid2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        empid2.setBorder(null);
        empid2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                empid2ComponentShown(evt);
            }
        });
        empid2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empid2ActionPerformed(evt);
            }
        });
        getContentPane().add(empid2);
        empid2.setBounds(610, 250, 360, 40);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(410, 360, 190, 40);

        jButton1.setFont(new java.awt.Font("Ayuthaya", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 204));
        jButton1.setText("RESET PASSWORD");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1030, 610, 200, 40);

        jButton4.setText("CANCEL");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(0, 770, 170, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/posx/main/bg2.jpeg"))); // NOI18N
        jLabel2.setSize(new java.awt.Dimension(1440, 800));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1440, 800);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
PasswordReset log = new PasswordReset();
        log.setVisible(true);

        this.setVisible(false);             // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Main log = new Main();
        log.setVisible(true);

        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void empid2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empid2ActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_empid2ActionPerformed

    private void empid2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_empid2ComponentShown
      // TODO add your handling code here:
    }//GEN-LAST:event_empid2ComponentShown

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
empid2.setText(LoginHome.empid.getText());
int id=Integer.parseInt(empid2.getText());
try 
            {Class.forName("java.sql.DriverManager");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/BILLING", "root", "");
         
            Statement stmt=con.createStatement();
            
            String query="SELECT * FROM USERS WHERE EMPLOYEE_ID='"+id+"';";
            ResultSet rs=stmt.executeQuery(query);
            if(rs.next())
            { String email=rs.getString("EMAIL");
           String phone=rs.getString("PHONE");
           jTextField3.setText(email);
           jTextField2.setText(phone);
      }}
 catch(Exception e)
            { 
            }
            
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
Email log = new Email();
        log.setVisible(true);

        this.setVisible(false);             // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
Phone log = new Phone();
        log.setVisible(true);

        this.setVisible(false);             // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Main log = new Main();
        log.setVisible(true);

        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField empid2;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton6;
    public javax.swing.JButton jButton9;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    private void setIconImage(String icon_2jpg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getTextField() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
