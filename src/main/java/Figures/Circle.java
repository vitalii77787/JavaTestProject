package Figures;

import Utils.Colour;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius, Colour colour) {
        this.radius = radius;
        this.colour = colour;
        this.name = this.getClass().getSimpleName();
    }

    @Override
    public void Draw() {
        int posX = (int) this.radius;
        int posY = (int) this.radius * 2;
        for (int i = 0; i <= posX + radius; i++) {
            for (int j = 1; j <= posY + radius; j++) {
                int xSquared = (i - posX) * (i - posX);
                int ySquared = (j - posY) * (j - posY);
                if (Math.abs(xSquared + ySquared - radius * radius) < radius) {
                    System.out.print(this.symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    @Override
    public double GetArea() {
        return (this.radius * this.radius * Math.PI);
    }

    @Override
    public void DisplayInfo() {
        System.out.println(String.format("Figure: %s, Area: %s, radius: %s, colour: %s", this.name, GetFormatedData(GetArea()),
                GetFormatedData(this.radius), this.GetColour()));
    }
}