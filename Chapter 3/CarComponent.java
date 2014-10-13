import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Creates a graphic of a bulls-eye target
 * 
 * @author Annika Dugad
 * @version 19 September 2014
 */
public class CarComponent extends JComponent
{
    /**
     * Default constructor for objects of class Target
     */
    public void paintComponent(Graphics g)
    {
        // initialise instance variables
        Graphics2D g2 = (Graphics2D) g;
        Car car1 = new Car(0,0);
        int x= getWidth() - 60;
        int y = getHeight() - 30;
        Car car2 = new Car(x,y);
        car1.draw(g2);
        car2.draw(g2);
    }
}