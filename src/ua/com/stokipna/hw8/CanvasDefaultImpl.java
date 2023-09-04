package ua.com.stokipna.hw8;

public class CanvasDefaultImpl implements ICanvas {
    @Override
    public void drawPoint(Point2D point, EColor color) {
        System.out.println("Draw point: " + point.toString() + ", color: " + color);
    }

    @Override
    public void drawLine(Point2D startPoint, Point2D endPoint, EColor color) {
        System.out.println("Draw line, startPoint: " + startPoint.toString() + ", endPoint: " + endPoint.toString() + ", color: " + color);

    }

    @Override
    public void drawCircle(Point2D point, int radius, EColor color) {
        System.out.println("Draw circle, centerPoint: " + point.toString() + ", radius: " + radius + ", color: " + color);

    }
}
