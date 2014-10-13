public class DistanceConverter
{
   public static final double YARDS_TO_FEET = 3;
   public static final double FEET_TO_INCHES = 12;
   
    public static void main(String[] args)
   {
      double yards = 3.5;
      
      double feet = yards * YARDS_TO_FEET;
      double inches = feet * FEET_TO_INCHES;
      
      System.out.println(yards + " yards are " + feet + " feet");
      System.out.println(yards + " yards are " + inches + " inches");
   }
}