package gui.controls;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;

public class FileChooser {

    private JFileChooser fileChooser;
    private int option; // 0 for open file, and 1 for save file chooser

    public FileChooser(int option) {
        this.option = option;

        fileChooser = new JFileChooser(FileSystemView.getFileSystemView());


    }

    public String openFileChooser() {
        String path = "";
        int res = 0;

        if(this.option == 0)
            res = this.fileChooser.showOpenDialog(null);
        else if(this.option == 1)
            res = this.fileChooser.showSaveDialog(null);

        if(res == JFileChooser.APPROVE_OPTION)
            path = this.fileChooser.getSelectedFile().getPath();

        System.out.println(path);
        return path;
    }

}
