package com.rk;

import javax.swing.*;
import java.awt.*;

public class FormUtama extends JFrame {

    JComboBox comboBox;
    String values[] = {
            "Menu1",
            "Menu2",
            "Menu3",
            "Menu4",
            "Menu5",
            "Menu6",
            "Menu7"
    };

    public FormUtama() {
        super("JComboBox Image Items");
        Inisialisasi_Komponen();
    }

    private void Inisialisasi_Komponen() {
        Integer[] indexValues = new Integer[values.length];

        for (int i = 0; i < values.length; i++) {
            indexValues[i] = new Integer(i);
        }

        comboBox = new JComboBox(indexValues);
        comboBox.setRenderer(new ListImageItemCell_Renderer(values));

        setPreferredSize(new Dimension(300, 160));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(comboBox, BorderLayout.CENTER);
        pack();
        setVisible(true);
    }
}
