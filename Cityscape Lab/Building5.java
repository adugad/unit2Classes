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
public class Building5
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
    public Building5(int x1, int y1)
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
        g2.setColor(Color.LIGHT_GRAY);
        Line2D.Double a5 = new Line2D.Double(x+15,y+20,x+10,y+90);
        g2.draw(a5);
        Line2D.Double b5 = new Line2D.Double(x+16,y+20,x+11,y+90);
        g2.draw(b5);
        Line2D.Double c5 = new Line2D.Double(x+17,y+20,x+12,y+90);
        g2.draw(c5);
        Line2D.Double d5 = new Line2D.Double(x+20,y+20,x+25,y+90);
        g2.draw(d5);
        Line2D.Double e5 = new Line2D.Double(x+21,y+20,x+26,y+90);
        g2.draw(e5);
        Line2D.Double f5 = new Line2D.Double(x+22,y+20,x+27,y+90);
        g2.draw(f5);
        g2.setColor(Color.DARK_GRAY);
        Line2D.Double g5 = new Line2D.Double(x+18,y+20,x+18,y+90);
        g2.draw(g5);
        Line2D.Double h5 = new Line2D.Double(x+19,y+20,x+19,y+90);
        g2.draw(h5);
        Ellipse2D.Double ellipsea5 = new Ellipse2D.Double(x+6,y+13,25,15);
        g2.setColor(Color.LIGHT_GRAY);
        g2.fill(ellipsea5);
        g2.draw(ellipsea5);
        Ellipse2D.Double ellipseb5 = new Ellipse2D.Double(x+2,y+19,33,2);
        g2.setColor(Color.DARK_GRAY);
        g2.fill(ellipseb5);
        g2.draw(ellipseb5);
        Line2D.Double i5 = new Line2D.Double(x+18,y+13,x+18,y+7);
        g2.draw(i5);
        Line2D.Double j5 = new Line2D.Double(x+19,y+13,x+19,y+3);
        g2.setColor(Color.BLACK);
        g2.draw(j5);
    }
}