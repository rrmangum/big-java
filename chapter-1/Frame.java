import javax.swing.JFrame;

public class Frame 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setTitle("An empty frame");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new RectangleComponent());
        frame.setVisible(true);


    }
}