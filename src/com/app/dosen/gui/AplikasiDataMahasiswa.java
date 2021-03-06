/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.dosen.gui;

import com.app.dosen.entity.Mahasiswa;
import com.app.dosen.model.MahasiswaTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP - PC
 */
public class AplikasiDataMahasiswa extends javax.swing.JFrame {
    private  MahasiswaTableModel model;
    private List<Mahasiswa> listData;
    

    /**
     * Creates new form AplikasiDataMahasiswa
     */
    public AplikasiDataMahasiswa() {
        initComponents();
        initData();
        model = new MahasiswaTableModel(listData);
        tableMahasiswa.setModel(model);
    }
    
    
    private void initData(){
        listData = new ArrayList<>();
        Mahasiswa mahasiswa = new Mahasiswa("43A87006180317", "Riyan Hidayat", "Teknik Informasi", 
                "jl.pejuangjaya", "rhdyt1299@gmail.com", "o81386713171");
        listData.add(mahasiswa);
        mahasiswa = new Mahasiswa("43A87006180318", "Agus Budioo", "Teknik Informasi", 
                "Kartini, Bekasi", "agusb@gmail.com", "o81386717762");
        listData.add(mahasiswa);
        mahasiswa = new Mahasiswa("43A87006180319", "Budion", "Teknik Informasi", 
                "Agus salim, Bekasi", "budi@gmail.com", "o81377463839");
        listData.add(mahasiswa);
        mahasiswa = new Mahasiswa("43A87006180320", "Charudin", "Teknik Informasi", 
                "Kartini, Bekasi", "charudin@gmail.com", "o8928191011");
        listData.add(mahasiswa);
        mahasiswa = new Mahasiswa("43A87006180321", "Gunawan Wibisono", "Teknik Informasi", 
                "Cibitung, Bekasi", "gunawan@gmail.com", "o81386771619");
        listData.add(mahasiswa);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMahasiswa = new javax.swing.JTable();
        buttonTambah = new javax.swing.JButton();
        buttonUbah = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        buttonKeluar = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableMahasiswa);

        buttonTambah.setText("Tambah");

        buttonUbah.setText("Ubah");

        buttonHapus.setText("Hapus");

        buttonKeluar.setText("Keluar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTambah)
                    .addComponent(buttonUbah)
                    .addComponent(buttonHapus)
                    .addComponent(buttonKeluar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
       
        //</editor-fold>

       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonKeluar;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JButton buttonUbah;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMahasiswa;
    // End of variables declaration//GEN-END:variables
}
