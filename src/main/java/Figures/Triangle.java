package Figures;

import Utils.Colour;

public class Triangle extends Figure {

    private double firstLeg;
    private double secondLeg;

    public Triangle(double secondLeg, double firstLeg, Colour colour) {
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
        this.colour = colour;
        this.name = this.getClass().getSimpleName();
    }

    private double GetHypotenuseLength() {
       return Math.sqrt(this.firstLeg * this.firstLeg + this.secondLeg * this.secondLeg);
    }

    @Override
    public void Draw() {
        for (int y = 1; y <= firstLeg; y++) {
            for (int x = 1; x <= y; x++) {
                System.out.print(this.symbol);
            }
            System.out.println();
        }
    }

    @Override
    public double GetArea() {
        return this.secondLeg * this.firstLeg * 0.5;
    }

    @Override
    public void DisplayInfo() {
        System.out.println(String.format("Figure: %s, Area: %s, Hypotenuse: %s, Colour: %s", this.name, GetFormatedData(GetArea()),
        GetFormatedData(GetHypotenuseLength()), this.GetColour()));
    }
}