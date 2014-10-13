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
public class Building2
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    
    /**
     * Constructs the cityscape
     * 
     * @param x the x-coordinate of its location
     * @param y the y-coordinate of its location
     */
    public Building2(int x1, int y1)
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
        Color skyblue = new Color(118,131,195);
        g2.setColor(skyblue);
        Rectangle frontbuilding2 = new Rectangle(x,y,25,40);
        g2.fill(frontbuilding2);
        g2.setColor(Color.DARK_GRAY);
        g2.draw(frontbuilding2);
        Rectangle windowa2 = new Rectangle(x+5,y+5,5,5);
        g2.fill(windowa2);
        Rectangle windowb2 = new Rectangle(x+5,y+15,5,5);
        g2.fill(windowb2);
        Rectangle windowc2 = new Rectangle(x+5,y+25,5,5);
        g2.fill(windowc2);
        Rectangle windowd2 = new Rectangle(x+15,y+5,5,5);
        g2.fill(windowd2);
        Rectangle windowe2 = new Rectangle(x+15,y+15,5,5);
        g2.fill(windowe2);
        Rectangle windowf2 = new Rectangle(x+15,y+25,5,5);
        g2.fill(windowf2);
    }
}