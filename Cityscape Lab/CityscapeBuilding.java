import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Arc2D;
import java.awt.GradientPaint;
/**
 * Class that constructs the background buildings of the cityscape
 * 
 * @author @adugad 
 * @version 4 October 2014
 */
public class CityscapeBuilding
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;

    /**
     * Constructs the background buildings of the cityscape
     * 
     * @param x the x-coordinate of its location
     * @param y the y-coordinate of its location
     */
    public CityscapeBuilding(int x1, int y1)
    {
        // initialise instance variables
        x = x1;
        y = y1;
    }

    /**
     * Draws the background buildings
     * 
     * @param  g3 the graphics content 
     */
    public void draw(Graphics2D g2)
    {
        Color cerulean = new Color(106,181,189);
        g2.setColor(Color.LIGHT_GRAY);
        Rectangle building1 = new Rectangle(x,y+40,25,50);
        g2.fill(building1);
        g2.draw(building1);
        
        Rectangle building2 = new Rectangle(x+35,y+45,25,40);
        g2.setColor(Color.DARK_GRAY);
        g2.fill(building2);
        g2.draw(building2);
        
        Rectangle building3 = new Rectangle(x+70,y+40,25,50);
        g2.fill(building3);
        g2.draw(building3);
        
        g2.setColor(Color.LIGHT_GRAY);
        Rectangle building4 = new Rectangle(x+105,y+40,25,50);
        g2.fill(building4);
        g2.draw(building4);
        
        Rectangle building5 = new Rectangle(x+140,y+20,25,70);
        g2.setColor(Color.DARK_GRAY);
        g2.fill(building5);
        g2.draw(building5);
        
        Rectangle building6 = new Rectangle(x+170,y+45,25,40);
        g2.setColor(Color.BLUE);
        g2.fill(building6);
        g2.draw(building6);
        
        g2.setColor(Color.LIGHT_GRAY);
        Rectangle building7 = new Rectangle(x+205,y+40,25,50);
        g2.fill(building7);
        g2.draw(building7);
        
        Rectangle building8 = new Rectangle(x+240,y+40,25,50);
        g2.fill(building8);
        g2.draw(building8);
        
        g2.setColor(Color.DARK_GRAY);
        Rectangle building9 = new Rectangle(x+270,y+20,25,70);
        g2.fill(building9);
        g2.draw(building9);
        
        Rectangle building10 = new Rectangle(x+300,y+40,25,50);
        g2.fill(building10);
        g2.draw(building10);
        
        g2.setColor(Color.BLACK);
        Rectangle building11 = new Rectangle(x+330,y,25,90);
        g2.fill(building11);
        g2.draw(building11);
        
        g2.setColor(cerulean);
        Rectangle building12 = new Rectangle(x+365,y+40,25,50);
        g2.fill(building12);
        g2.draw(building12);
        
        g2.setColor(Color.LIGHT_GRAY);
        Rectangle building13 = new Rectangle(x+400,y+50,25,40);
        g2.fill(building13);
        g2.draw(building13);
    }
}
