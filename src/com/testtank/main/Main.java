package com.testtank.main;

import com.testtank.display.Display;

import javax.swing.*;
import java.awt.event.ActionEvent;


public class Main {
    public static void main(String[] args) {
        Display.create(800,600, "Tanks");

        Timer t = new Timer(1000/60, new AbstractAction() {

            public void actionPerformed(ActionEvent e) {
                Display.render();
            }
        });
        t.setRepeats(true);
        t.start();
    }
}
