import javax.swing.JFrame;

class RectangleViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        // set properties
        frame.setSize(300, 400);
        frame.setTitle("My Frame");
        
        // set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // use the Rectangle class component
        RectangleComponent component = new RectangleComponent();
        frame.add(component);

        // make the frame visible
        frame.setVisible(true);
    }
}