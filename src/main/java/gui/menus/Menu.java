package gui.menus;

import javax.swing.*;

public class Menu extends JMenuBar {
    private JMenu fileM = new JMenu("File");
    private JMenu editM = new JMenu("Edit");

    public Menu() {
        this.add(fileM);
        this.add(editM);
    }

}
