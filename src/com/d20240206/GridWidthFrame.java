package com.d20240206;

import javax.swing.*;
import java.awt.*;

public class GridWidthFrame extends JFrame {
    Container container;
    public GridWidthFrame() {
        init();
    }

    private void init () {
        container = getContentPane();
        container.setLayout(new GridBagLayout());
        GridBagConstraints c= new GridBagConstraints();
        JTextField b1 = new JTextField(10);
        JTextField b2 = new JTextField(10);
        JTextField b3 = new JTextField(10);

        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;
        container.add(b1, c);
        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 1;
        c.weightx = 2;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;
        container.add(b2,c);

        c.gridx = 2;
        c.gridy = 0;
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;
        container.add(b3,c);



        setVisible(true);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new GridWidthFrame();
    }
}
