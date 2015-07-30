
package javaapplication10mouseevents;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * https://www.youtube.com/watch?v=sdUJR_DSyBU
 */
public class Gui extends JFrame{
    private JPanel mousepanel;
    private JLabel statusbar;
    
    //Constructor
    public Gui(){
    super("title");
    
    //Add panel
    mousepanel = new JPanel();
    mousepanel.setBackground(Color.WHITE);
    add(mousepanel, BorderLayout.CENTER);
    
    //Add statusbar to the screen
    statusbar = new JLabel("default");
    add(statusbar, BorderLayout.SOUTH);
    
    //Add handler class
    Handlerclass handler = new Handlerclass();
    mousepanel.addMouseListener(handler);
    mousepanel.addMouseMotionListener(handler);
    }
    
    //Create class handlerclass
    //Mouselistenere has 5 methods
    //MouseMotionListener has 2 methods
    private class Handlerclass implements MouseListener, MouseMotionListener{
        
        public void mouseClicked(MouseEvent event){
            statusbar.setText(String.format("clicked at %d,%d",event.getX(), event.getY()));
        }
        public void mousePressed(MouseEvent event){
            statusbar.setText("you presssed down the mouse");
        }
        public void mouseReleased(MouseEvent event){
            statusbar.setText("you released the button");
        }
        public void mouseEntered(MouseEvent event){
            statusbar.setText("you entered the area");
            mousepanel.setBackground(Color.red);
        }
        public void mouseExited(MouseEvent event){
            statusbar.setText("the mouse has left the window");
            mousepanel.setBackground(Color.WHITE);
        }
        //These are mouse motion events
        public void mouseDragged(MouseEvent event){
            statusbar.setText("you are dragging the mouse");
        }
        public void mouseMoved(MouseEvent event){
            statusbar.setText("you moved the mouse");
        }
        
        
        
    }
}

//#######################################################################
//#######################################################################
//#######################################################################
//MainClass:
package javaapplication10mouseevents;

import javax.swing.JFrame;

public class JavaApplication10MouseEvents {

    public static void main(String[] args) {
        
        Gui go = new Gui();
        go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        go.setSize(300, 200);
        go.setVisible(true);
    }
    
}
