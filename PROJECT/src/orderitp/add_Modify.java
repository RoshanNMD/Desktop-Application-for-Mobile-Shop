package orderitp;



import DB_connection.stock_db;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.runtime.regexp.joni.exception.JOniException;
import net.proteanit.sql.DbUtils;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC-LIFE
 */
public class add_Modify extends javax.swing.JFrame {
    Connection conn= null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form add_Modify
     */
    public add_Modify() {
        initComponents();
        
        //coonect db
        conn = stock_db.connect();
        tableload();
        
    }
    
    public void tableload(){
        try {
             String sql = "SELECT id,emiNo,model,brand,capacity,warrenty,Tot_imported,unit_prc FROM add_stock";
        pst= conn.prepareStatement(sql);
        rs=pst.executeQuery();
        viewTable.setModel(DbUtils.resultSetToTableModel(rs));
        
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
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        emi_no = new javax.swing.JTextField();
        model = new javax.swing.JTextField();
        brand = new javax.swing.JTextField();
        capacity = new javax.swing.JTextField();
        warrenty = new javax.swing.JTextField();
        tot_imported = new javax.swing.JTextField();
        unit_prc = new javax.swing.JTextField();
        add_bttn = new javax.swing.JButton();
        delete_bttn = new javax.swing.JButton();
        update_bttn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        lable_id = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1244, 614));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        jButton2.setText("Reject Item");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Generate Report");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Home");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jButton2)
                .addGap(33, 33, 33)
                .addComponent(jButton3)
                .addGap(28, 28, 28)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_stock.png"))); // NOI18N
        jLabel1.setText("Stock Management");

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/home@@.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Add New Item");

        jLabel3.setText("Emi No");

        jLabel4.setText("Model");

        jLabel5.setText("Brand");

        jLabel6.setText("Capacity");

        jLabel7.setText("Warrenty");

        jLabel8.setText("Total No of Imported Phones from model");

        jLabel9.setText("Unit Price");
        jLabel9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel9KeyTyped(evt);
            }
        });

        emi_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emi_noActionPerformed(evt);
            }
        });

        warrenty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warrentyActionPerformed(evt);
            }
        });

        tot_imported.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tot_importedActionPerformed(evt);
            }
        });
        tot_imported.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tot_importedKeyTyped(evt);
            }
        });

        unit_prc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                unit_prcKeyTyped(evt);
            }
        });

        add_bttn.setText("ADD");
        add_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_bttnActionPerformed(evt);
            }
        });

        delete_bttn.setText("DELETE");
        delete_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_bttnActionPerformed(evt);
            }
        });

        update_bttn.setText("UPDATE");
        update_bttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_bttnMouseClicked(evt);
            }
        });
        update_bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_bttnActionPerformed(evt);
            }
        });

        viewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Stock id", "Emi No", "Model", "Brand", "Capacity", "Warrenty", "Tot of imported phones", "Unit price"
            }
        ));
        viewTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(viewTable);

        jLabel10.setText("Stock_id");

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emi_no)
                            .addComponent(model)
                            .addComponent(brand)
                            .addComponent(capacity)
                            .addComponent(warrenty)
                            .addComponent(tot_imported)
                            .addComponent(unit_prc, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(lable_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(add_bttn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete_bttn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(update_bttn)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lable_id, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(emi_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(capacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(warrenty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tot_imported, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(unit_prc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add_bttn)
                            .addComponent(delete_bttn)
                            .addComponent(update_bttn)
                            .addComponent(jButton1)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(174, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emi_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emi_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emi_noActionPerformed

    private void warrentyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warrentyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_warrentyActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        Reject_Stock Rj = new Reject_Stock();
        Rj.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          try {
            
        viewTable.print();
        } 
          
          catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
          try {
            
        viewTable.print();
        } 
          
          catch (Exception e) {
        }
 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void add_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_bttnActionPerformed
        String Emi = emi_no.getText();
        String Model = model.getText();
        String Brand = brand.getText();
        String Capacity = capacity.getText();
        String Warrenty = warrenty.getText();
        String Tot = tot_imported.getText();
        String Unitprc = unit_prc.getText();
        
       
       if(Emi.equals("")){
            JOptionPane.showMessageDialog(null,"You can't keep empty for Emi no colomn ");
        }
       else if(Model.equals("")){
            JOptionPane.showMessageDialog(null,"You can't keep empty for model colomn ");
        }
       else if(Brand.equals("")){
            JOptionPane.showMessageDialog(null,"You can't keep empty for Brand colomn ");
        }
       else if(Capacity.equals("")){
            JOptionPane.showMessageDialog(null,"You can't keep empty for Capacity colomn ");
        }
       else if(Warrenty.equals("")){
            JOptionPane.showMessageDialog(null,"You can't keep empty for Warrenty colomn ");
        }
       else if(Tot.equals("")){
            JOptionPane.showMessageDialog(null,"You can't keep empty for Total imported phone colomn ");
        }
       else if(Unitprc.equals("")){
            JOptionPane.showMessageDialog(null,"You can't keep empty for Unit price colomn");
        }
             else{
                  JOptionPane.showMessageDialog(null,"Do you want to add?");
              }
              
            try {
              String adS = "INSERT INTO add_stock (emiNo,model,brand,capacity,warrenty,Tot_imported,unit_prc)values ('"+Emi+"','"+Model+"','"+Brand+"','"+Capacity+"','"+Warrenty+"','"+Tot+"','"+Unitprc+"')";
              pst= conn.prepareStatement(adS);
              pst.execute();
              
              tableload();
              ClearTextFeild();
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_add_bttnActionPerformed

    private void delete_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_bttnActionPerformed
       
       int x = JOptionPane.showConfirmDialog(null, "Do you want to delete?");
       if(x==0){
          String id = lable_id.getText();
          
          String sql = "DELETE from add_stock where id='"+id+"'";
           try {
                pst = conn.prepareStatement(sql);
                pst.execute();
                
                tableload();
                ClearTextFeild();
                
           } catch (Exception e) {
           }
       }
    }//GEN-LAST:event_delete_bttnActionPerformed

    private void tot_importedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tot_importedKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)|| c==KeyEvent.VK_BACK_SPACE)|| c==KeyEvent.VK_DELETE){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tot_importedKeyTyped

    private void jLabel9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel9KeyTyped
        
    }//GEN-LAST:event_jLabel9KeyTyped

    private void unit_prcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unit_prcKeyTyped
      /*   try{
       char c=evt.getKeyChar();
        if(!(Character.isDigit(c)|| c==KeyEvent.VK_BACK_SPACE)|| c==KeyEvent.VK_DELETE){
            getToolkit().beep();
            evt.consume();
        }
        }
        catch(Exception e){
                System.err.println(e);
                }*/
      char c=evt.getKeyChar();
      if(Character.isLetter(c) &&! evt.isAltDown()){
          evt.consume();
      }
         
    }//GEN-LAST:event_unit_prcKeyTyped

    private void viewTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewTableMouseClicked
      
        int r = viewTable.getSelectedRow();
        
       String id = viewTable.getValueAt(r, 0).toString();
       String emi = viewTable.getValueAt(r, 1).toString();
       String modl = viewTable.getValueAt(r, 2).toString();
       String brnd = viewTable.getValueAt(r, 3).toString();
       String capcty = viewTable.getValueAt(r, 4).toString();
       String wrnty = viewTable.getValueAt(r, 5).toString();
       String totImp = viewTable.getValueAt(r, 6).toString();
       String unitP = viewTable.getValueAt(r, 7).toString();
       
       emi_no.setText(emi);
       model.setText(modl);
       brand.setText(brnd);
       capacity.setText(capcty);
       warrenty.setText(wrnty);
       tot_imported.setText(totImp);
       unit_prc.setText(unitP);
       lable_id.setText(id);
      
      
    }//GEN-LAST:event_viewTableMouseClicked

    private void update_bttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_bttnActionPerformed
        int x= JOptionPane.showConfirmDialog(null,"Do you want to update");
        
        if(x==0){
            String id = lable_id.getText();
            String emi = emi_no.getText();
            String mod = model.getText();
            String brd = brand.getText();
            String capcty = capacity.getText();
            String wrrnty = warrenty.getText();
            String totI = tot_imported.getText();
            String untP = unit_prc.getText();
            
            String sql = "UPDATE add_stock SET emiNo = '"+emi+"' , model='"+mod+"' , brand='"+brd+"' , capacity='"+capcty+"' , warrenty='"+wrrnty+"' ,Tot_imported= '"+totI+"', unit_prc='"+untP+"' where id='"+id+"'";
            try {
                pst = conn.prepareStatement(sql);
                pst.execute();
                tableload();
                ClearTextFeild();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_update_bttnActionPerformed

    private void ClearTextFeild()
    {
        lable_id.setText(null);
        emi_no.setText(null);
        model.setText(null);
        brand.setText(null);
        capacity.setText(null);
        warrenty.setText(null);
        tot_imported.setText(null);
        unit_prc.setText(null);
    }
    
    private void update_bttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_bttnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_update_bttnMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tot_importedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tot_importedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tot_importedActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(add_Modify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_Modify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_Modify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_Modify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_Modify().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_bttn;
    private javax.swing.JTextField brand;
    private javax.swing.JTextField capacity;
    private javax.swing.JButton delete_bttn;
    private javax.swing.JTextField emi_no;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lable_id;
    private javax.swing.JTextField model;
    private javax.swing.JTextField tot_imported;
    private javax.swing.JTextField unit_prc;
    private javax.swing.JButton update_bttn;
    private javax.swing.JTable viewTable;
    private javax.swing.JTextField warrenty;
    // End of variables declaration//GEN-END:variables
}
