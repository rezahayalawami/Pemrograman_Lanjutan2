package LuasLingkaran;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenghitungLuasLingkaran {
    private JPanel rootPanel;
    private JTextField textJariJari;
    private JTextField textLuas;
    private JButton hitungButton;
    private JButton batalButton;
    private JButton keluarButton;

    public MenghitungLuasLingkaran() {
        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Membuat variabel
                double JariJari, Luas;
                double pi = 3.14;

                // Mengambil Inputan Dari text field
                JariJari = Double.parseDouble(textJariJari.getText());

                // Hitung Luas
                Luas = pi * (JariJari * JariJari);

                // Menaruh Hasil
                textLuas.setText(String.valueOf(Luas));


            }
        });
        batalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textJariJari.setText("");
                textLuas.setText("");
                textJariJari.requestFocus();
            }
        });
        keluarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
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
