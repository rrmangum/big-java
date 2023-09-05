import java.awt.Rectangle;

public class ReplaceDemo
{
   public static void main(String[] args)
   {
      String river = "Mississippi";
      System.out.println(river.replace("issipp", "our"));
      System.out.println(river.replace("i", "x"));

      Rectangle box = new Rectangle(5, 10, 20, 30);
      System.out.println(box);
   }
}
