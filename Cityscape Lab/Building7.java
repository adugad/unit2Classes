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
public class Building7
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
    public Building7(int x1, int y1)
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
        g2.setColor(Color.DARK_GRAY);
        Rectangle frontbuilding7 = new Rectangle(x,y,25,100);
        g2.fill(frontbuilding7);
        g2.setColor(Color.BLACK);
        g2.draw(frontbuilding7);
        Line2D.Double a7 = new Line2D.Double(x+5,y,x+5,y+100);
        g2.draw(a7);
        Line2D.Double b7 = new Line2D.Double(x+10,y,x+10,y+100);
        g2.draw(b7);
        Line2D.Double c7 = new Line2D.Double(x+15,y,x+15,y+100);
        g2.draw(c7);
        Line2D.Double d7 = new Line2D.Double(x+20,y,x+20,y+100);
        g2.draw(d7);
    }
}