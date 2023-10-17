package main;

import javax.swing.JPanel;
import inputs.KeyboardInputs;
import inputs.MouseInputs;
import java.awt.Graphics;

public class GamePanel extends JPanel {

private MouseInputs mouseInputs;
private int xDelta = 100, yDelta = 100;

    public GamePanel(){
        mouseInputs = new MouseInputs(this);
        addKeyListener(new KeyboardInputs(this));
        addMouseListener( mouseInputs);
        addMouseMotionListener(mouseInputs);

    }

    public void changeXDelta(int value){
        this.xDelta += value;
        
    }

    public void changeYDelta(int value){
        this.yDelta += value;
        
    }

    public void setRectPos(int x, int y){
        this.xDelta = x;
        this.yDelta = y;
        
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.fillRect(xDelta , yDelta, 200, 50);
        repaint();
    }
    
}
