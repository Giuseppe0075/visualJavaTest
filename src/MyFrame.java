import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame; 
public class MyFrame extends JFrame implements ActionListener{
    JButton button;
    public MyFrame()
    {
        button = new JButton();
        button.setBounds(200,100,250,100);
        button.addActionListener((e) -> {System.out.println("pog");});
        button.setText("I'm a button");
        button.setFocusable(false);
        button.setBorder(null);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == button)
        {
            System.out.println("pog");
        }
    }
}
