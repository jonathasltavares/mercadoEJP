/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import DAO.SellerDAO;
import modelo.Seller;
import modelo.sellerTableModel;



/**
 *
 * @author Jonathas
 */
public class viewManageSellers extends javax.swing.JFrame {

    /**
     * Creates new form viewManageSellers
     */
    public viewManageSellers() {
        initComponents();
        sellersTable.setModel(getTableModelSeller());
    }
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    private sellerTableModel tm;
    private sellerTableModel s;
    
    public sellerTableModel getTableModelSeller() { 
        SellerDAO dados = new SellerDAO(); 
        tm = new sellerTableModel(dados.getLista("SELECT * FROM sellers"));
       
        return tm;
       }
      
       private sellerTableModel montaGrid(String sql){   
        SellerDAO dados = new SellerDAO();       
        s = new sellerTableModel(dados.getLista(sql));
        return s;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();
        labelpass = new javax.swing.JLabel();
        sellId = new javax.swing.JTextField();
        nomelabel = new javax.swing.JLabel();
        sellName = new javax.swing.JTextField();
        editBttn = new javax.swing.JButton();
        deleteBttn = new javax.swing.JButton();
        addBttn = new javax.swing.JButton();
        clearBttn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sellersTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        sellPass = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(991, 552));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 19)); // NOI18N
        jLabel1.setText("LISTA DE VENDEDORES");

        labelId.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        labelId.setText("VendedorID");

        labelpass.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        labelpass.setText("PASSWORD");

        sellId.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        sellId.setForeground(new java.awt.Color(0, 51, 51));
        sellId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellIdActionPerformed(evt);
            }
        });

        nomelabel.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        nomelabel.setText("NOME");

        sellName.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        sellName.setForeground(new java.awt.Color(0, 51, 51));
        sellName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellNameActionPerformed(evt);
            }
        });

        editBttn.setBackground(new java.awt.Color(0, 153, 153));
        editBttn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        editBttn.setForeground(new java.awt.Color(0, 51, 51));
        editBttn.setText("EDIT");
        editBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBttnMouseClicked(evt);
            }
        });
        editBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBttnActionPerformed(evt);
            }
        });

        deleteBttn.setBackground(new java.awt.Color(0, 153, 153));
        deleteBttn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        deleteBttn.setForeground(new java.awt.Color(0, 51, 51));
        deleteBttn.setText("DELETE");
        deleteBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBttnMouseClicked(evt);
            }
        });
        deleteBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBttnActionPerformed(evt);
            }
        });

        addBttn.setBackground(new java.awt.Color(0, 153, 153));
        addBttn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        addBttn.setForeground(new java.awt.Color(0, 51, 51));
        addBttn.setText("ADD");
        addBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBttnActionPerformed(evt);
            }
        });

        clearBttn.setBackground(new java.awt.Color(0, 153, 153));
        clearBttn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        clearBttn.setForeground(new java.awt.Color(0, 51, 51));
        clearBttn.setText("CLEAR");
        clearBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBttnMouseClicked(evt);
            }
        });
        clearBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBttnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 19)); // NOI18N
        jLabel7.setText("GERENCIAR VENDEDORES");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        sellersTable.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        sellersTable.setForeground(new java.awt.Color(0, 51, 52));
        sellersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        sellersTable.setGridColor(new java.awt.Color(0, 51, 51));
        sellersTable.setRowHeight(25);
        sellersTable.setSelectionBackground(new java.awt.Color(0, 153, 153));
        sellersTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        sellersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(sellersTable);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jTable2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jTable2.setForeground(new java.awt.Color(0, 51, 52));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Vend.ID", "NOME", "PASSWORD"
            }
        ));
        jTable2.setGridColor(new java.awt.Color(0, 51, 51));
        jTable2.setRowHeight(25);
        jTable2.setSelectionBackground(new java.awt.Color(0, 153, 153));
        jTable2.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        sellPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(labelId)
                                        .addGap(18, 18, 18)
                                        .addComponent(sellId, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(labelpass)
                                        .addGap(28, 28, 28)
                                        .addComponent(sellPass)))
                                .addGap(43, 43, 43)
                                .addComponent(nomelabel)
                                .addGap(18, 18, 18)
                                .addComponent(sellName, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(addBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(editBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(deleteBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(clearBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(117, 117, 117))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(labelId))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(sellId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(sellName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nomelabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sellPass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelpass))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("X");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(153, 153, 153));
        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 23)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Produtos");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(153, 153, 153));
        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 23)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logout (2).png"))); // NOI18N
        jLabel12.setText("Logout");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(153, 153, 153));
        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 23)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Categorias");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(153, 153, 153));
        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 23)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Relatório");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sellIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellIdActionPerformed

    private void sellNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellNameActionPerformed

    private void deleteBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBttnActionPerformed

    private void clearBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearBttnActionPerformed

    private void sellPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellPassActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        new viewProducts().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        new viewManageCategories().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        new viewLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void addBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBttnActionPerformed
        // TODO add your handling code here:
        if(sellId.getText().isEmpty() || sellName.getText().isEmpty() || sellPass.getText().isEmpty()){
          JOptionPane.showMessageDialog(rootPane, "Falta informações.");  
        }
            
        else {

            Seller s = new Seller();
            s.setUserID(sellId.getText());
            s.setNome(sellName.getText()); 
            s.setPassword(Integer.valueOf(sellPass.getText()));
            
            SellerDAO dados = new SellerDAO();
            dados.adiciona(s);
            sellersTable.setModel(getTableModelSeller());
            JOptionPane.showMessageDialog(null, "Vendedor "+sellName.getText()+" inserido");
        }
       
        sellId.setText("");
        sellName.setText("");
        sellPass.setText(""); 
    }//GEN-LAST:event_addBttnActionPerformed

    private void sellersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellersTableMouseClicked

        sellId.setText(sellersTable.getValueAt(sellersTable.getSelectedRow(), 0).toString());
        sellName.setText(sellersTable.getValueAt(sellersTable.getSelectedRow(), 1).toString());
        sellPass.setText(sellersTable.getValueAt(sellersTable.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_sellersTableMouseClicked

    private void clearBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBttnMouseClicked
        // TODO add your handling code here:
        sellId.setText("");
        sellName.setText("");
        sellPass.setText("");
    }//GEN-LAST:event_clearBttnMouseClicked

    private void deleteBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBttnMouseClicked
        // TODO add your handling code here:
        if(sellId.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Escolha o vendedor para ser deletado");
        }else {
         
            Seller s = new Seller();
            s.setUserID(sellId.getText());
            s.setNome(sellName.getText()); 
            s.setPassword(Integer.valueOf(sellPass.getText()));
           
            SellerDAO dados = new SellerDAO();
            dados.deleta(s);
            sellersTable.setModel(getTableModelSeller());
            JOptionPane.showMessageDialog(null, "Vendedor deletado com sucesso!");
        }
       
        sellId.setText("");
        sellName.setText("");
        sellPass.setText(""); 
    }//GEN-LAST:event_deleteBttnMouseClicked

    private void editBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBttnMouseClicked
        if(sellId.getText().isEmpty() || sellName.getText().isEmpty() || sellPass.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Informações faltando.");
        }else {
            
            Seller s = new Seller();
            s.setUserID(sellId.getText());
            s.setNome(sellName.getText()); 
            s.setPassword(Integer.valueOf(sellPass.getText()));
          
            SellerDAO dados = new SellerDAO();
            dados.editar(s);
            sellersTable.setModel(getTableModelSeller());
            JOptionPane.showMessageDialog(null, "Vendedor editado com sucesso!");
        }
      
        sellId.setText("");
        sellName.setText("");
        sellPass.setText(""); 
    }//GEN-LAST:event_editBttnMouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        new viewRelatorio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void editBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBttnActionPerformed
        if(sellId.getText().isEmpty() || sellName.getText().isEmpty() || sellPass.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Informações faltando.");
        }else {
            
            Seller s = new Seller();
            s.setUserID(sellId.getText());
            s.setNome(sellName.getText()); 
            s.setPassword(Integer.valueOf(sellPass.getText()));
            
            SellerDAO dados = new SellerDAO();
            dados.editar(s);
            sellersTable.setModel(getTableModelSeller());
            JOptionPane.showMessageDialog(null, "Vendedor editado com sucesso!");
        }
        
        sellId.setText("");
        sellName.setText("");
        sellPass.setText("");
    }//GEN-LAST:event_editBttnActionPerformed

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
            java.util.logging.Logger.getLogger(viewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBttn;
    private javax.swing.JButton clearBttn;
    private javax.swing.JButton deleteBttn;
    private javax.swing.JButton editBttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelpass;
    private javax.swing.JLabel nomelabel;
    private javax.swing.JTextField sellId;
    private javax.swing.JTextField sellName;
    private javax.swing.JPasswordField sellPass;
    private javax.swing.JTable sellersTable;
    // End of variables declaration//GEN-END:variables
}
