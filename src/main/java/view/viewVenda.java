/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Jonathas
 */
public class viewVenda extends javax.swing.JFrame {

    /**
     * Creates new form viewVenda
     */
    public viewVenda() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        selectProducts();
        getCateg();
        
        
    }
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    double preco;
    double prodTotal;
    double total;
    int availQuant;
    int prodId;
    int newQuant;
    public void selectProducts(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejpmarketdb","root","");
            st = con.createStatement();
            rs = st.executeQuery("select * from products");
            prodTable.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException ex){
            System.out.println("Ocorreu um erro ao acessar o banco de dados"+ex.getMessage());
        }catch (ClassNotFoundException ex) {
            System.out.println("Driver do banco de dados não localizado");
        }finally{
            if(con!=null){
                try {
                con.close();
                
                    } catch (SQLException ex) {
                        Logger.getLogger(viewLogin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }   
        }
    }
    
    public void getCateg(){
      try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejpmarketdb","root","");
            st = con.createStatement();
            String query = "Select * from categories";
            rs = st.executeQuery(query);
            while(rs.next()){
                String myCateg = rs.getString("nome");
                categCombo.addItem(myCateg);
            }
        }catch(SQLException ex){
            System.out.println("Ocorreu um erro ao acessar o banco de dados"+ex.getMessage());
        }catch (ClassNotFoundException ex) {
            System.out.println("Driver do banco de dados não localizado");
        }  
    }
    public void filtrarProd(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejpmarketdb","root","");
            st = con.createStatement();
            rs = st.executeQuery("Select * from products where categoria = '"+categCombo.getSelectedItem().toString()+"';");
            prodTable.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException ex){
            System.out.println("Ocorreu um erro ao acessar o banco de dados"+ex.getMessage());
        }catch (ClassNotFoundException ex) {
            System.out.println("Driver do banco de dados não localizado");
        } 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        prodName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        prodQuant = new javax.swing.JTextField();
        categCombo = new javax.swing.JComboBox<>();
        addBttn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        prodTable = new javax.swing.JTable();
        refreshBttn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        notaFiscal = new javax.swing.JTextPane();
        clearBttn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        printBttn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        billID = new javax.swing.JTextField();
        totalTxt = new javax.swing.JLabel();
        filterBttn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("LISTA DE PRODUTOS");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel3.setText("PRODUTO");

        prodName.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        prodName.setForeground(new java.awt.Color(0, 51, 51));
        prodName.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                prodNameComponentRemoved(evt);
            }
        });
        prodName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodNameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel6.setText("QUANTID.");

        prodQuant.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        prodQuant.setForeground(new java.awt.Color(0, 51, 51));
        prodQuant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodQuantActionPerformed(evt);
            }
        });

        categCombo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        categCombo.setForeground(new java.awt.Color(0, 51, 51));
        categCombo.setBorder(null);
        categCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        categCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categComboActionPerformed(evt);
            }
        });

        addBttn.setBackground(new java.awt.Color(0, 153, 153));
        addBttn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        addBttn.setForeground(new java.awt.Color(0, 51, 51));
        addBttn.setText("ADICIONAR");
        addBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBttnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 832, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        prodTable.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        prodTable.setForeground(new java.awt.Color(0, 51, 52));
        prodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Prod.ID", "NOME", "CATEGORIA", "QUANTID.", "PREÇO"
            }
        ));
        prodTable.setGridColor(new java.awt.Color(0, 51, 51));
        prodTable.setRowHeight(25);
        prodTable.setSelectionBackground(new java.awt.Color(0, 153, 153));
        prodTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        prodTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prodTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(prodTable);

        refreshBttn.setBackground(new java.awt.Color(0, 153, 153));
        refreshBttn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        refreshBttn.setForeground(new java.awt.Color(0, 51, 51));
        refreshBttn.setText("REFRESH");
        refreshBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshBttnMouseClicked(evt);
            }
        });

        jScrollPane2.setViewportView(notaFiscal);

        clearBttn.setBackground(new java.awt.Color(0, 153, 153));
        clearBttn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        clearBttn.setForeground(new java.awt.Color(0, 51, 51));
        clearBttn.setText("LIMPAR");
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

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel4.setText("Filtrar por:");

        printBttn.setBackground(new java.awt.Color(0, 153, 153));
        printBttn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        printBttn.setForeground(new java.awt.Color(0, 51, 51));
        printBttn.setText("Print");
        printBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        printBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printBttnMouseClicked(evt);
            }
        });
        printBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBttnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel5.setText("ID");

        billID.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        billID.setForeground(new java.awt.Color(0, 51, 51));
        billID.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                billIDComponentRemoved(evt);
            }
        });
        billID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billIDActionPerformed(evt);
            }
        });

        totalTxt.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        totalTxt.setText("R$");

        filterBttn.setBackground(new java.awt.Color(0, 153, 153));
        filterBttn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        filterBttn.setForeground(new java.awt.Color(0, 51, 51));
        filterBttn.setText("FILTRAR");
        filterBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        filterBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filterBttnMouseClicked(evt);
            }
        });
        filterBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(clearBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(billID, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(prodQuant)
                                        .addComponent(prodName, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(categCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(filterBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(refreshBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(jLabel1))
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalTxt)
                            .addComponent(printBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(refreshBttn)
                            .addComponent(categCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(filterBttn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(totalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(printBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(prodName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(prodQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(addBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(clearBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(billID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
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

        jLabel10.setBackground(new java.awt.Color(153, 153, 153));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 23)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jonathas\\Downloads\\logout (2).png")); // NOI18N
        jLabel10.setText("Logout");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("EJP MARKET");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(592, 592, 592)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void update(){
        newQuant = availQuant - Integer.valueOf(prodQuant.getText().trim());
        try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejpmarketdb","root","");        
                String Query = "Update products set quantid = '"+newQuant+"' where prodID ='"+prodId+"';";
                Statement Add = con.createStatement();
                Add.executeUpdate(Query);
                selectProducts();
                
            }catch(Exception e){
                e.printStackTrace();
            } 
    }
    private void prodNameComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_prodNameComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_prodNameComponentRemoved

    private void prodNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodNameActionPerformed

    private void prodQuantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodQuantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodQuantActionPerformed

    private void clearBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBttnMouseClicked
       
    }//GEN-LAST:event_clearBttnMouseClicked
int i = 0;

    private void addBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBttnActionPerformed
    if(prodQuant.getText().trim().isEmpty() || prodName.getText().isEmpty()){
       JOptionPane.showMessageDialog(rootPane, "Escolha o produto e a quantidade desejada");
    }else if(availQuant < Integer.valueOf(prodQuant.getText().trim())){
       JOptionPane.showMessageDialog(rootPane, "Sem estoque do produto selecionado."); 
    }
    else{
        i++;
        
        prodTotal = preco*Integer.valueOf(prodQuant.getText().trim());
        total = total + prodTotal;
        if(i == 1){
            notaFiscal.setText(notaFiscal.getText()+"==========================EJP-MARKET===========================\n"+"\t NUM      PRODUTO      PREÇO      QUANTIDADE      TOTAL\n\t    "+i+"           "+prodName.getText()+"           "+preco+"                  "+prodQuant.getText()+"                   "+prodTotal+"\n\t");
        }else{
            notaFiscal.setText(notaFiscal.getText()+"    "+i+"              "+prodName.getText()+"         "+preco+"                "+prodQuant.getText()+"               "+prodTotal+"\n\t");
        }
        totalTxt.setText("R$"+total);
        update();
    }
    }//GEN-LAST:event_addBttnActionPerformed
    
    private void prodTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prodTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)prodTable.getModel();
        int myIndex = prodTable.getSelectedRow();
        
        
        prodId = Integer.valueOf(model.getValueAt(myIndex, 0).toString().trim());
        prodName.setText(model.getValueAt(myIndex, 1).toString());
        availQuant = Integer.valueOf(model.getValueAt(myIndex, 2).toString().trim());
        preco = Double.valueOf(model.getValueAt(myIndex, 3).toString().trim());
        categCombo.setSelectedItem(model.getValueAt(myIndex, 4).toString());
        
    }//GEN-LAST:event_prodTableMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        new viewLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void refreshBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshBttnMouseClicked
        selectProducts();
    }//GEN-LAST:event_refreshBttnMouseClicked

    private void clearBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBttnActionPerformed
        prodName.setText("");
        prodQuant.setText("");
        billID.setText("");
    }//GEN-LAST:event_clearBttnActionPerformed

    private void categComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categComboActionPerformed
         
    }//GEN-LAST:event_categComboActionPerformed

    private void printBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printBttnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_printBttnMouseClicked

    private void printBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBttnActionPerformed
        try{
            notaFiscal.print();
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_printBttnActionPerformed

    private void billIDComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_billIDComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_billIDComponentRemoved

    private void billIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billIDActionPerformed

    private void filterBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filterBttnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_filterBttnMouseClicked

    private void filterBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterBttnActionPerformed
        filtrarProd();
    }//GEN-LAST:event_filterBttnActionPerformed

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
            java.util.logging.Logger.getLogger(viewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBttn;
    private javax.swing.JTextField billID;
    private javax.swing.JComboBox<String> categCombo;
    private javax.swing.JButton clearBttn;
    private javax.swing.JButton filterBttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane notaFiscal;
    private javax.swing.JButton printBttn;
    private javax.swing.JTextField prodName;
    private javax.swing.JTextField prodQuant;
    private javax.swing.JTable prodTable;
    private javax.swing.JButton refreshBttn;
    private javax.swing.JLabel totalTxt;
    // End of variables declaration//GEN-END:variables
}
