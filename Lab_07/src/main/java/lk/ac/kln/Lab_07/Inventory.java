package lk.ac.kln.Lab_07;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Inventory extends javax.swing.JFrame {
    
    Connection con1=null;
    PreparedStatement pst = null;
    ResultSet rs;
    
    public Inventory() {
        initComponents();
        con1 = dbConnection.connect();
        this.setSize(750, 480);
        this.setTitle("Inventory Application");
        
        table_update();//update table
    }
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanelMenu = new javax.swing.JPanel();
        addBtn = new javax.swing.JButton();
        UpDelBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanelUpdate = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNo1 = new javax.swing.JTextField();
        txtName1 = new javax.swing.JTextField();
        txtType1 = new javax.swing.JTextField();
        jButtonDelete = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonResetUD = new javax.swing.JButton();
        jPanelInsert = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtType = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jButtonResetInsert = new javax.swing.JButton();
        jPanelTable = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jScrollPane1.setViewportView(jEditorPane1);

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(720, 420));
        setMinimumSize(new java.awt.Dimension(720, 420));

        jPanelMenu.setBackground(new java.awt.Color(153, 255, 255));
        jPanelMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addBtn.setBackground(new java.awt.Color(153, 255, 153));
        addBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addBtn.setText("Add");
        addBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanelMenu.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 73, -1));

        UpDelBtn.setBackground(new java.awt.Color(153, 255, 153));
        UpDelBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UpDelBtn.setText("Update and Delete");
        UpDelBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        UpDelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        UpDelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpDelBtnActionPerformed(evt);
            }
        });
        jPanelMenu.add(UpDelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 210, -1));

        viewBtn.setBackground(new java.awt.Color(153, 255, 153));
        viewBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewBtn.setText("View");
        viewBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MouseExited(evt);
            }
        });
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });
        jPanelMenu.add(viewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 73, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("New Building Inventory");
        jPanelMenu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 232, 33));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Inventory of the Department of Industry");
        jPanelMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, 38));

        jPanel1.setLayout(new java.awt.CardLayout());

        jPanelUpdate.setBackground(new java.awt.Color(153, 204, 255));
        jPanelUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update and Delete", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel6.setText("Inventory No:");

        jLabel7.setText("Inventory Name:");

        jLabel8.setText("Inventory Type:");

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonResetUD.setText("Reset");
        jButtonResetUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetUDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelUpdateLayout = new javax.swing.GroupLayout(jPanelUpdate);
        jPanelUpdate.setLayout(jPanelUpdateLayout);
        jPanelUpdateLayout.setHorizontalGroup(
            jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUpdateLayout.createSequentialGroup()
                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelUpdateLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(txtNo1)
                            .addComponent(txtType1)))
                    .addGroup(jPanelUpdateLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jButtonResetUD, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButtonUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 199, Short.MAX_VALUE))
        );
        jPanelUpdateLayout.setVerticalGroup(
            jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUpdateLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtType1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonResetUD)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonDelete))
                .addContainerGap(244, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelUpdate, "card4");

        jPanelInsert.setBackground(new java.awt.Color(153, 153, 255));
        jPanelInsert.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Insert ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Inventory Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Inventory Type:");

        txtType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTypeActionPerformed(evt);
            }
        });

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonResetInsert.setText("Reset");
        jButtonResetInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetInsertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInsertLayout = new javax.swing.GroupLayout(jPanelInsert);
        jPanelInsert.setLayout(jPanelInsertLayout);
        jPanelInsertLayout.setHorizontalGroup(
            jPanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInsertLayout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addGroup(jPanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelInsertLayout.createSequentialGroup()
                        .addComponent(jButtonResetInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelInsertLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelInsertLayout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(236, 236, 236))
        );
        jPanelInsertLayout.setVerticalGroup(
            jPanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInsertLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanelInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonResetInsert)
                    .addComponent(jButtonAdd))
                .addContainerGap(290, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelInsert, "card2");

        jPanelTable.setBackground(new java.awt.Color(204, 153, 255));
        jPanelTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "VIew Inventory", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanelTable.setMaximumSize(new java.awt.Dimension(720, 420));
        jPanelTable.setMinimumSize(new java.awt.Dimension(720, 420));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Inventory Num.", "Name", "Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanelTableLayout = new javax.swing.GroupLayout(jPanelTable);
        jPanelTable.setLayout(jPanelTableLayout);
        jPanelTableLayout.setHorizontalGroup(
            jPanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
        );
        jPanelTableLayout.setVerticalGroup(
            jPanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTableLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanelTable, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void table_update(){
        
        try{
            
            String sql ="select * from inventory order by InventoryNum";
            pst = con1.prepareStatement(sql);
            rs = pst.executeQuery();
            
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
     
        String name = txtName.getText().toLowerCase();
        String type = txtType.getText().toLowerCase();
        
        try{
            String queryAdd = "INSERT INTO inventory(Name,Type) values ('" + name + "','" + type + "');";
            pst = con1.prepareStatement(queryAdd);
            pst.execute();
                
            JOptionPane.showMessageDialog(null,"Inventory Added");
            table_update();
            txtName.setText("");
            txtType.setText("");
            txtName.requestFocus();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"failed!");
        }       
        
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed

        try{
            
            String InventoryNum = txtNo1.getText();
            String name1 = txtName1.getText();
            String type1 = txtType1.getText();
            String sql = "update inventory set InventoryNum = '"+ InventoryNum+ "',Name ='"+ name1+ "',Type = '"+type1+"' where InventoryNum = '"+ InventoryNum+ "' " ;
            
            pst = con1.prepareStatement(sql);
            pst.execute(sql);
            
            JOptionPane.showMessageDialog(null, "Updated!");
            table_update(); 
            
            txtNo1.setText("");
            txtName1.setText("");
            txtType1.setText("");
            txtNo1.requestFocus();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        
            try{
                
                String InventoryNum = txtNo1.getText();
                String sql = "DELETE from inventory where InventoryNum ="+InventoryNum+";" ;
                pst = con1.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Deleted");
                table_update();   
            
                txtNo1.setText("");
                txtName1.setText("");
                txtType1.setText("");
                txtName.requestFocus();
                
                
            }catch(Exception e){
                System.out.println(e);
            }
               
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonResetInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetInsertActionPerformed
        
        txtName.setText("");
        txtType.setText("");
        txtName.requestFocus();
        
    }//GEN-LAST:event_jButtonResetInsertActionPerformed

    private void jButtonResetUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetUDActionPerformed
        txtNo1.setText("");
        txtName1.setText("");
        txtType1.setText("");
        txtNo1.requestFocus();
    }//GEN-LAST:event_jButtonResetUDActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        
        jPanelInsert.setVisible(true);
        jPanelTable.setVisible(false);
        jPanelUpdate.setVisible(false);
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void UpDelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpDelBtnActionPerformed
        
        jPanelInsert.setVisible(false);
        jPanelTable.setVisible(false);
        jPanelUpdate.setVisible(true);
        
    }//GEN-LAST:event_UpDelBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        
        jPanelInsert.setVisible(false);
        jPanelTable.setVisible(true);
        jPanelUpdate.setVisible(false);
        
        
    }//GEN-LAST:event_viewBtnActionPerformed

    private void MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseEntered
        
        if (evt.getSource()==addBtn){
            
            addBtn.setBackground(new Color(135,135,135));
        }
        if (evt.getSource()==UpDelBtn){
            UpDelBtn.setBackground(new Color(135,135,135));
            
        }
        if (evt.getSource()==viewBtn){
            viewBtn.setBackground(new Color(135,135,135));
            
        }
       
        
    }//GEN-LAST:event_MouseEntered

    private void MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseExited
       
         if (evt.getSource()==addBtn){
            
            addBtn.setBackground(new Color(153,255,153));
        }
        if (evt.getSource()==UpDelBtn){
            UpDelBtn.setBackground(new Color(153,255,153));
            
        }
        if (evt.getSource()==viewBtn){
            viewBtn.setBackground(new Color(153,255,153));
            
        }
        
        
    }//GEN-LAST:event_MouseExited

    private void txtTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypeActionPerformed
        
    }//GEN-LAST:event_txtTypeActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        int row = jTable1.getSelectedRow();
        String InventoryNum = jTable1.getValueAt(row, 0).toString();
        String Name = jTable1.getValueAt(row, 1).toString();
        String Type = jTable1.getValueAt(row, 2).toString();
        
        txtNo1.setText(InventoryNum);
        txtName1.setText(Name);
        txtType1.setText(Type);
        
    }//GEN-LAST:event_jTable1MouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpDelBtn;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonResetInsert;
    private javax.swing.JButton jButtonResetUD;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelInsert;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelTable;
    private javax.swing.JPanel jPanelUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtNo1;
    private javax.swing.JTextField txtType;
    private javax.swing.JTextField txtType1;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}

/*
    This is that increment id for insert check later
    
    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {                                              
        
        String name = txtName.getText().toLowerCase();
        String type = txtType.getText().toLowerCase();
        try{
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/stock","root","");
            statement = connection.createStatement();
            String queryID = "SELECT * FROM inventory ORDER BY Stockno desc limit 1";
            ResultSet result = statement.executeQuery(queryID);
            
            if(result.next()){
                String IDnow = result.getString("Stockno");
                int ID = Integer.parseInt(IDnow);
                ID++;
                String queryAdd = "INSERT INTO inventory(Stockno,EquipmentName,EquipmentType) values (" + ID + ",'" + name + "','" + type + "');";
                statement.executeUpdate(queryAdd);
                
                JOptionPane.showMessageDialog(null, "Successfully Added");
            }
            
            else{
                JOptionPane.showMessageDialog(null, "Failed");
            }
            
            updateTable();
            txtName.setText("");
            txtType.setText("");
            txtName.requestFocus();
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        
    }                                             
*/