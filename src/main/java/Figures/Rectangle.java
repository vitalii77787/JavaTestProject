package Figures;

import Utils.Colour;

public class Rectangle extends Figure {

    private double width;
    private double height;

    public Rectangle(double width, double height, Colour colour) {
        this.width = width;
        this.height = height;
        this.colour = colour;
        this.name = this.getClass().getSimpleName();
    }

    @Override
    public void Draw() {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    @Override
    public double GetArea() {
        return this.width * this.height;
    }

    @Override
    public void DisplayInfo() {
        System.out.println(String.format("Figure: %s, Area: %s, side length: %s, colour: %s", this.name, GetFormatedData(GetArea()),
                GetFormatedData(this.width), this.GetColour()));
    }
}