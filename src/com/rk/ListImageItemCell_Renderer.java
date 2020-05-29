package com.rk;

import javax.swing.*;
import java.awt.*;

public class ListImageItemCell_Renderer extends JLabel implements ListCellRenderer {

    String[] ListValues;

    public ListImageItemCell_Renderer(String[] petStrings) {
        this.ListValues = petStrings;
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        int selectedIndex = ((Integer) value).intValue();

        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }

        ImageIcon icon = new ImageIcon("images/" + ListValues[selectedIndex].toLowerCase() + ".png");
        String val = ListValues[selectedIndex];
        setIcon(icon);
        setText(val);
        setFont(new Font("Cambria", Font.BOLD, 12));
        setHorizontalAlignment(CENTER);

        return this;
    }
}
