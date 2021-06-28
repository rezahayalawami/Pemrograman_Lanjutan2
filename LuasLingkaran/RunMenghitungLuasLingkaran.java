package LuasLingkaran;

import javax.swing.*;

public class RunMenghitungLuasLingkaran {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ignored) {
        }
        /**
         * Set image icon
         */
        ImageIcon imageIcon = new ImageIcon("res/My.png");
        JFrame jFrame = new JFrame("MenghitungLuasLingkaran");
        jFrame.setIconImage(imageIcon.getImage());
        jFrame.setContentPane(new MenghitungLuasLingkaran().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}

