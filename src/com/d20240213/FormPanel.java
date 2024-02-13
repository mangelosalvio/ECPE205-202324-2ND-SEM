package com.d20240213;

import javax.swing.*;
import java.awt.*;

public class FormPanel extends JPanel {
    JTextField firstNameField;
    JTextField lastNameField;
    JButton saveButton;

    public FormPanel() {
        init();
    }

    private void init () {
        firstNameField = new JTextField(10);
        lastNameField = new JTextField(10);
        saveButton  = new JButton("Save");

        this.setLayout(new FlowLayout());
        this.add(firstNameField);
        this.add(lastNameField);
        this.add(saveButton);
    }
}
