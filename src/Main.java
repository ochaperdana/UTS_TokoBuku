
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Smktelkom
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tfNama = new javax.swing.JTextField();
        tfHarga = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSave1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfIDBarang1 = new javax.swing.JTextField();
        tfNamaBarang1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfHargaBarang1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfQty1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfTotal2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        tfKasir = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("TOKO BUKU LALALA");

        Date.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N

        Time.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(155, 155, 155))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 40));

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));

        jLabel4.setText("Nama Barang");

        jLabel7.setText("Harga Barang");

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel3.setText("ID Barang");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "NAMA BARANG", "HARGA BARANG"
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

        btnSave1.setText("REFRESH");
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave1)
                        .addGap(71, 71, 71)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 64, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnSave1)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("INPUT BARANG");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 307, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 305, 770, 10));

        jPanel6.setBackground(new java.awt.Color(255, 0, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel5.setText("TRANSAKSI PEMBERIAN BARANG");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 268, 26));

        jLabel8.setText("ID Barang");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        tfIDBarang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIDBarang1ActionPerformed(evt);
            }
        });
        jPanel6.add(tfIDBarang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 280, -1));

        tfNamaBarang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNamaBarang1ActionPerformed(evt);
            }
        });
        jPanel6.add(tfNamaBarang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 280, -1));

        jLabel10.setText("Nama Barang");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 90, -1));

        jLabel11.setText("Harga Barang");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 90, -1));

        tfHargaBarang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHargaBarang1ActionPerformed(evt);
            }
        });
        jPanel6.add(tfHargaBarang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 280, -1));

        jLabel12.setText("Qty");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 90, -1));

        tfQty1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQty1ActionPerformed(evt);
            }
        });
        jPanel6.add(tfQty1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 280, -1));

        jLabel13.setText("Total Harga");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 90, -1));

        tfTotal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTotal2ActionPerformed(evt);
            }
        });
        jPanel6.add(tfTotal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 280, -1));

        jLabel14.setText("Tanggal Transaksi");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 90, -1));
        jPanel6.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 280, -1));

        jLabel6.setText("Nama Kasir");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 90, -1));

        tfKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfKasirActionPerformed(evt);
            }
        });
        jPanel6.add(tfKasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 280, -1));

        jButton5.setText("SAVE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        jButton3.setText("CLEAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, -1));

        jButton6.setText("PRINT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Barang", "Nama Barang", "Harga Barang", "Qty", "Total Harga", "Tanggal Transaksi", "Nama Kasir"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 87, 480, 300));

        jButton7.setText("HITUNG");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 810, 430));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 840, 770);

        setBounds(0, 0, 831, 809);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        /*tfNama.setText("");
        tfID.setText("");
        tfHarga.setText("");
        buttonGroup1.clearSelection();
        tfTmpLahir.setText("");
        jDateChooser2.setCalendar(null);
        tfEmail.setText("");
        taAlamat.setText("");*/
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Integer hargaBarang=Integer.parseInt(tfHargaBarang1.getText());
        Integer qty=Integer.parseInt(tfQty1.getText());
        Integer total=hargaBarang*qty;
        if (total>=100000) {
            total=total-((10/100)*total);
        }
        else{
            total=total-0;
        }
        String jml=total.toString();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String tanggal=dateFormat.format(jDateChooser1.getDate());
        if ("".equals(tfIDBarang1.getText())||"".equals(tfNamaBarang1.getText())||"".equals(tfHargaBarang1.getText())||"".equals(tfQty1.getText())||"".equals(tfTotal2.getText())||"".equals(tfKasir.getText())||"".equals(tanggal)) {
            JOptionPane.showMessageDialog(this, "Harap lengkapi data Anda","Error", JOptionPane.WARNING_MESSAGE);

        }
        else{
            int baris=jTable2.getSelectedRow();
            String id=jTable2.getValueAt(baris, 1).toString();
            String SQL="INSERT INTO tb_transaksi(id_produk,nama_produk,harga_produk,qty,total,nama_kasir,tgl_transaksi)"+
            "VALUES('"+tfIDBarang1.getText()+"','"+tfNamaBarang1.getText()+"','"+tfHargaBarang1.getText()+"','"+tfQty1.getText()+"','"+tfTotal2.getText()+"','"+tfKasir.getText()+"','"+tanggal+"')";
            int status=DBConnection.execute(SQL);
            if (status==1) {
                JOptionPane.showMessageDialog(this, "Data berhasil dimasukkan","Sukses",JOptionPane.INFORMATION_MESSAGE);
                selectData();
            }
            else{
                JOptionPane.showMessageDialog(this, "Data gagal dimasukkan","Gagal",JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        /*MessageFormat header=new MessageFormat("Biodata siswa SMK Telkom Malang");
        MessageFormat footer=new MessageFormat("Page (0,number,integer)");
        try {
            jTable1.print(JTable.PrintMode.FIT_WIDTH,header,footer,true,null,true,null);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Cannot print %s%n", e.getMessage());
        }*/
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int baris=jTable1.getSelectedRow();
        if (baris!=-1) {
            tfIDBarang1.setText(jTable1.getValueAt(baris, 0).toString());
            tfNamaBarang1.setText(jTable1.getValueAt(baris, 1).toString());
            tfHargaBarang1.setText(jTable1.getValueAt(baris, 2).toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void tfIDBarang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIDBarang1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIDBarang1ActionPerformed

    private void tfNamaBarang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNamaBarang1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNamaBarang1ActionPerformed

    private void tfHargaBarang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHargaBarang1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHargaBarang1ActionPerformed

    private void tfQty1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQty1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfQty1ActionPerformed

    private void tfKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfKasirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfKasirActionPerformed

    private void tfTotal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTotal2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTotal2ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if ("".equals(tfID.getText())||"".equals(tfNama.getText())||"".equals(tfHarga.getText())) {
            JOptionPane.showMessageDialog(this, "Harap lengkapi data Anda","Error", JOptionPane.WARNING_MESSAGE);

        }
        else{
            String SQL="INSERT INTO tb_produk(id_produk,nama_produk,harga_produk)"+
            "VALUES('"+tfID.getText()+"','"+tfNama.getText()+"','"+tfHarga.getText()+"')";
            int status=DBConnection.execute(SQL);
            if (status==1) {
                JOptionPane.showMessageDialog(this, "Data berhasil disimpan","Sukses",JOptionPane.INFORMATION_MESSAGE);
                selectData();
            }
            else{
                JOptionPane.showMessageDialog(this, "Data gagal disimpan","Sukses",JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
        // TODO add your handling code here:
        selectData();
    }//GEN-LAST:event_btnSave1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton7ActionPerformed

    public void selectData(){
        String kolom[]={"ID Barang","Nama Barang","Harga Barang"};
        DefaultTableModel dtm=new DefaultTableModel(null, kolom);
        String SQL="SELECT * FROM tb_produk";
        ResultSet rs=DBConnection.executeQuery(SQL);
        try {
            while(rs.next()){
                String id=rs.getString(1);
                String NamaBarang=rs.getString(2);
                String HargaBarang=rs.getString(3);
                String data[]={id,NamaBarang,HargaBarang};
                dtm.addRow(data);
            }
        } catch (SQLException ex) {
        //Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTable1.setModel(dtm);
    }
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Time;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSave1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField tfHarga;
    private javax.swing.JTextField tfHargaBarang1;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfIDBarang1;
    private javax.swing.JTextField tfKasir;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNamaBarang1;
    private javax.swing.JTextField tfQty1;
    private javax.swing.JTextField tfTotal2;
    // End of variables declaration//GEN-END:variables

}
