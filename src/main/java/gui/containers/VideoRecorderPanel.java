package gui.containers;

import javax.swing.*;
import java.awt.*;

public class VideoRecorderPanel extends JPanel {

    private JButton play;
    private JButton pause;
    private JButton stop;
    private JLabel elapsedTime;

    public VideoRecorderPanel() {
        play = new JButton("Play");
        pause = new JButton("Pause");
        stop = new JButton("Stop");

        elapsedTime = new JLabel("00:00:00");

        //this.setLayout(new BorderLayout());
        this.add(play);
        this.add(pause);
        this.add(stop);

        this.add(elapsedTime);
    }

}
