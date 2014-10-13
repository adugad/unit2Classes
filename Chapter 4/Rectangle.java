import java.util.Scanner;

public class Rectangle
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        double length = in.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = in.nextDouble();
        double area = length * width;
        double perimeter = length + length + width + width;
        double pythagorean = Math.pow((Math.pow(length,2) + Math.pow(width,2)),0.5);
        System.out.println(area);
        System.out.println(perimeter);
        System.out.println(pythagorean);
    }
}