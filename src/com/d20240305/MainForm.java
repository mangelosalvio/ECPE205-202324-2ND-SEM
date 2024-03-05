package com.d20240305;
import javax.swing.*;
import java.awt.*;

public class MainForm extends JPanel {
    NamePanel namePanel = new NamePanel();
    EmailPanel emailPanel = new EmailPanel();
    ButtonPanel buttonPanel = new ButtonPanel();
    public MainForm()
    {
        init();
    }
    private void init()
    {
        setLayout(new BorderLayout());
        this.add(namePanel, BorderLayout.NORTH);
        this.add(emailPanel, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);
    }

}
