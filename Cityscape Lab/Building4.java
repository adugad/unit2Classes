import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Arc2D;
import java.awt.GradientPaint;

/**
 * Class that constructs one type of building
 * 
 * @author @adugad
 * @version 4 October 2014
 */
public class Building4
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    
    /**
     * Constructs one type of building
     * 
     * @param x the x-coordinate of its location
     * @param y the y-coordinate of its location
     */
    public Building4(int x1, int y1)
    {
        // initialise instance variables
        x = x1;
        y = y1;
    }

    /**
     * Draws one type of building
     * 
     * @param  g2 the graphics content 
     */
    public void draw(Graphics2D g2)
    {
        Color brick = new Color(188,98,76);
        g2.setColor(brick);
        Rectangle frontbuilding4 = new Rectangle(x,y,25,40);
        g2.fill(frontbuilding4);
        g2.setColor(Color.DARK_GRAY);
        g2.draw(frontbuilding4);
        g2.setColor(Color.LIGHT_GRAY);
        Rectangle a4 = new Rectangle(x+5,y+5,5,2);
        g2.fill(a4);
        g2.draw(a4);
        Rectangle b4 = new Rectangle(x+5,y+15,5,2);
        g2.fill(b4);
        g2.draw(b4);
        Rectangle c4 = new Rectangle(x+5,y+25,5,2);
        g2.fill(c4);
        g2.draw(c4);
        Rectangle d4 = new Rectangle(x+15,y+5,5,2);
        g2.fill(d4);
        g2.draw(d4);
        Rectangle e4 = new Rectangle(x+15,y+15,5,2);
        g2.fill(e4);
        g2.draw(e4);
        Rectangle f4 = new Rectangle(x+15,y+25,5,2);
        g2.fill(f4);
        g2.draw(f4);
    }
}