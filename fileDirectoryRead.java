/*https://www.youtube.com/watch?v=HzJcUs_njdA
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textarearead;

/**
 *
 * @author guest1
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
public class Textarearead extends JFrame implements ActionListener{

public static void main(String[] args) {
Textarearead s = new Textarearead();
s.setVisible(true);
}
JTextArea area = new JTextArea(40,30);
public Textarearead()
{
 JPanel p = new JPanel();
 setContentPane(p);

JButton btn = new JButton("Load");
p.add(area);
p.add(btn);

btn.addActionListener(this);

setSize(600,400);
setLocationRelativeTo(null);
setDefaultCloseOperation(3);

}

    @Override
    public void actionPerformed(ActionEvent e) {
        
        JFileChooser fileChooser= new JFileChooser();
        int ret = fileChooser.showOpenDialog(this);
        if(ret==JFileChooser.APPROVE_OPTION)
        {
            File f = fileChooser.getSelectedFile();
            try
            {
                FileReader r = new FileReader(f);
                area.read(r,"");
            }
            catch(Exception ee){
                System.out.println("cant read file");
            }
        }
    }
}
