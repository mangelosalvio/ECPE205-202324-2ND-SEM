package com.d20240130;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame {
    public JTextField nameField;
    private JButton saveButton;
    JLabel  nameLabel;
    JTextArea textArea;

    JPanel fieldPanel;

    public RegistrationForm () {
        init();
    }

    private void init () {
        //instantiate objects
        nameLabel = new JLabel("Name:");
        nameField  = new JTextField(10);
        saveButton = new JButton("Save");
        textArea = new JTextArea(10,20);
        fieldPanel = new JPanel();

        //construct field panel
        fieldPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        fieldPanel.add(nameLabel);
        fieldPanel.add(nameField);
        fieldPanel.add(saveButton);

        this.setLayout(new BorderLayout());
        Container container = this.getContentPane();
        container.add(fieldPanel, BorderLayout.NORTH);
        container.add(textArea, BorderLayout.CENTER);

//        saveButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Hello from frame");
//            }
//        });



        this.pack();
        this.setVisible(true);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public JButton getSaveButton() {
        return saveButton;
    }


}
