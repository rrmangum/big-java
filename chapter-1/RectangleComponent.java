import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class RectangleComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {  
        // Recover Graphics2D 
        Graphics2D g2 = (Graphics2D) g;

        // Construct a rectangle and draw it
        Rectangle box = new Rectangle(5, 10, 20, 30);
        g2.draw(box);

        // Move rectangle 15 units to the right and 25 units down
        box.translate(15, 25);

        // Draw moved rectangle
        g2.draw(box);

        Ellipse2D.Double ellipse = new Ellipse2D.Double(10, 10, 20, 20);
        g2.draw(ellipse);

        Line2D.Double segment = new Line2D.Double(20, 20, 30, 30);
        g2.draw(segment);

        Point2D.Double from = new Point2D.Double(100, 100);
        Point2D.Double to = new Point2D.Double(125, 200);
   
        segment = new Line2D.Double(from, to);
        g2.draw(segment);

        Color magenta = new Color(255, 0, 255);
        g2.setColor(magenta);
        g2.drawString("Message", 200, 200);
    }
}