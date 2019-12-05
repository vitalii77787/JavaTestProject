package Test;

public class Triangle extends Figure {

    private double height;
    private double side;
    private String symbol = "*";

    public Triangle() {
        this.side = 3;
        this.height = 4;
        this.colour = Colour.Green;
        this.name = "Triangle";
    }

    public Triangle(float side, float height, Colour colour) {
        this.side = side;
        this.height = height;
        this.colour = colour;
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
        return Math.round(this.side * this.height * 0.5f);
    }

    @Override
    public String GetColour() {
        return this.colour.name();
    }

    @Override
    public String GetInfo() {
        return String.format("Figure: %s, Area: %s, Hypotenuse: %s, Colour: %s", this.name, GetFormatedData(GetArea()),
        GetFormatedData(GetHypotenuseLength()), this.GetColour());
    }
}