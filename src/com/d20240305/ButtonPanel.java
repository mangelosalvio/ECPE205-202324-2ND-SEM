package com.d20240305;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ButtonPanel extends JPanel {
    JButton okBtn, cancelBtn;
    public ButtonPanel()
    {
        init();
    }
    private void init()
    {
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));

        this.add(okBtn = new JButton("     OK     "));
        this.add(cancelBtn = new JButton("CANCEL"));
        this.setBorder(new EmptyBorder(5,0,5,0));
    }
}
