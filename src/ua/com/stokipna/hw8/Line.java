package ua.com.stokipna.hw8;

public class Line extends Shape {
    private final Point2D[] points = new Point2D[2];
    private EColor color;

    public Line(Point2D startPoint, Point2D endPoint, EColor color) {
        super("Line");
        points[0] = startPoint;
        points[1] = endPoint;
        this.color = color;
    }

    public Point2D[] getPoints() {
        return points;
    }

    public EColor getColor() {
        return color;
    }

    public void setColor(EColor color) {
        this.color = color;
    }
    @Override
    public void draw(ICanvas canvas) {
        canvas.drawLine(points[0], points[1], color);
    }
}
