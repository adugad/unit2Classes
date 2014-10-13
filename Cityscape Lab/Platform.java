import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Arc2D;
/**
 * Class that constructs the platform for the city
 * 
 * @author @adugad
 * @version 4 October 2014
 */
public class Platform
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;

    /**
     * Constructs the platform
     * 
     * @param x the x-coordinate of its location
     * @param y the y-coordinate of its location
     */
    public Platform(int x1, int y1)
    {
        // initialise instance variables
        x = x1;
        y=y1;
    }

    /**
     * Draws the platform
     * 
     * @param  g1   the graphics content
     */
    public void draw(Graphics2D g1)
    {
        g1.setColor(Color.DARK_GRAY);
        Rectangle pole = new Rectangle(225+x,y+10,50,600);
        g1.fill(pole);
        
        Line2D.Double line1 = new Line2D.Double(x,y+10,x+225,y+420);
        g1.draw(line1);
        Line2D.Double line2 = new Line2D.Double(x,y+10,x+225,y+380);
        g1.draw(line2);
        Line2D.Double line3 = new Line2D.Double(x,y+10,x+225,y+340);
        g1.draw(line3);
        Line2D.Double line4 = new Line2D.Double(x,y+10,x+225,y+300);
        g1.draw(line4);
        Line2D.Double line5 = new Line2D.Double(x,y+10,x+225,y+260);
        g1.draw(line5);
        Line2D.Double line6 = new Line2D.Double(x,y+10,x+225,y+220);
        g1.draw(line6);
        Line2D.Double linea1 = new Line2D.Double(500+x,y+10,x+275,y+420);
        g1.draw(linea1);
        Line2D.Double linea2 = new Line2D.Double(500+x,y+10,x+275,y+380);
        g1.draw(linea2);
        Line2D.Double linea3 = new Line2D.Double(500+x,y+10,x+275,y+340);
        g1.draw(linea3);
        Line2D.Double linea4 = new Line2D.Double(500+x,y+10,x+275,y+300);
        g1.draw(linea4);
        Line2D.Double linea5 = new Line2D.Double(500+x,y+10,x+275,y+260);
        g1.draw(linea5);
        Line2D.Double linea6 = new Line2D.Double(500+x,y+10,x+275,y+220);
        g1.draw(linea6);
        
        Ellipse2D.Double platform = new Ellipse2D.Double(x,y,500,20);
        Color cerulean = new Color(106,181,189);
        g1.setColor(cerulean);
        g1.fill(platform);
        g1.setColor(Color.DARK_GRAY);
        g1.draw(platform);
    }
}
