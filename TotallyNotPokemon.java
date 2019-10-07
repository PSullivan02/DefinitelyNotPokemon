package totallynotpokemon;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class TotallyNotPokemon {

    public static void main(String[] args) {
        JFrame j = new JFrame("Pokemon");
        World c = new World();
        j.add(c);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(800, 600);
        j.setVisible(true);
        j.setLocationRelativeTo(null);
        j.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                c.keyPressed(e);
            }
            @Override
            public void keyReleased(KeyEvent e) {
                c.keyReleased(e);
            }
        });
    }
    
}
