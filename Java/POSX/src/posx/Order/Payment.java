package posx.Order;



import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import posx.Login.LoginHome;
import posx.main.*;
import posx.Admin.Customer.*;
import posx.Admin.*;
import posx.Account.*;
import posx.Login.*;
import posx.Order.*;
import posx.main.*;
import java.math.*;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaden Ade
 */
public class Payment extends javax.swing.JFrame {
    String type;

    /**
     * Creates new form LoginHome
     */
    public Payment() {
        initComponents();
                

        
    }
    public Payment(String para){
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jTextField2 = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField10 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(1440, 800));
        setMinimumSize(new java.awt.Dimension(1440, 800));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1440, 800));
        setResizable(false);
        setSize(new java.awt.Dimension(1440, 800));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Ayuthaya", 1, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Payment");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(530, 50, 380, 70);

        jTextField5.setEditable(false);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(610, 190, 280, 40);

        jTextField4.setEditable(false);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(610, 230, 280, 40);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Credit Card");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(800, 330, 130, 21);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Payment Method:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(370, 320, 230, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Customer Name:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(370, 230, 230, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Customer ID:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(370, 190, 230, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phone:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(370, 270, 230, 40);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Cash");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(610, 330, 80, 21);

        jTextField2.setEditable(false);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(610, 270, 280, 40);

        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator10);
        jSeparator10.setBounds(1140, 420, 270, 190);
        getContentPane().add(jSeparator8);
        jSeparator8.setBounds(290, 420, 50, 10);
        getContentPane().add(jSeparator7);
        jSeparator7.setBounds(440, 420, 700, 10);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(290, 610, 850, 10);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(1140, 180, 110, 190);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(290, 180, 50, 10);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(380, 180, 760, 10);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(290, 370, 850, 10);
        getContentPane().add(jTextField10);
        jTextField10.setBounds(680, 550, 180, 40);

        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField9KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField9);
        jTextField9.setBounds(900, 440, 190, 40);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Auth Number:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(560, 550, 180, 40);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Card Number(4DIGITS):");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(740, 440, 240, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Bill Total:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(360, 440, 180, 40);

        jButton6.setBackground(new java.awt.Color(102, 0, 204));
        jButton6.setFont(new java.awt.Font("Ayuthaya", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("PAY");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(570, 690, 300, 40);

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(900, 440, 190, 40);

        jTextField1.setEditable(false);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(680, 550, 180, 40);

        jTextField6.setEditable(false);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(440, 440, 190, 40);

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

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/posx/main/logosmal.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(1180, 610, 330, 230);

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

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Balance:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(560, 550, 130, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cash Received:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(800, 440, 130, 40);

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Payment Details");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(340, 400, 160, 40);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Details");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(340, 160, 160, 40);

        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator9);
        jSeparator9.setBounds(290, 420, 800, 190);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(290, 180, 760, 190);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/posx/main/bg2.jpeg"))); // NOI18N
        jLabel2.setSize(new java.awt.Dimension(1440, 800));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1440, 800);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
int cust=Integer.parseInt(Order.jTextField1.getText());
String name=(String)Order.jComboBox1.getSelectedItem();
String phone=(String)Order.jTextField2.getText();
jTextField5.setText(Integer.toString(cust));
jTextField4.setText(name);
jTextField2.setText(phone);
float tpay=Float.parseFloat(Order.jTextField9.getText());
jTextField6.setText(Float.toString(tpay));
        jTextField3.setText("0");
        
        jTextField1.setText("0");
       
    jLabel8.setVisible(false);
    jLabel14.setVisible(false);
    jTextField9.setVisible(false);
    jLabel15.setVisible(false);
    jTextField10.setVisible(false);
    
    jLabel10.setVisible(false);
    
    //631
 
    jTextField3.setVisible(false);
    jTextField1.setVisible(false); 
   



     // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
/*String cat=(String)jComboBox2.getSelectedItem();  
jComboBox3.removeAllItems();
try 
            {Class.forName("java.sql.DriverManager");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/BILLING", "root", "");
         
            Statement stmt=con.createStatement();
            
            String cate="SELECT * FROM PRODUCT WHERE CATEGORY='"+cat+"';";
       
            
            ResultSet rs=stmt.executeQuery(cate);
            
            
            
     while(rs.next())
            {
                String i=rs.getString("NAME");
               
                
                
               jComboBox3.addItem(i);
                
            }
    
      
      }
 catch(Exception e)
            {System.out.println(e);
           }*/
            
// TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved

    // TODO add your handling code here:
    }//GEN-LAST:event_formMouseMoved

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
  if (jRadioButton1.isSelected()==true)
  {
    jLabel8.setVisible(true);
    jLabel10.setVisible(true);
   
    jLabel14.setVisible(false);
    jTextField9.setVisible(false);
    jLabel15.setVisible(false);
    jTextField10.setVisible(false);
    //631
   
    jTextField3.setVisible(true);
    jTextField1.setVisible(true); 
String type="Cash"; 
  }
    

// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
if(jRadioButton2.isSelected()==true)
  {
   jLabel8.setVisible(false);
    jLabel10.setVisible(false);
    
    jLabel14.setVisible(true);
    jTextField9.setVisible(true);
    jLabel15.setVisible(true);
    jTextField10.setVisible(true);
    
    
    
    //631
   jTextField3.setText("0");
   jTextField1.setText("0");
    jTextField3.setVisible(false);
    jTextField1.setVisible(false);   
      String type="Card";
  } 
          // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
float amt=Float.parseFloat(jTextField6.getText().trim());
float cas=Float.parseFloat(jTextField3.getText().trim());



float t=-(amt-cas);

jTextField1.setText(Float.toString(t).trim());

// TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9KeyReleased

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
int bid=Integer.parseInt(Order.jLabel19.getText().trim());
int id=Integer.parseInt(jTextField5.getText().trim());
float total=Float.parseFloat(jTextField6.getText().trim());

if(jRadioButton1.isSelected()==true){
float recd=Float.parseFloat(jTextField3.getText().trim());
String bal=jTextField1.getText().trim(); 
        try 
            {Class.forName("java.sql.DriverManager");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/BILLING", "root", "");
         
            Statement stmt=con.createStatement();
            
            String query="INSERT INTO PAYMENT(BILL_ID, CUST_ID, TYPE, TOTAL, RECEIVED, BALANCE) VALUES("+bid+","+id+",'CASH','"+total+"','"+recd+"','"+bal+"');";
            stmt.executeUpdate(query);
            
            String iid="INSERT INTO BILL_ID VALUES('"+bid+"');";
            
            stmt.executeUpdate(iid);
            
     
            {
                JOptionPane.showMessageDialog(this,"Order Processed along with Payment \n Press OK to Close form");}
                this.setVisible(false);
                new Main().setVisible(true);
            }
 catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e);
 int cus=JOptionPane.showConfirmDialog(this,"Error during Processing!!\n Redo Payment?","ERROR",JOptionPane.YES_NO_OPTION);
                    if (cus==0){
                        
                        this.setVisible(false);
                    new Main().setVisible(true);}
                   
            }}

        



       else if(jRadioButton2.isSelected()==true){
int cardnum=Integer.parseInt(jTextField9.getText().trim());
        int authno=Integer.parseInt(jTextField10.getText().trim());
        try 
            {Class.forName("java.sql.DriverManager");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/BILLING", "root", "");
         
            Statement stmt=con.createStatement();
            
             String query="INSERT INTO PAYMENT(BILL_ID, CUST_ID, TYPE, TOTAL, CARD_NUMBER, AUTH_NO) VALUES("+bid+","+id+",'CARD','"+total+"','"+cardnum+"','"+authno+"');";
            stmt.executeUpdate(query);
            String iid="INSERT INTO BILL_ID VALUES('"+bid+"');";
            
            stmt.executeUpdate(iid);
            
            
     
            {
                JOptionPane.showMessageDialog(this,"Order Processed along with Payment \n Press OK to Close form");}
                this.setVisible(false);
                new Main().setVisible(true);
            }
 catch(Exception e)
            {
               // JOptionPane.showMessageDialog(this, "ERROR");
 int cus=JOptionPane.showConfirmDialog(this,"Error during Processing!!\n Redo Payment?","ERROR",JOptionPane.YES_NO_OPTION);
                    if (cus==0){
                        
                        this.setVisible(false);
                    new Main().setVisible(true);}
                   
            }
}

        else {
            JOptionPane.showMessageDialog(this,"Please Select Payment Method");
        }
            
                    // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
new Order().setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      

        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

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
    public javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton6;
    public javax.swing.JButton jButton9;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JRadioButton jRadioButton1;
    public javax.swing.JRadioButton jRadioButton2;
    public javax.swing.JSeparator jSeparator1;
    public javax.swing.JSeparator jSeparator10;
    public javax.swing.JSeparator jSeparator2;
    public javax.swing.JSeparator jSeparator3;
    public javax.swing.JSeparator jSeparator4;
    public javax.swing.JSeparator jSeparator5;
    public javax.swing.JSeparator jSeparator6;
    public javax.swing.JSeparator jSeparator7;
    public javax.swing.JSeparator jSeparator8;
    public javax.swing.JSeparator jSeparator9;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField10;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField5;
    public javax.swing.JTextField jTextField6;
    public javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    private void setIconImage(String icon_2jpg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getTextField() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}