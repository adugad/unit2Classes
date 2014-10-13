import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Arc2D;
import java.awt.GradientPaint;

/**
 * Class that constructs blimps
 * 
 * @author @adugad
 * @version 4 October 2014
 */
public class Blimp
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    
    /**
     * Constructs the blimp
     * 
     * @param x the x-coordinate of its location
     * @param y the y-coordinate of its location
     */
    public Blimp(int x1, int y1)
    {
        // initialise instance variables
        x = x1;
        y = y1;
    }

    /**
     * Draws the blimp
     * 
     * @param  g2 the graphics content 
     */
    public void draw(Graphics2D g2)
    {
        Rectangle rect = new Rectangle(x+15,y+15,15,5);
        g2.setColor(Color.DARK_GRAY);
        g2.draw(rect);
        g2.fill(rect);
        
        Ellipse2D.Double body = new Ellipse2D.Double(x,y,50,15);
        g2.setColor(Color.LIGHT_GRAY);
        g2.fill(body);
        g2.setColor(Color.DARK_GRAY);
        g2.draw(body);
        
        Line2D.Double lne = new Line2D.Double(x+10,y+7,x+25,y+7);
        g2.draw(lne);
        
    }
}
        