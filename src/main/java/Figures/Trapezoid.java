package Figures;

import Utils.Colour;

public class Trapezoid extends Figure {

    private double height;
    private double topBase;
    private double bottomBase;

    public Trapezoid(double topBase, double bottomBase, double height, Colour colour) {
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
        this.colour = colour;
        this.name = this.getClass().getSimpleName();
    }

    private double GetMediumLineLength() {
        return ((this.topBase + this.bottomBase) / 2);
    }

    private double GetDiagonaleLength() {
        return Math.sqrt(Math.pow(this.height, 2) + Math.pow(GetMediumLineLength(), 2));
    }

    private double GetSideLength() {
        return Math.sqrt(Math.pow(GetDiagonaleLength(), 2) - this.topBase * this.bottomBase);
    }

    @Override
    public void Draw() {
        for (int i = (int) this.height; i > 0; --i) {
            int blocks = (int) this.bottomBase - i * 2;
            for (int j = 0; j < i; ++j) {
                System.out.print(" ");
            }
            for (int j = 0; j < blocks; ++j) {
                System.out.print(this.symbol);
            }
            System.out.println();
        }
    }

    @Override
    protected double GetArea() {
        return this.height * GetMediumLineLength();
    }

    @Override
    public void DisplayInfo() {
        System.out.println(String.format("Figure: %s, Area: %s, Side: %s, colour: %s", this.name,
                GetFormatedData(GetArea()), GetFormatedData(GetSideLength()), this.GetColour()));
    }
}