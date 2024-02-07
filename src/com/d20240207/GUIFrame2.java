package com.d20240207;

import javax.swing.*;
import java.awt.*;

public class GUIFrame2 extends JFrame {

    public GUIFrame2() {
        init();
    }


    private void init() {

        Container container  = this.getContentPane();
        container.setLayout(new GridBagLayout());

        add(new JLabel("Build Name:"),0,0,1,1,1,1, GridBagConstraints.NONE, GridBagConstraints.LINE_START
        );
        add(new JLabel("Key:"),0,1,1,1,1,1, GridBagConstraints.NONE, GridBagConstraints.LINE_START
        );
        add(new JLabel("Value:"),0,2,1,1,1,1, GridBagConstraints.NONE, GridBagConstraints.LINE_START
        );
        add(new JLabel("Comment:"),0,3,1,1,1,1, GridBagConstraints.NONE, GridBagConstraints.LINE_START
        );
        add(new JLabel("Code:"),0,4,1,1,1,1, GridBagConstraints.NONE, GridBagConstraints.LINE_START
        );

        add(new JTextField(10),1,0,2,1,5,1, GridBagConstraints.BOTH);
        add(new JButton("Select"),3,0,1,1,1,1);

        add(new JComboBox<String>(),1,1,3,1,1,1, GridBagConstraints.BOTH);
        add(new JTextArea(),1,2,3,1,1,1, GridBagConstraints.BOTH);
        add(new JTextArea(),1,3,3,1,1,1, GridBagConstraints.BOTH);
        add(new JTextField(10),1,4,3,1,1,1, GridBagConstraints.HORIZONTAL);

        add(new JButton("Arguments..."),2,5,1,1,1,1,GridBagConstraints.NONE, GridBagConstraints.LINE_END);
        add(new JButton("Format"),3,5,1,1,1,1 );

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonsPanel.add(new JButton("Replace"));
        buttonsPanel.add(new JButton("Skip"));
        buttonsPanel.add(new JButton("Ignore"));
        buttonsPanel.add(new JButton("Info"));
        buttonsPanel.add(new JButton("Close"));
        buttonsPanel.add(new JButton("Help"));

        add(buttonsPanel,0,6,4,1,1,1);

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
        c.insets = new Insets(2,2,2,2);
        c.gridx  =x;
        c.gridy = y;
        c.gridwidth = gridWidth;
        c.gridheight = gridHeight;
        c.weightx = weightX;
        c.weighty = weightY;
        c.fill = fill;
        this.add(component, c);

    }

    public void add(Component component,
                    int x, int y, int gridWidth, int gridHeight, int weightX, int weightY, int fill, int anchor){

        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(2,2,2,2);
        c.gridx  =x;
        c.gridy = y;
        c.gridwidth = gridWidth;
        c.gridheight = gridHeight;
        c.weightx = weightX;
        c.weighty = weightY;
        c.fill = fill;
        c.anchor = anchor;
        this.add(component, c);

    }

    public static void main(String[] args) {
        new GUIFrame2();
    }

}

