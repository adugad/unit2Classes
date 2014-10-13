import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Arc2D;
import java.awt.GradientPaint;

/**
 * Class that constructs the sky
 * 
 * @author @adugad
 * @version 4 October 2014
 */
public class CityscapeSky
{
    // instance variables - replace the example below with your own
    
    /**
     * Draws the sky in the background
     * 
     * @param  g2 the graphics content 
     */
    public void draw(Graphics2D g2)
    {
        Color skyblue1 = new Color(0,191,255);
        GradientPaint skyblue2 = new GradientPaint(300,400,skyblue1,300,500,Color.white);
        Rectangle sky = new Rectangle(0,0,1200,800);
        g2.setPaint(skyblue2);
        g2.fill(sky);
    }
}
