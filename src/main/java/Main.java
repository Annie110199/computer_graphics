import javax.swing.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main
{

    public static void main(String[] args)
    {
        View view =new View();
        JFrame window = new JFrame("Fractal");
        window.setSize(1000, 1000);
        window.setContentPane(view);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
