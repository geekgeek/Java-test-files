//http://www.codejava.net/java-se/swing/show-simple-open-file-dialog-using-jfilechooser

//File directory chooser

import javax.swing.JFileChooser;
import java.io.File;

        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
    // user selects a file
}
        File selectedFile = fileChooser.getSelectedFile();
        
