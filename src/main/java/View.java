import javax.swing.*;
import java.awt.*;

public class View extends JPanel{

    public void paintComponent(Graphics g){
        super.paintComponents(g);
            g.setColor(Color.BLUE);
        drawFractal(180, 200, 400, 450, 24, g);
        repaint();
    }

    private void drawFractal(int x1, int y1, int x2, int y2, int n, Graphics g){
        int xx, yy;
        if(n > 0)
        {
            xx = (x1 + x2) / 2 + (y2 - y1) / 2;
            yy = (y1 + y2) / 2 - (x2 - x1) / 2 ;
            drawFractal(x2, y2, xx, yy, n - 1, g);
            drawFractal(x1, y1, xx, yy, n - 1, g);
        }
        if(n == 0)
            g.drawLine(x1, y1, x2, y2);
    }

}