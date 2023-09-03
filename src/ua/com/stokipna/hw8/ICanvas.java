package ua.com.stokipna.hw8;

public interface ICanvas {
    void drawPoint(Point2D point, EColor color);
    void drawLine(Point2D startPoint, Point2D endPoint, EColor color);
    void drawCircle(Point2D point, int radius, EColor color);
}
