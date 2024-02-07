package com.d20240207;

import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import java.util.ArrayList;

public class TableForm extends JFrame {
    public TableForm() {
        init();
    }

    public void init () {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("de la Cruz","Juan"));
        persons.add(new Person("Doe","John"));

        JTable table = new JTable(new AbstractTableModel() {

            @Override
            public int getRowCount() {
                return persons.size();
            }

            @Override
            public int getColumnCount() {
                return 2;
            }

            @Override
            public String getColumnName(int columnIndex) {
                if ( columnIndex == 0 ) {
                    return "Last Name";
                } else {
                    return "First Name";
                }

            }


            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                Person person = persons.get(rowIndex);

                if ( columnIndex == 0 ) {
                    return person.getLastName();
                } else {
                    return person.getFirstName();
                }

            }


            @Override
            public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

            }

            @Override
            public void addTableModelListener(TableModelListener l) {

            }

            @Override
            public void removeTableModelListener(TableModelListener l) {

            }
        });

        this.add(new JScrollPane(table));


        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TableForm();
    }
}
