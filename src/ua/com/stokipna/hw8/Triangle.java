package ua.com.stokipna.hw8;

public class Triangle extends Shape{
private final Point2D[] points = new Point2D[3];
private EColor color;

    public Triangle(Point2D firstPoint, Point2D secondPoint, Point2D thirdPoint, EColor color) {
        super("Triangle");
        points[0] = firstPoint;
        points[1] = secondPoint;
        points[2] = thirdPoint;
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
        canvas.drawLine(points[1], points[2], color);
        canvas.drawLine(points[2], points[0], color);
    }
}
