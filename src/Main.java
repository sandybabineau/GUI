import javax.swing.*;
import java.awt.*;
class Main
{
    public static void main(String[] args){

        JFrame frame = new JFrame();
        frame.setSize(400,400);

        Panel panel = new Panel();
        panel.setBackground(Color.BLUE);
       panel.setLayout(new GridLayout(2,2));

        JLabel label = new JLabel("What animal is this?");
        JButton button = new JButton("Check me");
        JTextField textField = new JTextField(10);

        ImageIcon icon = new ImageIcon("images/PNG/2C.png");
        icon.setImage(icon.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
        JLabel picLabel = new JLabel(icon);

        panel.add(picLabel);
        panel.add(label);
       panel.add(textField);
        panel.add(button);

        frame.add(panel);

        frame.setVisible(true);

    }
}