/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.awt.Dimension;
    import java.awt.Toolkit;
    import java.awt.event.KeyEvent;
    import java.io.BufferedWriter;
    import java.io.FileWriter;
    import javax.swing.JOptionPane;
    import javax.swing.table.DefaultTableModel;
    import javax.swing.table.TableRowSorter;
    import javax.swing.RowFilter;

public class FormDaftarBarang extends javax.swing.JFrame {
    int x=0;

    /**
     * Creates new form NewJFrame
     */
    public FormDaftarBarang() {
        initComponents();
        Dimension screenSize = 
         Toolkit.getDefaultToolkit().getScreenSize();
            Dimension frameSize = this.getSize();
            if (frameSize.height > screenSize.height) {
                frameSize.height = screenSize.height;
            }
            if (frameSize.width > screenSize.width) {
                frameSize.width = screenSize.width;
            }
            this.setLocation(
                    (screenSize.width - frameSize.width) / 2, 
                    (screenSize.height - frameSize.height) / 2);
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
        LabelForm = new javax.swing.JLabel();
        LabelBarang = new javax.swing.JLabel();
        TfId = new javax.swing.JTextField();
        LabelKategori = new javax.swing.JLabel();
        LabelNama = new javax.swing.JLabel();
        TfBarang = new javax.swing.JTextField();
        jButtonCancel = new javax.swing.JButton();
        ButtonDelete = new javax.swing.JButton();
        ButtonInsert = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbData = new javax.swing.JTable();
        ComboBoxCategori = new javax.swing.JComboBox<>();
        LabelStok = new javax.swing.JLabel();
        TfStok = new javax.swing.JTextField();
        jFilter = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 51, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 102));

        LabelForm.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        LabelForm.setText("Form Daftar Barang");

        LabelBarang.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        LabelBarang.setText("ID Barang");

        TfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfIdActionPerformed(evt);
            }
        });

        LabelKategori.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        LabelKategori.setText("Kategori");

        LabelNama.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        LabelNama.setText("Nama Barang");

        jButtonCancel.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        ButtonDelete.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        ButtonDelete.setText("Delete");
        ButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeleteActionPerformed(evt);
            }
        });

        ButtonInsert.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        ButtonInsert.setText("Insert");
        ButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonInsertActionPerformed(evt);
            }
        });

        TbData.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        TbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id Barang", "Kategori", "Nama Barang", "Stok"
            }
        ));
        jScrollPane1.setViewportView(TbData);

        ComboBoxCategori.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        ComboBoxCategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Minuman", "Pakaian", "Alat Tulis" }));

        LabelStok.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        LabelStok.setText("Stok");

        jFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                        .addComponent(jButtonCancel)
                        .addGap(65, 65, 65)
                        .addComponent(ButtonDelete)
                        .addGap(50, 50, 50)
                        .addComponent(ButtonInsert)
                        .addGap(46, 46, 46))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelBarang)
                            .addComponent(LabelKategori)
                            .addComponent(LabelNama)
                            .addComponent(LabelStok))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TfId)
                            .addComponent(TfBarang)
                            .addComponent(ComboBoxCategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TfStok))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addComponent(LabelForm, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(LabelForm)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBarang)
                    .addComponent(TfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelKategori)
                    .addComponent(ComboBoxCategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNama)
                    .addComponent(TfBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelStok)
                    .addComponent(TfStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancel)
                    .addComponent(ButtonDelete)
                    .addComponent(ButtonInsert)
                    .addComponent(jFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfIdActionPerformed

    private void ButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonInsertActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tabel = (DefaultTableModel)TbData.getModel();
        TbData.setValueAt (TfId.getText(),x,0);
        TbData.setValueAt (ComboBoxCategori.getSelectedItem(),x,1);
        TbData.setValueAt (TfBarang.getText(),x,2);
        TbData.setValueAt (TfStok.getText(),x,3);
        x=x+1;
        
        
    }//GEN-LAST:event_ButtonInsertActionPerformed

    private void ButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeleteActionPerformed
        // TODO add your handling code here:
        TfId.setText(" ");
        TfBarang.setText(" ");
        TfStok.setText(" ");
        ComboBoxCategori.setSelectedItem(0);
        
    }//GEN-LAST:event_ButtonDeleteActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFilterActionPerformed
        // TODO add your handling code here:
       DefaultTableModel table = (DefaultTableModel)TbData.getModel();
       String search = TfId.getText().toLowerCase();
       TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
       TbData.setRowSorter(tr);
       tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_jFilterActionPerformed

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
            java.util.logging.Logger.getLogger(FormDaftarBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDaftarBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDaftarBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDaftarBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDaftarBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonDelete;
    private javax.swing.JButton ButtonInsert;
    private javax.swing.JComboBox<String> ComboBoxCategori;
    private javax.swing.JLabel LabelBarang;
    private javax.swing.JLabel LabelForm;
    private javax.swing.JLabel LabelKategori;
    private javax.swing.JLabel LabelNama;
    private javax.swing.JLabel LabelStok;
    private javax.swing.JTable TbData;
    private javax.swing.JTextField TfBarang;
    private javax.swing.JTextField TfId;
    private javax.swing.JTextField TfStok;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JTextField jFilter;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
