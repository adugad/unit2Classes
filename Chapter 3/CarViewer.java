import javax.swing.JFrame;
public class CarViewer
{
    public static void main(String[]args)
    {
        Jframe frame = new Jframe();
        frame.setSize(300,400);
        frame.setTitle("Target");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CarComponent component = new CarComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}