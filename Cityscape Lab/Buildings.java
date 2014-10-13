import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Arc2D;
import java.awt.GradientPaint;

/**
 * Class that constructs 3 buildings
 * 
 * @author @adugad
 * @version 4 October 2014
 */
public class Buildings
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    
    /**
     * Constructs 3 buildings
     * 
     * @param x the x-coordinate of its location
     * @param y the y-coordinate of its location
     */
    public Buildings(int x1, int y1)
    {
        // initialise instance variables
        x = x1;
        y = y1;
    }

    /**
     * Draws 3 buildings
     * 
     * @param  g2 the graphics content 
     */
    public void draw(Graphics2D g2)
    {
        Color jadegreen = new Color(213,232,197);
        g2.setColor(jadegreen);
        Rectangle frontbuilding10 = new Rectangle(x,y+50,25,30);
        g2.fill(frontbuilding10);
        g2.setColor(Color.DARK_GRAY);
        g2.draw(frontbuilding10);
        
        g2.setColor(Color.LIGHT_GRAY);
        Rectangle frontbuilding11 = new Rectangle(x+30,y+40,25,40);
        g2.fill(frontbuilding11);
        g2.setColor(Color.DARK_GRAY);
        g2.draw(frontbuilding11);
        
        g2.setColor(Color.BLACK);
        Rectangle frontbuilding12 = new Rectangle(x+65,y,25,80);
        g2.fill(frontbuilding12);
        g2.draw(frontbuilding12);
        
        g2.setColor(Color.DARK_GRAY);
        Rectangle frontbuilding13 = new Rectangle(x+100,y+30,25,50);
        g2.fill(frontbuilding13);
        g2.setColor(Color.BLACK);
        g2.draw(frontbuilding13);
    }
}