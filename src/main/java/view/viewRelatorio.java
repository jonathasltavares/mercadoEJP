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
public class viewRelatorio extends javax.swing.JFrame {

    /**
     * Creates new form viewRelatorio
     */
    public viewRelatorio() {
        initComponents();
        selectVendas();
        getSeller();
        numeroVendasTotal();
    }

    
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    
    
    public void selectVendas(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejpmarketdb","root","");
            st = con.createStatement();
            rs = st.executeQuery("select * from relatorio");
            vendTable.setModel(DbUtils.resultSetToTableModel(rs));
            
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
    public void getSeller(){
      try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejpmarketdb","root","");
            st = con.createStatement();
            String query = "Select * from sellers";
            rs = st.executeQuery(query);
            while(rs.next()){
                String myCateg = rs.getString("nome");
                sellerCombo.addItem(myCateg);
            }
        }catch(SQLException ex){
            System.out.println("Ocorreu um erro ao acessar o banco de dados"+ex.getMessage());
        }catch (ClassNotFoundException ex) {
            System.out.println("Driver do banco de dados não localizado");
        }  
    }
    public void filtrarSeller(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejpmarketdb","root","");
            st = con.createStatement();
            rs = st.executeQuery("Select * from relatorio where vendedor = '"+sellerCombo.getSelectedItem().toString()+"';");
            vendTable.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException ex){
            System.out.println("Ocorreu um erro ao acessar o banco de dados"+ex.getMessage());
        }catch (ClassNotFoundException ex) {
            System.out.println("Driver do banco de dados não localizado");
        } 
    }
    public void numeroVendasTotal(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejpmarketdb","root","");
            st = con.createStatement();
            rs = st.executeQuery("select count(*) from relatorio");
            rs.next();
            numVendas.setText(String.valueOf(rs.getInt(1)));
            
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
    public void numeroVendasFiltro(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejpmarketdb","root","");
            st = con.createStatement();
            rs = st.executeQuery("Select count(*) from relatorio where vendedor = '"+sellerCombo.getSelectedItem().toString()+"';");
            rs.next();
            numVendas.setText(String.valueOf(rs.getInt(1)));
            
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vendTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        vendaID = new javax.swing.JTextField();
        txtfieldaa = new javax.swing.JLabel();
        sellerNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        totalTxt = new javax.swing.JTextField();
        editBttn = new javax.swing.JButton();
        deleteBttn = new javax.swing.JButton();
        clearBttn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        refreshBttn = new javax.swing.JButton();
        filterBttn = new javax.swing.JButton();
        sellerCombo = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        numVendas = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(973, 600));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 19)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("RELATÓRIO DE VENDAS");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        vendTable.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        vendTable.setForeground(new java.awt.Color(0, 51, 52));
        vendTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "VendaID", "Vendedor ", "Total"
            }
        ));
        vendTable.setGridColor(new java.awt.Color(0, 51, 51));
        vendTable.setRowHeight(25);
        vendTable.setSelectionBackground(new java.awt.Color(0, 153, 153));
        vendTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        vendTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vendTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(vendTable);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel2.setText("Vendedor");

        vendaID.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        vendaID.setForeground(new java.awt.Color(0, 51, 51));
        vendaID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendaIDActionPerformed(evt);
            }
        });

        txtfieldaa.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        txtfieldaa.setText("Venda.ID");

        sellerNome.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        sellerNome.setForeground(new java.awt.Color(0, 51, 51));
        sellerNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellerNomeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel4.setText("Total");

        totalTxt.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        totalTxt.setForeground(new java.awt.Color(0, 51, 51));
        totalTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTxtActionPerformed(evt);
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

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FILTRAR POR VENDEDOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 18))); // NOI18N

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
        refreshBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBttnActionPerformed(evt);
            }
        });

        filterBttn.setBackground(new java.awt.Color(0, 153, 153));
        filterBttn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        filterBttn.setForeground(new java.awt.Color(0, 51, 51));
        filterBttn.setText("FILTRAR");
        filterBttn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        filterBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterBttnActionPerformed(evt);
            }
        });

        sellerCombo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        sellerCombo.setForeground(new java.awt.Color(0, 51, 51));
        sellerCombo.setBorder(null);
        sellerCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sellerCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellerComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sellerCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(filterBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(refreshBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sellerCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filterBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {filterBttn, refreshBttn, sellerCombo});

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TOTAL DE VENDAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 18))); // NOI18N

        numVendas.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        numVendas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(numVendas)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(numVendas)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtfieldaa)
                                        .addGap(18, 18, 18)
                                        .addComponent(vendaID, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(288, 288, 288)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(editBttn)
                                .addGap(18, 18, 18)
                                .addComponent(clearBttn)
                                .addGap(18, 18, 18)
                                .addComponent(deleteBttn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sellerNome, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {clearBttn, deleteBttn, editBttn});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vendaID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfieldaa))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(sellerNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(editBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clearBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {clearBttn, deleteBttn, editBttn});

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

        jLabel9.setBackground(new java.awt.Color(153, 153, 153));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 23)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Categorias");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
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

        jLabel11.setBackground(new java.awt.Color(153, 153, 153));
        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 23)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Vendedores");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(153, 153, 153));
        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 23)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Produtos");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        new viewManageCategories().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        new viewLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        new viewManageSellers().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void vendTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vendTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)vendTable.getModel();
        int myIndex = vendTable.getSelectedRow();
        vendaID.setText(model.getValueAt(myIndex, 0).toString());
        sellerNome.setText(model.getValueAt(myIndex, 1).toString());
        totalTxt.setText(model.getValueAt(myIndex, 2).toString());
        
        
    }//GEN-LAST:event_vendTableMouseClicked

    private void filterBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterBttnActionPerformed
        filtrarSeller();
        numeroVendasFiltro();
    }//GEN-LAST:event_filterBttnActionPerformed

    private void refreshBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshBttnMouseClicked
        
    }//GEN-LAST:event_refreshBttnMouseClicked

    private void sellerComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellerComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellerComboActionPerformed

    private void refreshBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBttnActionPerformed
        selectVendas();
        numeroVendasTotal();
    }//GEN-LAST:event_refreshBttnActionPerformed

    private void vendaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendaIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vendaIDActionPerformed

    private void sellerNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellerNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellerNomeActionPerformed

    private void totalTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalTxtActionPerformed

    private void editBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBttnMouseClicked
        
    }//GEN-LAST:event_editBttnMouseClicked

    private void deleteBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBttnMouseClicked
        
    }//GEN-LAST:event_deleteBttnMouseClicked

    private void deleteBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBttnActionPerformed
       if(vendaID.getText().isEmpty() || sellerNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Escolha a venda para ser deletada");
        }else{
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejpmarketdb","root","");              
                String Query = "Delete from relatorio where vendaId ='"+vendaID.getText()+"';";
                Statement Add = con.createStatement();
                Add.executeUpdate(Query);
                selectVendas();
                JOptionPane.showMessageDialog(rootPane, "Venda deletada com sucesso.");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_deleteBttnActionPerformed

    private void clearBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBttnMouseClicked
        vendaID.setText("");
        sellerNome.setText("");
        totalTxt.setText("");
        
    }//GEN-LAST:event_clearBttnMouseClicked

    private void clearBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBttnActionPerformed
        vendaID.setText("");
        sellerNome.setText("");
        totalTxt.setText("");
        
    }//GEN-LAST:event_clearBttnActionPerformed

    private void editBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBttnActionPerformed
        if(vendaID.getText().isEmpty() || sellerNome.getText().isEmpty() || totalTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Informações faltando.");
        }else{
           try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejpmarketdb","root","");              
                String Query = "Update relatorio set vendedor = '"+sellerNome.getText()+"', valor = '"+Double.valueOf(totalTxt.getText())+"' where vendaId ='"+Integer.valueOf(vendaID.getText())+"';";
                Statement Add = con.createStatement();
                Add.executeUpdate(Query);
                selectVendas();
                JOptionPane.showMessageDialog(rootPane, "Venda editada com sucesso.");
            }catch(Exception e){
                e.printStackTrace();
            } 
        }
    }//GEN-LAST:event_editBttnActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        new viewProducts().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

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
            java.util.logging.Logger.getLogger(viewRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewRelatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBttn;
    private javax.swing.JButton deleteBttn;
    private javax.swing.JButton editBttn;
    private javax.swing.JButton filterBttn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel numVendas;
    private javax.swing.JButton refreshBttn;
    private javax.swing.JComboBox<String> sellerCombo;
    private javax.swing.JTextField sellerNome;
    private javax.swing.JTextField totalTxt;
    private javax.swing.JLabel txtfieldaa;
    private javax.swing.JTable vendTable;
    private javax.swing.JTextField vendaID;
    // End of variables declaration//GEN-END:variables
}
