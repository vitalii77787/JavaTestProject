package Figures;

import Utils.Colour;

public class Triangle extends Figure {

    private double height;
    private double side;

    public Triangle(double side, double height, Colour colour) {
        this.side = side;
        this.height = height;
        this.colour = colour;
        this.name = this.getClass().getSimpleName();
    }

    private double GetHypotenuseLength() {
       return Math.sqrt(this.height * this.height + this.side * this.side);
    }

    @Override
    public void Draw() {
        for (int y = 1; y <= height; y++) {
            for (int x = 1; x <= y; x++) {
                System.out.print(this.symbol);
            }
            System.out.println();
        }
    }

    @Override
    public double GetArea() {
        return this.side * this.height * 0.5;
    }

    @Override
    public void DisplayInfo() {
        System.out.println(String.format("Figure: %s, Area: %s, Hypotenuse: %s, Colour: %s", this.name, GetFormatedData(GetArea()),
        GetFormatedData(GetHypotenuseLength()), this.GetColour()));
    }
}