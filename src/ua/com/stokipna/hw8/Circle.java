package ua.com.stokipna.hw8;

public class Circle extends  Shape {
    private Point2D centerPoint;
    private int radius;
    private EColor color;

    public Circle(Point2D centerPoint, int radius, EColor color) {
        super("Circle");
        this.centerPoint = centerPoint;
        this.radius = radius;
        this.color = color;
    }

    public Point2D getCenterPoint() {
        return centerPoint;
    }

    public int getRadius() {
        return radius;
    }

    public EColor getColor() {
        return color;
    }

    public void setColor(EColor color) {
        this.color = color;
    }

    @Override
    public void draw(ICanvas canvas) {
        canvas.drawCircle(centerPoint, radius, color);
    }
}
