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
public class Building9
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
    public Building9(int x1, int y1)
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
        Rectangle frontbuilding9 = new Rectangle(x,y,25,55);
        g2.fill(frontbuilding9);
        g2.setColor(Color.DARK_GRAY);
        g2.draw(frontbuilding9);
        Rectangle windowa9 = new Rectangle(x+5,y+5,5,5);
        g2.fill(windowa9);
        Rectangle windowb9 = new Rectangle(x+5,y+15,5,5);
        g2.fill(windowb9);
        Rectangle windowc9 = new Rectangle(x+5,y+25,5,5);
        g2.fill(windowc9);
        Rectangle windowd9 = new Rectangle(x+5,y+35,5,5);
        g2.fill(windowd9);
        Line2D.Double a9 = new Line2D.Double(x+15,y,x+15,y+55);
        g2.draw(a9);
        Line2D.Double b9 = new Line2D.Double(x+16,y,x+16,y+55);
        g2.draw(b9);
    }
}