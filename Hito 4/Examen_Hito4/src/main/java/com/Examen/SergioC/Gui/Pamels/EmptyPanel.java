package com.Examen.SergioC.Gui.Pamels;

import javax.swing.*;
import java.awt.*;

public class EmptyPanel extends JPanel {
    public EmptyPanel() {
        this.setPreferredSize(new Dimension(500,100));
        this.setBackground(Color.CYAN);
        this.setLayout(new GridLayout(2, 1));
    }
}
