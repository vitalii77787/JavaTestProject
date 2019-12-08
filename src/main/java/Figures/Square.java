package Figures;

import Utils.Colour;

public class Square extends Figure {

    private double side;

    public Square(double side, Colour colour) {
        this.side = side;
        this.colour = colour;
        this.name = this.getClass().getSimpleName();
    }


    @Override
    protected double GetArea() {
        return this.side * this.side;
    }

    @Override
    public void DisplayInfo() {
        System.out.println(String.format("Figure: %s, Area: %s, colour: %s", this.name, GetFormatedData(GetArea()),
        this.GetColour()));
    }

    @Override
    public void Draw() {
        for (int i = 0; i < this.side; i++) {
            for (int j = 0; j < this.side; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}