package com.d20240207;

import javax.swing.*;
import java.awt.*;

public class GUIFrame1 extends JFrame {

    public GUIFrame1() {
        init();
    }


    private void init() {

        Container container  = this.getContentPane();
        container.setLayout(new GridBagLayout());

        add(new JLabel("jLabel1"),0,0,1,1,1,1);
        add(new JComboBox<String>(),1,0,2,1,4,1, GridBagConstraints.BOTH);
        add(new JButton("jButton 1"),3,0,1,1,1,1);

        add(new JButton("jButton 2"),3,1,1,1,1,1);
        add(new JButton("jButton 3"),3,2,1,1,1,1);




        add(new JCheckBox("jCheckBox1"),1,1,1,1,1,1);
        add(new JCheckBox("jCheckBox2"),1,2,1,1,1,1);
        add(new JCheckBox("jCheckBox3"),1,3,1,1,1,1);
        add(new JCheckBox("jCheckBox4"),1,4,1,1,1,1);

        add(new JCheckBox("jCheckBox5"),2,1,1,1,1,1);
        add(new JCheckBox("jCheckBox6"),2,2,1,1,1,1);
        add(new JCheckBox("jCheckBox7"),2,3,1,1,1,1);
        add(new JCheckBox("jCheckBox8"),2,4,1,1,1,1);

        setVisible(true);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void add(Component component,
                    int x, int y, int gridWidth, int gridHeight, int weightX, int weightY){

        GridBagConstraints c = new GridBagConstraints();

        c.insets = new Insets(2,2,2,2);
        c.gridx  =x;
        c.gridy = y;
        c.gridwidth = gridWidth;
        c.gridheight = gridHeight;
        c.weightx = weightX;
        c.weighty = weightY;
        c.fill = GridBagConstraints.NONE;
        this.add(component, c);

    }
    public void add(Component component,
                    int x, int y, int gridWidth, int gridHeight, int weightX, int weightY, int fill){

        GridBagConstraints c = new GridBagConstraints();

        c.gridx  =x;
        c.gridy = y;
        c.gridwidth = gridWidth;
        c.gridheight = gridHeight;
        c.weightx = weightX;
        c.weighty = weightY;
        c.fill = fill;
        this.add(component, c);

    }

    public static void main(String[] args) {
        new GUIFrame1();
    }

}

