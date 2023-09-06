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

        // // Construct a rectangle and draw it
        // Rectangle box = new Rectangle(5, 10, 20, 30);
        // g2.draw(box);

        // // Move rectangle 15 units to the right and 25 units down
        // box.translate(15, 25);

        // // Draw moved rectangle
        // g2.draw(box);

        // Ellipse2D.Double ellipse = new Ellipse2D.Double(10, 10, 20, 20);
        // g2.draw(ellipse);

        // Line2D.Double segment = new Line2D.Double(20, 20, 30, 30);
        // g2.draw(segment);

        // Point2D.Double from = new Point2D.Double(100, 100);
        // Point2D.Double to = new Point2D.Double(125, 200);
   
        // segment = new Line2D.Double(from, to);
        // g2.draw(segment);

        // Color magenta = new Color(255, 0, 255);
        // g2.setColor(magenta);
        // g2.drawString("Message", 200, 200);

        // 2.3-1
        // Rectangle box = new Rectangle(5, 10, 20, 30);
        // g2.draw(box);

        // box.translate(20, 30);
        // g2.draw(box);

        // Rectangle box2 = new Rectangle(5, 10, 40, 60);
        // g2.draw(box2);

        // 2.3-2
        // Rectangle box = new Rectangle(100, 100, 20, 30);
        // g2.draw(box);

        // box.grow(10, 10);
        // g2.draw(box);

        // box.grow(10, 10);
        // g2.draw(box);

        // 2.3-3
        // Line2D.Double l1 = new Line2D.Double(50, 0, 50, 100);
        // Line2D.Double l2 = new Line2D.Double(0, 50, 100, 50);
        // Line2D.Double l3 = new Line2D.Double(10, 10, 90, 90);
        // Line2D.Double l4 = new Line2D.Double(10, 90, 90, 10);

        // g2.draw(l1);
        // g2.draw(l2);
        // g2.draw(l3);
        // g2.draw(l4);

        // 2.3-4
        Color red = new Color(255, 0, 0);
        Line2D.Double l1 = new Line2D.Double(0, 100, 200, 100);
        Line2D.Double l2 = new Line2D.Double(100, 0, 100, 200);

        Ellipse2D.Double ellipse1 = new Ellipse2D.Double(20, 20, 160, 160);
        Ellipse2D.Double ellipse2 = new Ellipse2D.Double(45, 45, 110, 110);
        // Ellipse2D.Double ellipse3 = new Ellipse2D.Double(70, 70, 70, 70);


        g2.setColor(red);
        g2.draw(l1);
        g2.draw(l2);
        g2.draw(ellipse1);
        g2.draw(ellipse2);
        // g2.draw(ellipse3);
        }
}