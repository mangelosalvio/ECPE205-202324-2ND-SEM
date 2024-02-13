package com.d20240213;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIFrame extends JFrame {

    StudentTableModel tableModel;
    FormPanel formPanel;
    public GUIFrame() {
        init();
    }

    private void init () {
        formPanel  = new FormPanel();
        tableModel = new StudentTableModel();
        Container container  = getContentPane();
        JTable table = new JTable(tableModel);
        container.setLayout(new BorderLayout());
        container.add(formPanel,BorderLayout.NORTH);
        container.add(new JScrollPane(table), BorderLayout.CENTER);

        formPanel.saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lastName = formPanel.lastNameField.getText();
                String firstName = formPanel.firstNameField.getText();

                Student s = new Student(firstName,lastName);
                tableModel.addStudent(s);

                formPanel.lastNameField.setText("");
                formPanel.firstNameField.setText("");
                formPanel.firstNameField.requestFocus();

                tableModel.fireTableDataChanged();
            }
        });




        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
