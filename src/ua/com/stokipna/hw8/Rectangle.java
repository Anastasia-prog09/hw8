package ua.com.stokipna.hw8;

public class Rectangle extends Shape{
    private final Point2D[] points = new Point2D[4];
    private EColor color;

    public Rectangle(Point2D firstPoint, Point2D secondPoint, Point2D thirdPoint, Point2D fourthPoint, EColor color) {
        super("Rectangle");
        points[0] = firstPoint;
        points[1] = secondPoint;
        points[2] = thirdPoint;
        points[3] = fourthPoint;
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
        canvas.drawLine(points[2], points[3], color);
        canvas.drawLine(points[3], points[0], color);
    }
}
