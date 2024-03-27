package by.bkg.patterns.gof.structural.flyweight.one;

import by.bkg.patterns.gof.structural.flyweight.one.model.Shape;

import javax.swing.*;
import java.awt.*;
import java.io.Serial;

// https://www.digitalocean.com/community/tutorials/flyweight-design-pattern-java
// https://refactoring.guru/design-patterns/flyweight
public class DrawingClient extends JFrame {

    @Serial
    private static final long serialVersionUID = -1350200437285282550L;
    private final int WIDTH;
    private final int HEIGHT;

    private static final ShapeFactory.ShapeType[] shapes = {ShapeFactory.ShapeType.LINE, ShapeFactory.ShapeType.OVAL_FILL, ShapeFactory.ShapeType.OVAL_NOFILL};
    private static final Color[] colors = {Color.RED, Color.GREEN, Color.YELLOW};

    public DrawingClient(int width, int height) {
        this.WIDTH = width;
        this.HEIGHT = height;
        var contentPane = getContentPane();

        var startButton = new JButton("Draw");
        final var panel = new JPanel();

        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(startButton, BorderLayout.SOUTH);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        startButton.addActionListener(event -> {
            var graphics = panel.getGraphics();
            for (int i = 0; i < 20; ++i) {
                var shape = ShapeFactory.getShape(getRandomShape());
                shape.draw(graphics, getRandomX(), getRandomY(), getRandomWidth(), getRandomHeight(), getRandomColor());
            }
        });
    }

    private ShapeFactory.ShapeType getRandomShape() {
        return shapes[(int) (Math.random() * shapes.length)];
    }

    private int getRandomX() {
        return (int) (Math.random() * WIDTH);
    }

    private int getRandomY() {
        return (int) (Math.random() * HEIGHT);
    }

    private int getRandomWidth() {
        return (int) (Math.random() * (WIDTH / 10));
    }

    private int getRandomHeight() {
        return (int) (Math.random() * (HEIGHT / 10));
    }

    private Color getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    public static void main(String[] args) {
        var drawing = new DrawingClient(500, 600);
    }
}