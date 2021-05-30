package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;


public class FormBiodata {
    private JTextField textNama;
    private JTextField textNim;
    private JButton buttonSave;
    private JPanel rootPanel;
    private JLabel hasilNama;
    private JLabel hasilNIM;
    private JLabel hasilJenjangPendidikan;
    private JLabel hasilTahunMasuk;
    private JLabel hasilFakultas;
    private JLabel hasilJurusan;
    private JLabel hasilJenisKelamin;
    private JLabel hasilNomorUrutMahasiswa;


    public FormBiodata() {
        rootPanel.addComponentListener(new ComponentAdapter() {});

        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Mengambil data dari teksNama
                String nama = textNama.getText();
                //Mengambil data dari teksNim
                String nim = textNim.getText();
                //Diproses
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(nama);
                mhs.setNim(nim);
                //Tampilkan output ke FORM
                hasilNama.setText(mhs.toString());
                hasilNama.setText("Nama = " + nama);
                hasilNIM.setText("NIM = " + nim);
                hasilJenjangPendidikan.setText(mhs.JenjangPendidikan());
                hasilTahunMasuk.setText(mhs.TahunMasuk());
                hasilFakultas.setText(mhs.MenentukanFakultas());
                hasilJurusan.setText(mhs.MenentukanJurusan());
                hasilJenisKelamin.setText(mhs.JenisKelamin());
                hasilNomorUrutMahasiswa.setText(mhs.NomorUrutMahasiswa());


            }
        });
    }

    public JPanel getRootPanel() {

        return rootPanel;
    }
    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

}

