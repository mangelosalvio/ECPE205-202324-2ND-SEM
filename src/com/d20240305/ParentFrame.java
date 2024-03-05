package com.d20240305;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ParentFrame extends JFrame {
    MainForm form;
    ArrayList<String> names;
    JTable table;

    public ParentFrame() {

        init();
    }

    private void init () {
        form = new MainForm();
        names= new ArrayList<>();
        Container container = getContentPane();
        container.setLayout(new GridLayout(1,2));
        container.add(form);

        container.add(new JScrollPane(table = new JTable(new AbstractTableModel() {

            @Override
            public int getRowCount() {
                return names.size();
            }

            @Override
            public int getColumnCount() {
                return 1;
            }

            @Override
            public String getColumnName(int column) {
                return "First Name";
            }

            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                return names.get(rowIndex);
            }
        })));

        form.buttonPanel.okBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String firstName = form.namePanel.fnameField.getText();
                ArrayList<String> emailList = form.emailPanel.listModel.list;
                names.add(firstName);
                table.updateUI();
            }
        });



        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ParentFrame();
    }

}
