package core;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageRecorder {

    private Robot robot;

    public ImageRecorder(Robot robot) {
        this.robot = robot;
    }

    public void takeScreenshot(String uri, String fileName) throws IOException {
        Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage capture = this.robot.createScreenCapture(screenRect);

        File imageFile = new File("single-screen.bmp");
        ImageIO.write(capture, "bmp", imageFile );
    }
}
