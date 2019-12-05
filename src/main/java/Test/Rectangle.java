package Test;

public class Rectangle extends Figure {

    private double width;
    private double height;
    private String symbol = "*";

    public Rectangle() {
        this.width = 20;
        this.height = 20;
        this.colour = Colour.Green;
        this.name = "Rectangle";
    }

    public Rectangle(float width, float height, Colour colour) {
        this.width = width;
        this.height = height;
        this.colour = colour;
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
    public String GetColour() {
        return this.colour.name();
    }

    @Override
    public String GetInfo() {
        return String.format("Figure: %s, Area: %s, side length: %s, colour: %s", this.name, GetFormatedData(GetArea()),
                GetFormatedData(this.width), this.GetColour());
    }
}