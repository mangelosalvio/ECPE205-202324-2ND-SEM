package com.d20240305;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class NamePanel extends JPanel {
    JLabel  fnameLabel, lnameLabel, titleLabel, nicknameLabel, formatLabel;
    JTextField fnameField, lnameField, titleField, nicknameField;
    JComboBox format;

    String dataValue[] = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

    public NamePanel()
    {
        init();
    }
    private void init()
    {
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        TitledBorder titledBorder = BorderFactory.createTitledBorder("Name");
        this.setBorder(titledBorder);

        add(0,0,c);
        this.add(fnameLabel = new JLabel("First Name:"), c);
        setLabelAlignment(fnameLabel, SwingConstants.RIGHT);
        add(1, 0,c);
        this.add(fnameField = new JTextField(15),c);
        border(fnameField);
        add(2,0,c);
        this.add(lnameLabel = new JLabel("Last Name:"),c);
        setLabelAlignment(lnameLabel, SwingConstants.RIGHT);
        add(3,0,c);
        this.add(lnameField = new JTextField(15),c);
        border(lnameField);
        add(0,1,c);
        this.add(titleLabel = new JLabel("Title:"),c);
        setLabelAlignment(titleLabel, SwingConstants.RIGHT);
        add(1,1,c);
        this.add(titleField = new JTextField(15),c);
        border(titleField);
        add(2,1,c);
        this.add(nicknameLabel = new JLabel("Nickname:"),c);
        setLabelAlignment(nicknameLabel, SwingConstants.RIGHT);
        add(3,1,c);
        this.add(nicknameField = new JTextField(15),c);
        border(nicknameField);
        add(0,2,c);
        this.add(formatLabel = new JLabel("Display Format:"),c);
        setLabelAlignment(formatLabel, SwingConstants.RIGHT);
        add(1,2,4,1,c);
        this.add(format = new JComboBox(dataValue), c);
    }
    private static void add(int gridx, int gridy, GridBagConstraints c)
    {
        c.gridx = gridx;
        c.gridy = gridy;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(5,5,5,5);
    }
    private static void add(int gridx, int gridy, int gridWidth, int gridHeight, GridBagConstraints c)
    {
        c.gridx = gridx;
        c.gridy = gridy;
        c.gridwidth = gridWidth;
        c.gridheight = gridHeight;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(5,5,5,5);
    }
    private static void setLabelAlignment(JLabel label, int alignment)
    {
        label.setHorizontalAlignment(alignment);
    }
    private void border(JTextField textField)
    {
        textField.setBorder(BorderFactory.createLineBorder(new Color(155,211,221)));
    }
}
