/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboard;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hnd
 */
public class UserInterface extends javax.swing.JFrame {

    private final String filename = "data.txt";
    private String category;
    private String price;
    private String desc;
    private String fileName;
    private Vector data;

    public UserInterface() {
        initComponents();
        LoadData();

        Table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table1MouseClicked(evt);
            }

        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pannel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        IdL = new javax.swing.JLabel();
        NameL = new javax.swing.JLabel();
        CategoryL = new javax.swing.JLabel();
        PriceL = new javax.swing.JLabel();
        DescriptonL = new javax.swing.JLabel();
        Idf = new javax.swing.JTextField();
        Namef = new javax.swing.JTextField();
        CategoryC = new javax.swing.JComboBox();
        Pricef = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        DescriptoinA = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        AddB = new javax.swing.JButton();
        UpdateB = new javax.swing.JButton();
        DeleteB = new javax.swing.JButton();
        ClearB = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        SerchHereLable = new javax.swing.JLabel();
        Serchbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pannel.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tekton Pro Ext", 1, 36)); // NOI18N
        jLabel1.setText("Dashboard");

        IdL.setBackground(new java.awt.Color(255, 255, 255));
        IdL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        IdL.setText("ID");

        NameL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NameL.setText("Name");

        CategoryL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CategoryL.setText("Category");

        PriceL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PriceL.setText("Price");

        DescriptonL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DescriptonL.setText("Description");

        Idf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdfActionPerformed(evt);
            }
        });

        CategoryC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Car", "Van", "Bike", " ", " " }));
        CategoryC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryCActionPerformed(evt);
            }
        });

        DescriptoinA.setColumns(20);
        DescriptoinA.setRows(5);
        jScrollPane1.setViewportView(DescriptoinA);

        Table1.setBackground(new java.awt.Color(255, 204, 204));
        Table1.setForeground(new java.awt.Color(255, 255, 255));
        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Category", "Price", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Table1);

        AddB.setBackground(new java.awt.Color(255, 204, 204));
        AddB.setText("Add");
        AddB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBActionPerformed(evt);
            }
        });

        UpdateB.setBackground(new java.awt.Color(255, 204, 204));
        UpdateB.setText("Update");
        UpdateB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBActionPerformed(evt);
            }
        });

        DeleteB.setBackground(new java.awt.Color(255, 204, 204));
        DeleteB.setText("Delete");
        DeleteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBActionPerformed(evt);
            }
        });

        ClearB.setBackground(new java.awt.Color(255, 204, 204));
        ClearB.setText("Clear");
        ClearB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        SerchHereLable.setText("Search Here");

        Serchbtn.setText("Serch");

        javax.swing.GroupLayout PannelLayout = new javax.swing.GroupLayout(Pannel);
        Pannel.setLayout(PannelLayout);
        PannelLayout.setHorizontalGroup(
            PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PannelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(341, 341, 341))
            .addGroup(PannelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PannelLayout.createSequentialGroup()
                        .addComponent(SerchHereLable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Serchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PannelLayout.createSequentialGroup()
                            .addGap(129, 129, 129)
                            .addComponent(DeleteB)
                            .addGap(72, 72, 72)
                            .addComponent(ClearB, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PannelLayout.createSequentialGroup()
                            .addGroup(PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PannelLayout.createSequentialGroup()
                                    .addGroup(PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(IdL, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NameL)
                                        .addComponent(CategoryL)
                                        .addComponent(PriceL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DescriptonL, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(76, 76, 76)
                                    .addGroup(PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Idf, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Namef, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CategoryC, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Pricef, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(PannelLayout.createSequentialGroup()
                                    .addGap(129, 129, 129)
                                    .addComponent(AddB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(72, 72, 72)
                                    .addComponent(UpdateB)))
                            .addGap(68, 68, 68)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        PannelLayout.setVerticalGroup(
            PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SerchHereLable)
                    .addComponent(Serchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PannelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Idf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IdL, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Namef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameL))
                        .addGap(28, 28, 28)
                        .addGroup(PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CategoryL)
                            .addComponent(CategoryC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PannelLayout.createSequentialGroup()
                                .addGroup(PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(PriceL)
                                    .addComponent(Pricef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addComponent(DescriptonL))
                            .addGroup(PannelLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(114, 114, 114)
                        .addGroup(PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddB)
                            .addComponent(UpdateB)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(PannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DeleteB)
                    .addComponent(ClearB))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     private void ClearFields() {
        Idf.setText("");
        Namef.setText("");
        Pricef.setText("");
        DescriptoinA.setText("");
        CategoryC.setSelectedItem(0);
    }

    private void addData() {
        String ID = Idf.getText();
        String Name = Namef.getText();
        String Price = Pricef.getText();
        String Description = DescriptoinA.getText();
        String Category = CategoryC.getSelectedItem().toString();

        try (FileWriter fw = new FileWriter(filename, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);) {
            pw.println(ID + "," + Name + "," + Category + "," + Price + "," + Description);
        } catch (Exception e) {

        }
    }

    private void updateData() {
        String id = Idf.getText();
        String name = Namef.getText();
        String price = Pricef.getText();
        String desc = DescriptoinA.getText();
        String category = CategoryC.getSelectedItem().toString();

        List<String> dataList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(Idf)) {
                    line = id + "," + name + "," + category + "," + price + "," + desc;
                }
                dataList.add(line);
            }
        } catch (Exception e) {
        }
        try (FileWriter fw = new FileWriter(filename, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);) {
            pw.println(id + "," + name + "," + category + "," + price + "," + desc);
        } catch (Exception e) {

        }

    }
    
    //  merthed to delete selected row
    private void deleteData(){
        String id = Idf.getText();
        List<String> dataList = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = br.readLine()) != null){
                String[] data =line.split(",");
                if(data[0].equals(Idf)){
                    line = id + "," + name + "," + category + "," + price + "," + desc;
                }
                    dataList.add(line);
            }
            }
         catch (Exception e) {
        }
        try {FileWriter fw = new FileWriter(filename, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw)) {
            for(String data: dataList){
                pw.println(data);
            }
        }
            
        } catch (Exception e) {
        }
    }
    private void serchData(String serchTerm){
        DefaultTableModel model = (DefaultTableModel) Table1.getModel();
        
        model.setRowCount(0);
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            while(line = br.readLine() !=null){
                String line;
                
                if (data[0].contains(searchTerm) || data[1].contains(searchTerm)){
                    
                    model.addRow(data);
                }
            }
            
        } catch (Exception e) {
        }
    }
    
    

    private void CategoryCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryCActionPerformed

    private void AddBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBActionPerformed
        addData();
        ClearFields();
        LoadData();
    }//GEN-LAST:event_AddBActionPerformed

    private void ClearBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBActionPerformed
        ClearFields();
    }//GEN-LAST:event_ClearBActionPerformed

    private void Table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table1MouseClicked
        int selectedRow = Table1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) Table1.getModel();

        Idf.setText(model.getValueAt(selectedRow, 0).toString());
        Namef.setText(model.getValueAt(selectedRow, 1).toString());
        CategoryC.setSelectedItem(model.getValueAt(selectedRow, 2).toString());
        Pricef.setText(model.getValueAt(selectedRow, 3).toString());
        DescriptoinA.setText(model.getValueAt(selectedRow, 4).toString());


    }//GEN-LAST:event_Table1MouseClicked

    private void IdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdfActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void UpdateBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBActionPerformed
       updateData();
    }//GEN-LAST:event_UpdateBActionPerformed

    private void DeleteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBActionPerformed
        deleteData();// TODO add your handling code here:
    }//GEN-LAST:event_DeleteBActionPerformed

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
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddB;
    private javax.swing.JComboBox CategoryC;
    private javax.swing.JLabel CategoryL;
    private javax.swing.JButton ClearB;
    private javax.swing.JButton DeleteB;
    private javax.swing.JTextArea DescriptoinA;
    private javax.swing.JLabel DescriptonL;
    private javax.swing.JLabel IdL;
    private javax.swing.JTextField Idf;
    private javax.swing.JLabel NameL;
    private javax.swing.JTextField Namef;
    private javax.swing.JPanel Pannel;
    private javax.swing.JLabel PriceL;
    private javax.swing.JTextField Pricef;
    private javax.swing.JLabel SerchHereLable;
    private javax.swing.JButton Serchbtn;
    private javax.swing.JTable Table1;
    private javax.swing.JButton UpdateB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void LoadData() {
        DefaultTableModel model = (DefaultTableModel) Table1.getModel();
        model.setRowCount(0);

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                model.addRow(data);
            }

        } catch (Exception e) {

        }

    }
}
