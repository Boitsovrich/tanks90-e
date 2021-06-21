package com.testtank.display;

import javax.swing.*;
import java.awt.*;

public abstract class Display {
    private static boolean created = false;
    private static JFrame window;
    private static Canvas content;

    public static void create (int width, int height, String title){
        if(created)
            return;
        window = new JFrame(title);
        content = new Canvas() {

            public  void paint(Graphics g){
                super.paint(g);
                render(g);
            }
        };

        Dimension size = new Dimension(width, height);
        content.setPreferredSize(size);
        content.setBackground(Color.BLACK);

        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().add(content);
        window.pack();
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }

    public static void render(){
        content.repaint();
    }
    private static void render(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(400-50,300-50,100,100);
    }
}
