package ua.com.stokipna.hw8;

public class Point extends Shape {
    private final Point2D point;
    private EColor color;

    public Point(Point2D point, EColor color) {
        super("Point");
        this.point = point;
        this.color = color;
    }

    public Point2D getPoint() {
        return point;
    }

    public EColor getColor() {
        return color;
    }

    public void setColor(EColor color) {
        this.color = color;
    }

    @Override
    public void draw(ICanvas canvas) {
        canvas.drawPoint(point, color);
    }
}
