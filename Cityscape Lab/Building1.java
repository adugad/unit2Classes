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
public class Building1
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
    public Building1(int x1, int y1)
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
        Color gold = new Color(206,188,113);
        g2.setColor(gold);
        Rectangle frontbuilding1 = new Rectangle(x,y,25,60);
        g2.fill(frontbuilding1);
        g2.setColor(Color.DARK_GRAY);
        g2.draw(frontbuilding1);
        Line2D.Double a1 = new Line2D.Double(x+5,y,x+5,y+60);
        g2.draw(a1);
        Line2D.Double b1 = new Line2D.Double(x+6,y,x+6,y+60);
        g2.draw(b1);
        Line2D.Double c1 = new Line2D.Double(x+10,y,x+10,y+60);
        g2.draw(c1);
        Line2D.Double d1 = new Line2D.Double(x+15,y,x+15,y+60);
        g2.draw(d1);
        Line2D.Double e1 = new Line2D.Double(x+16,y,x+16,y+60);
        g2.draw(e1);
        Line2D.Double f1 = new Line2D.Double(x+20,y,x+20,y+60);
        g2.draw(f1);
    }
}