import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Main{
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("alpaca.png");  //creates an ImageIcon
        Border border = BorderFactory.createLineBorder(Color.GREEN, 3); //create a line border
        
        //Label
        JLabel label = new JLabel();
        label.setIcon(image);                               //sets label's image
        label.setHorizontalTextPosition(JLabel.CENTER);     //sets text LEFT, CENTER, RIGHT of an imageicon
        label.setVerticalTextPosition(JLabel.TOP);          //sets text TOP, CENTER, BOTTOM of an imageicon
        label.setText("Label's text");                 //sets label's text
        label.setForeground(Color.GREEN);                   //sets foregroung color
        label.setFont(new Font("MV Boli", Font.BOLD, 20));  //sets a new font
        label.setIconTextGap(-2);                           //set the gap between icon and text to -2
        label.setBackground(Color.GRAY);                    //set the label background to orange
        label.setOpaque(true);                     //set the background to opaque, so you can see it
        label.setBorder(border);                            //set the label's border
        label.setVerticalAlignment(JLabel.CENTER);          //set vertical position of the label
        label.setHorizontalAlignment(JLabel.CENTER);        //set horizontal position of the label
        label.setBounds(0,0,720,720);      //set x, y, width and height of a label (Useless if you don't modify frame.setLayout)
        
        //Panels
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(720,0,500,300);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);
        yellowPanel.setBounds(720,300,500,300);

        JLabel label2 = new JLabel();
        label2.setText("HI");
        label2.setHorizontalAlignment(JLabel.CENTER);
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(720,600,500,300);
        greenPanel.setLayout(new BorderLayout());
        greenPanel.add(label2);

        //Frame
        JFrame frame = new JFrame();                        //instansiates a frame
        frame.setTitle("Frame title");                //sets the title of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //exit out of application by clicking on the top-right X
        frame.setSize(1500,1000);                //sets the size of the frame
        frame.setResizable(true);                 //sets the resizability false
        frame.setIconImage(image.getImage());               //change the frame's icon
        frame.getContentPane().setBackground(Color.BLUE);   //sets the frame's background equals to blue
        frame.setLayout(null);                      //set the layout of the frame for  labels
        frame.add(label);                                   //adds to the frame our label
        frame.add(redPanel);                                //adds to the frame the redPanel
        frame.add(yellowPanel);                                //adds to the frame the yellowPanel
        frame.add(greenPanel);
        frame.setVisible(true);                           //sets the visibility of the frame to true
        //frame.pack();                                       //resize the frame to accomodate the panel inside
        
       

    }
}
