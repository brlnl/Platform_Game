package main;

import javax.swing.JPanel;

import inputs.KeyboardInputs;

import java.awt.Graphics;


public class GamePanel extends JPanel {

    public GamePanel(){
        addKeyListener(new KeyboardInputs() {

    
            
        });

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.fillRect(100, 100, 200, 50);
    }
    
}
