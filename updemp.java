
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANJALI
 */
public class updemp extends javax.swing.JFrame {

    /**
     * Creates new form updemp
     */
    public updemp() {
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
        eno = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        dsg1 = new javax.swing.JComboBox();
        dpt = new javax.swing.JComboBox();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("UPDATE EMPLOYEE DETAILS");

        jLabel2.setText("EMPLOYEE NO.");

        eno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enoKeyPressed(evt);
            }
        });

        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel3.setText("EMPLOYEE NAME");

        name.setEnabled(false);

        jLabel4.setText("DESIGNATION");

        jLabel5.setText("SALARY");

        sal.setEnabled(false);
        sal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                salKeyPressed(evt);
            }
        });

        jLabel6.setText("DAPARTMENT");

        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        dsg1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CEO", "MANAGER", "FINANCER", "SALES MANAGER", "H.R.", "H.O.D." }));
        dsg1.setEnabled(false);

        dpt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CEO", "MANAGING", "FINANCING", "SALES", "H.R'S", "H.O.D'S" }));
        dpt.setEnabled(false);

        exit.setText("BACK");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1)
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name)
                            .addComponent(sal)
                            .addComponent(dsg1, 0, 0, Short.MAX_VALUE)
                            .addComponent(dpt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(82, 82, 82)
                        .addComponent(eno)
                        .addGap(18, 18, 18)
                        .addComponent(search)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(clear)
                .addGap(48, 48, 48)
                .addComponent(update)
                .addGap(30, 30, 30)
                .addComponent(exit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(eno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(dsg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(dpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update)
                    .addComponent(clear)
                    .addComponent(exit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
      String en=eno.getText();
      name.setEnabled(true);
      String dsgignation=(String)dsg1.getSelectedItem();
      sal.setEnabled(true);
      String department=(String)dpt.getSelectedItem();
      if(en.isEmpty())
      {
        JOptionPane.showMessageDialog(this,"ENTER EMPLOYEE NO");
        name.setEnabled(false);
        sal.setEnabled(false);
        eno.setText("");
        dsg1.setEnabled(false);
        dpt.setEnabled(false);
      }
      else
      {
          
      
        try
      {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            
            PreparedStatement ps=con.prepareStatement("select empno,ename,designation,salary,dapartment from emp where empno=?");
            ps.setString(1,en);
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
               /* eno.setText(rs.getString(1));
                name.setText(rs.getString(2));
                ps.setString(3,(String)dsg1.getSelectedItem());
                sal.setText(rs.getString(4));
                ps.setString(5,(String)dpt.getSelectedItem());*/
                
                String s=rs.getString(2);
                String s1=rs.getString(3);
                String s2=rs.getString(4);
                String s3=rs.getString(5);
                name.setText(s);
                dsg1.setSelectedItem(s1);
                dpt.setSelectedItem(s3);
                sal.setText(s2);
                name.setEnabled(true);
                dsg1.setEnabled(true);
                dpt.setEnabled(true);
                
            }
            else
            {
               JOptionPane.showMessageDialog(this,"RECORD NOT FOUND" );
               eno.setText("");
                name.setEnabled(false);
                dsg1.setEnabled(false);
                dpt.setEnabled(false);
                sal.setEnabled(false);
            }
      }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
      }
    
     
    }//GEN-LAST:event_searchActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

                
            
         try{
            int en=Integer.parseInt(eno.getText());
            String ename=name.getText();
            int esal=Integer.parseInt(sal.getText());
            String designation=(String)dsg1.getSelectedItem();
            String department=(String)dpt.getSelectedItem();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            
            PreparedStatement ps=con.prepareStatement("update emp set empno='"+en+"',ename='"+ename+"',designation='"+designation+"',salary='"+esal+"',dapartment='"+department+"' where empno=?");
            ps.setInt(1, en);
            int rs=ps.executeUpdate();
            while(rs>0)
            {
             JOptionPane.showMessageDialog(this,"RECORD UPDATED");
             eno.setText("");
             name.setText("");
             sal.setText("");
             name.setEnabled(false);
             dsg1.setEnabled(false);
             dpt.setEnabled(false);
             sal.setEnabled(false);
             break;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Field can't be empty");
        }
    
           
     
    }//GEN-LAST:event_updateActionPerformed
        
    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        eno.setText(" ");
        name.setText(" ");
        
        sal.setText(" ");
      
    }//GEN-LAST:event_clearActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        new emp_man().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void enoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enoKeyPressed
        if((evt.getKeyChar()>='0' && evt.getKeyChar()<='9') || (evt.getKeyChar() == evt.VK_DELETE))
            
        {
          eno.setEnabled(true);
           
           
        }
        else{
            JOptionPane.showMessageDialog(this, "Insert integer value");
            eno.setText("");
            eno.setEnabled(true);
    }                              
    }//GEN-LAST:event_enoKeyPressed

    private void salKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salKeyPressed
       char c=evt.getKeyChar();
      if(!((c>='0') && (c<='9') || (c==evt.VK_BACK_SPACE) || (c==evt.VK_DELETE)))
      {
          JOptionPane.showMessageDialog(this,"ENTER INTEGER VALUE");
          //eno.grabFocus();
          sal.setText("");
      }
                 
                                   

    }//GEN-LAST:event_salKeyPressed
       
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
            java.util.logging.Logger.getLogger(updemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updemp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JComboBox dpt;
    private javax.swing.JComboBox dsg1;
    private javax.swing.JTextField eno;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField name;
    private javax.swing.JTextField sal;
    private javax.swing.JButton search;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
