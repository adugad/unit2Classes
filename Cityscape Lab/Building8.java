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
public class Building8
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
    public Building8(int x1, int y1)
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
        Rectangle frontbuilding8 = new Rectangle(x,y,25,60);
        g2.draw(frontbuilding8);
        g2.fill(frontbuilding8);
        g2.setColor(Color.LIGHT_GRAY);
        Line2D.Double a8 = new Line2D.Double(x,y,x+25,y+60);
        g2.draw(a8);
        Line2D.Double b8 = new Line2D.Double(x+5,y,x+25,y+50);
        g2.draw(b8);
        Line2D.Double c8 = new Line2D.Double(x+10,y,x+25,y+38);
        g2.draw(c8);
        Line2D.Double d8 = new Line2D.Double(x+15,y,x+25,y+26);
        g2.draw(d8);
        Line2D.Double e8 = new Line2D.Double(x+20,y,x+25,y+14);
        g2.draw(e8);
        Line2D.Double f8 = new Line2D.Double(x,y+10,x+20,y+60);
        g2.draw(f8);
        Line2D.Double g8 = new Line2D.Double(x,y+22,x+15,y+60);
        g2.draw(g8);
        Line2D.Double h8 = new Line2D.Double(x,y+34,x+10,y+60);
        g2.draw(h8);
        Line2D.Double i8 = new Line2D.Double(x,y+46,x+5,y+60);
        g2.draw(i8);
        Line2D.Double aa8 = new Line2D.Double(x+25,y,x,y+60);
        g2.draw(aa8);
        Line2D.Double bb8 = new Line2D.Double(x+20,y,x,y+50);
        g2.draw(bb8);
        Line2D.Double cc8 = new Line2D.Double(x+15,y,x,y+38);
        g2.draw(cc8);
        Line2D.Double dd8 = new Line2D.Double(x+10,y,x,y+26);
        g2.draw(dd8);
        Line2D.Double ee8 = new Line2D.Double(x+5,y,x,y+14);
        g2.draw(ee8);
        Line2D.Double ff8 = new Line2D.Double(x+25,y+10,x+5,y+60);
        g2.draw(ff8);
        Line2D.Double gg8 = new Line2D.Double(x+25,y+22,x+10,y+60);
        g2.draw(gg8);
        Line2D.Double hh8 = new Line2D.Double(x+25,y+34,x+15,y+60);
        g2.draw(hh8);
        Line2D.Double ii8 = new Line2D.Double(x+25,y+46,x+20,y+60);
        g2.draw(ii8);
    }
}
        