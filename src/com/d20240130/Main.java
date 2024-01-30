package com.d20240130;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        RegistrationForm registrationForm = new RegistrationForm();
        RegistrationForm registrationForm2 = new RegistrationForm();

//        registrationForm.getSaveButton().addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });


        /*registrationForm2.getSaveButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello from form 2");
            }
        });*/

        SaveButtonListener saveButtonListener = new SaveButtonListener();
        registrationForm.getSaveButton().addActionListener(saveButtonListener);

        registrationForm2.getSaveButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }
}