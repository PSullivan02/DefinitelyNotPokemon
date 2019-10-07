package totallynotpokemon;

import java.util.*;
import java.awt.*;

public class Player {
    private int height, width, x, y, vx, vy, score; 
    private Rectangle bounds;  
    
    public Player(int cWidth, int cHeight){
        this.x = cWidth / 2;
        this.y = cHeight / 2;
        this.vx = 0;
        this.vy = 0;
        this.width = 30;
        this.height = 40;
        this.bounds = new Rectangle(this.x, this.y, this.width, this.height);
    }
    public void move(String direction){
        if (direction.equals("right")){
            vx = 0;
        }
        else if (direction.equals("left")){
            vx = -0;
        }
        else if (direction.equals("up")){
            vy = -0;
        }
        else if (direction.equals("down")){
            vy = 0;
        }
    }
    public void update(){
        this.x += vx;
        this.y += vy;
        this.bounds = new Rectangle(this.x, this.y, this.width, this.height);
    }
    public void stop(){
        vx = 0;
        vy = 0;
    }
}
