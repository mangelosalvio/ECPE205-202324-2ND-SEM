package com.d20240227;

import javax.swing.*;
import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Task 1","John Doe"));
        tasks.add(new Task("Task 2","Foo Bar"));
        JList list = new JList<>(new AbstractListModel<Task>() {
            @Override
            public int getSize() {
                return tasks.size();
            }

            @Override
            public Task getElementAt(int index) {
                return tasks.get(index);
            }
        });
        list.setCellRenderer(new ListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                Task task  = (Task)value;

                JPanel panel = new JPanel();
                panel.setLayout(new GridLayout(2,1));
                panel.add(new JLabel(task.getName()));
                panel.add(new JLabel(task.getAssignedTo()));

                if ( isSelected ) {
                    panel.setBackground(Color.red);
                }
                return panel;
            }
        });

        JFrame frame = new JFrame();
        Container container = frame.getContentPane();
        container.add(new JScrollPane(list));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
