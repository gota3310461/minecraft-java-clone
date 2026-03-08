package engine;

import javax.swing.JFrame;

public class window {

    JFrame frame;

    public void create(){

        frame = new JFrame("Minecraft Clone");

        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}