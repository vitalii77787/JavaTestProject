package Utils;

import Figures.Circle;
import Figures.Figure;
import Figures.Rectangle;
import Figures.Square;
import Figures.Trapezoid;
import Figures.Triangle;

public class FigureFactory {
    private Figure myFigure;

    public Figure GetFigure(FigureType type) {
        switch (type) {
        case Rectangle:
            myFigure = new Rectangle(ValueGenerator.GetRangedDoubleValue(InitialData.MinValue, InitialData.MaxValue),
                    ValueGenerator.GetRangedDoubleValue(InitialData.MinValue, InitialData.MaxValue),
                    ValueGenerator.GetRandomColour());
            break;
        case Circle:
            myFigure = new Circle(ValueGenerator.GetRangedDoubleValue(InitialData.MinValue, InitialData.MaxValue),
                    ValueGenerator.GetRandomColour());
            break;
        case Triangle:
            myFigure = new Triangle(ValueGenerator.GetRangedDoubleValue(InitialData.MinValue, InitialData.MaxValue),
                    ValueGenerator.GetRangedDoubleValue(InitialData.MinValue, InitialData.MaxValue),
                    ValueGenerator.GetRandomColour());
            break;
        case Trapezoid:
            myFigure = new Trapezoid(ValueGenerator.GetRangedDoubleValue(InitialData.MinValue, InitialData.MaxValue),
                    ValueGenerator.GetRangedDoubleValue(InitialData.MinValue, InitialData.MaxValue),
                    ValueGenerator.GetRangedDoubleValue(InitialData.MinValue, InitialData.MaxValue),
                    ValueGenerator.GetRandomColour());
            break;
        case Square:
            myFigure = new Square(ValueGenerator.GetRangedDoubleValue(InitialData.MinValue, InitialData.MaxValue),
                    ValueGenerator.GetRandomColour());
            break;
        default:
            myFigure = new Circle(ValueGenerator.GetRangedDoubleValue(InitialData.MinValue, InitialData.MaxValue),
                    ValueGenerator.GetRandomColour());
            break;
        }
        return myFigure;
    }
}