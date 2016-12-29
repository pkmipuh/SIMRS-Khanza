package inventory;
import fungsi.WarnaTable;
import fungsi.batasInput;
import fungsi.koneksiDB;
import fungsi.sekuel;
import fungsi.validasi;
import fungsi.var;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import keuangan.DlgJurnal;
import keuangan.DlgJurnal;
import keuangan.Jurnal;

public class DlgUbahPiutang extends javax.swing.JDialog {
    private DefaultTableModel tabMode;
    private sekuel Sequel=new sekuel();
    private validasi Valid=new validasi();
    private Jurnal jur=new Jurnal();

    /** Creates new form DlgProgramStudi */
    public DlgUbahPiutang(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        Object[] row={"Kode Barang",
                    "Nama Barang",
                    "Satuan",
                    "Harga(Rp)",
                    "Jumlah",
                    "Subtotal(Rp)",
                    "Besar Diskon(Rp)",
                    "Total(Rp)"};
        tabMode=new DefaultTableModel(null,row){
              @Override 
              public boolean isCellEditable(int rowIndex, int colIndex){
                    boolean a = false;
                    if (colIndex==4||colIndex==5||colIndex==6||colIndex==7||colIndex==3||colIndex==0) {
                        a=true;
                    }
                    return a;
              }
        };
        tbDokter.setModel(tabMode);

        tbDokter.setPreferredScrollableViewportSize(new Dimension(800,800));
        tbDokter.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        for (int i = 0; i < 8; i++) {
            TableColumn column = tbDokter.getColumnModel().getColumn(i);
            if(i==0){
                column.setPreferredWidth(110);
            }else if(i==1){
                column.setPreferredWidth(200);
            }else if(i==2){
                column.setPreferredWidth(80);
            }else if(i==3){
                column.setPreferredWidth(110);
            }else if(i==4){
                column.setPreferredWidth(70);
            }else if(i==5){
                column.setPreferredWidth(130);
            }else if(i==6){
                column.setPreferredWidth(130);
            }else if(i==7){
                column.setPreferredWidth(130);
            }
        }
        tbDokter.setDefaultRenderer(Object.class, new WarnaTable());

        NoNota.setDocument(new batasInput((byte)8).getKata(NoNota));        
        
    }
    
    private double ttlpiutang=0;    
    private DecimalFormat df2 = new DecimalFormat("###,###,###,###,###,###,###");

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Kd2 = new widget.TextBox();
        internalFrame1 = new widget.InternalFrame();
        scrollPane1 = new widget.ScrollPane();
        tbDokter = new widget.Table();
        panelisi1 = new widget.panelisi();
        label15 = new widget.Label();
        NoNota = new widget.TextBox();
        label9 = new widget.Label();
        LTotal = new widget.Label();
        BtnTambah = new widget.Button();
        BtnSimpan = new widget.Button();
        BtnHapus = new widget.Button();
        BtnKeluar = new widget.Button();

        Kd2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Kd2.setName("Kd2"); // NOI18N
        Kd2.setPreferredSize(new java.awt.Dimension(207, 23));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        internalFrame1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 245, 235)), "::[ Ubah Piutang Obat, Alkes & BHP Medis ]::", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(50, 70, 40))); // NOI18N
        internalFrame1.setName("internalFrame1"); // NOI18N
        internalFrame1.setLayout(new java.awt.BorderLayout(1, 1));

        scrollPane1.setName("scrollPane1"); // NOI18N
        scrollPane1.setOpaque(true);

        tbDokter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbDokter.setToolTipText("Silahkan klik untuk memilih data yang mau diedit ataupun dihapus");
        tbDokter.setName("tbDokter"); // NOI18N
        tbDokter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDokterMouseClicked(evt);
            }
        });
        tbDokter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbDokterKeyPressed(evt);
            }
        });
        scrollPane1.setViewportView(tbDokter);

        internalFrame1.add(scrollPane1, java.awt.BorderLayout.CENTER);

        panelisi1.setName("panelisi1"); // NOI18N
        panelisi1.setPreferredSize(new java.awt.Dimension(100, 56));
        panelisi1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 9));

        label15.setText("No.Nota :");
        label15.setName("label15"); // NOI18N
        label15.setPreferredSize(new java.awt.Dimension(55, 23));
        panelisi1.add(label15);

        NoNota.setEditable(false);
        NoNota.setName("NoNota"); // NOI18N
        NoNota.setPreferredSize(new java.awt.Dimension(120, 23));
        NoNota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NoNotaKeyPressed(evt);
            }
        });
        panelisi1.add(NoNota);

        label9.setText("Total :");
        label9.setName("label9"); // NOI18N
        label9.setPreferredSize(new java.awt.Dimension(50, 30));
        panelisi1.add(label9);

        LTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LTotal.setText("0");
        LTotal.setName("LTotal"); // NOI18N
        LTotal.setPreferredSize(new java.awt.Dimension(90, 30));
        panelisi1.add(LTotal);

        BtnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/add-file-16x16.png"))); // NOI18N
        BtnTambah.setMnemonic('T');
        BtnTambah.setText("Tambah");
        BtnTambah.setToolTipText("Alt+T");
        BtnTambah.setName("BtnTambah"); // NOI18N
        BtnTambah.setPreferredSize(new java.awt.Dimension(100, 30));
        BtnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTambahActionPerformed(evt);
            }
        });
        panelisi1.add(BtnTambah);

        BtnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/save-16x16.png"))); // NOI18N
        BtnSimpan.setMnemonic('S');
        BtnSimpan.setText("Simpan");
        BtnSimpan.setToolTipText("Alt+S");
        BtnSimpan.setName("BtnSimpan"); // NOI18N
        BtnSimpan.setPreferredSize(new java.awt.Dimension(100, 30));
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });
        BtnSimpan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnSimpanKeyPressed(evt);
            }
        });
        panelisi1.add(BtnSimpan);

        BtnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/stop_f2.png"))); // NOI18N
        BtnHapus.setMnemonic('H');
        BtnHapus.setText("Hapus");
        BtnHapus.setToolTipText("Alt+H");
        BtnHapus.setName("BtnHapus"); // NOI18N
        BtnHapus.setPreferredSize(new java.awt.Dimension(100, 30));
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });
        panelisi1.add(BtnHapus);

        BtnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/exit.png"))); // NOI18N
        BtnKeluar.setMnemonic('K');
        BtnKeluar.setText("Keluar");
        BtnKeluar.setToolTipText("Alt+K");
        BtnKeluar.setName("BtnKeluar"); // NOI18N
        BtnKeluar.setPreferredSize(new java.awt.Dimension(100, 30));
        BtnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKeluarActionPerformed(evt);
            }
        });
        BtnKeluar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnKeluarKeyPressed(evt);
            }
        });
        panelisi1.add(BtnKeluar);

        internalFrame1.add(panelisi1, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(internalFrame1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*
private void KdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TKdKeyPressed
    Valid.pindah(evt,BtnCari,Nm);
}//GEN-LAST:event_TKdKeyPressed
*/

    private void NoNotaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NoNotaKeyPressed
        Valid.pindah(evt, BtnKeluar, BtnSimpan);
    }//GEN-LAST:event_NoNotaKeyPressed

    private void BtnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKeluarActionPerformed
        dispose();
    }//GEN-LAST:event_BtnKeluarActionPerformed

    private void BtnKeluarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnKeluarKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            dispose();
        }else{Valid.pindah(evt,BtnSimpan,NoNota);}
    }//GEN-LAST:event_BtnKeluarKeyPressed

    private void tbDokterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbDokterKeyPressed
        if(tabMode.getRowCount()!=0){
            if((evt.getKeyCode()==KeyEvent.VK_ENTER)||(evt.getKeyCode()==KeyEvent.VK_UP)||(evt.getKeyCode()==KeyEvent.VK_DOWN)){
                try {
                    getData();
                } catch (java.lang.NullPointerException e) {
                }
            }
        }
    }//GEN-LAST:event_tbDokterKeyPressed

    private void tbDokterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDokterMouseClicked
        if(tabMode.getRowCount()!=0){
            try {
                getData();
            } catch (java.lang.NullPointerException e) {
            }
        }
    }//GEN-LAST:event_tbDokterMouseClicked

private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
            int reply = JOptionPane.showConfirmDialog(rootPane,"Eeiiiiiits, udah bener belum data yang mau disimpan..??","Konfirmasi",JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                    double sebelum=ttlpiutang;                    
                    int row=tabMode.getRowCount(),cek;
                    for(int i=0;i<row;i++){  
                        cek=Sequel.cariInteger("select count(nota_piutang) from detailpiutang where "+
                                "nota_piutang='"+NoNota.getText()+"' and kode_brng='"+tabMode.getValueAt(i,0).toString()+"'");
                        if(cek>0){
                            Sequel.queryu("update detailpiutang set total='"+tabMode.getValueAt(i,7).toString()+"',"+
                                "bsr_dis='"+tabMode.getValueAt(i,6).toString()+"',"+
                                "subtotal='"+tabMode.getValueAt(i,5).toString()+"',"+
                                "jumlah='"+tabMode.getValueAt(i,4).toString()+"' "+
                                " where nota_piutang='"+NoNota.getText()+"' and kode_brng='"+tabMode.getValueAt(i,0).toString()+"'");
                        }else if(cek==0){
                            Sequel.queryu("insert into detailpiutang values('"+NoNota.getText()+"','"+tabMode.getValueAt(i,0).toString()+"',"+
                                    "'"+tabMode.getValueAt(i,2).toString()+"','"+tabMode.getValueAt(i,3).toString()+"',"+
                                    "'0','"+tabMode.getValueAt(i,4).toString()+"','"+tabMode.getValueAt(i,5).toString()+"','0',"+
                                    "'"+tabMode.getValueAt(i,6).toString()+"','"+tabMode.getValueAt(i,7).toString()+"')");
                        }                        
                    }                    
                    tampil(NoNota.getText());  
                    int reply2 = JOptionPane.showConfirmDialog(rootPane,"Anda sudah melakukan perubahan data piutang .....!!!!\n"+
                                                                        "Silahkan lakukan 'Jurnal Penyesuaian' agar transaksi akuntansi tetap balance.\n"+
                                                                        "Jika Anda melakukan perubahan jumlah barang maka jangan lupa melakukan 'Stok Opname'\n"+
                                                                        "agar jumlah barang tetap valid. Anda ingin melakukan 'Jurnal Penyesuaian' sekarang...??","Konfirmasi",JOptionPane.YES_NO_OPTION);
                    if (reply2 == JOptionPane.YES_OPTION) {
                        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                        double sesudah=ttlpiutang-sebelum;
                        if(sesudah>0){
                            Sequel.menyimpan("tampjurnal","'71000','PIUTANG DAGANG','"+(sesudah)+"','0'","Rekening");    
                            Sequel.menyimpan("tampjurnal","'11120','KAS DI TANGAN','0','"+(sesudah)+"'","Rekening"); 
                        }else if(sesudah<0){
                            Sequel.menyimpan("tampjurnal","'71000','PIUTANG DAGANG','0','"+(-1*sesudah)+"'","Rekening");    
                            Sequel.menyimpan("tampjurnal","'11120','KAS DI TANGAN','"+(-1*sesudah)+"','0'","Rekening"); 
                        }          
                        
                        DlgJurnal form=new DlgJurnal(null,false);
                        form.emptTeks();  
                        form.setData(NoNota.getText());
                        form.tampil();
                        form.setSize(internalFrame1.getWidth(), internalFrame1.getHeight());
                        form.setLocationRelativeTo(internalFrame1);
                        form.setVisible(true);
                        this.setCursor(Cursor.getDefaultCursor());
                    }
            }
        
}//GEN-LAST:event_BtnSimpanActionPerformed

private void BtnSimpanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnSimpanKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            BtnSimpanActionPerformed(null);
        }else{
            Valid.pindah(evt,NoNota,BtnKeluar);
        }
}//GEN-LAST:event_BtnSimpanKeyPressed

private void BtnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTambahActionPerformed
    Object[] data={"","","","0","0","0","0","0"};      
    tabMode.addRow(data);
}//GEN-LAST:event_BtnTambahActionPerformed

private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
     int row=tbDokter.getSelectedRow(); 
     double sebelum=ttlpiutang; 
     Sequel.queryu("delete from detailpiutang where nota_piutang='"+NoNota.getText()+"' and kode_brng='"+tabMode.getValueAt(row,0).toString()+"'");
     tampil(NoNota.getText());  
     int reply2 = JOptionPane.showConfirmDialog(rootPane,"Anda sudah melakukan perubahan data piutang .....!!!!\n"+
                                                                        "Silahkan lakukan 'Jurnal Penyesuaian' agar transaksi akuntansi tetap balance.\n"+
                                                                        "Jika Anda melakukan perubahan jumlah barang maka jangan lupa melakukan 'Stok Opname'\n"+
                                                                        "agar jumlah barang tetap valid. Anda ingin melakukan 'Jurnal Penyesuaian' sekarang...??","Konfirmasi",JOptionPane.YES_NO_OPTION);
     if (reply2 == JOptionPane.YES_OPTION) {
         this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
         double sesudah=ttlpiutang-sebelum;
         if(sesudah>0){
              Sequel.menyimpan("tampjurnal","'71000','PIUTANG DAGANG','"+(sesudah)+"','0'","Rekening");    
              Sequel.menyimpan("tampjurnal","'11120','KAS DI TANGAN','0','"+(sesudah)+"'","Rekening"); 
         }else if(sesudah<0){
              Sequel.menyimpan("tampjurnal","'71000','PIUTANG DAGANG','0','"+(-1*sesudah)+"'","Rekening");    
              Sequel.menyimpan("tampjurnal","'11120','KAS DI TANGAN','"+(-1*sesudah)+"','0'","Rekening"); 
         }          
                      
         DlgJurnal form=new DlgJurnal(null,false);
         form.emptTeks();  
         form.setData(NoNota.getText());
         form.tampil();
         form.setSize(internalFrame1.getWidth(), internalFrame1.getHeight());
         form.setLocationRelativeTo(internalFrame1);
         form.setVisible(true);
         this.setCursor(Cursor.getDefaultCursor());
    }
}//GEN-LAST:event_BtnHapusActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        BtnSimpan.setEnabled(var.getpiutang_obat());
        BtnTambah.setEnabled(var.getpiutang_obat());
        BtnHapus.setEnabled(var.getpiutang_obat());        
    }//GEN-LAST:event_formWindowActivated

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            DlgUbahPiutang dialog = new DlgUbahPiutang(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widget.Button BtnHapus;
    private widget.Button BtnKeluar;
    private widget.Button BtnSimpan;
    private widget.Button BtnTambah;
    private widget.TextBox Kd2;
    private widget.Label LTotal;
    private widget.TextBox NoNota;
    private widget.InternalFrame internalFrame1;
    private widget.Label label15;
    private widget.Label label9;
    private widget.panelisi panelisi1;
    private widget.ScrollPane scrollPane1;
    private widget.Table tbDokter;
    // End of variables declaration//GEN-END:variables

    public void tampil(String nonota) {
        NoNota.setText(nonota);
        String sql="select detailpiutang.kode_brng,databarang.nama_brng, detailpiutang.kode_sat,"+
                        "detailpiutang.h_jual, detailpiutang.jumlah,detailpiutang.subtotal, "+
                        " detailpiutang.bsr_dis, detailpiutang.total from detailpiutang inner join databarang "+
                        " on detailpiutang.kode_brng=databarang.kode_brng where "+
                        " detailpiutang.nota_piutang='"+NoNota.getText()+"'  order by detailpiutang.kode_brng  ";
        prosesCari(sql);
    }

    private void prosesCari(String sql) {
       Valid.tabelKosong(tabMode);
        try{
            ResultSet rs=koneksiDB.condb().prepareStatement(sql).executeQuery();
            ttlpiutang=0;
            while(rs.next()){
                Object[] data={rs.getString(1),
                               rs.getString(2),
                               rs.getString(3),
                               rs.getString(4),
                               rs.getString(5),
                               rs.getString(6),
                               rs.getString(7),
                               rs.getString(8)};                
                ttlpiutang=ttlpiutang+rs.getDouble(8);
                tabMode.addRow(data);
            }       
            LTotal.setText(df2.format(ttlpiutang));
        }catch(Exception e){
            System.out.println("Notifikasi : "+e);
        }     
        
    }


    private void getData() {
        int row=tbDokter.getSelectedRow();
        if(row!= -1){
            tabMode.setValueAt(Sequel.cariIsi("select nama_brng from databarang where kode_brng='"+tabMode.getValueAt(row,0).toString()+"'"), row,1);
            tabMode.setValueAt(Sequel.cariIsi("select kode_sat from databarang where kode_brng='"+tabMode.getValueAt(row,0).toString()+"'"), row,2);
            tabMode.setValueAt(Sequel.cariIsiAngka("select jualbebas from databarang where kode_brng='"+tabMode.getValueAt(row,0).toString()+"'"), row,3);
            tabMode.setValueAt(Double.toString(Double.parseDouble(tabMode.getValueAt(row,3).toString())*Double.parseDouble(tabMode.getValueAt(row,4).toString())), row,5);
            tabMode.setValueAt(Double.toString(Double.parseDouble(tabMode.getValueAt(row,5).toString())-Double.parseDouble(tabMode.getValueAt(row,6).toString())), row,7);
        }
    }     
 
}
