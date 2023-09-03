package ua.com.stokipna.hw8;

public class Painter {
    private final ICanvas canvas;

    public Painter(ICanvas canvas) {
        this.canvas = canvas;
    }

    public void drawObject(IDrawable object) {
        object.draw(canvas);
    }

    public void drawShape(Shape shape) {
        System.out.println("Shape name: " + shape.getName());
        shape.draw(canvas);
    }
}
