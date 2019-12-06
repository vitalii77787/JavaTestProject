package Figures;

import Utils.Colour;

public abstract class Figure {

    protected Colour colour;
    protected String name;
    protected String symbol = "*";

    protected abstract double GetArea();

    protected String GetColour() {
        return this.colour.name();
    }

    protected String GetFormatedData(double value) {
        return String.format("%.2f", value);
    }

    public abstract void DisplayInfo();

    public abstract void Draw();
}