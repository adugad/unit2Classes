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
public class Building6
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
    public Building6(int x1, int y1)
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
        Color silverblue = new Color(199,230,235);
        g2.setColor(silverblue);
        Rectangle frontbuilding6 = new Rectangle(x,y,25,60);
        g2.fill(frontbuilding6);
        g2.setColor(Color.LIGHT_GRAY);
        g2.draw(frontbuilding6);
    }
}