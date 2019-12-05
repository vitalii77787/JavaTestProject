package Test;

public abstract class Figure {

    protected Colour colour;
    protected String name;

    protected abstract double GetArea();

    protected abstract String GetColour();

    protected String GetFormatedData(double value) {
        return String.format("%.2f", value);
    }

    public abstract String GetInfo();

    public abstract void Draw();
}