/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interf;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mycode.dbconnect;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Dinith Malindu
 */
public class genreports extends javax.swing.JInternalFrame {
Connection con=null;
    PreparedStatement pst = null;
    ResultSet rs= null;
    /**
     * Creates new form addmobi
     */
    public genreports() {
        initComponents();
        con=dbconnect.connect();
        tableload();
    }
public void tableload(){
        
        try {
            String sql= "SELECT id,CustomerName,type,contact,email,home,price,month FROM customer";
       pst =con.prepareStatement(sql);
       rs=pst.executeQuery();
       
       jTable1.setModel(DbUtils.resultSetToTableModel(rs));
       
        } catch (Exception e) {
        }
        
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
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        namebox2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        namebox3 = new javax.swing.JTextField();
        namebox = new javax.swing.JTextField();
        namebox4 = new javax.swing.JTextField();
        pricebox = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        emppossition = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));

        jButton2.setFont(new java.awt.Font("Book Antiqua", 3, 13)); // NOI18N
        jButton2.setText("search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 3, 13)); // NOI18N
        jLabel6.setText("Month");

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 3, 13)); // NOI18N
        jLabel2.setText("Customer Name");

        jComboBox1.setFont(new java.awt.Font("Book Antiqua", 3, 13)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 3, 13)); // NOI18N
        jLabel3.setText("Type");

        namebox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namebox2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 3, 13)); // NOI18N
        jLabel4.setText("price ");

        namebox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namebox3ActionPerformed(evt);
            }
        });

        namebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameboxActionPerformed(evt);
            }
        });

        namebox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namebox4ActionPerformed(evt);
            }
        });

        pricebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceboxActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 3, 13)); // NOI18N
        jLabel8.setText("Contact number");

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 3, 13)); // NOI18N
        jLabel5.setText("ID");

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 3, 13)); // NOI18N
        jLabel9.setText("Email");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel10.setFont(new java.awt.Font("Book Antiqua", 3, 13)); // NOI18N
        jLabel10.setText("Home Town");

        jLabel11.setFont(new java.awt.Font("Book Antiqua", 3, 13)); // NOI18N
        jLabel11.setText("Customer Name");

        jButton1.setFont(new java.awt.Font("Book Antiqua", 3, 13)); // NOI18N
        jButton1.setText("Genarate Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        emppossition.setFont(new java.awt.Font("Book Antiqua", 3, 13)); // NOI18N
        emppossition.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select the correct job", "Full service", "Body Wash" }));
        emppossition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emppossitionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 3, 13)); // NOI18N
        jLabel1.setText("ID");

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Create a Report");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel10)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel6))
                                                    .addGap(115, 115, 115))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel1)
                                                    .addGap(194, 194, 194)))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(pricebox, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(namebox, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(emppossition, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(namebox2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(namebox3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(namebox4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel7)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(emppossition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namebox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namebox3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namebox4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pricebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
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

    private void nameboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameboxActionPerformed

    private void priceboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceboxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    int x=JOptionPane.showConfirmDialog(null,"Do you really want to Update");
         if(x==0){
        String name = namebox.getText();
    String clas = emppossition.getSelectedItem().toString();
    String id = jLabel5.getText();
    String contact = namebox2.getText();
    String email = namebox3.getText();
    
     String price = pricebox.getText();
     String mont = jComboBox1.getSelectedItem().toString();
     
    try {
             String g= "INSERT INTO report(CustomerName, type, contact, email, price, month) VALUES ('"+name+"','"+clas+"','"+contact+"','"+email+"','"+price+"','"+mont+"')";
  pst =con.prepareStatement(g);
  pst.execute();
  tableload();
        } catch (Exception e) {
            int y=JOptionPane.showConfirmDialog(null,"same ID");
        }
         }
                 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      int r=jTable1.getSelectedRow(); 
        String id =jTable1.getValueAt(r, 0).toString();
        String name =jTable1.getValueAt(r, 1).toString();
        String clas =jTable1.getValueAt(r, 2).toString();
        
        String contact =jTable1.getValueAt(r, 3).toString();
        String email =jTable1.getValueAt(r, 4).toString();
        String home =jTable1.getValueAt(r, 5).toString();
        String price =jTable1.getValueAt(r, 6).toString();
        String mont =jTable1.getValueAt(r, 7).toString();
        
        namebox.setText(name);
        
        emppossition.setSelectedItem(clas);
      
        namebox2.setText(contact);
        namebox3.setText(email);
        namebox4.setText(home);
        pricebox.setText(price);
         jComboBox1.setSelectedItem(mont);
        jLabel5.setText(id);
    }//GEN-LAST:event_jTable1MouseClicked

    private void namebox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namebox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namebox2ActionPerformed

    private void namebox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namebox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namebox3ActionPerformed

    private void namebox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namebox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namebox4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String name =jTextField1.getText();
        
        try {String sql = "SELECT id,CustomerName,type,contact,email,home,price,month FROM customer where CustomerName like '%"+name+"%'";
            pst =con.prepareStatement(sql);
  rs=pst.executeQuery();
  jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed
 private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
//      String name = namebox.getText();
//    String clas = emppossition.getSelectedItem().toString();
//    String id = jLabel5.getText();
//    String contact = namebox2.getText();
//    String email = namebox3.getText();
//    
//     String price = pricebox.getText();
//     String mont = jComboBox1.getSelectedItem().toString();           
//     jTextArea1.setText("Receipt No :  "+jLabel5.getText() + "\n"
//                        +"*******************\n"
//                        + "Receipt Type:"+emppossition.getSelectedItem().toString()+ "\n "
//                        + "Receipt For Month Of " +jComboBox1.getSelectedItem().toString()+ "\n\n "
//                        + "Receipt Charges\n"
//                        + "--------------- \n"
//                        + "Total Repair Charge :Rs."+namebox2.getText()+ "\n "
//                        + "Total Disporsal Charge :Rs."+namebox3.getText()+ "\n "
//                        + "Total Towing Charge :Rs."+namebox3.getText()+ "\n"
//                        + "******************************************\n"
//                        + "Total Repair/Restore Charges:Rs."+pricebox.getText()+ "\n "
//                        + "*******************************************\n" );
//                
    }//GEN-LAST:event_printActionPerformed

    private void emppossitionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emppossitionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emppossitionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox emppossition;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField namebox;
    private javax.swing.JTextField namebox2;
    private javax.swing.JTextField namebox3;
    private javax.swing.JTextField namebox4;
    private javax.swing.JTextField pricebox;
    // End of variables declaration//GEN-END:variables
}
