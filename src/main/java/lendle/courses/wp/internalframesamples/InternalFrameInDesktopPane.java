/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.internalframesamples;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Locale;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class InternalFrameInDesktopPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());
        //create a desktoppane
        //add internalFrame to it
        //make it visible
        JDesktopPane jDesktopPane=new JDesktopPane();
        frame.setContentPane(jDesktopPane);
        JInternalFrame jInternalFrame=new JInternalFrame();
        frame.add(jInternalFrame);
        jInternalFrame.setSize(300,300);
        jInternalFrame.setVisible(true);
        jInternalFrame.setMaximizable(true);
        jInternalFrame.setIconifiable(true);
        jInternalFrame.setResizable(true);
        jInternalFrame.setClosable(true);
        jInternalFrame.setLocation(100, 200); 
        /////////////////////////////////
        frame.setVisible(true);
    }
    
}
