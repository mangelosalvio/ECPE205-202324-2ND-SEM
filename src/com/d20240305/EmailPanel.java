package com.d20240305;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.List;

public class EmailPanel extends JPanel {
    JLabel emailLabel, mailFormat;
    JTextField emailField;
    JTextArea emailTextArea;
    JList emailList;
    JButton addBtn, editBtn, removeBtn,defaultBtn;
    JRadioButton htmlRbtn,plainTxtRBtn,customRbtn;
    JPanel buttonGroup;
    ListModel listModel;
    String textValue[] = new String[]
            {
                    "Item 1", "Item 2", "Item 3",
                    "Item 4", "Item 5"
            };
    public EmailPanel()
    {
        init();
    }
    private void init()
    {
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        TitledBorder titledBorder = new TitledBorder(BorderFactory
                .createLineBorder(new Color(155,211,221)), "E-mail");
        this.setBorder(titledBorder);
        listModel = new ListModel();
        emailList = new JList(listModel);

        add(0, 0, c);
        this.add(emailLabel = new JLabel("E-mail Address:"), c);
        add(1, 0, c);
        this.add(emailField = new JTextField(29),c );
        border(emailField);
        add(2, 0, c);
        this.add(addBtn = new JButton("Add"), c);
        add(2, 1,c);
        this.add(editBtn = new JButton("Edit"), c);
        add(2, 2, c);
        this.add(removeBtn = new JButton("Remove"), c);
        add(2, 3, c);
        this.add(defaultBtn = new JButton("As Default"), c);
        add(0, 1,2,3, c);
        this.add(new JScrollPane(emailList), c);
        add(0, 4, c);
        this.add(mailFormat = new JLabel("Mail Format:"), c);
        add(0,5,c);
        c.insets = new Insets(15, 22, 0,0);
        this.add(buttonGroup = new JPanel(new FlowLayout(FlowLayout.LEFT)), c);

        buttonGroup.add(htmlRbtn = new JRadioButton("HTML"));
        buttonGroup.add(plainTxtRBtn = new JRadioButton("Plain Text"));
        buttonGroup.add(customRbtn = new JRadioButton("Custom"));

//        emailTextArea.setBorder(BorderFactory.createLineBorder(new Color(155,211,221)));
//        emailTextArea.setEditable(false);
//        emailTextArea.setLineWrap(true);
//        emailTextArea.setWrapStyleWord(true);
//
//        emailTextArea.setText(String.join("\n", textValue));
    }
    private static void add(int gridx, int gridy, GridBagConstraints c)
    {
        c.gridx = gridx;
        c.gridy = gridy;
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
    private void border(JTextField textField)
    {
        textField.setBorder(BorderFactory.createLineBorder(new Color(155,211,221)));
    }
}
