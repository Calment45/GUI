import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[]args) {

        JFrame frame = new JFrame();
        ImageIcon image = new ImageIcon("asset/square.png");
        frame.setVisible(true);
        frame.setSize(800, 800);
        frame.setTitle("Calment's application");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLUE);

        JLabel thumb = new JLabel();
        thumb.setText("Hey!");
        thumb.setFont(new Font("Time",Font.BOLD, 50));
        thumb.setVerticalAlignment(JLabel.CENTER);
        thumb.setHorizontalAlignment(JLabel.CENTER);
        thumb.setForeground(Color.red);
        frame.add(thumb);

        JLabel label = new JLabel();
        ImageIcon icon = new ImageIcon("asset/smile.png");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);
        frame.setIconImage(image.getImage());






    }
}
