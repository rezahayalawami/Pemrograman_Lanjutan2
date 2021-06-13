package gui.Table;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TryTableArrays {
    private JPanel rootPanel;
    private JTextField textJumlah;
    private JTextField textAngka;
    private JButton buttonSave;
    private JTable tableBiodata;
    private DefaultTableModel tableModel;
    private boolean added = false;


    public JPanel getRootPanel() {
        return rootPanel;
    }

    

    public TryTableArrays() {

        this.initComponents();
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                DefaultTableModel model = (DefaultTableModel) tableBiodata.getModel();
                String input = textAngka.getText();
                int jumlah = Integer.parseInt(textJumlah.getText());
                String[] stmp = input.split(",");
                if (textJumlah.getText().length()>3){
                    JOptionPane.showMessageDialog(rootPanel,
                            "Data Terlalu Banyak\nMax Input : 999",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (stmp.length > jumlah || stmp.length < jumlah){
                    JOptionPane.showMessageDialog(rootPanel,
                            "Jumlah Angka Tidak Sesuai Limit yang DiInput",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (!added) {
                    for (int i = 0; i < jumlah; i++) {
                        model.addRow(new Object[]{});
                    }
                    added = true;
                }
                int a = 0;
                for (int i : Sorting.getas(input, jumlah)){
                    model.setValueAt(i, a, 0);
                    a++;
                }
                int b = 0;
                for (int i : Sorting.getdes(input, jumlah)){
                    model.setValueAt(i, b, 1);
                    b++;
                }
            }
        });
    }

    private void initComponents(){
        Object[] tableColom = {
                "Ascending",
                "Descending"
        };
        Object[][] initData = {

        };
        tableModel = new DefaultTableModel(initData,tableColom);
        tableBiodata.setModel(tableModel);
        tableBiodata.setAutoCreateRowSorter(false);
        tableBiodata.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);


    }
}




