package ua.com.stokipna.hw8;

public abstract class Shape implements IDrawable {
    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
