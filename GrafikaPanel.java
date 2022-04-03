package GrafikHW;

import javax.swing.*;
import java.awt.*;

public class GrafikaPanel extends JPanel {
    private int width;
    private int height;


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        width = getWidth();
        height = getHeight();
        g.setColor(Color.BLACK);
        g.drawLine(width/2, 0, width/2, height);

        g.drawLine(0, height/2, width, height/2);
        drawScale(g);
        drawSin(g);
    }
    private void drawScale(Graphics g) {

        for(int x=width/2; x<width; x+=30){
            g.drawLine(x, height/2-10, x, height/2+10);
        }

        for(int x=width/2; x>0; x-=30){
            g.drawLine(x, height/2-10, x, height/2+10);
        }

        for(int y=height/2; y<height; y+=30){
            g.drawLine(width/2-10, y, width/2+10, y);
            //g.drawString("" + (i--),width/2-20, y);
        }

        for(int y=height/2; y>0; y-=30){
            g.drawLine(width/2-10, y, width/2+10, y);
        }
    }
    private void drawSin(Graphics g) {

        for(int x=0; x<width; x++){
            int xPoint = x - width/2;
            double rad = xPoint/30.0;
            double degree1 = Math.sin(rad);
            int y1 = height/2 - (int) (Math.round(degree1 * 90));
            double degree2 = Math.cos(rad);
            int y2 = height/2 - (int) (Math.round(degree2 * 90));
            g.setColor(Color.RED);
            g.drawOval(x, y1, 4, 4);
            g.setColor(Color.GREEN);
            g.drawOval(x, y2, 4, 4);
        }

    }
}
