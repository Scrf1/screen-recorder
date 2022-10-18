package gui.frames;

import gui.containers.ImageScreenshotPanel;
import gui.containers.VideoRecorderPanel;
import gui.menus.Menu;

import javax.swing.*;

public class MainFrame extends JFrame {

    private JTabbedPane tabs;
    private VideoRecorderPanel videoRecorderPanel;
    private ImageScreenshotPanel imageScreenshotPanel;
    private Menu menu;

    public MainFrame() {
        // Creating tabs
        videoRecorderPanel = new VideoRecorderPanel();
        imageScreenshotPanel = new ImageScreenshotPanel();

        tabs = new JTabbedPane();
        tabs.addTab("Record Screen", videoRecorderPanel);
        tabs.addTab("Screenshot", imageScreenshotPanel);

        // Creating menu
        menu = new Menu();

        // Finally set the frame
        this.setSize(500, 500);
        this.setContentPane(tabs);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setJMenuBar(menu);

    }
}
