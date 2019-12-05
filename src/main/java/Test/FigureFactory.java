package Test;

import Utils.FigureType;

public class FigureFactory {
    private  Figure myFigure;

    public  Figure GetFigure(FigureType type) {
        switch (type) {
        case Rectangle:
            myFigure = new Rectangle();
            break;
        case Circle:
            myFigure = new Circle();
            break;
        case Triangle:
            myFigure = new Triangle();
            break;
        case Trapezoid:
            myFigure = new Trapezoid();
            break;
        default:
            myFigure = new Rectangle();
            break;
        }
        return myFigure;
    }
}