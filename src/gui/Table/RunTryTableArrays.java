package gui.Table;

import javax.swing.*;

public class RunTryTableArrays {
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ignored) {
        }
        /**
         * Set image icon
         */
        ImageIcon imageIcon = new ImageIcon("res/Insta.png");
        JFrame jFrame = new JFrame("TryTableArrays");
        jFrame.setIconImage(imageIcon.getImage());
        jFrame.setContentPane(new TryTableArrays().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500, 400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}

