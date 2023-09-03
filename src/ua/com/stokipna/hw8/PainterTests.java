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
        painter.drawShape(point);
        painter.drawShape(line);
    }
}
