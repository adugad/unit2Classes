import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 * cityscape to these objects
 * 
 * @author @adugad
 * @version 4 October 2014
 */
public class CityscapeComponent extends JComponent implements ActionListener
{
    Timer time = new Timer(50,this);
    int x1 = 0;
    int velocityx = 4;
    int x2 = 1200;
    /**
     * Method creates the graphics for the buildings, blimps, and platform of the city
     * 
     * @param g the graphics component
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        //create instances of classes and invoke the draw method on each
        CityscapeSky sky = new CityscapeSky();
        Platform platform = new Platform(325,250);
        CityscapeBuilding background = new CityscapeBuilding(350,170);
        Building1 b1 = new Building1(370,200);
        Building2 b2 = new Building2(400,220);
        Building3 b3 = new Building3(435,190);
        Building4 b4 = new Building4(475,220);
        Building5 b5 = new Building5(500,170);
        Building6 b6 = new Building6(540,200);
        Building7 b7 = new Building7(575,160);
        Building8 b8 = new Building8(610,200);
        Building9 b9 = new Building9(640,205);
        Buildings bs = new Buildings(670,180);
        Blimp blimp = new Blimp(x1,20);
        Blimp blimp1 = new Blimp (x2,55);
        time.start();
        
        int x1 = getWidth()-800;
        int y1 = getHeight()-800;
        sky.draw(g2);
        platform.draw(g2);
        background.draw(g2);
        b1.draw(g2);
        b2.draw(g2);
        b3.draw(g2);
        b4.draw(g2);
        b5.draw(g2);
        b6.draw(g2);
        b7.draw(g2);
        b8.draw(g2);
        b9.draw(g2);
        bs.draw(g2);
        blimp.draw(g2);
        blimp1.draw(g2);
    }
    /**
     * Method that implements the animation by adding variables and repainting
     * 
     * @param e the actionevent component
     */
    public void actionPerformed(ActionEvent e)
    {
        x1 = x1 + velocityx;
        x2 = x2 - velocityx;
        repaint();
    }
}

