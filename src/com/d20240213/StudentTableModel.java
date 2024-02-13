package com.d20240213;

import javax.swing.table.AbstractTableModel;
import java.sql.Array;
import java.util.ArrayList;

import static javax.swing.UIManager.get;

public class StudentTableModel extends AbstractTableModel {

    private ArrayList<Student> students;

    public void addStudent (Student student) {
        students.add(student);
    }

    public StudentTableModel() {
        students = new ArrayList<Student>();
    }

    @Override
    public int getRowCount() {
        return students.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int column) {
        switch (column){
            case  0 :
                return "First Name";
            case 1 :
                return "Last Name";
            default:
                return "";
        }

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Student s = students.get(rowIndex);

        if ( columnIndex == 0 ) {
            return s.getFirstName();
        } else if ( columnIndex == 1 ) {
            return s.getLastName();
        } else {
            return null;
        }
    }
}
