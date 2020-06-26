package com.Examen.SergioC.Gui.Util;

import java.awt.*;
import java.net.URL;

public class Util {
    public static final Font FONT_TEXT = new Font("Arial", Font.BOLD, 28);

    private static URL getResourcePath(String nameImg) {
        return Util.class.getClassLoader().getResource(nameImg);
    }

    public Util(){}
}
