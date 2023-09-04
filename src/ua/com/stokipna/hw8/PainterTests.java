package ua.com.stokipna.hw8;

public class PainterTests {
    public static void main(String[] args) {
        ICanvas canvas = new CanvasDefaultImpl();
        Painter painter = new Painter(canvas);
        Point point = new Point(new Point2D(1, 2), EColor.BLUE);
        Line line = new Line(
                new Point2D(4, 8),
                new Point2D(9, 7),
                EColor.GREEN
        );
        Triangle triangle = new Triangle(
                new Point2D(4, 5 ),
                new Point2D(7, 6),
                new Point2D(1, 4),
                EColor.RED);
        Rectangle rectangle = new Rectangle(
                new Point2D(6, 8),
                new Point2D(7, 2),
                new Point2D(1, 4),
                new Point2D(6, 7),
                EColor.BLUE);
        Circle circle = new Circle(
                new Point2D(5, 7),
                5,
                EColor.BLACK);
        painter.drawShape(point);
        painter.drawShape(line);
        painter.drawShape(triangle);
        painter.drawShape(rectangle);
        painter.drawShape(circle);
    }
}
