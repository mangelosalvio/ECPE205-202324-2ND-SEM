package com.d20240206;

import javax.swing.*;
import java.awt.*;

public class GridWidthSample1 extends JFrame {
    Container container;
    public GridWidthSample1() {
        init ();

    }

    private void init() {
        container = getContentPane();
        container.setLayout(new GridBagLayout());

        //FIRST GUI
//        this.add(new JButton(""),0,0,1,2,2,1);
//        this.add(new JButton(""),1,0,1,1,1,1);
//        this.add(new JButton(""),1,1,1,1,1,1);

        this.add(new JButton(""),0,0,1,3,1,1);
        this.add(new JButton(""),1,0,3,1,1,1);
        this.add(new JButton(""),1,1,2,1,1,1);
        this.add(new JButton(""),3,1,1,1,1,1);
        this.add(new JButton(""),1,2,1,1,1,1);
        this.add(new JButton(""),2,2,1,1,1,1);
        this.add(new JButton(""),3,2,1,1,1,1);






        setVisible(true);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void add(Component component,
                    int x, int y, int gridWidth, int gridHeight, int weightX, int weightY){

        GridBagConstraints c = new GridBagConstraints();


        c.gridx  =x;
        c.gridy = y;
        c.gridwidth = gridWidth;
        c.gridheight = gridHeight;
        c.weightx = weightX;
        c.weighty = weightY;
        c.fill = GridBagConstraints.BOTH;
        this.add(component, c);

    }

    public static void main(String[] args) {
        new GridWidthSample1();
    }
}
