package GrafikHW;

import misal.MyComponent;

import javax.swing.*;
import java.awt.*;

public class Koordinata extends JFrame {
    private GrafikaPanel grafikaPanel;
    Koordinata(){
        super("Grafika window");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,600,600);
        grafikaPanel = new GrafikaPanel();
        grafikaPanel.setBackground(Color.WHITE);
        this.add(grafikaPanel);
        this.setVisible(true);
    }
}
