package ru.vsu.cs.sviridov_d_v;

import java.util.Locale;

public class GuiMain {

    public static void main(String[] args) {
        winMain();
    }

    public static void winMain(){
        Locale.setDefault(Locale.ROOT);

        java.awt.EventQueue.invokeLater(() -> new MainFrame().setVisible(true));

    }
}
