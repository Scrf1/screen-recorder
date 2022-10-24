package gui.containers;

import core.ImageRecorder;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class ImageScreenshotPanel extends JPanel {

    private JButton capture;
    private ImageRecorder recorder;
    private Robot robot;

    public ImageScreenshotPanel() {
        this.capture = new JButton("Capture");

        try {
            this.robot = new Robot();
            this.recorder = new ImageRecorder(this.robot);

            this.capture.addActionListener(l -> {
                try
                {
                    this.recorder.takeScreenshot("", "");
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
        catch (AWTException e) {
            e.printStackTrace();
        }

        this.add(capture);
    }


}
